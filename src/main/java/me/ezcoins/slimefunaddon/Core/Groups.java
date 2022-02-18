package me.ezcoins.slimefunaddon.Core;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;


import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import me.ezcoins.slimefunaddon.MainClass;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import static me.ezcoins.slimefunaddon.MainClass.plugin;

public class Groups {



    private Groups() {
    }


    public static final ItemGroup EzMaterials = new SubGroup("ezmaterials",
            new CustomItemStack(Material.NETHERITE_INGOT, "&7EasyMaterials"));
    public static final ItemGroup EzMachines = new SubGroup("ezmachines",
            new CustomItemStack(Material.FURNACE, "&7EasyMachines"));
    public static final ItemGroup EzFood = new SubGroup("ezfood",
            new CustomItemStack(Material.BREAD, "&7EasyFood"));
    public static final ItemGroup EzGenerators = new SubGroup("ezgenerators",
            new CustomItemStack(Material.DAYLIGHT_DETECTOR, "&7EasyGenerators"));
    public static final ItemGroup MAIN_CATEGORY = new MultiGroup("main",
            new CustomItemStack(Material.END_CRYSTAL, "&9EasyExpansion"), 3,
            EzMaterials, EzMachines, EzFood, EzGenerators);

    public static void setup(MainClass inst) {
        MAIN_CATEGORY.register(plugin);
    }


    }

