package me.ezcoins.slimefunaddon;

import me.ezcoins.slimefunaddon.Recipes.MachinesRecipes;
import me.ezcoins.slimefunaddon.Recipes.Materials;
import org.bukkit.plugin.java.JavaPlugin;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;

public class MainRecipes extends JavaPlugin implements SlimefunAddon {

    public static MainRecipes plugin;

    public static MainRecipes getInstance() {
        return plugin;
    }

    @Override
    public void onEnable() {
        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example

            plugin = this;

            Materials.setup(plugin);
            MachinesRecipes.setup(plugin);
        }


    }





    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * You will need to return a reference to your Plugin here.
         * If you are using your main class for this, simply return "this".
         */
        return this;
    }
}
