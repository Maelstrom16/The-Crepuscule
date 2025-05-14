package com.maelstrom.crepuscule.registries;

import com.maelstrom.crepuscule.CRegistry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CCreativeModeTabs {
    // Empty init method to load class into memory
    public static void init() {}

    // Creates a creative tab with the id "crepuscule:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CRegistry.CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.crepuscule")) //The language key for the title of your CreativeModeTab
            //.withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> CItems.EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (DeferredHolder<Item, ? extends Item> item : CRegistry.ITEMS.getEntries()) {
                    output.accept(item.get()); // Add all items to the tab. For your own tabs, this method is preferred over the event
                }
            }).build());
}
