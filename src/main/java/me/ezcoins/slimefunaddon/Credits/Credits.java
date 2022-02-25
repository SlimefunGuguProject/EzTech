package me.ezcoins.slimefunaddon.Credits;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.EasySlimefunAddon;
import org.bukkit.inventory.ItemStack;

public class Credits {

    public static final SlimefunItemStack ImSeven = new SlimefunItemStack("IMSEVEN",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODc0NjNhMzNkNmNlNGE5NGI1OTljNGFiNjQ4YTEzMzUzOGJkYjU1MGE0ZGI1NTU0OGJjNjY3NTEwMWZhMjllMCJ9fX0=",
            "&6ImSeven",
            "&7Helped with crafting recipes and ideas for machines."
    );

    public static final SlimefunItemStack Yuki = new SlimefunItemStack("YUKI",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQzNmZiODcxM2FmNzZmZjA3NDBiNmMxNWY0ZTI4OGYzNjE2MGY5YTlhNDRkMGZmYjA0YWM0YjZlZWU2NzI3OCJ9fX0=",
            "&3Yukii031",
            "&7Helped with ideas."
    );

    public static final SlimefunItemStack Unknown = new SlimefunItemStack("UNKNOWN",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmFkYzA0OGE3Y2U3OGY3ZGFkNzJhMDdkYTI3ZDg1YzA5MTY4ODFlNTUyMmVlZWQxZTNkYWYyMTdhMzhjMWEifX19",
            "&c???",
            "&7Could be you. :D"
    );

    public static void setup(EasySlimefunAddon plugin) {

        new SlimefunItem(Groups.Credits, ImSeven, RecipeType.NULL,
                new ItemStack[]{null})
                .register(EasySlimefunAddon.plugin);

        new SlimefunItem(Groups.Credits, Yuki, RecipeType.NULL,
                new ItemStack[]{null})
                .register(EasySlimefunAddon.plugin);

        new SlimefunItem(Groups.Credits, Unknown, RecipeType.NULL,
                new ItemStack[]{null})
                .register(EasySlimefunAddon.plugin);

        }
    }
