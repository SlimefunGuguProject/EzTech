package me.ezcoins.slimefunaddon.Recipes.Materials;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.RainbowTickHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.RainbowBlock;
import io.github.thebusybiscuit.slimefun4.utils.ColoredMaterial;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.EasySlimefunAddon;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class MaterialRecipes {


    public static void setup(EasySlimefunAddon plugin) {



        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.BISMUTH, RecipeType.SMELTERY,
                new ItemStack[]{SlimefunItems.CARBON, SlimefunItems.SULFATE, SlimefunItems.STEEL_INGOT})
                .register(EasySlimefunAddon.plugin);


        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.BISMUTHPLATES, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.BISMUTH, MaterialsSetup.BISMUTH, MaterialsSetup.BISMUTH,
                        MaterialsSetup.BISMUTH, SlimefunItems.HARDENED_METAL_INGOT, MaterialsSetup.BISMUTH,
                        MaterialsSetup.BISMUTH, MaterialsSetup.BISMUTH, MaterialsSetup.BISMUTH}).register(EasySlimefunAddon.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.PLATINUM, RecipeType.SMELTERY,
                new ItemStack[]{SlimefunItems.DAMASCUS_STEEL_INGOT, MaterialsSetup.BISMUTH, SlimefunItems.REINFORCED_ALLOY_INGOT})
                .register(EasySlimefunAddon.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.SOULARIUM, RecipeType.SMELTERY,
                new ItemStack[]{MaterialsSetup.BISMUTHPLATES, SlimefunItems.REDSTONE_ALLOY, new ItemStack(Material.SOUL_SAND, 4)})
                .register(EasySlimefunAddon.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.MACHINE_MOTOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, SlimefunItems.ELECTRO_MAGNET, null,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD})
                .register(EasySlimefunAddon.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.MACHINEPLATING, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        MaterialsSetup.BISMUTHPLATES, MaterialsSetup.PLATINUM, MaterialsSetup.BISMUTHPLATES,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT
                }).register(EasySlimefunAddon.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.MACHINECHASSIS, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.BISMUTH, MaterialsSetup.PLATINUM, MaterialsSetup.BISMUTH,
                        MaterialsSetup.PLATINUM, MaterialsSetup.MACHINEPLATING, MaterialsSetup.PLATINUM,
                        MaterialsSetup.BISMUTH, MaterialsSetup.PLATINUM, MaterialsSetup.BISMUTH
                }).register(EasySlimefunAddon.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.DARKPHOTO, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{new ItemStack(Material.BLACK_STAINED_GLASS), new ItemStack(Material.BLACK_STAINED_GLASS), new ItemStack(Material.BLACK_STAINED_GLASS),
                        SlimefunItems.SILICON, SlimefunItems.SILICON, SlimefunItems.SILICON,
                        SlimefunItems.FERROSILICON, SlimefunItems.FERROSILICON, SlimefunItems.FERROSILICON
                }).register(EasySlimefunAddon.plugin);

        new RainbowBlock(Groups.EzMisc, MaterialsSetup.RAINBOW_CARPET, RecipeType.ANCIENT_ALTAR,
                new ItemStack[]{new ItemStack(Material.WHITE_CARPET), new ItemStack(Material.WHITE_CARPET), new ItemStack(Material.WHITE_CARPET),
                        new ItemStack(Material.WHITE_CARPET), SlimefunItems.RAINBOW_RUNE, new ItemStack(Material.WHITE_CARPET),
                        new ItemStack(Material.WHITE_CARPET), new ItemStack(Material.WHITE_CARPET), new ItemStack(Material.WHITE_CARPET)},
                new SlimefunItemStack(MaterialsSetup.RAINBOW_CARPET, 8), new RainbowTickHandler(ColoredMaterial.CARPET))
                .register(plugin);


    }

    @Nullable
    public static ItemStack getItem(@Nonnull String id) {
        SlimefunItem item = SlimefunItem.getById(id);
        return item != null ? item.getItem() : null;
    }


}



