package me.ezcoins.CavernTech.Machines.QOL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.entities.AnimalProduce;
import io.github.thebusybiscuit.slimefun4.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;

public class AdvancedProduceCollector extends AContainer implements RecipeDisplayItem {

    private final ItemSetting<Integer> range = new IntRangeSetting(this, "range", 1, 8, 32);
    private final Set<AnimalProduce> animalProduces = new HashSet<>();

    @ParametersAreNonnullByDefault
    public AdvancedProduceCollector(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);

        addItemSetting(range);
    }

    @Override
    protected void registerDefaultRecipes() {
        // Milk from adult cows and goats
        addProduce(new AnimalProduce(new ItemStack(Material.GLASS_BOTTLE), new ItemStack(Material.HONEY_BOTTLE), n -> {
            if (n instanceof Bee) {
                return ((Bee) n).hasNectar();
            } else {
                return false;
            }
        }));

        addProduce(new AnimalProduce(new ItemStack(Material.BUCKET), new ItemStack(Material.MILK_BUCKET), n -> {
            if (n instanceof Cow) {
                return ((Cow) n).isAdult();
            } else {
                return false;
            }
        }));

        addProduce(new AnimalProduce(new ItemStack(Material.BUCKET), new ItemStack(Material.MILK_BUCKET), n -> {
            if (n instanceof Goat) {
                return ((Goat) n).isAdult();
            } else {
                return false;
            }
        }));

        addProduce(new AnimalProduce(new ItemStack(Material.WHEAT_SEEDS, 16), new ItemStack(Material.EGG), n -> {
            if (n instanceof Chicken) {
                return ((Chicken) n).isAdult();
            } else {
                return false;
            }
        }));

        addProduce(new AnimalProduce(new ItemStack(Material.BOWL), new ItemStack(Material.MUSHROOM_STEM), n -> {
            if (n instanceof MushroomCow) {
                return ((MushroomCow) n).isAdult();
            } else {
                return false;
            }
        }));

        addProduce(new AnimalProduce(new ItemStack(Material.BOWL), new ItemStack(Material.RABBIT_STEW), n -> {
            if (n instanceof Rabbit) {
                return ((Rabbit) n).isAdult();
            } else {
                return false;
            }
        }));

    }


    public void addProduce(@Nonnull AnimalProduce produce) {
        Validate.notNull(produce, "A produce cannot be null");

        this.animalProduces.add(produce);
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {

            @Override
            public void tick(Block b, SlimefunItem sf, Config data) {
                AdvancedProduceCollector.this.tick(b);
            }

            @Override
            public boolean isSynchronized() {
                // We override the preRegister() method to override the sync setting here
                return true;
            }
        });
    }

    @Override
    public @Nonnull List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>();


        displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &eBee &fnearby"));
        displayRecipes.add(new ItemStack(Material.HONEY_BOTTLE));

        displayRecipes.add(new CustomItemStack(Material.BUCKET, null, "&fRequires &8Cow &fnearby"));
        displayRecipes.add(new ItemStack(Material.MILK_BUCKET));

        displayRecipes.add(new CustomItemStack(Material.BUCKET, null, "&fRequires &fGoat &fnearby"));
        displayRecipes.add(new ItemStack(Material.MILK_BUCKET));

        displayRecipes.add(new CustomItemStack(Material.BOWL, null, "&fRequires &cMushroom cow &fnearby"));
        displayRecipes.add(new ItemStack(Material.MUSHROOM_STEW));

        displayRecipes.add(new CustomItemStack(Material.BOWL, null, "&fRequires &8Rabbit &fnearby"));
        displayRecipes.add(new ItemStack(Material.RABBIT_STEW));

        displayRecipes.add(new CustomItemStack(new ItemStack(Material.WHEAT_SEEDS, 16), "&fWheat Seeds", "&fRequires &fChicken &fnearby"));
        displayRecipes.add(new ItemStack(Material.EGG));


        return displayRecipes;
    }

    @Override
    protected @Nullable MachineRecipe findNextRecipe(@Nonnull BlockMenu inv) {
        for (int slot : getInputSlots()) {
            for (AnimalProduce produce : animalProduces) {
                ItemStack item = inv.getItemInSlot(slot);

                if (!SlimefunUtils.isItemSimilar(item, produce.getInput()[0], true) || !InvUtils.fits(inv.toInventory(), produce.getOutput()[0], getOutputSlots())) {
                    continue;
                }

                if (isAnimalNearby(inv.getBlock(), produce)) {
                    inv.consumeItem(slot);
                    return produce;
                }
            }
        }

        return null;
    }

    @ParametersAreNonnullByDefault
    private boolean isAnimalNearby(Block b, Predicate<LivingEntity> predicate) {
        int radius = range.getValue();
        return !b.getWorld().getNearbyEntities(b.getLocation(), radius, radius, radius, n -> isValidAnimal(n, predicate)).isEmpty();
    }

    @ParametersAreNonnullByDefault
    private boolean isValidAnimal(Entity n, Predicate<LivingEntity> predicate) {
        if (n instanceof LivingEntity) {
            return predicate.test((LivingEntity) n);
        } else {
            return false;
        }
    }

    @Override
    public @Nonnull String getMachineIdentifier() {
        return "Advanced_Produce_Collector";
    }

    @Override
    public @Nonnull ItemStack getProgressBar() {
        return new ItemStack(Material.SHEARS);
    }

}