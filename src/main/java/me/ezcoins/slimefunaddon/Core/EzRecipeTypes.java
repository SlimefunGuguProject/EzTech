package me.ezcoins.slimefunaddon.Core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.ezcoins.slimefunaddon.MainClass;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class EzRecipeTypes {

    private EzRecipeTypes() {}

    public static final RecipeType CORRUPTER = new RecipeType(new NamespacedKey(MainClass.plugin, "CORRUPTER"), new SlimefunItemStack("CORRUPTER", Material.GILDED_BLACKSTONE, "&6Corrupter"), "", "&8This item must be made", "&8in a Corrupter");

}

