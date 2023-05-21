package net.timeworndevs.lightbulb.registry;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.timeworndevs.lightbulb.Main;

import java.util.function.ToIntFunction;

public class Blocks {
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

    public static void register(){
        sets(Main.MOD_ID,"white");
        sets(Main.MOD_ID,"light_gray");
        sets(Main.MOD_ID,"gray");
        sets(Main.MOD_ID,"black");
        sets(Main.MOD_ID,"red");
        sets(Main.MOD_ID,"orange");
        sets(Main.MOD_ID,"yellow");
        sets(Main.MOD_ID,"lime");
        sets(Main.MOD_ID,"green");
        sets(Main.MOD_ID,"cyan");
        sets(Main.MOD_ID,"light_blue");
        sets(Main.MOD_ID,"blue");
        sets(Main.MOD_ID,"purple");
        sets(Main.MOD_ID,"magenta");
        sets(Main.MOD_ID,"pink");
        sets(Main.MOD_ID,"brown");
    }

    public static void sets(String modid, String setName){
        Registries.registerBlocks(new Identifier(modid, setName + "_glowblock"), new Block(AbstractBlock.Settings.of(Material.STONE).sounds(BlockSoundGroup.GLASS).luminance((state) -> {return 15;}).strength(0.3f)));
        Registries.registerBlocks(new Identifier(modid, setName + "_glowlamp"), new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP).sounds(BlockSoundGroup.GLASS).luminance(createLightLevelFromLitBlockState(15)).strength(0.3f)));
        Registries.registerBlocks(new Identifier(modid, "inverted_" + setName + "_glowlamp"), new RedstoneLampBlock(AbstractBlock.Settings.of(Material.REDSTONE_LAMP).sounds(BlockSoundGroup.GLASS).luminance(createLightLevelFromUnlitLitBlockState(15)).strength(0.3f)));
        Registries.registerBlocks(new Identifier(modid, setName + "_glowrod"), new ChainBlock(AbstractBlock.Settings.of(Material.STONE).sounds(BlockSoundGroup.GLASS).luminance((state) -> {return 15;}).strength(5.0F, 6.0F)));
    }
}
