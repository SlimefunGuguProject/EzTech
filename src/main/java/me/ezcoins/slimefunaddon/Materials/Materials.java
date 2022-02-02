package me.ezcoins.slimefunaddon.Materials;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.MainRecipes;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Materials {


    public static final SlimefunItemStack MACHINE_MOTOR = new SlimefunItemStack("MACHINE_MOTOR",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2IwNDMzZjFjMjI3OTYwOGY3YmQyY2VjZWI5OGNkMTc1Y2JhYWRjM2Y2Mjk5YWUzY2NhZTI1N2RjMjJhNTViMiJ9fX0=",
            "&cMachine Motor"
    );

    public static final SlimefunItemStack ALLOY_MIXTUREH = new SlimefunItemStack("ALLOY_MIXTURE50",
            Material.NETHERITE_INGOT,
            "&6&lAlloy Mixture&r &7(50%)"
    );

    public static final SlimefunItemStack ALLOY_MIXTURE = new SlimefunItemStack("ALLOY_MIXTURE",
            Material.NETHERITE_INGOT,
            "&6&lAlloy Mixture"
    );




    public static void setup(MainRecipes plugin) {

        new SlimefunItem(Groups.EzMaterials, MACHINE_MOTOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, SlimefunItems.ELECTRO_MAGNET, null,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD})
                .register(MainRecipes.plugin);

        new SlimefunItem(Groups.EzMaterials, ALLOY_MIXTUREH, RecipeType.SMELTERY,
                new ItemStack[]{new ItemStack(Material.IRON_INGOT), new ItemStack(Material.GOLD_INGOT), SlimefunItems.ALUMINUM_INGOT,
                        SlimefunItems.COPPER_INGOT, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.LEAD_INGOT})
                .register(MainRecipes.plugin);

        new SlimefunItem(Groups.EzMaterials, ALLOY_MIXTURE, RecipeType.SMELTERY,
                new ItemStack[]{Materials.ALLOY_MIXTUREH, SlimefunItems.SILVER_INGOT, SlimefunItems.TIN_INGOT,
                        SlimefunItems.ZINC_INGOT, SlimefunItems.CARBON, null})
                .register(MainRecipes.plugin);



    }
}
