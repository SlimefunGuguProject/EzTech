package me.ezcoins.slimefunaddon.Recipes.Machines;

import java.util.EnumMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import io.github.mooy1.infinitylib.machines.MachineBlock;
import lombok.experimental.UtilityClass;
import me.ezcoins.slimefunaddon.Core.*;
import me.ezcoins.slimefunaddon.Machines.Factory.*;
import me.ezcoins.slimefunaddon.Machines.QOL.*;
import me.ezcoins.slimefunaddon.EasySlimefunAddon;
import me.ezcoins.slimefunaddon.Recipes.Materials.MaterialsSetup;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;


@UtilityClass
public class MachineRecipes {




    public static void setup(EasySlimefunAddon plugin) {

        //// MACHINES

        new PresCarbonPress(Groups.EzMachines, MachineSetup.PresCarbonPress, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRO_MAGNET, SlimefunItems.CARBONADO_EDGED_FURNACE, SlimefunItems.ELECTRO_MAGNET,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.CARBON_PRESS, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.CARBONADO, MaterialsSetup.MACHINECHASSIS, SlimefunItems.CARBONADO})
                .register(EasySlimefunAddon.plugin);

        new SaltShaker(Groups.EzMachines, MachineSetup.SaltShaker, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.HEATING_COIL, new ItemStack(Material.CAULDRON), SlimefunItems.HEATING_COIL,
                        new ItemStack(Material.IRON_BLOCK), SlimefunItems.SALT, new ItemStack(Material.IRON_BLOCK),
                        new ItemStack(Material.IRON_BLOCK), MaterialsSetup.MACHINE_MOTOR, new ItemStack(Material.IRON_BLOCK)})
                .register(EasySlimefunAddon.plugin);

        new CookieMaker(Groups.EzMachines, MachineSetup.CookieMaker, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, new ItemStack(Material.COOKIE, 64), null,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.HAY_BLOCK), SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR})
                .register(EasySlimefunAddon.plugin);

        new Corrupter(Groups.EzMachines, MachineSetup.Corrupter, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{MaterialsSetup.BISMUTHPLATES, new ItemStack(Material.END_CRYSTAL), MaterialsSetup.BISMUTHPLATES,
                        new ItemStack(Material.SOUL_SAND), MaterialsSetup.MACHINECHASSIS, new ItemStack(Material.SOUL_SAND),
                        MaterialsSetup.BISMUTHPLATES, MaterialsSetup.MACHINE_MOTOR, MaterialsSetup.BISMUTHPLATES})
                .register(EasySlimefunAddon.plugin);

        new Hydronator(Groups.EzMachines, MachineSetup.Hydronator, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, new ItemStack(Material.DIAMOND_PICKAXE), null,
                        new ItemStack(Material.WATER_BUCKET), SlimefunItems.PROGRAMMABLE_ANDROID_MINER, new ItemStack(Material.WATER_BUCKET),
                        new ItemStack(Material.WHITE_CONCRETE), MaterialsSetup.MACHINE_MOTOR, new ItemStack(Material.WHITE_CONCRETE)})
                .register(EasySlimefunAddon.plugin);


        new MaterialGenerator(Groups.EzMachines, MachineSetup.COBBLEGENS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null,new ItemStack(Material.DIAMOND_PICKAXE),null,
                new ItemStack(Material.LAVA_BUCKET),SlimefunItems.PROGRAMMABLE_ANDROID_MINER,new ItemStack(Material.WATER_BUCKET),
                SlimefunItems.ELECTRIC_MOTOR, MaterialsSetup.MACHINEPLATING,SlimefunItems.ELECTRIC_MOTOR
        }).material(Material.COBBLESTONE).speed(1).energyPerTick(48).register(EasySlimefunAddon.plugin);


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
        new MachineBlock(Groups.EzMachines, MachineSetup.INGOTEXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ELECTRIC_GOLD_PAN_3, MaterialsSetup.MACHINEPLATING, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_2, SlimefunItems.ELECTRIC_DUST_WASHER_3,
                SlimefunItems.ELECTRIC_ORE_GRINDER_3, MaterialsSetup.MACHINE_MOTOR, SlimefunItems.ELECTRIC_ORE_GRINDER_3

        }).addRecipe(twoIngot, new ItemStack(Material.COBBLESTONE, 2)).ticksPerOutput(2).
                energyPerTick(300).register(EasySlimefunAddon.plugin);

        new GoldRefinery(Groups.EzMachines, MachineSetup.GOLDREFINERY, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{null, SlimefunItems.LAVA_CRYSTAL, null,
                        SlimefunItems.ELECTRIC_SMELTERY_2, MaterialsSetup.MACHINECHASSIS, SlimefunItems.ELECTRIC_SMELTERY_2,
                        SlimefunItems.GOLD_24K_BLOCK, MaterialsSetup.MACHINE_MOTOR, SlimefunItems.GOLD_24K_BLOCK})
                .register(EasySlimefunAddon.plugin);

        new UraniumExtractor(Groups.EzMachines, MachineSetup.URANIUMEXTRACTOR, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ELECTRIC_ORE_GRINDER_2,
                        SlimefunItems.ENHANCED_AUTO_CRAFTER, MaterialsSetup.MACHINECHASSIS, SlimefunItems.ENHANCED_AUTO_CRAFTER,
                        SlimefunItems.ELECTRIC_GOLD_PAN_3, MaterialsSetup.MACHINE_MOTOR, SlimefunItems.ELECTRIC_DUST_WASHER_3})
                .register(EasySlimefunAddon.plugin);

        new ExtremeFreezer(Groups.EzMachines, MachineSetup.ExtremeFreezer, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.FREEZER_2, SlimefunItems.REACTOR_COOLANT_CELL, SlimefunItems.FREEZER_2,
                        new ItemStack(Material.WATER_BUCKET), MaterialsSetup.MACHINECHASSIS, new ItemStack(Material.WATER_BUCKET),
                        SlimefunItems.FREEZER_2, MaterialsSetup.MACHINE_MOTOR, SlimefunItems.FREEZER_2})
                .register(EasySlimefunAddon.plugin);




        new Decompressor(Groups.EzMachines, MachineSetup.ItemProcessor, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        null, SlimefunItems.ELECTRIC_ORE_GRINDER_2, null,
                        SlimefunItems.HARDENED_METAL_INGOT, new ItemStack(Material.PISTON), SlimefunItems.HARDENED_METAL_INGOT,
                        SlimefunItems.ELECTRIC_MOTOR, MaterialsSetup.MACHINE_MOTOR, SlimefunItems.ELECTRIC_MOTOR})
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

        new TreeGrowers(Groups.EzMachines, MachineSetup.TREEHOUSE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.STRIPPED_OAK_LOG), new ItemStack(Material.DIAMOND_AXE), new ItemStack(Material.STRIPPED_OAK_LOG),
                SlimefunItems.HEATING_COIL, SlimefunItems.PROGRAMMABLE_ANDROID_WOODCUTTER, SlimefunItems.HEATING_COIL,
                MaterialsSetup.BISMUTHPLATES, MaterialsSetup.MACHINE_MOTOR, MaterialsSetup.BISMUTHPLATES
        }).recipes(trees).ticksPerOutput(50).energyPerTick(36).register(plugin);

        new GreenHouse(Groups.EzMachines, MachineSetup.GREENHOUSE, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.LIME_STAINED_GLASS), SlimefunItems.PROGRAMMABLE_ANDROID_2_FARMER, new ItemStack(Material.LIME_STAINED_GLASS),
                        SlimefunItems.HEATING_COIL, MaterialsSetup.MACHINECHASSIS, SlimefunItems.HEATING_COIL,
                        new ItemStack(Material.WATER_BUCKET), MachineSetup.TREEHOUSE, new ItemStack(Material.WATER_BUCKET)})
                .setEnergyCapacity(512)
                .setEnergyConsumption(32)
                .setProcessingSpeed(1)
                .register(plugin);

                                                ////// CREDITS




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
