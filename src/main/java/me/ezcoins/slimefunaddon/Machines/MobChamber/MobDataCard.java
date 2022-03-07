package me.ezcoins.slimefunaddon.Machines.MobChamber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import me.ezcoins.slimefunaddon.Core.Groups;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.RandomizedSet;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

@ParametersAreNonnullByDefault
public final class MobDataCard extends SlimefunItem implements RecipeDisplayItem, NotPlaceable {

    static final Map<String, MobDataCard> CARDS = new HashMap<>();

    public static SlimefunItemStack create(String name, MobDataTier tier) {
        return new SlimefunItemStack(
                name.toUpperCase(Locale.ROOT).replace(" ", "_") + "_DATA_CHIP_EZ",
                tier.material,
                "&9EZ" + name + "生物芯片",
                "&7放在EZ生物模拟室中使用",
                "",
                MachineLore.energyPerSecond(tier.energy)
        );
    }

    public MobDataCard(String name, MobDataTier tier, ItemStack[] recipe) {
        super(Groups.EzChamber, create(name, tier), MobDataInfuser.TYPE, recipe);
        this.tier = tier;
        CARDS.put(getId(), this);
    }

    public MobDataCard(SlimefunItemStack item, MobDataTier tier, ItemStack[] recipe) {
        super(Groups.EzChamber, item, MobDataInfuser.TYPE, recipe);
        this.tier = tier;
        CARDS.put(getId(), this);
    }

    final RandomizedSet<ItemStack> drops = new RandomizedSet<>();
    final MobDataTier tier;

    public MobDataCard addDrop(ItemStack drop, float chance) {
        this.drops.add(drop, 1 / chance);
        return this;
    }

    public MobDataCard addDrop(ItemStack drop, int amount, float chance) {
        return addDrop(new CustomItemStack(drop, amount), chance);
    }

    public MobDataCard addDrop(Material drop, float chance) {
        return addDrop(new ItemStack(drop), chance);
    }

    public MobDataCard addDrop(Material drop, int amount, float chance) {
        return addDrop(new ItemStack(drop, amount), chance);
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> items = new ArrayList<>();
        for (ItemStack item : this.drops) {
            items.add(null);
            items.add(item);
        }
        return items;
    }

}
