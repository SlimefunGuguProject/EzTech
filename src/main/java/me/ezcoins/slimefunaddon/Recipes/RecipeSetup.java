package me.ezcoins.slimefunaddon.Recipes;
import java.util.EnumMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import io.github.mooy1.infinitylib.machines.MachineBlock;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.ElectricSmeltery;
import lombok.experimental.UtilityClass;
import me.ezcoins.slimefunaddon.Core.*;
import me.ezcoins.slimefunaddon.Machines.Factory.*;
import me.ezcoins.slimefunaddon.Machines.Generators.*;
import me.ezcoins.slimefunaddon.Machines.QOL.*;
import me.ezcoins.slimefunaddon.MainClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.generators.SolarGenerator;

import static me.ezcoins.slimefunaddon.Recipes.MaterialsSetup.*;

@UtilityClass
public class RecipeSetup {




    public static void setup(MainClass plugin) {

        //// MACHINES

        new PresCarbonPress(Groups.EzMachines, MaterialsSetup.PresCarbonPress, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRO_MAGNET, SlimefunItems.CARBONADO_EDGED_FURNACE, SlimefunItems.ELECTRO_MAGNET,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.CARBON_PRESS, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.CARBON, MaterialsSetup.MACHINECHASSIS, SlimefunItems.CARBON})
                .register(MainClass.plugin);

