package me.ezcoins.CavernTech.Core;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;


import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import me.ezcoins.CavernTech.CavernTech;
import org.bukkit.Material;

import static me.ezcoins.CavernTech.CavernTech.plugin;

public class Groups {



    private Groups() {
    }


    public static final ItemGroup EzMaterials = new SubGroup("ezmaterials",
            new CustomItemStack(Material.NETHERITE_INGOT, "&7Materials"));
    public static final ItemGroup EzMachines = new SubGroup("ezmachines",
            new CustomItemStack(Material.FURNACE, "&7Machines"));
    public static final ItemGroup EzGenerators = new SubGroup("ezmachines",
            new CustomItemStack(Material.DAYLIGHT_DETECTOR, "&7Generators"));
    public static final ItemGroup EzChamber = new SubGroup("ezchambers",
            new CustomItemStack(Material.SPAWNER, "&7Chambers"));
    public static final ItemGroup EzMisc = new SubGroup("ezmisc",
            new CustomItemStack(Material.WHITE_WOOL, "&7Misc"));
    public static final ItemGroup Credits = new SubGroup("credits",
            new CustomItemStack(Material.PAPER, "&7Credits"));
    public static final ItemGroup MAIN_CATEGORY = new MultiGroup("main",
            new CustomItemStack(Material.END_CRYSTAL, "&9CavernTech"), 3,
            EzMaterials, EzMachines, EzGenerators, EzChamber, EzMisc, Credits);

    public static void setup(CavernTech inst) {
        MAIN_CATEGORY.register(plugin);
    }


    }

