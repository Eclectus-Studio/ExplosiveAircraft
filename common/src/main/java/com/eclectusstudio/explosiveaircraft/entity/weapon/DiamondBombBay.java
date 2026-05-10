package com.eclectusstudio.explosiveaircraft.entity.weapon;

import immersive_aircraft.config.Config;
import immersive_aircraft.entity.VehicleEntity;
import immersive_aircraft.entity.misc.WeaponMount;
import immersive_aircraft.entity.weapon.BombBay;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.ItemStack;
import org.joml.Vector3f;
import org.joml.Vector4f;

import static net.minecraft.world.entity.item.PrimedTnt.TAG_FUSE;

public class DiamondBombBay extends BombBay {
    public DiamondBombBay(VehicleEntity entity, ItemStack stack, WeaponMount mount, int slot) {
        super(entity, stack, mount, slot);
    }

    @Override
    protected Entity getBullet(Vector4f position, Vector3f direction) {
        Vector3f vel = direction.mul(getVelocity(), new Vector3f());

        ItemStack stack = getAmmoStack();
        String string = stack != null ? BuiltInRegistries.ITEM.getKey(stack.getItem()).toString() : "minecraft:tnt";
        String identifier = Config.getInstance().bombBayEntity.getOrDefault(string, "minecraft:tnt");
        CompoundTag compoundTag = new CompoundTag();
        compoundTag.putString("id", identifier);
        compoundTag.putInt(TAG_FUSE, 80);
        return EntityType.loadEntityRecursive(compoundTag, getEntity().level(), (e) -> {
            e.moveTo(position.x(), position.y(), position.z(), e.getYRot(), e.getXRot());
            e.setDeltaMovement(vel.x(), vel.y(), vel.z());
            return e;
        });
    }
}
