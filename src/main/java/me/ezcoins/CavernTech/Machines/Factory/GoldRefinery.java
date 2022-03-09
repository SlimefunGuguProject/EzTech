package me.ezcoins.CavernTech.Machines.Factory;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class GoldRefinery extends AContainer implements RecipeDisplayItem{
    public static final int ENERGY_CONSUMPTION = 250;
    public static final int CAPACITY = ENERGY_CONSUMPTION * 3;
    private final ItemSetting<Boolean> useVanillaRatios = new ItemSetting<>(this, "use-vanilla-ratios", false);

    public GoldRefinery(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemSetting(useVanillaRatios);
    }

    @Override
    protected void registerDefaultRecipes() {
        if (useVanillaRatios.getValue()) {
            registerRecipe(30, new ItemStack(Material.GOLD_INGOT, 12), (new SlimefunItemStack(SlimefunItems.GOLD_24K,1)));
            registerRecipe(30, new SlimefunItemStack(SlimefunItems.GOLD_DUST, 12), (new SlimefunItemStack(SlimefunItems.GOLD_24K,1)));
            registerRecipe(30, new SlimefunItemStack(SlimefunItems.GOLD_4K, 12), (new SlimefunItemStack(SlimefunItems.GOLD_24K, 1)));


        } else {
            registerRecipe(30, new ItemStack(Material.GOLD_INGOT, 12), (new SlimefunItemStack(SlimefunItems.GOLD_24K,1)));
            registerRecipe(30, new SlimefunItemStack(SlimefunItems.GOLD_DUST, 12), (new SlimefunItemStack(SlimefunItems.GOLD_24K,1)));
            registerRecipe(30, new SlimefunItemStack(SlimefunItems.GOLD_4K, 12), (new SlimefunItemStack(SlimefunItems.GOLD_24K, 1)));



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
        return new ItemStack(Material.LAVA_BUCKET);
    }

    @Override
    public String getMachineIdentifier() {
        return "GoldRefinery";
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
        return 01;
    }
}
