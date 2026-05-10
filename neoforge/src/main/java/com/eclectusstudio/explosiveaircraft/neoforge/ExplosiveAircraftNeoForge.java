package com.eclectusstudio.explosiveaircraft.neoforge;

import com.eclectusstudio.explosiveaircraft.ExplosiveAircraft;
import net.neoforged.fml.common.Mod;

@Mod(ExplosiveAircraft.MOD_ID)
public final class ExplosiveAircraftNeoForge {
    public ExplosiveAircraftNeoForge() {
        // Run our common setup.
        ExplosiveAircraft.init();
    }
}
