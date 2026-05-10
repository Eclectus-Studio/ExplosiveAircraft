package com.eclectusstudio.explosiveaircraft.weapons;

import com.eclectusstudio.explosiveaircraft.Locations;
import immersive_aircraft.WeaponRendererRegistry;
import immersive_aircraft.client.render.entity.weaponRenderer.SimpleWeaponRenderer;

public class ExplosiveAircraftWeaponsRenderer {
    public static void init(){
        WeaponRendererRegistry.register(Locations.diamond_bomb_bay, new SimpleWeaponRenderer(Locations.diamond_bomb_bay));
        WeaponRendererRegistry.register(Locations.netherite_bomb_bay, new SimpleWeaponRenderer(Locations.netherite_bomb_bay));
    }
}
