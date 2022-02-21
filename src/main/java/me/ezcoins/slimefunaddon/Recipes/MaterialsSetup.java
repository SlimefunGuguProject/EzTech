package me.ezcoins.slimefunaddon.Recipes;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.ezcoins.slimefunaddon.Core.MachinesLore;
import org.bukkit.Material;

public class MaterialsSetup {


    public static final SlimefunItemStack MACHINE_MOTOR = new SlimefunItemStack("MACHINE_MOTOR",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2IwNDMzZjFjMjI3OTYwOGY3YmQyY2VjZWI5OGNkMTc1Y2JhYWRjM2Y2Mjk5YWUzY2NhZTI1N2RjMjJhNTViMiJ9fX0=",
            "&cMachine Motor"
    );


    public static final SlimefunItemStack BISMUTH = new SlimefunItemStack("BISMUTH",
            Material.BRICK,
            "&3Bismuth Ingot"
    );

    public static final SlimefunItemStack BISMUTHPLATES = new SlimefunItemStack("BISMUTHPLATES",
            Material.NETHERITE_SCRAP,
            "&3&lBismuth Plate"
    );

    public static final SlimefunItemStack PLATINUM = new SlimefunItemStack("PLATINUM",
            Material.IRON_INGOT,
            "&f&lPlatinum Ingot"
    );


    public static final SlimefunItemStack MACHINEPLATING = new SlimefunItemStack("MACHINEPLATING",
            Material.PAPER,
            "&bMachine Plating"
    );

    public static final SlimefunItemStack MACHINECHASSIS = new SlimefunItemStack("MACHINECHASSIS",
            Material.NETHERITE_BLOCK,
            "&bMachine Chassis"
    );

    public static final SlimefunItemStack DARKPHOTO = new SlimefunItemStack("DARKPHOTO",
            Material.DAYLIGHT_DETECTOR,
            "&8Dark Photovoltaic Cell",
            "",
            "&7Used to craft Night Generators"
    );

    public static final SlimefunItemStack ImSeven = new SlimefunItemStack("IMSEVEN",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODc0NjNhMzNkNmNlNGE5NGI1OTljNGFiNjQ4YTEzMzUzOGJkYjU1MGE0ZGI1NTU0OGJjNjY3NTEwMWZhMjllMCJ9fX0=",
            "&6ImSeven",
            "&7Helped with crafting recipes and ideas for machines."
    );

    public static final SlimefunItemStack Yuki = new SlimefunItemStack("YUKI",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQzNmZiODcxM2FmNzZmZjA3NDBiNmMxNWY0ZTI4OGYzNjE2MGY5YTlhNDRkMGZmYjA0YWM0YjZlZWU2NzI3OCJ9fX0=",
            "&3Yukii031",
            "&7Helped with ideas."
    );

    public static final SlimefunItemStack Unknown = new SlimefunItemStack("UNKNOWN",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmFkYzA0OGE3Y2U3OGY3ZGFkNzJhMDdkYTI3ZDg1YzA5MTY4ODFlNTUyMmVlZWQxZTNkYWYyMTdhMzhjMWEifX19",
            "&c???",
            "&7Could be you. :D"
    );







                                                //// MACHINES

    public static final SlimefunItemStack PresCarbonPress = new SlimefunItemStack("PRESCARBON_PRESS",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjA5MTQyZjNhMGFiY2Y5YWZkYjkzYmNjZDdmNGQ3MzNjYzZlZTM0N2Y3NjBiNGE3Y2IzM2ZiZDljZjk5YWJiMCJ9fX0=",
            "&ePressurized Carbon Press",
            "",
            "&7Turns logs into Carbon",
            "",
            MachineLore.energyPerSecond(100),
            MachineLore.energyBuffer(900)
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
            MachinesLore.energyBuffer(120)
    );

    public static final SlimefunItemStack Corrupter = new SlimefunItemStack("CORRUPTER",
            Material.GILDED_BLACKSTONE,
            "&cCorrupter",
            "",
            "&7Corrupts blocks into a different state.",
            "",
            MachineLore.energyPerSecond(60),
            MachineLore.energyBuffer(360)
    );

    public static final SlimefunItemStack Hydronator = new SlimefunItemStack("HYDRONATOR",
            Material.BLUE_ICE,
            "&bHydronator",
            "",
            "&7Turns concrete powder into its hardened form.",
            "",
            MachinesLore.ENERGY_CONSUMPTION(10),
            MachinesLore.energyBuffer(50)
    );

