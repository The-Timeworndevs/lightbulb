package net.timeworndevs.lightbulb.common;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.lightbulb.Main;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LightbulbBlocks {

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (lit) -> {
            return (Boolean)lit.getValue(BlockStateProperties.LIT) ? lightValue : 0;
        };
    }

    private static ToIntFunction<BlockState> invertedLitBlockEmission(int lightValue) {
        return (lit) -> {
            return (Boolean)lit.getValue(BlockStateProperties.LIT) ? lightValue : 15;
        };
    }

    public static final DeferredRegister.Blocks BLOCKS_REGISTRY = DeferredRegister.createBlocks(Main.MODID);
    public static final DeferredRegister.Items BLOCK_ITEMS_REGISTRY = DeferredRegister.createItems(Main.MODID);

    public static final DeferredBlock<Block> GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> WHITE_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("white_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> LIGHT_GRAY_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("light_gray_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> GRAY_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("gray_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> BLACK_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("black_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> BROWN_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("brown_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> RED_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("red_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> ORANGE_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("orange_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> YELLOW_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("yellow_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> LIME_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("lime_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> GREEN_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("green_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> CYAN_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("cyan_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> LIGHT_BLUE_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("light_blue_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> BLUE_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("blue_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> PURPLE_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("purple_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> MAGENTA_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("magenta_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));
    public static final DeferredBlock<Block> PINK_GLOWBLOCK = BLOCKS_REGISTRY.registerSimpleBlock("pink_glowblock", BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15));

    public static final DeferredItem<BlockItem> GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("glowblock", GLOWBLOCK);
    public static final DeferredItem<BlockItem> WHITE_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("white_glowblock", WHITE_GLOWBLOCK);
    public static final DeferredItem<BlockItem> BROWN_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("brown_glowblock", BROWN_GLOWBLOCK);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("light_gray_glowblock", LIGHT_GRAY_GLOWBLOCK);
    public static final DeferredItem<BlockItem> GRAY_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("gray_glowblock", GRAY_GLOWBLOCK);
    public static final DeferredItem<BlockItem> BLACK_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("black_glowblock", BLACK_GLOWBLOCK);
    public static final DeferredItem<BlockItem> RED_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("red_glowblock", RED_GLOWBLOCK);
    public static final DeferredItem<BlockItem> ORANGE_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("orange_glowblock", ORANGE_GLOWBLOCK);
    public static final DeferredItem<BlockItem> YELLOW_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("yellow_glowblock", YELLOW_GLOWBLOCK);
    public static final DeferredItem<BlockItem> LIME_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("lime_glowblock", LIME_GLOWBLOCK);
    public static final DeferredItem<BlockItem> GREEN_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("green_glowblock", GREEN_GLOWBLOCK);
    public static final DeferredItem<BlockItem> CYAN_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("cyan_glowblock", CYAN_GLOWBLOCK);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("light_blue_glowblock", LIGHT_BLUE_GLOWBLOCK);
    public static final DeferredItem<BlockItem> BLUE_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("blue_glowblock", BLUE_GLOWBLOCK);
    public static final DeferredItem<BlockItem> PURPLE_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("purple_glowblock", PURPLE_GLOWBLOCK);
    public static final DeferredItem<BlockItem> MAGENTA_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("magenta_glowblock", MAGENTA_GLOWBLOCK);
    public static final DeferredItem<BlockItem> PINK_GLOWBLOCK_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("pink_glowblock", PINK_GLOWBLOCK);

    public static final DeferredBlock<Block> GLOWLAMP = BLOCKS_REGISTRY.register("glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> WHITE_GLOWLAMP = BLOCKS_REGISTRY.register("white_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIGHT_GRAY_GLOWLAMP = BLOCKS_REGISTRY.register("light_gray_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> GRAY_GLOWLAMP = BLOCKS_REGISTRY.register("gray_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BLACK_GLOWLAMP = BLOCKS_REGISTRY.register("black_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BROWN_GLOWLAMP = BLOCKS_REGISTRY.register("brown_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> RED_GLOWLAMP = BLOCKS_REGISTRY.register("red_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> ORANGE_GLOWLAMP = BLOCKS_REGISTRY.register("orange_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> YELLOW_GLOWLAMP = BLOCKS_REGISTRY.register("yellow_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIME_GLOWLAMP = BLOCKS_REGISTRY.register("lime_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> GREEN_GLOWLAMP = BLOCKS_REGISTRY.register("green_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> CYAN_GLOWLAMP = BLOCKS_REGISTRY.register("cyan_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> LIGHT_BLUE_GLOWLAMP = BLOCKS_REGISTRY.register("light_blue_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> BLUE_GLOWLAMP = BLOCKS_REGISTRY.register("blue_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> PURPLE_GLOWLAMP = BLOCKS_REGISTRY.register("purple_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> MAGENTA_GLOWLAMP = BLOCKS_REGISTRY.register("magenta_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));
    public static final DeferredBlock<Block> PINK_GLOWLAMP = BLOCKS_REGISTRY.register("pink_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(litBlockEmission(15))));

    public static final DeferredItem<BlockItem> GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("glowlamp", GLOWLAMP);
    public static final DeferredItem<BlockItem> WHITE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("white_glowlamp", WHITE_GLOWLAMP);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("light_gray_glowlamp", LIGHT_GRAY_GLOWLAMP);
    public static final DeferredItem<BlockItem> GRAY_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("gray_glowlamp", GRAY_GLOWLAMP);
    public static final DeferredItem<BlockItem> BLACK_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("black_glowlamp", BLACK_GLOWLAMP);
    public static final DeferredItem<BlockItem> BROWN_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("brown_glowlamp", BROWN_GLOWLAMP);
    public static final DeferredItem<BlockItem> RED_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("red_glowlamp", RED_GLOWLAMP);
    public static final DeferredItem<BlockItem> ORANGE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("orange_glowlamp", ORANGE_GLOWLAMP);
    public static final DeferredItem<BlockItem> YELLOW_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("yellow_glowlamp", YELLOW_GLOWLAMP);
    public static final DeferredItem<BlockItem> LIME_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("lime_glowlamp", LIME_GLOWLAMP);
    public static final DeferredItem<BlockItem> GREEN_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("green_glowlamp", GREEN_GLOWLAMP);
    public static final DeferredItem<BlockItem> CYAN_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("cyan_glowlamp", CYAN_GLOWLAMP);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("light_blue_glowlamp", LIGHT_BLUE_GLOWLAMP);
    public static final DeferredItem<BlockItem> BLUE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("blue_glowlamp", BLUE_GLOWLAMP);
    public static final DeferredItem<BlockItem> PURPLE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("purple_glowlamp", PURPLE_GLOWLAMP);
    public static final DeferredItem<BlockItem> MAGENTA_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("magenta_glowlamp", MAGENTA_GLOWLAMP);
    public static final DeferredItem<BlockItem> PINK_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("pink_glowlamp", PINK_GLOWLAMP);

    public static final DeferredBlock<Block> INVERTED_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_WHITE_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_white_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_LIGHT_GRAY_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_light_gray_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_GRAY_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_gray_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_BLACK_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_black_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_BROWN_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_brown_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_RED_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_red_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_ORANGE_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_orange_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_YELLOW_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_yellow_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_LIME_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_lime_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_GREEN_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_green_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_CYAN_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_cyan_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_LIGHT_BLUE_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_light_blue_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_BLUE_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_blue_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_PURPLE_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_purple_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_MAGENTA_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_magenta_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));
    public static final DeferredBlock<Block> INVERTED_PINK_GLOWLAMP = BLOCKS_REGISTRY.register("inverted_pink_glowlamp", ()-> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(0.3F).sound(SoundType.GLASS).lightLevel(invertedLitBlockEmission(0))));

    public static final DeferredItem<BlockItem> INVERTED_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_glowlamp", INVERTED_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_WHITE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_white_glowlamp", INVERTED_WHITE_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_LIGHT_GRAY_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_light_gray_glowlamp", INVERTED_LIGHT_GRAY_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_GRAY_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_gray_glowlamp", INVERTED_GRAY_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_BLACK_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_black_glowlamp", INVERTED_BLACK_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_BROWN_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_brown_glowlamp", INVERTED_BROWN_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_RED_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_red_glowlamp", INVERTED_RED_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_ORANGE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_orange_glowlamp", INVERTED_ORANGE_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_YELLOW_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_yellow_glowlamp", INVERTED_YELLOW_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_LIME_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_lime_glowlamp", INVERTED_LIME_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_GREEN_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_green_glowlamp", INVERTED_GREEN_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_CYAN_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_cyan_glowlamp", INVERTED_CYAN_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_LIGHT_BLUE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_light_blue_glowlamp", INVERTED_LIGHT_BLUE_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_BLUE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_blue_glowlamp", INVERTED_BLUE_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_PURPLE_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_purple_glowlamp", INVERTED_PURPLE_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_MAGENTA_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_magenta_glowlamp", INVERTED_MAGENTA_GLOWLAMP);
    public static final DeferredItem<BlockItem> INVERTED_PINK_GLOWLAMP_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("inverted_pink_glowlamp", INVERTED_PINK_GLOWLAMP);

    public static final DeferredBlock<Block> GLOWROD = BLOCKS_REGISTRY.register("glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> WHITE_GLOWROD = BLOCKS_REGISTRY.register("white_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> LIGHT_GRAY_GLOWROD = BLOCKS_REGISTRY.register("light_gray_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> GRAY_GLOWROD = BLOCKS_REGISTRY.register("gray_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> BLACK_GLOWROD = BLOCKS_REGISTRY.register("black_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> BROWN_GLOWROD = BLOCKS_REGISTRY.register("brown_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> RED_GLOWROD = BLOCKS_REGISTRY.register("red_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> ORANGE_GLOWROD = BLOCKS_REGISTRY.register("orange_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> YELLOW_GLOWROD = BLOCKS_REGISTRY.register("yellow_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> LIME_GLOWROD = BLOCKS_REGISTRY.register("lime_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> GREEN_GLOWROD = BLOCKS_REGISTRY.register("green_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> CYAN_GLOWROD = BLOCKS_REGISTRY.register("cyan_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> LIGHT_BLUE_GLOWROD = BLOCKS_REGISTRY.register("light_blue_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> BLUE_GLOWROD = BLOCKS_REGISTRY.register("blue_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> PURPLE_GLOWROD = BLOCKS_REGISTRY.register("purple_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> MAGENTA_GLOWROD = BLOCKS_REGISTRY.register("magenta_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> PINK_GLOWROD = BLOCKS_REGISTRY.register("pink_glowrod", ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));

    public static final DeferredItem<BlockItem> GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("glowrod", GLOWROD);
    public static final DeferredItem<BlockItem> WHITE_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("white_glowrod", WHITE_GLOWROD);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("light_gray_glowrod", LIGHT_GRAY_GLOWROD);
    public static final DeferredItem<BlockItem> GRAY_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("gray_glowrod", GRAY_GLOWROD);
    public static final DeferredItem<BlockItem> BLACK_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("black_glowrod", BLACK_GLOWROD);
    public static final DeferredItem<BlockItem> BROWN_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("brown_glowrod", BROWN_GLOWROD);
    public static final DeferredItem<BlockItem> RED_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("red_glowrod", RED_GLOWROD);
    public static final DeferredItem<BlockItem> ORANGE_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("orange_glowrod", ORANGE_GLOWROD);
    public static final DeferredItem<BlockItem> YELLOW_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("yellow_glowrod", YELLOW_GLOWROD);
    public static final DeferredItem<BlockItem> LIME_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("lime_glowrod", LIME_GLOWROD);
    public static final DeferredItem<BlockItem> GREEN_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("green_glowrod", GREEN_GLOWROD);
    public static final DeferredItem<BlockItem> CYAN_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("cyan_glowrod", CYAN_GLOWROD);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("light_blue_glowrod", LIGHT_BLUE_GLOWROD);
    public static final DeferredItem<BlockItem> BLUE_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("blue_glowrod", BLUE_GLOWROD);
    public static final DeferredItem<BlockItem> PURPLE_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("purple_glowrod", PURPLE_GLOWROD);
    public static final DeferredItem<BlockItem> MAGENTA_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("magenta_glowrod", MAGENTA_GLOWROD);
    public static final DeferredItem<BlockItem> PINK_GLOWROD_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("pink_glowrod", PINK_GLOWROD);

    public static final DeferredBlock<Block> GLOWBUTTON = BLOCKS_REGISTRY.register("glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> WHITE_GLOWBUTTON = BLOCKS_REGISTRY.register("white_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> LIGHT_GRAY_GLOWBUTTON = BLOCKS_REGISTRY.register("light_gray_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> GRAY_GLOWBUTTON = BLOCKS_REGISTRY.register("gray_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> BLACK_GLOWBUTTON = BLOCKS_REGISTRY.register("black_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> BROWN_GLOWBUTTON = BLOCKS_REGISTRY.register("brown_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> RED_GLOWBUTTON = BLOCKS_REGISTRY.register("red_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> ORANGE_GLOWBUTTON = BLOCKS_REGISTRY.register("orange_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> YELLOW_GLOWBUTTON = BLOCKS_REGISTRY.register("yellow_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> LIME_GLOWBUTTON = BLOCKS_REGISTRY.register("lime_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> GREEN_GLOWBUTTON = BLOCKS_REGISTRY.register("green_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> CYAN_GLOWBUTTON = BLOCKS_REGISTRY.register("cyan_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> LIGHT_BLUE_GLOWBUTTON = BLOCKS_REGISTRY.register("light_blue_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> BLUE_GLOWBUTTON = BLOCKS_REGISTRY.register("blue_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> PURPLE_GLOWBUTTON = BLOCKS_REGISTRY.register("purple_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> MAGENTA_GLOWBUTTON = BLOCKS_REGISTRY.register("magenta_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));
    public static final DeferredBlock<Block> PINK_GLOWBUTTON = BLOCKS_REGISTRY.register("pink_glowbutton", ()-> new ButtonBlock(BlockSetType.STONE, 20,BlockBehaviour.Properties.of().strength(0.3f).sound(SoundType.GLASS).lightLevel((level)-> 15)));

    public static final DeferredItem<BlockItem> GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("glowbutton", GLOWBUTTON);
    public static final DeferredItem<BlockItem> WHITE_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("white_glowbutton", WHITE_GLOWBUTTON);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("light_gray_glowbutton", LIGHT_GRAY_GLOWBUTTON);
    public static final DeferredItem<BlockItem> GRAY_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("gray_glowbutton", GRAY_GLOWBUTTON);
    public static final DeferredItem<BlockItem> BLACK_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("black_glowbutton", BLACK_GLOWBUTTON);
    public static final DeferredItem<BlockItem> BROWN_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("brown_glowbutton", BROWN_GLOWBUTTON);
    public static final DeferredItem<BlockItem> RED_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("red_glowbutton", RED_GLOWBUTTON);
    public static final DeferredItem<BlockItem> ORANGE_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("orange_glowbutton", ORANGE_GLOWBUTTON);
    public static final DeferredItem<BlockItem> YELLOW_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("yellow_glowbutton", YELLOW_GLOWBUTTON);
    public static final DeferredItem<BlockItem> LIME_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("lime_glowbutton", LIME_GLOWBUTTON);
    public static final DeferredItem<BlockItem> GREEN_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("green_glowbutton", GREEN_GLOWBUTTON);
    public static final DeferredItem<BlockItem> CYAN_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("cyan_glowbutton", CYAN_GLOWBUTTON);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("light_blue_glowbutton", LIGHT_BLUE_GLOWBUTTON);
    public static final DeferredItem<BlockItem> BLUE_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("blue_glowbutton", BLUE_GLOWBUTTON);
    public static final DeferredItem<BlockItem> PURPLE_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("purple_glowbutton", PURPLE_GLOWBUTTON);
    public static final DeferredItem<BlockItem> MAGENTA_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("magenta_glowbutton", MAGENTA_GLOWBUTTON);
    public static final DeferredItem<BlockItem> PINK_GLOWBUTTON_ITEM = BLOCK_ITEMS_REGISTRY.registerSimpleBlockItem("pink_glowbutton", PINK_GLOWBUTTON);

}
