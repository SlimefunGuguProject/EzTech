package me.ezcoins.slimefunaddon.Core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.ezcoins.slimefunaddon.EasySlimefunAddon;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class EzRecipeTypes {

    private EzRecipeTypes() {}

    public static final RecipeType CORRUPTER = new RecipeType(new NamespacedKey(EasySlimefunAddon.plugin, "CORRUPTER"), new SlimefunItemStack("CORRUPTER", Material.GILDED_BLACKSTONE, "&6Corrupter"), "", "&8This item must be made", "&8in a Corrupter");
    public static final RecipeType MOBCHAMBER = new RecipeType(new NamespacedKey(EasySlimefunAddon.plugin, "MOBCHAMBER"), new SlimefunItemStack("CHAMBER", Material.SEA_LANTERN, "&7&lMob Chamber"), "", "&8This item must be made", "&8in a &7&lMob Chamber");
    public static final RecipeType SOULREAVER = new RecipeType(new NamespacedKey(EasySlimefunAddon.plugin, "SOULREAVER"), new SlimefunItemStack("SOULREAVER", Material.HONEYCOMB, "&9Soulreaver Data Card"), "", "&8This is a drop from:", "&8- &9Soulreaver");

}

