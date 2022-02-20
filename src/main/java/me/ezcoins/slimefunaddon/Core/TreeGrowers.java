package me.ezcoins.slimefunaddon.Core;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import lombok.Setter;

import me.ezcoins.slimefunaddon.MainClass;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.machines.AbstractMachineBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;

public final class TreeGrowers extends AbstractMachineBlock implements RecipeDisplayItem {

    private static final int[] OUTPUT_SLOTS = {
            10,11,12,13,14,15,16,
            19,20,21,22,23,24,25,
            28,29,33,34,
            37,38,42,43
    };
    private static final int[] INPUT_SLOTS = { 40 };
    private static final int STATUS_SLOT = 49;
    private static final ItemStack GROWING = new CustomItemStack(Material.LIME_STAINED_GLASS_PANE, "&aProducing!");
    private static final ItemStack INPUT_PLANT = new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE, "&9Input a sapling!");

    @Setter
    private EnumMap<Material, ItemStack[]> recipes;
    @Setter
    private int ticksPerOutput;

    public TreeGrowers(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    protected boolean process(@Nonnull Block b, @Nonnull BlockMenu menu) {
        ItemStack input = menu.getItemInSlot(INPUT_SLOTS[0]);
        if (input != null && this.recipes.containsKey(input.getType())) {
            if (menu.hasViewer()) {
                menu.replaceExistingItem(STATUS_SLOT, GROWING);
            }
            if (MainClass.slimefunTickCount() % this.ticksPerOutput == 0) {
                ItemStack[] output = this.recipes.get(input.getType());
                if (output != null) {
                    for (ItemStack item : output) {
                        menu.pushItem(item.clone(), OUTPUT_SLOTS);
                    }
                }
            }
            return true;
        }
        else {
            if (menu.hasViewer()) {
                menu.replaceExistingItem(STATUS_SLOT, INPUT_PLANT);
            }
            return false;
        }
    }


    @Override
    protected int getStatusSlot() {
        return STATUS_SLOT;
    }

    @Override
    protected void setup(@Nonnull BlockMenuPreset blockMenuPreset) {
        blockMenuPreset.drawBackground(new int[] {
                49
        });
        blockMenuPreset.drawBackground(INPUT_BORDER, new int[] {
                30, 31, 32, 39, 48, 41, 50
        });
        blockMenuPreset.drawBackground(OUTPUT_BORDER, new int[] {
                0, 1, 2, 3, 4, 5, 6, 7, 8,
                9, 17, 18, 26, 27, 35, 36,
                44, 45, 46, 47, 51, 52, 53
        });
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> list = new ArrayList<>();
        for (Map.Entry<Material, ItemStack[]> entry : this.recipes.entrySet()) {
            ItemStack in = new ItemStack(entry.getKey());
            for (ItemStack item : entry.getValue()) {
                list.add(in);
                list.add(item);
            }
        }
        return list;
    }

    @Override
    protected int[] getInputSlots() {
        return INPUT_SLOTS;
    }

    @Override
    protected int[] getOutputSlots() {
        return OUTPUT_SLOTS;
    }

}