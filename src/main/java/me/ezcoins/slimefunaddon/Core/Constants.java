package me.ezcoins.slimefunaddon.Core;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Constants {

    public static final List<SlimefunItemStack> Ingots = new ArrayList<>(Arrays.asList(
            SlimefunItems.COPPER_INGOT, SlimefunItems.GOLD_DUST, SlimefunItems.IRON_DUST,
            SlimefunItems.LEAD_INGOT, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ZINC_INGOT,
            SlimefunItems.TIN_INGOT, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.SILVER_INGOT));
}
