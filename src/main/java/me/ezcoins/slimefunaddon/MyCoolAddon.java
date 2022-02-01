package me.ezcoins.slimefunaddon;

import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
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

        // Infused Diamond
        SlimefunItemStack Infused_Diamond = new SlimefunItemStack("INFUSED_DIAMOND", Material.DIAMOND, "&bInfused Diamond");

        ItemStack[] recipe_INFDiamond = {
                new ItemStack(Material.EMERALD), SlimefunItems.CARBONADO, new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.BARRIER), new ItemStack(Material.DIAMOND), null,
                new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD) };

        SlimefunItem INFDiamond = new SlimefunItem(itemGroup, Infused_Diamond, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_INFDiamond);
        INFDiamond.register(this);

        // RAI Block
        SlimefunItemStack RAI_BLOCK = new SlimefunItemStack("REINFORCED_ALLOY_BLOCK", Material.IRON_BLOCK, "&b&lReinforced Alloy Block");

        ItemStack[] recipe_RAIBlock = {
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT };
        SlimefunItem RAIBlock = new SlimefunItem(itemGroup, RAI_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_RAIBlock);
        RAIBlock.register(this);


        // Auto Salvager
        SlimefunItemStack AutoSal = new SlimefunItemStack("AUTO_SALVAGER", Material.WHITE_STAINED_GLASS, "&cAuto Salvager &7- &eI", "", "&4End-Game Machine", "&7> Speed: 1x");

        ItemStack[] recipe_AS = {
                SlimefunItems.ELECTRO_MAGNET, new ItemStack(Material.GOLD_BLOCK), SlimefunItems.ELECTRO_MAGNET,
                SlimefunItems.ELECTRIC_MOTOR , SlimefunItems.AUTO_ANVIL_2 , SlimefunItems.ELECTRIC_MOTOR,
                SlimefunItems.GILDED_IRON, Infused_Diamond, SlimefunItems.GILDED_IRON };
        SlimefunItem AS = new AutoSal(itemGroup, AutoSal, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_AS);
        AS.register(this);


        // DiamondScraps
        SlimefunItemStack DiamondScraps = new SlimefunItemStack("DIAMOND_SCRAPS", Material.CYAN_DYE, "&3Diamond Scraps", "&7Acquired from Auto Salvager");

        ItemStack[] recipe_DS = {
                null, null, null,
                null, null, null,
                null, null, null };

        SlimefunItem DS = new SlimefunItem(itemGroup, DiamondScraps, RecipeType.NULL, recipe_DS);
        DS.register(this);

        // Zinc Factory
        SlimefunItemStack ZINCFactory = new SlimefunItemStack("ZINC_FACTORY", Material.BLAST_FURNACE, "&cZink Factory","", "&4End-Game Machine");

        ItemStack[] recipe_ZF = {
                null, null, null,
                null, SlimefunItems.ELECTRIC_SMELTERY, null,
                null, null, null };
        SlimefunItem ZF = new IngotFactory(itemGroup, ZINCFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_ZF);
        ZF.register(this);

        // Copper Factory
        SlimefunItemStack CopperFactory = new SlimefunItemStack("COPPER_FACTORY", Material.BLAST_FURNACE, "&cCopper Factory","", "&4End-Game Machine");

        ItemStack[] recipe_CF = {
                null, null, null,
                null, SlimefunItems.ALUMINUM_INGOT, null,
                null, null, null };
        SlimefunItem CF = new IngotFactory(itemGroup, CopperFactory, RecipeType.ENHANCED_CRAFTING_TABLE, recipe_CF);
        CF.register(this);
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
