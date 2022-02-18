package me.ezcoins.slimefunaddon.Core;


import javax.annotation.ParametersAreNonnullByDefault;

import io.github.thebusybiscuit.exoticgarden.ExoticGardenRecipeTypes;
import io.github.thebusybiscuit.exoticgarden.items.ExoticGardenFruit;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class Foods extends ExoticGardenFruit {

    private final int food;

    @ParametersAreNonnullByDefault
    public Foods(ItemGroup itemGroup, SlimefunItemStack item, ItemStack[] recipe, int food) {
        super(itemGroup, item, EzRecipeTypes.SAUCEDIPPER, true, recipe);
        this.food = food;
    }

    @ParametersAreNonnullByDefault
    public Foods(ItemGroup itemGroup, SlimefunItemStack item, int amount, ItemStack[] recipe, int food) {
        super(itemGroup, item, RecipeType.ENHANCED_CRAFTING_TABLE, true, recipe, new SlimefunItemStack(item, amount));
        this.food = food;
    }

    @Override
    public int getFoodValue() {
        return food;
    }

}