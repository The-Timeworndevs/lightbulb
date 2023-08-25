package net.timeworndevs.lightbulb.registry;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.timeworndevs.lightbulb.Main;

import java.util.function.ToIntFunction;

public class BlockRegistry {

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> {
            return (Boolean)state.get(Properties.LIT) ? litLevel : 0;
        };
    }
    private static ToIntFunction<BlockState> createLightLevelFromUnlitLitBlockState(int litLevel) {
        return (state) -> {
            return !(Boolean)state.get(Properties.LIT) ? litLevel : 0;
        };
    }

    public static final Block WHITE_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.WHITE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block LIGHT_GRAY_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.LIGHT_GRAY).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block GRAY_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.GRAY).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block BLACK_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.BLACK).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block RED_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.RED).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block ORANGE_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.ORANGE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block YELLOW_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.YELLOW).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block LIME_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.LIME).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block GREEN_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.GREEN).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block CYAN_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.CYAN).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block LIGHT_BLUE_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.LIGHT_BLUE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block BLUE_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.BLUE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block PURPLE_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.PURPLE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block MAGENTA_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.MAGENTA).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block PINK_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.PINK).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final Block BROWN_GLOWBLOCK = new Block(AbstractBlock.Settings.of(Material.GLASS, MapColor.BROWN).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));

    public static final ChainBlock WHITE_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.WHITE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock LIGHT_GRAY_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.LIGHT_GRAY).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock GRAY_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.GRAY).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock BLACK_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.BLACK).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock RED_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.RED).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock ORANGE_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.ORANGE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock YELLOW_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.YELLOW).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock LIME_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.LIME).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock GREEN_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.GREEN).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock CYAN_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.CYAN).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock LIGHT_BLUE_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.LIGHT_BLUE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock BLUE_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.BLUE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock PURPLE_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.PURPLE).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock MAGENTA_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.MAGENTA).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock PINK_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.PINK).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));
    public static final ChainBlock BROWN_GLOWROD = new ChainBlock(AbstractBlock.Settings.of(Material.GLASS, MapColor.BROWN).hardness(0.3f).requiresTool().luminance((state) -> {return 15;}).sounds(BlockSoundGroup.GLASS));

    public static final RedstoneLampBlock WHITE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.WHITE).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock LIGHT_GRAY_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.LIGHT_GRAY).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock GRAY_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.GRAY).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock BLACK_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.BLACK).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock RED_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.RED).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock ORANGE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.ORANGE).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock YELLOW_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.YELLOW).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock LIME_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.LIME).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock GREEN_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.GREEN).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock CYAN_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.CYAN).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock LIGHT_BLUE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.LIGHT_BLUE).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock BLUE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.BLUE).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock PURPLE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.PURPLE).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock MAGENTA_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.MAGENTA).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock PINK_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.PINK).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock BROWN_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.BROWN).hardness(0.3f).requiresTool().luminance(createLightLevelFromLitBlockState(15)).sounds(BlockSoundGroup.GLASS));

    public static final RedstoneLampBlock INVERTED_WHITE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.WHITE).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_LIGHT_GRAY_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.LIGHT_GRAY).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_GRAY_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.GRAY).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_BLACK_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.BLACK).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_RED_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.RED).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_ORANGE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.ORANGE).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_YELLOW_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.YELLOW).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_LIME_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.LIME).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_GREEN_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.GREEN).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_CYAN_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.CYAN).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_LIGHT_BLUE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.LIGHT_BLUE).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_BLUE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.BLUE).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_PURPLE_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.PURPLE).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_MAGENTA_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.MAGENTA).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_PINK_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.PINK).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));
    public static final RedstoneLampBlock INVERTED_BROWN_GLOWLAMP = new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP, MapColor.BROWN).hardness(0.3f).requiresTool().luminance(createLightLevelFromUnlitLitBlockState(15)).sounds(BlockSoundGroup.GLASS));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_glowblock"), WHITE_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_glowblock"), LIGHT_GRAY_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_glowblock"), GRAY_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_glowblock"), BLACK_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_glowblock"), RED_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_glowblock"), ORANGE_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_glowblock"), YELLOW_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_glowblock"), LIME_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_glowblock"), GREEN_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_glowblock"), CYAN_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_glowblock"), LIGHT_BLUE_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_glowblock"), BLUE_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_glowblock"), PURPLE_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_glowblock"), MAGENTA_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_glowblock"), PINK_GLOWBLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_glowblock"), BROWN_GLOWBLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_glowrod"), WHITE_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_glowrod"), LIGHT_GRAY_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_glowrod"), GRAY_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_glowrod"), BLACK_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_glowrod"), RED_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_glowrod"), ORANGE_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_glowrod"), YELLOW_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_glowrod"), LIME_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_glowrod"), GREEN_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_glowrod"), CYAN_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_glowrod"), LIGHT_BLUE_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_glowrod"), BLUE_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_glowrod"), PURPLE_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_glowrod"), MAGENTA_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_glowrod"), PINK_GLOWROD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_glowrod"), BROWN_GLOWROD);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "white_glowlamp"), WHITE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_gray_glowlamp"), LIGHT_GRAY_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gray_glowlamp"), GRAY_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "black_glowlamp"), BLACK_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "red_glowlamp"), RED_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "orange_glowlamp"), ORANGE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "yellow_glowlamp"), YELLOW_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lime_glowlamp"), LIME_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "green_glowlamp"), GREEN_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "cyan_glowlamp"), CYAN_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "light_blue_glowlamp"), LIGHT_BLUE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "blue_glowlamp"), BLUE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "purple_glowlamp"), PURPLE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "magenta_glowlamp"), MAGENTA_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "pink_glowlamp"), PINK_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "brown_glowlamp"), BROWN_GLOWLAMP);

        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_white_glowlamp"), INVERTED_WHITE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_light_gray_glowlamp"), INVERTED_LIGHT_GRAY_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_gray_glowlamp"), INVERTED_GRAY_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_black_glowlamp"), INVERTED_BLACK_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_red_glowlamp"), INVERTED_RED_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_orange_glowlamp"), INVERTED_ORANGE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_yellow_glowlamp"), INVERTED_YELLOW_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_lime_glowlamp"), INVERTED_LIME_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_green_glowlamp"), INVERTED_GREEN_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_cyan_glowlamp"), INVERTED_CYAN_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_light_blue_glowlamp"), INVERTED_LIGHT_BLUE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_blue_glowlamp"), INVERTED_BLUE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_purple_glowlamp"), INVERTED_PURPLE_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_magenta_glowlamp"), INVERTED_MAGENTA_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_pink_glowlamp"), INVERTED_PINK_GLOWLAMP);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "inverted_brown_glowlamp"), INVERTED_BROWN_GLOWLAMP);
    }
}
