package com.eclectusstudio.explosiveaircraft.neoforge.client;

import com.eclectusstudio.explosiveaircraft.client.ExplosiveAircraftClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = "explosiveaircraft", value = Dist.CLIENT)
public class ExplosiveAircraftNeoForgeClient {

    @SubscribeEvent
    public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        ExplosiveAircraftClient.init();
    }
}