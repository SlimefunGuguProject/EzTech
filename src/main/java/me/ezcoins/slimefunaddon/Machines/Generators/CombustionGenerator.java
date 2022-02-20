package me.ezcoins.slimefunaddon.Machines.Generators;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;

public class CombustionGenerator extends AGenerator {

    public CombustionGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(2, new ItemStack(Material.GUNPOWDER)));
        registerFuel(new MachineFuel(5, new ItemStack(Material.FIREWORK_ROCKET)));
        registerFuel(new MachineFuel(15, new ItemStack(Material.TNT)));
        registerFuel(new MachineFuel(30, new ItemStack(Material.END_CRYSTAL)));

    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.FLINT_AND_STEEL);
    }

}
