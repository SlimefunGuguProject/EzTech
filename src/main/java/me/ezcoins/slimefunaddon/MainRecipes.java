package me.ezcoins.slimefunaddon;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.ezcoins.slimefunaddon.Materials.Materials;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import me.ezcoins.slimefunaddon.Machines.QOL.*;
import me.ezcoins.slimefunaddon.Machines.Factory.*;
import me.ezcoins.slimefunaddon.Core.*;
import me.ezcoins.slimefunaddon.Core.Groups;

public class MainRecipes extends JavaPlugin implements SlimefunAddon {

    public static MainRecipes plugin;

    public static MainRecipes getInstance() {
        return plugin;
    }

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example

            plugin = this;

            Materials.setup(plugin);
        }






        // Zinc Factory
        SlimefunItemStack ZINCFactory = new SlimefunItemStack(
                "ZINC_FACTORY",
                Material.BLAST_FURNACE,
                "&cZinc Factory",
                "&7Turns 16 cobblestone into 8 Zinc Ingots","",
                MachinesLore.ENERGY_CONSUMPTION(475),
                MachinesLore.energyBuffer(800));

        ItemStack[] recipe_ZF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.ZINC_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.ZINC_INGOT,
                SlimefunItems.HEATING_COIL, Materials.MACHINE_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem ZF = new ZincFactory(Groups.EzMachines, ZINCFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_ZF);
        ZF.register(plugin);

        // Copper Factory
        SlimefunItemStack CopperFactory = new SlimefunItemStack(
                "COPPER_FACTORY",
                Material.BLAST_FURNACE,
                "&cCopper Factory",
                "&7Turns 16 cobblestone into 8 Copper Ingots","",
                MachinesLore.ENERGY_CONSUMPTION(475),
                MachinesLore.energyBuffer(800));

        ItemStack[] recipe_CF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.COPPER_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.COPPER_INGOT,
                SlimefunItems.HEATING_COIL, Materials.MACHINE_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem CF = new CopperFactory(Groups.EzMachines, CopperFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_CF);
        CF.register(plugin);

        // Aluminum Factory
        SlimefunItemStack AluminumFactory = new SlimefunItemStack(
                "ALUMINUM_FACTORY",
                Material.BLAST_FURNACE,
                "&cAluminum Factory",
                "&7Turns 16 cobblestone into 8 Aluminum Ingots","",
                MachinesLore.ENERGY_CONSUMPTION(475),
                MachinesLore.energyBuffer(800));

        ItemStack[] recipe_AF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.ALUMINUM_INGOT,
                SlimefunItems.HEATING_COIL, Materials.MACHINE_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem AF = new AluminumFactory(Groups.EzMachines, AluminumFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_AF);
        AF.register(plugin);

        // Tin Factory
        SlimefunItemStack TinFactory = new SlimefunItemStack(
                "TIN_FACTORY",
                Material.BLAST_FURNACE,
                "&cTin Factory",
                "&7Turns 16 cobblestone into 8 Tin Ingots","",
                MachinesLore.ENERGY_CONSUMPTION(475),
                MachinesLore.energyBuffer(800));

        ItemStack[] recipe_TF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.TIN_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.TIN_INGOT,
                SlimefunItems.HEATING_COIL, Materials.MACHINE_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem TF = new TinFactory(Groups.EzMachines, TinFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_TF);
        TF.register(this);

        // Silver Factory
        SlimefunItemStack SilverFactory = new SlimefunItemStack(
                "SILVER_FACTORY",
                Material.BLAST_FURNACE,
                "&cSilver Factory",
                "&7Turns 16 cobblestone into 8 Silver Ingots","",
                MachinesLore.ENERGY_CONSUMPTION(475),
                MachinesLore.energyBuffer(800));

        ItemStack[] recipe_SF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.SILVER_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.SILVER_INGOT,
                SlimefunItems.HEATING_COIL, Materials.MACHINE_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem SF = new SilverFactory(Groups.EzMachines, SilverFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_SF);
        SF.register(this);

        // Lead Factory
        SlimefunItemStack LeadFactory = new SlimefunItemStack(
                "LEAD_FACTORY",
                Material.BLAST_FURNACE,
                "&cLead Factory",
                "&7Turns 16 cobblestone into 8 Lead Ingots","",
                MachinesLore.ENERGY_CONSUMPTION(475),
                MachinesLore.energyBuffer(800));
        ItemStack[] recipe_LF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.LEAD_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.LEAD_INGOT,
                SlimefunItems.HEATING_COIL, Materials.MACHINE_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem LF = new LeadFactory(Groups.EzMachines, LeadFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_LF);
        LF.register(this);
        // Lead Factory
        SlimefunItemStack MagnesiumFactory = new SlimefunItemStack(
                "MAGNESIUM_FACTORY",
                Material.BLAST_FURNACE,
                "&cMagnesium Factory",
                "&7Turns 16 cobblestone into 8 Magnesium Ingots","",
                MachinesLore.ENERGY_CONSUMPTION(475),
                MachinesLore.energyBuffer(800));
        ItemStack[] recipe_MF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.MAGNESIUM_INGOT,
                SlimefunItems.HEATING_COIL, Materials.MACHINE_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem MF = new MagnesiumFactory(Groups.EzMachines, MagnesiumFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_MF);
        MF.register(this);

        // Iron Factory
        SlimefunItemStack IronFactory = new SlimefunItemStack(
                "IRON_FACTORY",
                Material.BLAST_FURNACE,
                "&cIron Factory",
                "&7Turns 16 cobblestone into 8 Iron Ingots","",
                MachinesLore.ENERGY_CONSUMPTION(475),
                MachinesLore.energyBuffer(800));
        ItemStack[] recipe_IF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                new ItemStack(Material.IRON_BLOCK), SlimefunItems.ELECTRIC_ORE_GRINDER_3, new ItemStack(Material.IRON_BLOCK),
                SlimefunItems.HEATING_COIL, Materials.MACHINE_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem IF = new IronFactory(Groups.EzMachines, IronFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_IF);
        IF.register(this);

        // Gold Factory
        SlimefunItemStack GoldFactory = new SlimefunItemStack(
                "GOLD_FACTORY",
                Material.BLAST_FURNACE,
                "&cGold Factory",
                "&7Turns 16 cobblestone into 8 Gold Ingots","",
                MachinesLore.ENERGY_CONSUMPTION(475),
                MachinesLore.energyBuffer(800));
        ItemStack[] recipe_GF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                new ItemStack(Material.GOLD_BLOCK), SlimefunItems.ELECTRIC_ORE_GRINDER_3, new ItemStack(Material.GOLD_BLOCK),
                SlimefunItems.HEATING_COIL, Materials.MACHINE_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem GF = new GoldFactory(Groups.EzMachines, GoldFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_GF);
        GF.register(this);
        // 24C Factory
        SlimefunItemStack CaratFactory = new SlimefunItemStack(
                "CARAT_FACTORY",
                Material.GOLD_BLOCK,
                "&624-Carat Factory",
                "&7Turns 12 Gold Ingots into 1 24-Carat Gold Ingot","",
                MachinesLore.ENERGY_CONSUMPTION(540),
                MachinesLore.energyBuffer(3240));
        ItemStack[] recipe_CGF = {
                GoldFactory, GoldFactory, GoldFactory,
                SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.HEATING_COIL, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                Materials.MACHINE_MOTOR, SlimefunItems.GOLD_24K_BLOCK, Materials.MACHINE_MOTOR };
        SlimefunItem CGF = new CaratFactory(Groups.EzMachines, CaratFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_CGF);
        CGF.register(this);

        // Pressurized Carbon Press
        SlimefunItemStack PresCarbonPress = new SlimefunItemStack(
                "PRESCARBON_PRESS",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjA5MTQyZjNhMGFiY2Y5YWZkYjkzYmNjZDdmNGQ3MzNjYzZlZTM0N2Y3NjBiNGE3Y2IzM2ZiZDljZjk5YWJiMCJ9fX0=",
                "&ePressurized Carbon Press",
                "&7Turns logs into Carbon","",
                MachinesLore.ENERGY_CONSUMPTION(200),
                MachinesLore.energyBuffer(900));
        ItemStack[] recipe_PP = {
                SlimefunItems.ELECTRO_MAGNET, SlimefunItems.CARBONADO_EDGED_FURNACE, SlimefunItems.ELECTRO_MAGNET,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.CARBON_PRESS_3, SlimefunItems.REINFORCED_ALLOY_INGOT,
                Materials.MACHINE_MOTOR, SlimefunItems.CARBONADO, Materials.MACHINE_MOTOR };
        SlimefunItem PP = new PresCarbonPress(Groups.EzMachines, PresCarbonPress, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_PP);
        PP.register(this);
        //
        SlimefunItemStack ElectricGM = new SlimefunItemStack(
                "SALT_PRODUCER",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk0Y2M3MjVlM2VjNDJkOTc0NjQwNDMxODBiNmEyYTZiNmYwZGU4OGNkZjY0NmM2NDk0NTIwODM2YTQ4YThiNyJ9fX0=",
                "&fSalt Producer",
                "",
                MachinesLore.ENERGY_CONSUMPTION(16),
                MachinesLore.energyBuffer(120));
        ItemStack[] recipe_EGM = {
                SlimefunItems.HEATING_COIL,new ItemStack(Material.CAULDRON),SlimefunItems.HEATING_COIL,
                new ItemStack(Material.IRON_BLOCK),SlimefunItems.SALT,new ItemStack(Material.IRON_BLOCK),
                new ItemStack(Material.IRON_BLOCK),Materials.MACHINE_MOTOR,new ItemStack(Material.IRON_BLOCK)};
        SlimefunItem EGM = new SaltProducer(Groups.EzMachines, ElectricGM, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_EGM);
        EGM.register(this);

        SlimefunItemStack CookieMaker = new SlimefunItemStack(
                "COOKIE_MAKER",
                "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQ3NjY5NWRmY2MxNzBiZDc0ZWFkNGNiYWYxNzVlMTM3ODdjYmRmN2YzMmYwOGZmY2FhZmY2Mzg1OGUzYzEyMCJ9fX0=",
                "&7Cookie Jar",
                "",
                MachinesLore.ENERGY_CONSUMPTION(16),
                MachinesLore.energyBuffer(120));
        ItemStack[] recipe_CM = {
                SlimefunItems.ELECTRO_MAGNET, SlimefunItems.CARBONADO_EDGED_FURNACE, SlimefunItems.ELECTRO_MAGNET,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.CARBONADO, SlimefunItems.ELECTRIC_MOTOR };
        SlimefunItem CM = new CookieMaker(Groups.EzMachines, CookieMaker, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_CM);
        CM.register(this);

        SlimefunItemStack Corrupter = new SlimefunItemStack(
                "CORRUPTER",
                Material.GILDED_BLACKSTONE,
                "&cCorrupter",
                "",
                MachinesLore.ENERGY_CONSUMPTION(160),
                MachinesLore.energyBuffer(950));
        ItemStack[] recipe_CR = {
                SlimefunItems.ELECTRO_MAGNET, SlimefunItems.CARBONADO_EDGED_FURNACE, SlimefunItems.ELECTRO_MAGNET,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.CARBONADO, SlimefunItems.ELECTRIC_MOTOR };
        SlimefunItem CR = new Corrupter(Groups.EzMachines, Corrupter, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_CR);
        CR.register(this);
    }





    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }
}
