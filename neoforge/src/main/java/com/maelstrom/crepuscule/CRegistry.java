package com.maelstrom.crepuscule;

import com.maelstrom.crepuscule.registries.*;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CRegistry {
    // Call initializers for other registry classes
    public static void registerAll(IEventBus modEventBus) {
        // Bring all registry classes into scope so their additions are reflected
        CItems.init();
        CBlocks.init();
        CCreativeModeTabs.init();
        // Register everything
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    // Create Deferred Registers to hold everything which will be registered under the "crepuscule" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Crepuscule.MODID);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Crepuscule.MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Crepuscule.MODID);
}
