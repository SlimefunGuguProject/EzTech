package me.ezcoins.slimefunaddon.Recipes.Machines;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;

public class MachineSetup {


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
            MachineLore.energyPerSecond(16),
            MachineLore.energyBuffer(120)
    );

    public static final SlimefunItemStack CookieMaker = new SlimefunItemStack("COOKIE_MAKER",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQ3NjY5NWRmY2MxNzBiZDc0ZWFkNGNiYWYxNzVlMTM3ODdjYmRmN2YzMmYwOGZmY2FhZmY2Mzg1OGUzYzEyMCJ9fX0=",
            "&6Cookie Jar",
            "",
            MachineLore.energyPerSecond(16),
            MachineLore.energyBuffer(120)
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
            MachineLore.energyPerSecond(10),
            MachineLore.energyBuffer(50)
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
            "&7- &aFlowers &7(10s / Flower)",
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

    public static final SlimefunItemStack ItemProcessor = new SlimefunItemStack("ITEMPROCESSOR",
            Material.PISTON,
            "&6Decompressor",
            "",
            "&7De-compresses items",
            MachineLore.energyPerSecond(12),
            MachineLore.energyBuffer(36)
    );



}
