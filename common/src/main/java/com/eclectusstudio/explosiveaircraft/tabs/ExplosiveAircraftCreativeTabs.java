package com.eclectusstudio.explosiveaircraft.tabs;

import com.eclectusstudio.explosiveaircraft.ExplosiveAircraft;
import com.eclectusstudio.explosiveaircraft.items.ExplosiveAircraftItems;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ExplosiveAircraftCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(ExplosiveAircraft.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> EXPLOSIVE_AIRCRAFT_TAB =
            TABS.register("explosive_aircraft_tab", () ->
                    CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                            .title(Component.translatable("category.explosiveaircraft.tab"))
                            .icon(() -> new ItemStack(
                                    ExplosiveAircraftItems.DIAMOND_BOMB_BAY.get()
                            ))
                            .displayItems((parameters, output) -> {

                                output.accept(
                                        ExplosiveAircraftItems.DIAMOND_BOMB_BAY.get()
                                );

                                output.accept(
                                        ExplosiveAircraftItems.NETHERITE_BOMB_BAY.get()
                                );

                            })
                            .build()
            );

    public static void init() {
        TABS.register();
    }
}