    public static final SlimefunItemStack CombustionGenerator = new SlimefunItemStack("COMBUSTIONGENERATOR",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWU0MzUyNjgwZDBiYjI5YjkxMzhhZjc4MzMwMWEzOTFiMzQwOTBjYjQ5NDFkNTJjMDg3Y2E3M2M4MDM2Y2I1MSJ9fX0=",
            "&cCombustion Generator",
            "",
            "&7Uses explosions as fuel",
            "",
            "&8&oIs this safe...?",
            MachineLore.energyPerSecond(40),
            MachineLore.energyBuffer(240)
    );

    public static final SlimefunItemStack COBBLEGENS = new SlimefunItemStack(
            "COBBLE_GEN",
            Material.CHISELED_DEEPSLATE,
            "&8Cobble Generator",
            "",
            "&7What do you think it does?",
            MachineLore.energyPerSecond(48),
            MachineLore.energyBuffer(360)
    );

    public static final SlimefunItemStack INGOTEXTRACTOR = new SlimefunItemStack(
            "INGOTEXTRACTOR",
            Material.FURNACE,
            "&8Ingot Extractor",
            "",
            "&7Converts cobblestone into ingots",
            "",
            MachineLore.speed(10),
            MachineLore.energyPerSecond(300)
    );

    public static final SlimefunItemStack GOLDREFINERY = new SlimefunItemStack(
            "GOLDREFINERY",
            Material.RAW_GOLD_BLOCK,
            "&6Gold Refinery",
            "",
            "&7Refines Gold into its purest form",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(250)
    );

    public static final SlimefunItemStack URANIUMEXTRACTOR = new SlimefunItemStack(
            "URANIUMEXTRACTOR",
            Material.GREEN_CONCRETE,
            "&aUranium Extractor",
            "",
            "&7Refines cobblestone into its &cRADIOACTIVE &7form",
            "",
            MachineLore.energyPerSecond(240)
    );


    public static final SlimefunItemStack TREEHOUSE = new SlimefunItemStack(
            "TREEHOUSE",
            Material.STRIPPED_OAK_WOOD,
            "&2Treehouse",
            "",
            "&7Grows and harvests:",
            "&7- &aTrees &7(25s / Tree)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(36)
    );



    public static final SlimefunItemStack GREENHOUSE = new SlimefunItemStack(
            "GREENHOUSE",
            Material.LIME_STAINED_GLASS,
            "&2Greenhouse",
            "",
            "&7Grows and harvests:",
            "&7- &aTrees &7(20s / Tree)",
            "&7- &aCrops &7(12s / Crop)",
            "&7- &aExotic Garden plants &7(30s / Plant)",
            "",
            MachineLore.energyPerSecond(48),
            MachineLore.energyBuffer(384)
    );

    public static final SlimefunItemStack ExtremeFreezer = new SlimefunItemStack(
            "EXTREMEFREEZER",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&bExtreme Freezer",
            "",
            "&7Turns Water into Reactor Coolant",
            "",
            MachineLore.energyPerSecond(60),
            MachineLore.energyBuffer(360)
    );

    public static final SlimefunItemStack BASIC_LUNAR_GENERATOR = new SlimefunItemStack(
            "BASIC_LUNAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&9Basic Lunar Generator",
            "",
            "&7Only works at night",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(2)

    );

    public static final SlimefunItemStack ADVANCED_LUNAR_GENERATOR = new SlimefunItemStack(
            "ADVANCED_LUNAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&cAdvanced Lunar Generator",
            "",
            "&7Only works at night",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(8)

    );


    public static final SlimefunItemStack CARBONADO_LUNAR_GENERATOR = new SlimefunItemStack(
            "CARBONADO_LUNAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&4Carbonado Lunar Generator",
            "",
            "&7Only works at night",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(64)

    );

    public static final SlimefunItemStack ENERGIZED_LUNAR_GENERATOR = new SlimefunItemStack(
            "ENERGIZED_LUNAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&eEnergized Lunar Generator",
            "",
            "&7Works during the day and night",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(256) + " (Night)",
            LoreBuilder.powerPerSecond(128) + " (Day)"

    );

    public static final SlimefunItemStack OVERLOADED_CYCLE_GENERATOR = new SlimefunItemStack(
            "OVERLOADED_CYCLE_GENERATOR",
            Material.RED_NETHER_BRICK_SLAB,
            "&6&lOverloaded Cycle Generator",
            "",
            "&7Works during the day and night",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(768) + " (Night)",
            LoreBuilder.powerPerSecond(768) + " (Day)"

    );



}
