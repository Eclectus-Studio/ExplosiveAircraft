package com.eclectusstudio.explosiveaircraft.items;

import com.eclectusstudio.explosiveaircraft.ExplosiveAircraft; // Your main class
import com.eclectusstudio.explosiveaircraft.tabs.ExplosiveAircraftCreativeTabs;
import immersive_aircraft.entity.misc.WeaponMount;
import immersive_aircraft.item.WeaponItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;


public class ExplosiveAircraftItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ExplosiveAircraft.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> DIAMOND_BOMB_BAY = ITEMS.register("diamond_bomb_bay",
            () -> new WeaponItem(baseProps().stacksTo(1), WeaponMount.Type.DROP));

    public static final RegistrySupplier<Item> NETHERITE_BOMB_BAY = ITEMS.register("netherite_bomb_bay",
            () -> new WeaponItem(baseProps().stacksTo(1), WeaponMount.Type.DROP));

    public static void init() {
        ITEMS.register();
    }

    static Item.Properties baseProps() {
        return new Item.Properties();
    }
}