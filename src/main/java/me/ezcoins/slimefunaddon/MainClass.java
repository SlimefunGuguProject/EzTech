package me.ezcoins.slimefunaddon;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.Recipes.MachinesRecipes;
import me.ezcoins.slimefunaddon.Recipes.Materials;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
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

    @Override
    protected void enable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example

            plugin = this;

            Materials.setup(plugin);
            MachinesRecipes.setup(plugin);
            Groups.setup(plugin);
        }


    }


    @Override
    public void disable() {
        // Logic for disabling the plugin...
    }
}

