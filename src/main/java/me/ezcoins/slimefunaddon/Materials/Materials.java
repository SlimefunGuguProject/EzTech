package me.ezcoins.slimefunaddon;

import java.util.Arrays;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;



import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public final class Materials {
    public static final SlimefunItemStack TESTING_INGOT = new SlimefunItemStack(
            "TEST_INGOT",
            Material.DIAMOND,
            "&bezaeaz",
            "&7eazeazez");



                private static void registerEnhanced(SlimefunItemStack item, ItemStack[] recipe) {
                    register(item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
                }

                private static void registerSmeltery(SlimefunItemStack itemStack, ItemStack... recipe) {
                    register(itemStack, RecipeType.SMELTERY, Arrays.copyOf(recipe, 9));
                }

                private static void register(SlimefunItemStack itemStack, RecipeType type, ItemStack[] recipe) {
                    register(itemStack, type, recipe);
                }
                }
