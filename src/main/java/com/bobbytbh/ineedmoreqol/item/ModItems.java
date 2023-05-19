package com.bobbytbh.ineedmoreqol.item;

import com.bobbytbh.ineedmoreqol.ineedmoreqol;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ineedmoreqol.MOD_ID);

    public static final RegistryObject<Item> ITEM = ITEMS.register("item",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_BREWING)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
