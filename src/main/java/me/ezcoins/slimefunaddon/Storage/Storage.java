package me.ezcoins.slimefunaddon.Storage;

import lombok.experimental.UtilityClass;

import me.ezcoins.slimefunaddon.MainClass;
import me.ezcoins.slimefunaddon.Recipes.MaterialsSetup;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

@UtilityClass
public final class Storage {

    private static final int BASIC_AMOUNT = 6400;
    private static final int ADVANCED_AMOUNT = 25600;
    private static final int REINFORCED_AMOUNT = 102400;
    private static final int VOID_AMOUNT = 409600;
    private static final int INFINITY_AMOUNT = 1_600_000_000;

    public static final SlimefunItemStack BASIC_STORAGE = new SlimefunItemStack(
            "BASIC_STORAGE",
            Material.OAK_WOOD,
            "&9Basic &8Storage Unit",
            "&6Capacity: &e" + MachineLore.format(BASIC_AMOUNT) + " &eitems"
    );
    public static final SlimefunItemStack ADVANCED_STORAGE = new SlimefunItemStack(
            "ADVANCED_STORAGE",
            Material.DARK_OAK_WOOD,
            "&cAdvanced &8Storage Unit",
            "&6Capacity: &e" + MachineLore.format(ADVANCED_AMOUNT) + " &eitems"
    );
    public static final SlimefunItemStack REINFORCED_STORAGE = new SlimefunItemStack(
            "REINFORCED_STORAGE",
            Material.ACACIA_WOOD,
            "&fReinforced &8Storage Unit",
            "&6Capacity: &e" + MachineLore.format(REINFORCED_AMOUNT) + " &eitems"
    );
    public static final SlimefunItemStack VOID_STORAGE = new SlimefunItemStack(
            "VOID_STORAGE",
            Material.CRIMSON_HYPHAE,
            "&8Void &8Storage Unit",
            "&6Capacity: &e" + MachineLore.format(VOID_AMOUNT) + " &eitems"
    );
    public static final SlimefunItemStack INFINITY_STORAGE = new SlimefunItemStack(
            "INFINITY_STORAGE",
            Material.WARPED_HYPHAE,
            "&bInfinity &8Storage Unit",
            "&6Capacity: &e" + MachineLore.format(INFINITY_AMOUNT) + " &eitems"
    );

    public static void setup(MainClass plugin) {
        new StorageUnit(BASIC_STORAGE, BASIC_AMOUNT, new ItemStack[] {
                new ItemStack(Material.OAK_LOG), MaterialsSetup.BISMUTHPLATES, new ItemStack(Material.OAK_LOG),
                new ItemStack(Material.OAK_LOG), new ItemStack(Material.BARREL), new ItemStack(Material.OAK_LOG),
                new ItemStack(Material.OAK_LOG), MaterialsSetup.BISMUTHPLATES, new ItemStack(Material.OAK_LOG)
        }).register(MainClass.plugin);
    }

}