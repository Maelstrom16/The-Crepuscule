package com.maelstrom.crepuscule.registries;

import com.maelstrom.crepuscule.CRegistry;
import com.maelstrom.crepuscule.items.DragonCharge;
import com.maelstrom.crepuscule.items.CrepuscularArrow;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class CItems {
    // Empty init method to load class into memory
    public static void init() {}
    
    public static final DeferredItem<Item> DRAGON_CHARGE = CRegistry.ITEMS.registerItem("dragon_charge", DragonCharge::new);
    public static final DeferredItem<Item> CREPUSCULAR_ARROW = CRegistry.ITEMS.registerItem("crepuscular_arrow", CrepuscularArrow::new);

    // Creates a new BlockItem with the id "crepuscule:example_block", combining the namespace and path
    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = CRegistry.ITEMS.registerSimpleBlockItem("example_block", CBlocks.EXAMPLE_BLOCK);

    // Creates a new food item with the id "crepuscule:example_id", nutrition 1 and saturation 2
    public static final DeferredItem<Item> EXAMPLE_ITEM = CRegistry.ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));
}
