package me.ezcoins.slimefunaddon;

import java.util.ArrayList;
import java.util.List;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;

public class AutoSal extends AContainer implements RecipeDisplayItem {

    public static final int ENERGY_CONSUMPTION = 256;
    public static final int CAPACITY = ENERGY_CONSUMPTION * 3;
    private final ItemSetting<Boolean> useVanillaRatios = new ItemSetting<>(this, "use-vanilla-ratios", false);

    public AutoSal(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemSetting(useVanillaRatios);
    }



    @Override
    protected void registerDefaultRecipes() {
        if (useVanillaRatios.getValue()) {
            registerRecipe(1, new ItemStack(Material.IRON_INGOT), (new SlimefunItemStack(Materials.TESTING_INGOT,1)));
            registerRecipe(1, new ItemStack[] { new ItemStack(Material.IRON_HOE) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 1) });
            registerRecipe(1, new ItemStack[] { new ItemStack(Material.IRON_SWORD) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.IRON_PICKAXE) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 2) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.IRON_AXE) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 2) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.IRON_BOOTS) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 2) });
            registerRecipe(3, new ItemStack[] { new ItemStack(Material.IRON_HELMET) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 3) });
            registerRecipe(4, new ItemStack[] { new ItemStack(Material.IRON_LEGGINGS) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 4) });
            registerRecipe(5, new ItemStack[] { new ItemStack(Material.IRON_CHESTPLATE) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 5) });

            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GOLDEN_SHOVEL) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GOLDEN_HOE) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GOLDEN_SWORD) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 1) });
            registerRecipe(4, new ItemStack[] { new ItemStack(Material.GOLDEN_PICKAXE) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 2) });
            registerRecipe(4, new ItemStack[] { new ItemStack(Material.GOLDEN_AXE) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 2) });
            registerRecipe(4, new ItemStack[] { new ItemStack(Material.GOLDEN_BOOTS) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 2) });
            registerRecipe(6, new ItemStack[] { new ItemStack(Material.GOLDEN_HELMET) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 3) });
            registerRecipe(8, new ItemStack[] { new ItemStack(Material.GOLDEN_LEGGINGS) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 4) });
            registerRecipe(10, new ItemStack[] { new ItemStack(Material.GOLDEN_CHESTPLATE) }, new ItemStack[] { new ItemStack(Material.GOLD_INGOT, 5) });
        } else {
            registerRecipe(1, new ItemStack(Material.IRON_INGOT), (new SlimefunItemStack(Materials.TESTING_INGOT,1)));
            registerRecipe(1, new ItemStack[] { new ItemStack(Material.IRON_HOE) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 1) });
            registerRecipe(1, new ItemStack[] { new ItemStack(Material.IRON_SWORD) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 1) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.IRON_PICKAXE) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 2) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.IRON_AXE) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 2) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.IRON_BOOTS) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 2) });
            registerRecipe(3, new ItemStack[] { new ItemStack(Material.IRON_HELMET) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 3) });
            registerRecipe(4, new ItemStack[] { new ItemStack(Material.IRON_LEGGINGS) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 4) });
            registerRecipe(5, new ItemStack[] { new ItemStack(Material.IRON_CHESTPLATE) }, new ItemStack[] { new ItemStack(Material.IRON_INGOT, 5) });


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
        return "AutoSal";
    }

    @Override
    public int getCapacity() {
        return CAPACITY;
    }

    @Override
    public int getEnergyConsumption() {
        return ENERGY_CONSUMPTION;
    }

    @Override
    public int getSpeed() {
        return 10;
    }
    }
