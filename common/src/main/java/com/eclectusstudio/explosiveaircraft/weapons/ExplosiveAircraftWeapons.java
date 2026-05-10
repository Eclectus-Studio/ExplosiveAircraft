package com.eclectusstudio.explosiveaircraft.weapons;

import com.eclectusstudio.explosiveaircraft.Locations;
import com.eclectusstudio.explosiveaircraft.entity.weapon.DiamondBombBay;
import com.eclectusstudio.explosiveaircraft.entity.weapon.NetheriteBombBay;
import immersive_aircraft.WeaponRegistry;

public class ExplosiveAircraftWeapons {
    public static void init(){
        WeaponRegistry.register(Locations.diamond_bomb_bay, DiamondBombBay::new);
        WeaponRegistry.register(Locations.netherite_bomb_bay, NetheriteBombBay::new);
    }
}
