package com.maelstrom.crepuscule.registries;

import com.maelstrom.crepuscule.CRegistry;
import com.maelstrom.crepuscule.blocks.CrepuscularPortal;
import com.maelstrom.crepuscule.blocks.DormantPortal;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;

public class CBlocks {
    // Empty init method to load class into memory
    public static void init() {}
    
    public static final DeferredBlock<Block> DORMANT_PORTAL = CRegistry.BLOCKS.registerBlock("dormant_portal", DormantPortal::new, Properties.of().randomTicks().strength(-1.0F).sound(SoundType.GLASS).lightLevel((x) -> {return 5;}));
    public static final DeferredBlock<Block> CREPUSCULAR_PORTAL = CRegistry.BLOCKS.registerBlock("crepuscular_portal", CrepuscularPortal::new, Properties.of().noCollission().randomTicks().strength(-1.0F).sound(SoundType.GLASS).lightLevel((x) -> {return 15;}));
    // Creates a new Block with the id "crepuscule:example_block", combining the namespace and path
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = CRegistry.BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
}
