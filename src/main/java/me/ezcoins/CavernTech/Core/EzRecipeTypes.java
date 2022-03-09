package me.ezcoins.CavernTech.Core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.ezcoins.CavernTech.CavernTech;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class EzRecipeTypes {

    private EzRecipeTypes() {}

    public static final RecipeType CORRUPTER = new RecipeType(new NamespacedKey(CavernTech.plugin, "CORRUPTER"), new SlimefunItemStack("CORRUPTER", Material.GILDED_BLACKSTONE, "&6Corrupter"), "", "&8This item must be made", "&8in a Corrupter");
    public static final RecipeType MOBCHAMBER = new RecipeType(new NamespacedKey(CavernTech.plugin, "MOBCHAMBER"), new SlimefunItemStack("CHAMBER", Material.SEA_LANTERN, "&7&lMob Chamber"), "", "&8This item must be made", "&8in a &7&lMob Chamber");
    public static final RecipeType SOULREAVER = new RecipeType(new NamespacedKey(CavernTech.plugin, "SOULREAVER"), new SlimefunItemStack("SOULREAVER", Material.HONEYCOMB, "&9Soulreaver Data Card"), "", "&8This is a drop from:", "&8- &9Soulreaver");
    public static final RecipeType COOKIE_MAKER = new RecipeType(new NamespacedKey(CavernTech.plugin, "COOKIE_MAKER"), new SlimefunItemStack("COOKIE_MAKER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQ3NjY5NWRmY2MxNzBiZDc0ZWFkNGNiYWYxNzVlMTM3ODdjYmRmN2YzMmYwOGZmY2FhZmY2Mzg1OGUzYzEyMCJ9fX0=", "&6Cookie Maker"), "", "&8Used to make cookie stuff");

}

