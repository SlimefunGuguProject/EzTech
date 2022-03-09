package me.ezcoins.CavernTech;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.ezcoins.CavernTech.Core.Groups;
import me.ezcoins.CavernTech.Core.Researches;
import me.ezcoins.CavernTech.Machines.MobChamber.MobData;
import me.ezcoins.CavernTech.Recipes.Credits.Credits;
import me.ezcoins.CavernTech.Recipes.Generators.GeneratorRecipes;
import me.ezcoins.CavernTech.Recipes.Machines.MachineRecipes;
import me.ezcoins.CavernTech.Recipes.Materials.MaterialRecipes;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public final class CavernTech extends AbstractAddon implements SlimefunAddon {

    public static CavernTech plugin;

    public CavernTech(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
                "TheRealEzCoins", "SlimeFunAddon", "master", "auto-update");
    }

    public static CavernTech getInstance() {
        return plugin;
    }

    public CavernTech() {
        super("TheRealEzCoins", "SlimeFunAddon", "master", "auto-update");
    }

    private static boolean exoticGardenInstalled;

    public static boolean isExoticGardenInstalled() {
        return exoticGardenInstalled;
    }



    @Override
    protected void enable() {

        getLogger().info("----------------------------------------");
        getLogger().info("|          QOL-Addon ~ EzCoins          |");
        getLogger().info("----------------------------------------");


        exoticGardenInstalled = Bukkit.getServer().getPluginManager().isPluginEnabled("ExoticGarden");
        Config cfg = new Config(this);


        plugin = this;

        MachineRecipes.setup(plugin);
        MaterialRecipes.setup(plugin);
        GeneratorRecipes.setup(plugin);
        MobData.setup(plugin);
        Credits.setup(plugin);
        Groups.setup(plugin);
        Researches.setup(plugin);
        }


        @Override
        public void disable () {
            // Logic for disabling the plugin...
        }
    }

