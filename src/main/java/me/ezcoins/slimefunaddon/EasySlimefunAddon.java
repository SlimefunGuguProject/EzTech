package me.ezcoins.slimefunaddon;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.Machines.MobChamber.MobData;
import me.ezcoins.slimefunaddon.Recipes.Credits.Credits;
import me.ezcoins.slimefunaddon.Recipes.Generators.GeneratorRecipes;
import me.ezcoins.slimefunaddon.Recipes.Machines.MachineRecipes;
import me.ezcoins.slimefunaddon.Recipes.Materials.MaterialRecipes;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public final class EasySlimefunAddon extends AbstractAddon implements SlimefunAddon {

    public static EasySlimefunAddon plugin;

    public EasySlimefunAddon(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
                "TheRealEzCoins", "SlimeFunAddon", "master", "auto-update");
    }

    public static EasySlimefunAddon getInstance() {
        return plugin;
    }

    public EasySlimefunAddon() {
        super("TheRealEzCoins", "SlimeFunAddon", "master", "auto-update");
    }

    private static boolean exoticGardenInstalled;

    public static boolean isExoticGardenInstalled() {
        return exoticGardenInstalled;
    }



    @Override
    protected void enable() {

        getLogger().info("----------------------------------------");
        getLogger().info("          QOL-Addon ~ EzCoins           ");
        getLogger().info("----------------------------------------");


        exoticGardenInstalled = Bukkit.getServer().getPluginManager().isPluginEnabled("ExoticGarden");
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example

            plugin = this;

            MachineRecipes.setup(plugin);
            MaterialRecipes.setup(plugin);
            GeneratorRecipes.setup(plugin);
            MobData.setup(plugin);
            Credits.setup(plugin);
            Groups.setup(plugin);
        }


    }


    @Override
    public void disable() {
        // Logic for disabling the plugin...
    }
}

