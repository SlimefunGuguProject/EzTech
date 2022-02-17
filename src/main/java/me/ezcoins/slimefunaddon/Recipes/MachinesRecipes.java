package me.ezcoins.slimefunaddon.Recipes;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.Core.MachinesLore;
import me.ezcoins.slimefunaddon.Core.MaterialGenerator;
import me.ezcoins.slimefunaddon.Machines.Factory.PresCarbonPress;
import me.ezcoins.slimefunaddon.Machines.QOL.*;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.ezcoins.slimefunaddon.MainRecipes;
import me.ezcoins.slimefunaddon.Machines.Generators.CookieGenerator;

public class MachinesRecipes {



    public static final SlimefunItemStack PresCarbonPress = new SlimefunItemStack("PRESCARBON_PRESS",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjA5MTQyZjNhMGFiY2Y5YWZkYjkzYmNjZDdmNGQ3MzNjYzZlZTM0N2Y3NjBiNGE3Y2IzM2ZiZDljZjk5YWJiMCJ9fX0=",
            "&ePressurized Carbon Press",
            "&7Turns logs into Carbon",
                  "",
            MachinesLore.ENERGY_CONSUMPTION(200),
            MachinesLore.energyBuffer(900)
    );

    public static final SlimefunItemStack SaltShaker = new SlimefunItemStack("SALT_PRODUCER",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk0Y2M3MjVlM2VjNDJkOTc0NjQwNDMxODBiNmEyYTZiNmYwZGU4OGNkZjY0NmM2NDk0NTIwODM2YTQ4YThiNyJ9fX0=",
            "&fSalt Shaker",
            "",
            MachinesLore.ENERGY_CONSUMPTION(16),
            MachinesLore.energyBuffer(120)
    );

    public static final SlimefunItemStack CookieMaker = new SlimefunItemStack("COOKIE_MAKER",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQ3NjY5NWRmY2MxNzBiZDc0ZWFkNGNiYWYxNzVlMTM3ODdjYmRmN2YzMmYwOGZmY2FhZmY2Mzg1OGUzYzEyMCJ9fX0=",
            "&6Cookie Jar",
            "",
            MachinesLore.ENERGY_CONSUMPTION(16),
            MachinesLore.energyBuffer(120),
            "",
            "&7~ Made for &2Toortle &7and &cShromp"
    );

    public static final SlimefunItemStack Corrupter = new SlimefunItemStack("CORRUPTER",
            Material.GILDED_BLACKSTONE,
            "&cCorrupter",
            "&7Corrupts blocks into a different state.",
            "",
            MachinesLore.ENERGY_CONSUMPTION(160),
            MachinesLore.energyBuffer(950)
    );

    public static final SlimefunItemStack Hydronator = new SlimefunItemStack("HYDRONATOR",
            Material.BLUE_ICE,
            "&bHydronator",
            "&7Turns concrete powder into its hardened form.",
            "",
            MachinesLore.ENERGY_CONSUMPTION(10),
            MachinesLore.energyBuffer(50)
    );

    public static final SlimefunItemStack CookieGenerator = new SlimefunItemStack("COOKIEGENERATOR",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjViOTFkYTMyNTJjOTE3ZGQ5OWY2MmFjYTQ5ZGJiZTZmMTMzNTljNDA3NTdkZDUxMzIzM2I4OTkxOGViNzZlNSJ9fX0=",
            "&6Cookie Generator",
            "",
            "&7Uses cookies as... Fuel?",
            "",
            MachinesLore.ENERGY_CONSUMPTION(75),
            MachinesLore.energyBuffer(475)
    );

    public static final SlimefunItemStack COBBLEGENS = new SlimefunItemStack(
            "COBBLE_GEN",
            Material.SMOOTH_STONE,
            "&cAdvanced &8Cobble Generator",
            "",
            MachinesLore.speed(4),
            MachinesLore.energyPerSecond(120)
    );




    public static void setup(MainRecipes plugin) {

        new PresCarbonPress(Groups.EzMachines, PresCarbonPress, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRO_MAGNET, SlimefunItems.CARBONADO_EDGED_FURNACE, SlimefunItems.ELECTRO_MAGNET,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.CARBON_PRESS_3, SlimefunItems.REINFORCED_ALLOY_INGOT,
                        Materials.MACHINE_MOTOR, SlimefunItems.CARBONADO, Materials.MACHINE_MOTOR})
                .register(MainRecipes.plugin);

        new SaltShaker(Groups.EzMachines, SaltShaker, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.HEATING_COIL, new ItemStack(Material.CAULDRON), SlimefunItems.HEATING_COIL,
                        new ItemStack(Material.IRON_BLOCK), SlimefunItems.SALT, new ItemStack(Material.IRON_BLOCK),
                        new ItemStack(Material.IRON_BLOCK), Materials.MACHINE_MOTOR, new ItemStack(Material.IRON_BLOCK)})
                .register(MainRecipes.plugin);

        new CookieMaker(Groups.EzMachines, CookieMaker, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.CROP_GROWTH_ACCELERATOR_2, SlimefunItems.ELECTRIC_MOTOR,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.HAY_BLOCK), SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR})
                .register(MainRecipes.plugin);

        new Corrupter(Groups.EzMachines, Corrupter, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ELECTRO_MAGNET,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.DIAMOND_BLOCK), SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ELECTRIC_MOTOR, Materials.MACHINE_MOTOR, SlimefunItems.ELECTRIC_MOTOR})
                .register(MainRecipes.plugin);

        new Hydronator(Groups.EzMachines, Hydronator, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ELECTRO_MAGNET,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.DIAMOND_BLOCK), SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ELECTRIC_MOTOR, Materials.MACHINE_MOTOR, SlimefunItems.ELECTRIC_MOTOR})
                .register(MainRecipes.plugin);

        new CookieGenerator(Groups.EzGenerators, CookieGenerator, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BLISTERING_INGOT_2, SlimefunItems.ELECTRO_MAGNET,
                        SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.DIAMOND_BLOCK), SlimefunItems.REINFORCED_ALLOY_INGOT,
                        SlimefunItems.ELECTRIC_MOTOR, Materials.MACHINE_MOTOR, SlimefunItems.ELECTRIC_MOTOR})
                .setCapacity(475)
                .setEnergyProduction(75)
                .register(MainRecipes.plugin);

        new MaterialGenerator(Groups.EzGenerators, COBBLEGENS, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                Materials.MACHINE_MOTOR, null, null,
                null, null})
                .material(Material.COBBLESTONE)
                .speed(4)
                .energyPerTick(75)
                .register(MainRecipes.plugin);


    }

}