package me.ezcoins.CavernTech.Recipes.Generators;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;

public class GeneratorSetup {

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
            LoreBuilder.powerPerSecond(1028) + " (Night)",
            LoreBuilder.powerPerSecond(1028) + " (Day)"

    );

    public static final SlimefunItemStack CombustionGenerator = new SlimefunItemStack("EXPLOSIONGENERATOR",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWU0MzUyNjgwZDBiYjI5YjkxMzhhZjc4MzMwMWEzOTFiMzQwOTBjYjQ5NDFkNTJjMDg3Y2E3M2M4MDM2Y2I1MSJ9fX0=",
            "&cExplosion Generator",
            "",
            "&7Uses explosions as fuel",
            "",
            "&8&oIs this safe...?",
            MachineLore.energyPerSecond(40),
            MachineLore.energyBuffer(240)
    );

    public static final SlimefunItemStack ADVANCED_NUCLEAR_REACTOR = new SlimefunItemStack(
            "ADVANCED_NUCLEAR_REACTOR",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmRjY2NjYThlOWE1MTgyODVlMDM1MmI0MzE4MmY1ODQ1YjFhNjZiOWYwOWI0NTAyMjJjNmUyMTAwNWI2Y2ExYSJ9fX0=",
            "&cAdvanced Nuclear Reactor",
            "",
            "&fRequires Cooling!",
            "&8\u21E8 &bMust be surrounded by Water",
            "&8\u21E8 &bMust be supplied with Reactor Coolant Cells",
            "",
            "         &8Turns &2Uranium &f\u21E8 &7Plutonium",
            "",
            MachineLore.energyBuffer(49152),
            MachineLore.energyPerSecond(1500)
    );

}
