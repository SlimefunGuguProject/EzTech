package me.ezcoins.slimefunaddon.Materials;

import java.util.Arrays;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import me.ezcoins.slimefunaddon.MyCoolAddon;


import me.ezcoins.slimefunaddon.Machines.ZincFactory;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public final class Materials {

    public static final SlimefunItemStack FACTORY_MOTOR = new SlimefunItemStack(
            "FACTORY_MOTOR",
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
