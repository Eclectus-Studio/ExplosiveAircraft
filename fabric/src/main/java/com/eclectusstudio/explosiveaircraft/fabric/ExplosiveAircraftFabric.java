package com.eclectusstudio.explosiveaircraft.fabric;

import com.eclectusstudio.explosiveaircraft.ExplosiveAircraft;
import net.fabricmc.api.ModInitializer;

public final class ExplosiveAircraftFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExplosiveAircraft.init();
    }
}
