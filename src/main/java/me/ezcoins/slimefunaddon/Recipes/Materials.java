package me.ezcoins.slimefunaddon.Recipes;

import io.github.thebusybiscuit.exoticgarden.ExoticGarden;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.ezcoins.slimefunaddon.Core.EzRecipeTypes;
import me.ezcoins.slimefunaddon.Core.Foods;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.Machines.QOL.Corrupter;
import me.ezcoins.slimefunaddon.MainClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.exoticgarden.ExoticGardenRecipeTypes;
import io.github.thebusybiscuit.exoticgarden.items.FoodRegistry;
import io.github.thebusybiscuit.exoticgarden.items.CustomFood;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Materials {


    public static final SlimefunItemStack MACHINE_MOTOR = new SlimefunItemStack("MACHINE_MOTOR",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2IwNDMzZjFjMjI3OTYwOGY3YmQyY2VjZWI5OGNkMTc1Y2JhYWRjM2Y2Mjk5YWUzY2NhZTI1N2RjMjJhNTViMiJ9fX0=",
            "&cMachine Motor"
    );


    public static final SlimefunItemStack OBSIDIAN_DUST = new SlimefunItemStack("OBSIDIANDUST",
            Material.GUNPOWDER,
            "&5Obsidian Dust"
    );


    public static void setup(MainClass plugin) {

        new SlimefunItem(Groups.EzMaterials, MACHINE_MOTOR, RecipeType.GRIND_STONE,
                new ItemStack[]{null, SlimefunItems.ELECTRO_MAGNET, null,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD})
                .register(MainClass.plugin);


        new SlimefunItem(Groups.EzMaterials, OBSIDIAN_DUST, EzRecipeTypes.CORRUPTER,
                new ItemStack[]{null, null, null,
                        null, new ItemStack(Material.OBSIDIAN), null,
                        null, null, null})
                .register(MainClass.plugin);


                                                // FOOOOOOOD

        new SlimefunItem(Groups.EzFood, new SlimefunItemStack("KETCHUP", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmM0ZjZmODNjYTA2N2U1YjY0NjNkZjE3NTNkMDcwZjc3OGZmOGI5MzAwM2I5OGE2MTVjMGVmMzgxMDE4NDkyYiJ9fX0=", "&cKetchup"), RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {null, null, null, null, getItem("TOMATO"), null, null, null, null})
                .register(plugin);


        new Foods(Groups.EzFood, new SlimefunItemStack("FRIESWKETCHUP", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmM0ZjZmODNjYTA2N2U1YjY0NjNkZjE3NTNkMDcwZjc3OGZmOGI5MzAwM2I5OGE2MTVjMGVmMzgxMDE4NDkyYiJ9fX0=", "&eFries &7with &cKetchup", "", "&7&oRestores &b&o" + "8" + " &7&oHunger"),
                new ItemStack[] {getItem("KETCHUP"), getItem("FRIES"), null, null, null, null, null, null, null},
                16)
                .register(plugin);

        new Foods(Groups.EzFood, new SlimefunItemStack("FRIESWCHEESE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmE4MmUxMWQ1YTY0YzZkNjUzZjNhMWM1M2M5NDIwYTE1MzgxOGU2N2RiZDhlOTM0NDJjMzVjNjI3ZTBjNjMxIn19fQ==", "&eFries &7with &eCheese", "", "&7&oRestores &b&o" + "8" + " &7&oHunger"),
                new ItemStack[] {getItem("CHEESE"), getItem("FRIES"), null, null, null, null, null, null, null},
                16)
                .register(plugin);

    }

    @Nullable
    private static ItemStack getItem(@Nonnull String id) {
        SlimefunItem item = SlimefunItem.getById(id);
        return item != null ? item.getItem() : null;
    }

}
