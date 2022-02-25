package me.ezcoins.slimefunaddon.Machines.QOL;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.ezcoins.slimefunaddon.Recipes.Materials.MaterialsSetup;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Decompressor extends AContainer implements RecipeDisplayItem{
    public static final int ENERGY_CONSUMPTION = 24;
    public static final int CAPACITY = ENERGY_CONSUMPTION * 3;
    public static final int SPEED = 1;
    private final ItemSetting<Boolean> useVanillaRatios = new ItemSetting<>(this, "use-vanilla-ratios", false);

    public Decompressor(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemSetting(useVanillaRatios);
    }

    @Override
    protected void registerDefaultRecipes() {
        if (useVanillaRatios.getValue()) {
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.COAL_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.COAL, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.COPPER_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.COPPER_INGOT, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.IRON_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GOLD_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.LAPIS_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.LAPIS_LAZULI, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.REDSTONE_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.REDSTONE, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.DIAMOND_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.DIAMOND, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.EMERALD_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.EMERALD, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.NETHERITE_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.NETHERITE_INGOT, 9) });

            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GLASS,6) }, new ItemStack[] { new ItemStack(Material.GLASS_PANE, 16) });
            registerRecipe(2, new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE, 1), (new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 8)));
            registerRecipe(2, new SlimefunItemStack(MaterialsSetup.BISMUTHPLATES, 1), (new SlimefunItemStack(MaterialsSetup.BISMUTH, 8)));
            registerRecipe(2, new SlimefunItemStack(SlimefunItems.STEEL_PLATE, 1), (new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 8)));



        } else {
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.COAL_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.COAL, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.COPPER_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.COPPER_INGOT, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.IRON_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GOLD_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.LAPIS_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.LAPIS_LAZULI, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.REDSTONE_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.REDSTONE, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.DIAMOND_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.DIAMOND, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.EMERALD_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.EMERALD, 9) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.NETHERITE_BLOCK,1) }, new ItemStack[] { new ItemStack(Material.NETHERITE_INGOT, 9) });

            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GLASS,6) }, new ItemStack[] { new ItemStack(Material.GLASS_PANE, 16) });
            registerRecipe(2, new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE, 1), (new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 8)));
            registerRecipe(2, new SlimefunItemStack(MaterialsSetup.BISMUTHPLATES, 1), (new SlimefunItemStack(MaterialsSetup.BISMUTH, 8)));

        }

    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size());

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);


        }

        return displayRecipes;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.GOLDEN_AXE);
    }

    @Override
    public String getMachineIdentifier() {
        return "BLOCKSLICER";
    }

    @Override
    public int getCapacity() {
        return CAPACITY;
    }

    @Override
    public int getEnergyConsumption() {return ENERGY_CONSUMPTION;
    }

    @Override
    public int getSpeed() {
        return SPEED;
    }
}
