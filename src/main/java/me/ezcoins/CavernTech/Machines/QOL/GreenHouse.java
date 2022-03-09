package me.ezcoins.CavernTech.Machines.QOL;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.ezcoins.CavernTech.Core.GreenhouseBlock;
import me.ezcoins.CavernTech.CavernTech;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class GreenHouse extends GreenhouseBlock implements RecipeDisplayItem {
    private ItemSetting<Boolean> exoticGardenIntegration = new ItemSetting<Boolean>(this, "exotic-garden-integration", true);

    public GreenHouse(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);

        addItemSetting(exoticGardenIntegration);
    }

    @Override
    protected void registerDefaultRecipes() {


        registerRecipe(12, new ItemStack(Material.CARROT), new ItemStack(Material.CARROT, 2));
        registerRecipe(12, new ItemStack(Material.POTATO), new ItemStack(Material.POTATO, 2));
        registerRecipe(12, new ItemStack(Material.SWEET_BERRIES), new ItemStack(Material.SWEET_BERRIES, 2));
        registerRecipe(12, new ItemStack(Material.SUGAR_CANE), new ItemStack(Material.SUGAR_CANE, 2));
        registerRecipe(12, new ItemStack(Material.BAMBOO), new ItemStack(Material.BAMBOO, 2));
        registerRecipe(12, new ItemStack(Material.CACTUS), new ItemStack(Material.CACTUS, 2));

        registerRecipe(20, new ItemStack[] { new ItemStack(Material.OAK_SAPLING)}, new ItemStack[] { new ItemStack(Material.OAK_LEAVES, 8), new ItemStack(Material.APPLE, 1), new ItemStack(Material.OAK_LOG, 6) });
        registerRecipe(20, new ItemStack[] { new ItemStack(Material.BIRCH_SAPLING)}, new ItemStack[] { new ItemStack(Material.BIRCH_LEAVES, 8), new ItemStack(Material.BIRCH_LOG, 6)});
        registerRecipe(20, new ItemStack[] { new ItemStack(Material.DARK_OAK_SAPLING)}, new ItemStack[] { new ItemStack(Material.DARK_OAK_LEAVES, 8), new ItemStack(Material.DARK_OAK_LOG, 6), new ItemStack(Material.APPLE)});
        registerRecipe(20, new ItemStack[] { new ItemStack(Material.SPRUCE_SAPLING)}, new ItemStack[] { new ItemStack(Material.SPRUCE_LEAVES, 8), new ItemStack(Material.SPRUCE_LOG, 6)});
        registerRecipe(20, new ItemStack[] { new ItemStack(Material.JUNGLE_SAPLING)}, new ItemStack[] { new ItemStack(Material.JUNGLE_LEAVES, 8), new ItemStack(Material.JUNGLE_LOG, 6)});
        registerRecipe(20, new ItemStack[] { new ItemStack(Material.ACACIA_SAPLING)}, new ItemStack[] { new ItemStack(Material.ACACIA_LEAVES, 8), new ItemStack(Material.ACACIA_LOG, 6)});
        registerRecipe(20, new ItemStack[] { new ItemStack(Material.CRIMSON_FUNGUS)}, new ItemStack[] { new ItemStack(Material.WEEPING_VINES, 2), new ItemStack(Material.CRIMSON_STEM, 6)});
        registerRecipe(20, new ItemStack[] { new ItemStack(Material.WARPED_FUNGUS)}, new ItemStack[] { new ItemStack(Material.SHROOMLIGHT, 2), new ItemStack(Material.WARPED_STEM, 6)});


        registerRecipe(10, new ItemStack(Material.DANDELION), new ItemStack(Material.DANDELION, 3));
        registerRecipe(10, new ItemStack(Material.POPPY), new ItemStack(Material.POPPY, 3));
        registerRecipe(10, new ItemStack(Material.BLUE_ORCHID), new ItemStack(Material.BLUE_ORCHID, 3));
        registerRecipe(10, new ItemStack(Material.ALLIUM), new ItemStack(Material.ALLIUM, 3));
        registerRecipe(10, new ItemStack(Material.AZURE_BLUET), new ItemStack(Material.AZURE_BLUET, 3));
        registerRecipe(10, new ItemStack(Material.RED_TULIP), new ItemStack(Material.RED_TULIP, 3));
        registerRecipe(10, new ItemStack(Material.ORANGE_TULIP), new ItemStack(Material.ORANGE_TULIP, 3));
        registerRecipe(10, new ItemStack(Material.WHITE_TULIP), new ItemStack(Material.WHITE_TULIP, 3));
        registerRecipe(10, new ItemStack(Material.PINK_TULIP), new ItemStack(Material.PINK_TULIP, 3));
        registerRecipe(10, new ItemStack(Material.OXEYE_DAISY), new ItemStack(Material.OXEYE_DAISY, 3));
        registerRecipe(10, new ItemStack(Material.CORNFLOWER), new ItemStack(Material.CORNFLOWER, 3));
        registerRecipe(10, new ItemStack(Material.LILY_OF_THE_VALLEY), new ItemStack(Material.LILY_OF_THE_VALLEY, 3));
        registerRecipe(10, new ItemStack(Material.WITHER_ROSE), new ItemStack(Material.WITHER_ROSE, 2));
        registerRecipe(10, new ItemStack(Material.SUNFLOWER), new ItemStack(Material.SUNFLOWER, 2));
        registerRecipe(10, new ItemStack(Material.LILAC), new ItemStack(Material.LILAC, 2));
        registerRecipe(10, new ItemStack(Material.ROSE_BUSH), new ItemStack(Material.ROSE_BUSH, 2));
        registerRecipe(10, new ItemStack(Material.PEONY), new ItemStack(Material.PEONY, 2));
    }

    @Override
    public MachineRecipe findNextRecipe(BlockMenu inv) {
        if (CavernTech.isExoticGardenInstalled() && exoticGardenIntegration.getValue()) {
            for (int inputSlot : getInputSlots()) {
                ItemStack item = inv.getItemInSlot(inputSlot);
                if (item != null && SlimefunItem.getByItem(item) != null) {
                    SlimefunItem sfItem = SlimefunItem.getByItem(item);
                    if (sfItem.getId().contains("_BUSH") || sfItem.getId().contains("_PLANT") || sfItem.getId().contains("_SAPLING")) {
                        if (sfItem.getId().contains("_BUSH")) {
                            ItemStack fruit = SlimefunItem.getById(sfItem.getId().replace("_BUSH", "")).getItem().clone();
                            MachineRecipe recipe = new MachineRecipe(30, new ItemStack[] {sfItem.getItem()}, new ItemStack[] {fruit});


                            return recipe;
                        } else
                        if (sfItem.getId().contains("_SAPLING")) {
                            ItemStack fruit = SlimefunItem.getById(sfItem.getId().replace("_SAPLING", "")).getItem().clone();
                            fruit.setAmount(3);
                            MachineRecipe recipe = new MachineRecipe(30, new ItemStack[] {sfItem.getItem()}, new ItemStack[] {fruit});

                            return recipe;
                        }

                    }
                }
            }
        }
        return super.findNextRecipe(inv);

    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.IRON_HOE);
    }

    @Override
    public String getMachineIdentifier() {
        return "GREENHOUSE";
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
}
