package com.eclectusstudio.explosiveaircraft.fabric.client;

import com.eclectusstudio.explosiveaircraft.client.ExplosiveAircraftClient;
import net.fabricmc.api.ClientModInitializer;

public final class ExplosiveAircraftFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        ExplosiveAircraftClient.init();
    }
}
