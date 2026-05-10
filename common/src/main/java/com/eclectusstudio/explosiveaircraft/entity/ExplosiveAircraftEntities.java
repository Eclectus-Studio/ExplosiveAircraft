package com.eclectusstudio.explosiveaircraft.entity;

import com.eclectusstudio.explosiveaircraft.ExplosiveAircraft;
import com.eclectusstudio.explosiveaircraft.entity.custom.StrongTNTEntity;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ExplosiveAircraftEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ExplosiveAircraft.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<StrongTNTEntity>> STRONG_TNT =
            ENTITIES.register("strong_tnt", () ->
                    EntityType.Builder
                            .<StrongTNTEntity>of(StrongTNTEntity::new, MobCategory.MISC)
                            .sized(0.98F, 0.98F)
                            .clientTrackingRange(10)
                            .updateInterval(10)
                            .build("strong_tnt")
            );

    public static void init() {
        ENTITIES.register();
    }
}