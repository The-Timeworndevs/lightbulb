package net.timeworndevs.lightbulb.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.lightbulb.Main;

public class LightbulbTabs {

    public static final DeferredRegister<CreativeModeTab> TABS_REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LIGHTBULB_TAB = TABS_REGISTRY.register("lightbilb_tab", ()->
            CreativeModeTab.builder().title(Component.translatable("itemGroup.lightbulb"))
                    .icon(()-> Items.GLOWSTONE.getDefaultInstance())
                    .displayItems(((parameters, output)-> {
                        output.accept(LightbulbBlocks.GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.WHITE_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.LIGHT_GRAY_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.GRAY_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.BLACK_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.BROWN_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.RED_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.ORANGE_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.YELLOW_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.LIME_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.GREEN_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.CYAN_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.LIGHT_BLUE_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.BLUE_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.PURPLE_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.MAGENTA_GLOWBLOCK_ITEM);
                        output.accept(LightbulbBlocks.PINK_GLOWBLOCK_ITEM);

                        output.accept(LightbulbBlocks.GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.WHITE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.LIGHT_GRAY_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.GRAY_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.BLACK_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.BROWN_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.RED_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.ORANGE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.YELLOW_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.LIME_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.GREEN_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.CYAN_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.LIGHT_BLUE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.BLUE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.PURPLE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.MAGENTA_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.PINK_GLOWLAMP_ITEM);

                        output.accept(LightbulbBlocks.INVERTED_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_WHITE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_LIGHT_GRAY_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_GRAY_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_BLACK_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_BROWN_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_RED_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_ORANGE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_YELLOW_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_LIME_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_GREEN_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_CYAN_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_LIGHT_BLUE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_BLUE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_PURPLE_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_MAGENTA_GLOWLAMP_ITEM);
                        output.accept(LightbulbBlocks.INVERTED_PINK_GLOWLAMP_ITEM);

                        output.accept(LightbulbBlocks.GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.WHITE_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.LIGHT_GRAY_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.GRAY_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.BLACK_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.BROWN_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.RED_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.ORANGE_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.YELLOW_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.LIME_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.GREEN_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.CYAN_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.LIGHT_BLUE_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.BLUE_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.PURPLE_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.MAGENTA_GLOWROD_ITEM);
                        output.accept(LightbulbBlocks.PINK_GLOWROD_ITEM);

                        output.accept(LightbulbBlocks.GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.WHITE_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.LIGHT_GRAY_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.GRAY_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.BLACK_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.BROWN_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.RED_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.ORANGE_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.YELLOW_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.LIME_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.GREEN_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.CYAN_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.LIGHT_BLUE_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.BLUE_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.PURPLE_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.MAGENTA_GLOWBUTTON_ITEM);
                        output.accept(LightbulbBlocks.PINK_GLOWBUTTON_ITEM);
                    }))
                    .build()
            );
}
