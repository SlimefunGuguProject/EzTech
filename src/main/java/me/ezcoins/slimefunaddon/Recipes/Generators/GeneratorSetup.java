package me.ezcoins.slimefunaddon.Recipes.Generators;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;

public class GeneratorSetup {

    public static final SlimefunItemStack BASIC_LUNAR_GENERATOR = new SlimefunItemStack(
            "BASIC_LUNAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&9基础月光发电机",
            "",
            "&7仅在夜晚工作",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(2)

    );

    public static final SlimefunItemStack ADVANCED_LUNAR_GENERATOR = new SlimefunItemStack(
            "ADVANCED_LUNAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&c高级月光发电机",
            "",
            "&7仅在夜晚工作",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(8)

    );


    public static final SlimefunItemStack CARBONADO_LUNAR_GENERATOR = new SlimefunItemStack(
            "CARBONADO_LUNAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&4黑金刚石月光发电机",
            "",
            "&7仅在夜晚工作",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(64)

    );

    public static final SlimefunItemStack ENERGIZED_LUNAR_GENERATOR = new SlimefunItemStack(
            "ENERGIZED_LUNAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "&e充能月光发电机",
            "",
            "&7可全天工作",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(256) + " (夜间)",
            LoreBuilder.powerPerSecond(128) + " (日间)"

    );

    public static final SlimefunItemStack OVERLOADED_CYCLE_GENERATOR = new SlimefunItemStack(
            "OVERLOADED_CYCLE_GENERATOR",
            Material.RED_NETHER_BRICK_SLAB,
            "&6&l过载循环发电机",
            "",
            "&7可全天工作",
            "",
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(1028) + " (夜间)",
            LoreBuilder.powerPerSecond(1028) + " (日间)"

    );

    public static final SlimefunItemStack CombustionGenerator = new SlimefunItemStack("COMBUSTIONGENERATOR",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWU0MzUyNjgwZDBiYjI5YjkxMzhhZjc4MzMwMWEzOTFiMzQwOTBjYjQ5NDFkNTJjMDg3Y2E3M2M4MDM2Y2I1MSJ9fX0=",
            "&c爆炸反应堆",
            "",
            "&7以爆炸物为燃料",
            "",
            "&8&o它真的安全吗...?",
            MachineLore.energyPerSecond(40),
            MachineLore.energyBuffer(240)
    );

}
