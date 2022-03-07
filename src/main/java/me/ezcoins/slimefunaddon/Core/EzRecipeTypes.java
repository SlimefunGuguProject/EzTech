package me.ezcoins.slimefunaddon.Core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.ezcoins.slimefunaddon.EasySlimefunAddon;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class EzRecipeTypes {

    private EzRecipeTypes() {}

    public static final RecipeType CORRUPTER = new RecipeType(new NamespacedKey(EasySlimefunAddon.plugin, "CORRUPTER"), new SlimefunItemStack("CORRUPTER", Material.GILDED_BLACKSTONE, "&6侵蚀机"), "", "&8该物品须在", "&8侵蚀机中制作");
    public static final RecipeType MOBCHAMBER = new RecipeType(new NamespacedKey(EasySlimefunAddon.plugin, "MOBCHAMBER"), new SlimefunItemStack("CHAMBER", Material.SEA_LANTERN, "&7&lEZ生物模拟器"), "", "&8该物品须在", "&7&lEZ生物模拟器", "&8中制作");
    public static final RecipeType SOULREAVER = new RecipeType(new NamespacedKey(EasySlimefunAddon.plugin, "SOULREAVER"), new SlimefunItemStack("SOULREAVER", Material.HONEYCOMB, "&9灵魂掠夺者数据卡"), "", "&8该物品从:", "&8- &9灵魂掠夺者中获取");

}