        new SaltShaker(Groups.EzMachines, MaterialsSetup.SaltShaker, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.HEATING_COIL, new ItemStack(Material.CAULDRON), SlimefunItems.HEATING_COIL,
                        new ItemStack(Material.IRON_BLOCK), SlimefunItems.SALT, new ItemStack(Material.IRON_BLOCK),
                        new ItemStack(Material.IRON_BLOCK), MaterialsSetup.MACHINE_MOTOR, new ItemStack(Material.IRON_BLOCK)})
                .register(MainClass.plugin);

        new CookieMaker(Groups.EzMachines, MaterialsSetup.CookieMaker, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, null,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.HAY_BLOCK), SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR})
                .register(MainClass.plugin);

        new Corrupter(Groups.EzMachines, MaterialsSetup.Corrupter, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.BISMUTHPLATES, new ItemStack(Material.END_CRYSTAL), MaterialsSetup.BISMUTHPLATES,
                        new ItemStack(Material.SOUL_SAND), MaterialsSetup.MACHINECHASSIS, new ItemStack(Material.SOUL_SAND),
                        MaterialsSetup.BISMUTHPLATES, MaterialsSetup.MACHINE_MOTOR, MaterialsSetup.BISMUTHPLATES})
                .register(MainClass.plugin);

        new Hydronator(Groups.EzMachines, MaterialsSetup.Hydronator, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, new ItemStack(Material.DIAMOND_PICKAXE), null,
                        new ItemStack(Material.WATER_BUCKET), MaterialsSetup.MACHINECHASSIS, new ItemStack(Material.WATER_BUCKET),
                        new ItemStack(Material.WHITE_CONCRETE), SlimefunItems.PROGRAMMABLE_ANDROID_MINER, new ItemStack(Material.WHITE_CONCRETE)})
                .register(MainClass.plugin);


        new SolarGenerator(Groups.EzGenerators, 0, 2, MaterialsSetup.BASIC_LUNAR_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.DARKPHOTO, MaterialsSetup.DARKPHOTO, MaterialsSetup.DARKPHOTO,
                        SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.ALUMINUM_INGOT,
                        null, SlimefunItems.ALUMINUM_INGOT, null})
                .register(plugin);

        new SolarGenerator(Groups.EzGenerators, 0, 8, MaterialsSetup.ADVANCED_LUNAR_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.BASIC_LUNAR_GENERATOR, SlimefunItems.ALUMINUM_INGOT, MaterialsSetup.BASIC_LUNAR_GENERATOR,
                        SlimefunItems.ALUMINUM_INGOT, new ItemStack(Material.REDSTONE), SlimefunItems.ALUMINUM_INGOT,
                        MaterialsSetup.BASIC_LUNAR_GENERATOR, SlimefunItems.ALUMINUM_INGOT, MaterialsSetup.BASIC_LUNAR_GENERATOR})
                .register(plugin);

        new SolarGenerator(Groups.EzGenerators, 0, 64, MaterialsSetup.CARBONADO_LUNAR_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.ADVANCED_LUNAR_GENERATOR, SlimefunItems.ALUMINUM_INGOT, MaterialsSetup.ADVANCED_LUNAR_GENERATOR,
                        SlimefunItems.ALUMINUM_INGOT, SlimefunItems.CARBONADO, SlimefunItems.ALUMINUM_INGOT,
                        MaterialsSetup.ADVANCED_LUNAR_GENERATOR, SlimefunItems.ALUMINUM_INGOT, MaterialsSetup.ADVANCED_LUNAR_GENERATOR})
                .register(plugin);

        new SolarGenerator(Groups.EzGenerators, 128, 256, MaterialsSetup.ENERGIZED_LUNAR_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.CARBONADO_LUNAR_GENERATOR, SlimefunItems.BLISTERING_INGOT_3, MaterialsSetup.CARBONADO_LUNAR_GENERATOR,
                        SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BLISTERING_INGOT_3,
                        MaterialsSetup.CARBONADO_LUNAR_GENERATOR, SlimefunItems.BLISTERING_INGOT_3, MaterialsSetup.CARBONADO_LUNAR_GENERATOR})
                .register(plugin);

        new SolarGenerator(Groups.EzGenerators, 768, 768, MaterialsSetup.OVERLOADED_CYCLE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.ENERGIZED_LUNAR_GENERATOR, MaterialsSetup.BISMUTHPLATES, MaterialsSetup.ENERGIZED_LUNAR_GENERATOR,
                        MaterialsSetup.BISMUTHPLATES, SlimefunItems.ELECTRO_MAGNET, MaterialsSetup.BISMUTHPLATES,
                        SlimefunItems.SOLAR_GENERATOR_4, MaterialsSetup.BISMUTHPLATES, SlimefunItems.SOLAR_GENERATOR_4})
                .register(plugin);


        new CombustionGenerator(Groups.EzGenerators, MaterialsSetup.CombustionGenerator, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BLISTERING_INGOT_2, SlimefunItems.ELECTRO_MAGNET,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.DIAMOND_BLOCK), SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ELECTRIC_MOTOR, MaterialsSetup.MACHINE_MOTOR, SlimefunItems.ELECTRIC_MOTOR})
                .setCapacity(360)
                .setEnergyProduction(40)
                .register(MainClass.plugin);


        new MaterialGenerator(Groups.EzMachines, MaterialsSetup.COBBLEGENS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null,new ItemStack(Material.DIAMOND_PICKAXE),null,
                new ItemStack(Material.LAVA_BUCKET),SlimefunItems.PROGRAMMABLE_ANDROID_MINER,new ItemStack(Material.WATER_BUCKET),
                SlimefunItems.ELECTRIC_MOTOR,MaterialsSetup.MACHINECHASSIS,SlimefunItems.ELECTRIC_MOTOR
        }).material(Material.COBBLESTONE).speed(1).energyPerTick(48).register(MainClass.plugin);


        RandomizedItemStack twoIngot = new RandomizedItemStack(
                new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 1),
                new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 1),
                new SlimefunItemStack(SlimefunItems.TIN_INGOT, 1),
                new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 1),
                new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 1),
                new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 1),
                new SlimefunItemStack(SlimefunItems.GOLD_4K, 1),
                new ItemStack(Material.IRON_INGOT, 1),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 1)
        );
        new MachineBlock(Groups.EzMachines, MaterialsSetup.INGOTEXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_ORE_GRINDER_2,
                SlimefunItems.ELECTRIC_GOLD_PAN_3, MaterialsSetup.MACHINECHASSIS, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
                MaterialsSetup.PLATINUM, MaterialsSetup.MACHINE_MOTOR, MaterialsSetup.PLATINUM

        }).addRecipe(twoIngot, new ItemStack(Material.COBBLESTONE, 2)).ticksPerOutput(2).
                energyPerTick(300).register(MainClass.plugin);

        new GoldRefinery(Groups.EzMachines, MaterialsSetup.GOLDREFINERY, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, SlimefunItems.LAVA_CRYSTAL, null,
                        SlimefunItems.ELECTRIC_SMELTERY_2, MaterialsSetup.MACHINECHASSIS, SlimefunItems.ELECTRIC_SMELTERY_2,
                        SlimefunItems.GOLD_24K_BLOCK, MaterialsSetup.MACHINE_MOTOR, SlimefunItems.GOLD_24K_BLOCK})
                .register(MainClass.plugin);

        new UraniumExtractor(Groups.EzMachines, MaterialsSetup.URANIUMEXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ELECTRIC_ORE_GRINDER_2,
                        SlimefunItems.BLISTERING_INGOT_3, MaterialsSetup.MACHINECHASSIS, SlimefunItems.BLISTERING_INGOT_3,
                        SlimefunItems.ELECTRIC_GOLD_PAN_3, MaterialsSetup.MACHINE_MOTOR, SlimefunItems.ELECTRIC_DUST_WASHER_3})
                .register(MainClass.plugin);

        new ElectricSmeltery(Groups.EzMachines, ELECTRIC_SMELTERY_3, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {MaterialsSetup.PLATINUM, SlimefunItems.POWER_CRYSTAL, MaterialsSetup.PLATINUM,
                                 SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.HEATING_COIL,
                                 MaterialsSetup.PLATINUM, SlimefunItems.ELECTRIC_MOTOR, MaterialsSetup.PLATINUM})
                .setCapacity(2048)
                .setEnergyConsumption(60)
                .setProcessingSpeed(8)
                .register(plugin);




        EnumMap<Material, ItemStack[]> trees = new EnumMap<>(Material.class);

        trees.put(Material.OAK_SAPLING, new ItemStack[] {
                new ItemStack(Material.OAK_LEAVES, 8), new ItemStack(Material.OAK_LOG, 6), new ItemStack(Material.APPLE)
        });
        trees.put(Material.SPRUCE_SAPLING, new ItemStack[] {
                new ItemStack(Material.SPRUCE_LEAVES, 8), new ItemStack(Material.SPRUCE_LOG, 6)
        });
        trees.put(Material.DARK_OAK_SAPLING, new ItemStack[] {
                new ItemStack(Material.DARK_OAK_LEAVES, 8), new ItemStack(Material.DARK_OAK_LOG, 6), new ItemStack(Material.APPLE)
        });
        trees.put(Material.BIRCH_SAPLING, new ItemStack[] {
                new ItemStack(Material.BIRCH_LEAVES, 8), new ItemStack(Material.BIRCH_LOG, 6)
        });
        trees.put(Material.ACACIA_SAPLING, new ItemStack[] {
                new ItemStack(Material.ACACIA_LEAVES, 8), new ItemStack(Material.ACACIA_LOG, 6)
        });
        trees.put(Material.JUNGLE_SAPLING, new ItemStack[] {
                new ItemStack(Material.JUNGLE_LEAVES, 8), new ItemStack(Material.JUNGLE_LOG, 6)
        });
        trees.put(Material.WARPED_FUNGUS, new ItemStack[] {
                new ItemStack(Material.WARPED_STEM, 6), new ItemStack(Material.SHROOMLIGHT)
        });
        trees.put(Material.CRIMSON_FUNGUS, new ItemStack[] {
                new ItemStack(Material.CRIMSON_STEM, 6), new ItemStack(Material.WEEPING_VINES)
        });

        new TreeGrowers(Groups.EzMachines, TREEHOUSE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.STRIPPED_OAK_LOG), new ItemStack(Material.DIAMOND_AXE), new ItemStack(Material.STRIPPED_OAK_LOG),
                SlimefunItems.HEATING_COIL, SlimefunItems.PROGRAMMABLE_ANDROID_WOODCUTTER, SlimefunItems.HEATING_COIL,
                MaterialsSetup.BISMUTHPLATES, MaterialsSetup.MACHINE_MOTOR, MaterialsSetup.BISMUTHPLATES
        }).recipes(trees).ticksPerOutput(50).energyPerTick(36).register(plugin);

        new GreenHouse(Groups.EzMachines, MaterialsSetup.GREENHOUSE, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.LIME_STAINED_GLASS), SlimefunItems.PROGRAMMABLE_ANDROID_2_FARMER, new ItemStack(Material.LIME_STAINED_GLASS),
                        SlimefunItems.HEATING_COIL, MaterialsSetup.MACHINECHASSIS, SlimefunItems.HEATING_COIL,
                        new ItemStack(Material.WATER_BUCKET), MaterialsSetup.TREEHOUSE, new ItemStack(Material.WATER_BUCKET)})
                .setEnergyCapacity(512)
                .setEnergyConsumption(32)
                .setProcessingSpeed(1)
                .register(plugin);

        //// RESOURCES

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.MACHINE_MOTOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, SlimefunItems.ELECTRO_MAGNET, null,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ADVANCED_CIRCUIT_BOARD})
                .register(MainClass.plugin);


        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.BISMUTH, RecipeType.SMELTERY,
                new ItemStack[]{SlimefunItems.CARBON, SlimefunItems.SULFATE, SlimefunItems.STEEL_INGOT})
                .register(MainClass.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.PLATINUM, RecipeType.SMELTERY,
                new ItemStack[]{SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT})
                .register(MainClass.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.BISMUTHPLATES, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.BISMUTH, MaterialsSetup.BISMUTH, MaterialsSetup.BISMUTH,
                                MaterialsSetup.BISMUTH, SlimefunItems.HARDENED_METAL_INGOT, MaterialsSetup.BISMUTH,
                                MaterialsSetup.BISMUTH, MaterialsSetup.BISMUTH, MaterialsSetup.BISMUTH}).register(MainClass.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.MACHINEPLATING, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.REINFORCED_ALLOY_INGOT,SlimefunItems.REINFORCED_PLATE,SlimefunItems.REINFORCED_ALLOY_INGOT,
                                MaterialsSetup.BISMUTHPLATES,MaterialsSetup.PLATINUM,MaterialsSetup.BISMUTHPLATES,
                                SlimefunItems.REINFORCED_ALLOY_INGOT,SlimefunItems.REINFORCED_PLATE,SlimefunItems.REINFORCED_ALLOY_INGOT
                }).register(MainClass.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.MACHINECHASSIS, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.BISMUTH,MaterialsSetup.PLATINUM,MaterialsSetup.BISMUTH,
                        MaterialsSetup.PLATINUM,MaterialsSetup.MACHINEPLATING,MaterialsSetup.PLATINUM,
                        MaterialsSetup.BISMUTH,MaterialsSetup.PLATINUM,MaterialsSetup.BISMUTH
                }).register(MainClass.plugin);

        new SlimefunItem(Groups.EzMaterials, MaterialsSetup.DARKPHOTO, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{new ItemStack(Material.BLACK_STAINED_GLASS), new ItemStack(Material.BLACK_STAINED_GLASS), new ItemStack(Material.BLACK_STAINED_GLASS),
                        SlimefunItems.SILICON, SlimefunItems.SILICON, SlimefunItems.SILICON,
                        SlimefunItems.FERROSILICON, SlimefunItems.FERROSILICON, SlimefunItems.FERROSILICON
                }).register(MainClass.plugin);

                                                ////// CREDITS


        new SlimefunItem(Groups.Credits, ImSeven, RecipeType.NULL,
                new ItemStack[]{null})
                .register(MainClass.plugin);

        new SlimefunItem(Groups.Credits, Yuki, RecipeType.NULL,
                new ItemStack[]{null})
                .register(MainClass.plugin);

        new SlimefunItem(Groups.Credits, Unknown, RecipeType.NULL,
                new ItemStack[]{null})
                .register(MainClass.plugin);




    }





    private static final class RandomizedItemStack extends ItemStack {

        private final ItemStack[] items;

        public RandomizedItemStack(ItemStack... outputs) {
            super(outputs[0]);
            this.items = outputs;
        }

        @Nonnull
        @Override
        public ItemStack clone() {
            return this.items[ThreadLocalRandom.current().nextInt(this.items.length)].clone();
        }
    }
}
