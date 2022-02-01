package me.ezcoins.slimefunaddon;

import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.ElectricSmeltery;
import me.ezcoins.slimefunaddon.Machines.CopperFactory;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.entity.Slime;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.java.JavaPlugin;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.ezcoins.slimefunaddon.Machines.*;
import me.ezcoins.slimefunaddon.Core.*;
import me.ezcoins.slimefunaddon.Materials.*;

import java.util.Arrays;

public class MyCoolAddon extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        ItemStack itemGroupItem = new CustomItemStack(Material.BIRCH_BOAT, "&eEzAddon", "", "&a> Click to open");
        NamespacedKey itemGroupId = new NamespacedKey(this, "addon_category");
        ItemGroup itemGroup = new ItemGroup(itemGroupId, itemGroupItem);

        // Zinc Factory
        SlimefunItemStack ZINCFactory = new SlimefunItemStack(
                "ZINC_FACTORY",
                Material.BLAST_FURNACE,
                "&cZinc Factory",
                "&7Turns 2 cobblestone into 1 Zinc Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(200));

        ItemStack[] recipe_ZF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.ZINC_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.ZINC_INGOT,
                SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem ZF = new ZincFactory(itemGroup, ZINCFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_ZF);
        ZF.register(this);

        // Copper Factory
        SlimefunItemStack CopperFactory = new SlimefunItemStack(
                "COPPER_FACTORY",
                Material.BLAST_FURNACE,
                "&cCopper Factory",
                "&7Turns 2 cobblestone into 1 Copper Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(200));

        ItemStack[] recipe_CF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.COPPER_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.COPPER_INGOT,
                SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem CF = new CopperFactory(itemGroup, CopperFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_CF);
        CF.register(this);

        // Aluminum Factory
        SlimefunItemStack AluminumFactory = new SlimefunItemStack(
                "ALUMINUM_FACTORY",
                Material.BLAST_FURNACE,
                "&cAluminum Factory",
                "&7Turns 2 cobblestone into 1 Aluminum Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(200));

        ItemStack[] recipe_AF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.ALUMINUM_INGOT,
                SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem AF = new AluminumFactory(itemGroup, AluminumFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_AF);
        AF.register(this);

        // Tin Factory
        SlimefunItemStack TinFactory = new SlimefunItemStack(
                "TIN_FACTORY",
                Material.BLAST_FURNACE,
                "&cTin Factory",
                "&7Turns 2 cobblestone into 1 Tin Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(200));

        ItemStack[] recipe_TF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.TIN_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.TIN_INGOT,
                SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem TF = new TinFactory(itemGroup, TinFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_TF);
        TF.register(this);

        // Silver Factory
        SlimefunItemStack SilverFactory = new SlimefunItemStack(
                "SILVER_FACTORY",
                Material.BLAST_FURNACE,
                "&cSilver Factory",
                "&7Turns 2 cobblestone into 1 Silver Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(200));

        ItemStack[] recipe_SF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.SILVER_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.SILVER_INGOT,
                SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem SF = new SilverFactory(itemGroup, SilverFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_SF);
        SF.register(this);

        // Lead Factory
        SlimefunItemStack LeadFactory = new SlimefunItemStack(
                "LEAD_FACTORY",
                Material.BLAST_FURNACE,
                "&cLead Factory",
                "&7Turns 2 cobblestone into 1 Lead Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(200));
        ItemStack[] recipe_LF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.LEAD_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.LEAD_INGOT,
                SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem LF = new LeadFactory(itemGroup, LeadFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_LF);
        LF.register(this);
        // Lead Factory
        SlimefunItemStack MagnesiumFactory = new SlimefunItemStack(
                "MAGNESIUM_FACTORY",
                Material.BLAST_FURNACE,
                "&cMagnesium Factory",
                "&7Turns 2 cobblestone into 1 Magnesium Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(200));
        ItemStack[] recipe_MF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.MAGNESIUM_INGOT,
                SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem MF = new MagnesiumFactory(itemGroup, MagnesiumFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_MF);
        MF.register(this);

        // Iron Factory
        SlimefunItemStack IronFactory = new SlimefunItemStack(
                "IRON_FACTORY",
                Material.BLAST_FURNACE,
                "&cIron Factory",
                "&7Turns 2 cobblestone into 1 Iron Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(200));
        ItemStack[] recipe_IF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                new ItemStack(Material.IRON_BLOCK), SlimefunItems.ELECTRIC_ORE_GRINDER_3, new ItemStack(Material.IRON_BLOCK),
                SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem IF = new IronFactory(itemGroup, IronFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_IF);
        IF.register(this);

        // Gold Factory
        SlimefunItemStack GoldFactory = new SlimefunItemStack(
                "GOLD_FACTORY",
                Material.BLAST_FURNACE,
                "&cGold Factory",
                "&7Turns 2 cobblestone into 1 Gold Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(200));
        ItemStack[] recipe_GF = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                new ItemStack(Material.GOLD_BLOCK), SlimefunItems.ELECTRIC_ORE_GRINDER_3, new ItemStack(Material.GOLD_BLOCK),
                SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL };
        SlimefunItem GF = new GoldFactory(itemGroup, GoldFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_GF);
        GF.register(this);
        // 24C Factory
        SlimefunItemStack CaratFactory = new SlimefunItemStack(
                "CARAT_FACTORY",
                Material.BLAST_FURNACE,
                "&c24-Carat Factory",
                "&7Turns 12 Gold Ingots into 1 24-Carat Gold Ingot","", "&4End-Game Machine",
                MachinesLore.speed(1),
                MachinesLore.ENERGY_CONSUMPTION(600));
        ItemStack[] recipe_CGF = {
                GoldFactory, GoldFactory, GoldFactory,
                SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.HEATING_COIL, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.ELECTRIC_MOTOR };
        SlimefunItem CGF = new CaratFactory(itemGroup, CaratFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_CGF);
        CGF.register(this);
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
