package me.ezcoins.slimefunaddon.Machines.QOL;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Hydronator extends AContainer implements RecipeDisplayItem{
    public static final int ENERGY_CONSUMPTION = 20;
    public static final int CAPACITY = ENERGY_CONSUMPTION * 3;
    public static final int SPEED = 1;
    private final ItemSetting<Boolean> useVanillaRatios = new ItemSetting<>(this, "use-vanilla-ratios", false);

    public Hydronator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        addItemSetting(useVanillaRatios);
    }

    @Override
    protected void registerDefaultRecipes() {
        if (useVanillaRatios.getValue()) {
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.RED_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.RED_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.ORANGE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.ORANGE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.YELLOW_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.YELLOW_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.LIME_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.LIME_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GREEN_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.GREEN_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.LIGHT_BLUE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.LIGHT_BLUE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.CYAN_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.CYAN_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.BLUE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.BLUE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.PINK_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.PINK_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.MAGENTA_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.MAGENTA_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.PURPLE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.PURPLE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.WHITE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.WHITE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.LIGHT_GRAY_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GRAY_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.GRAY_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.BLACK_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.BLACK_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.BROWN_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.BROWN_CONCRETE) });




        } else {
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.RED_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.RED_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.ORANGE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.ORANGE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.YELLOW_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.YELLOW_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.LIME_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.LIME_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GREEN_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.GREEN_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.LIGHT_BLUE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.LIGHT_BLUE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.CYAN_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.CYAN_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.BLUE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.BLUE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.PINK_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.PINK_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.MAGENTA_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.MAGENTA_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.PURPLE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.PURPLE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.WHITE_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.WHITE_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.LIGHT_GRAY_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.GRAY_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.GRAY_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.BLACK_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.BLACK_CONCRETE) });
            registerRecipe(2, new ItemStack[] { new ItemStack(Material.BROWN_CONCRETE_POWDER) }, new ItemStack[] { new ItemStack(Material.BROWN_CONCRETE) });


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
        return new ItemStack(Material.WATER_BUCKET);
    }

    @Override
    public String getMachineIdentifier() {
        return "HYDRONATOR";
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
