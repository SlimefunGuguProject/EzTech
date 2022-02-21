package me.ezcoins.slimefunaddon;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.Recipes.RecipeSetup;
import me.ezcoins.slimefunaddon.Storage.Storage;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public final class MainClass extends AbstractAddon implements SlimefunAddon {

    public static MainClass plugin;

    public MainClass(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
                "TheRealEzCoins", "SlimeFunAddon", "master", "auto-update");
    }

    public static MainClass getInstance() {
        return plugin;
    }

    public MainClass() {
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

            RecipeSetup.setup(plugin);
            Groups.setup(plugin);
            Storage.setup(plugin);
        }


    }


    @Override
    public void disable() {
        // Logic for disabling the plugin...
    }
}

