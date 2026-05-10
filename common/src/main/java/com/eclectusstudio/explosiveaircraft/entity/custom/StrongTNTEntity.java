package com.eclectusstudio.explosiveaircraft.entity.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Level.ExplosionInteraction;

public class StrongTNTEntity extends PrimedTnt {

    public StrongTNTEntity(EntityType<? extends PrimedTnt> type, Level level) {
        super(type, level);
    }

    private void explodeCustom() {
        float power = 6.0F; // 1.5x vanilla TNT

        this.level().explode(
                this,
                Explosion.getDefaultDamageSource(this.level(), this),
                null,
                this.getX(),
                this.getY(0.0625D),
                this.getZ(),
                power,
                false,
                ExplosionInteraction.TNT
        );
    }

    @Override
    public void tick() {
        this.handlePortal();
        this.applyGravity();
        this.move(MoverType.SELF, this.getDeltaMovement());
        this.setDeltaMovement(this.getDeltaMovement().scale(0.98));

        if (this.onGround()) {
            this.setDeltaMovement(
                    this.getDeltaMovement().multiply(0.7, -0.5, 0.7)
            );
        }

        int i = this.getFuse() - 1;
        this.setFuse(i);

        if (i <= 0) {
            this.discard();

            if (!this.level().isClientSide) {
                explodeCustom();
            }
        } else {
            this.updateInWaterStateAndDoFluidPushing();

            if (this.level().isClientSide) {
                this.level().addParticle(
                        ParticleTypes.SMOKE,
                        this.getX(),
                        this.getY() + 0.5D,
                        this.getZ(),
                        0.0D,
                        0.0D,
                        0.0D
                );
            }
        }
    }
}