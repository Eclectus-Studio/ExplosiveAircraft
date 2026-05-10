package com.eclectusstudio.explosiveaircraft;

import com.eclectusstudio.explosiveaircraft.client.ExplosiveAircraftClient;
import com.eclectusstudio.explosiveaircraft.entity.ExplosiveAircraftEntities;
import com.eclectusstudio.explosiveaircraft.items.ExplosiveAircraftItems;
import com.eclectusstudio.explosiveaircraft.tabs.ExplosiveAircraftCreativeTabs;
import com.eclectusstudio.explosiveaircraft.weapons.ExplosiveAircraftWeapons;
import com.eclectusstudio.explosiveaircraft.weapons.ExplosiveAircraftWeaponsRenderer;
import net.minecraft.resources.ResourceLocation;

public final class ExplosiveAircraft {
    public static final String MOD_ID = "explosiveaircraft";

    public static void init() {
        ExplosiveAircraftItems.init();
        ExplosiveAircraftCreativeTabs.init();
        ExplosiveAircraftEntities.init();
        ExplosiveAircraftClient.init();
        ExplosiveAircraftWeapons.init();
        ExplosiveAircraftWeaponsRenderer.init();
    }
}
