package me.ezcoins.slimefunaddon.Recipes.Generators;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.generators.SolarGenerator;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.Machines.Generators.CombustionGenerator;
import me.ezcoins.slimefunaddon.EasySlimefunAddon;
import me.ezcoins.slimefunaddon.Recipes.Materials.MaterialsSetup;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GeneratorRecipes {

    public static void setup(EasySlimefunAddon plugin) {


        new SolarGenerator(Groups.EzGenerators, 0, 2, GeneratorSetup.BASIC_LUNAR_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.DARKPHOTO, MaterialsSetup.DARKPHOTO, MaterialsSetup.DARKPHOTO,
                        SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.ALUMINUM_INGOT,
                        null, SlimefunItems.ALUMINUM_INGOT, null})
                .register(plugin);

        new SolarGenerator(Groups.EzGenerators, 0, 8, GeneratorSetup.ADVANCED_LUNAR_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{GeneratorSetup.BASIC_LUNAR_GENERATOR, SlimefunItems.ALUMINUM_INGOT, GeneratorSetup.BASIC_LUNAR_GENERATOR,
                        SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.REDSTONE), SlimefunItems.ALUMINUM_INGOT,
                        GeneratorSetup.BASIC_LUNAR_GENERATOR, SlimefunItems.ALUMINUM_INGOT, GeneratorSetup.BASIC_LUNAR_GENERATOR})
                .register(plugin);

        new SolarGenerator(Groups.EzGenerators, 0, 64, GeneratorSetup.CARBONADO_LUNAR_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{GeneratorSetup.ADVANCED_LUNAR_GENERATOR, SlimefunItems.ALUMINUM_INGOT, GeneratorSetup.ADVANCED_LUNAR_GENERATOR,
                        SlimefunItems.ALUMINUM_INGOT, SlimefunItems.CARBONADO, SlimefunItems.ALUMINUM_INGOT,
                        GeneratorSetup.ADVANCED_LUNAR_GENERATOR, SlimefunItems.ALUMINUM_INGOT, GeneratorSetup.ADVANCED_LUNAR_GENERATOR})
                .register(plugin);

        new SolarGenerator(Groups.EzGenerators, 128, 256, GeneratorSetup.ENERGIZED_LUNAR_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{GeneratorSetup.CARBONADO_LUNAR_GENERATOR, SlimefunItems.BLISTERING_INGOT_3, GeneratorSetup.CARBONADO_LUNAR_GENERATOR,
                        SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BLISTERING_INGOT_3,
                        GeneratorSetup.CARBONADO_LUNAR_GENERATOR, SlimefunItems.BLISTERING_INGOT_3, GeneratorSetup.CARBONADO_LUNAR_GENERATOR})
                .register(plugin);

        new SolarGenerator(Groups.EzGenerators, 1028, 1028, GeneratorSetup.OVERLOADED_CYCLE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{GeneratorSetup.ENERGIZED_LUNAR_GENERATOR, SlimefunItems.REINFORCED_PLATE, GeneratorSetup.ENERGIZED_LUNAR_GENERATOR,
                        SlimefunItems.REINFORCED_PLATE, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.REINFORCED_PLATE,
                        SlimefunItems.SOLAR_GENERATOR_4, SlimefunItems.REINFORCED_PLATE, SlimefunItems.SOLAR_GENERATOR_4})
                .register(plugin);


        new CombustionGenerator(Groups.EzGenerators, GeneratorSetup.CombustionGenerator, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BLISTERING_INGOT_2, SlimefunItems.ELECTRO_MAGNET,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.DIAMOND_BLOCK), SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ELECTRIC_MOTOR, MaterialsSetup.MACHINE_MOTOR, SlimefunItems.ELECTRIC_MOTOR})
                .setCapacity(360)
                .setEnergyProduction(40)
                .register(EasySlimefunAddon.plugin);


    }
}
