package com.eclectusstudio.explosiveaircraft.client;

import com.eclectusstudio.explosiveaircraft.entity.ExplosiveAircraftEntities;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import net.minecraft.client.renderer.entity.TntRenderer;

public class ExplosiveAircraftClient {

    public static void init() {
        EntityRendererRegistry.register(
                ExplosiveAircraftEntities.STRONG_TNT,
                TntRenderer::new
        );
    }
}