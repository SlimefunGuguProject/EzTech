package me.ezcoins.slimefunaddon.Core;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;


import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import me.ezcoins.slimefunaddon.EasySlimefunAddon;
import org.bukkit.Material;

import static me.ezcoins.slimefunaddon.EasySlimefunAddon.plugin;

public class Groups {



    private Groups() {
    }


    public static final ItemGroup EzMaterials = new SubGroup("ezmaterials",
            new CustomItemStack(Material.NETHERITE_INGOT, "&7EasyMaterials"));
    public static final ItemGroup EzMachines = new SubGroup("ezmachines",
            new CustomItemStack(Material.FURNACE, "&7EasyMachines"));
    public static final ItemGroup EzGenerators = new SubGroup("ezgenerators",
            new CustomItemStack(Material.DAYLIGHT_DETECTOR, "&7EasyGenerators"));
    public static final ItemGroup EzChamber = new SubGroup("ezchambers",
            new CustomItemStack(Material.SPAWNER, "&7EasyChambers"));
    public static final ItemGroup EzMisc = new SubGroup("ezmisc",
            new CustomItemStack(Material.WHITE_WOOL, "&7EasyMisc"));
    public static final ItemGroup EzFood = new SubGroup("ezfood",
            new CustomItemStack(Material.BREAD, "&7EasyFood &8&o(Coming soon)"));
    public static final ItemGroup Credits = new SubGroup("credits",
            new CustomItemStack(Material.PAPER, "&7Credits"));
    public static final ItemGroup MAIN_CATEGORY = new MultiGroup("main",
            new CustomItemStack(Material.END_CRYSTAL, "&9EasyExpansion"), 3,
            EzMaterials, EzMachines, EzGenerators, EzChamber, EzMisc, EzFood, Credits);

    public static void setup(EasySlimefunAddon inst) {
        MAIN_CATEGORY.register(plugin);
    }


    }

