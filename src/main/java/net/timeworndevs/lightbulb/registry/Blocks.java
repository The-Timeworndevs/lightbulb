package net.timeworndevs.lightbulb.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.timeworndevs.lightbulb.Main;

public class Blocks {

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
    }
}
