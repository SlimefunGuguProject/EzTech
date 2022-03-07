package me.ezcoins.slimefunaddon.Recipes.Machines;

import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;

public class MachineSetup {


    public static final SlimefunItemStack PresCarbonPress = new SlimefunItemStack("PRESCARBON_PRESS",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjA5MTQyZjNhMGFiY2Y5YWZkYjkzYmNjZDdmNGQ3MzNjYzZlZTM0N2Y3NjBiNGE3Y2IzM2ZiZDljZjk5YWJiMCJ9fX0=",
            "&e过压碳压机",
            "",
            "&7将木头压成碳",
            "",
            MachineLore.energyPerSecond(100),
            MachineLore.energyBuffer(900)
    );

    public static final SlimefunItemStack SaltShaker = new SlimefunItemStack("SALT_PRODUCER",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk0Y2M3MjVlM2VjNDJkOTc0NjQwNDMxODBiNmEyYTZiNmYwZGU4OGNkZjY0NmM2NDk0NTIwODM2YTQ4YThiNyJ9fX0=",
            "&f筛盐机",
            "",
            MachineLore.energyPerSecond(16),
            MachineLore.energyBuffer(120)
    );

    public static final SlimefunItemStack CookieMaker = new SlimefunItemStack("COOKIE_MAKER",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQ3NjY5NWRmY2MxNzBiZDc0ZWFkNGNiYWYxNzVlMTM3ODdjYmRmN2YzMmYwOGZmY2FhZmY2Mzg1OGUzYzEyMCJ9fX0=",
            "&6饼干烘焙机",
            "",
            MachineLore.energyPerSecond(16),
            MachineLore.energyBuffer(120)
    );

    public static final SlimefunItemStack Corrupter = new SlimefunItemStack("CORRUPTER",
            Material.GILDED_BLACKSTONE,
            "&c侵蚀机",
            "",
            "&7侵蚀方块至不同阶段",
            "",
            MachineLore.energyPerSecond(60),
            MachineLore.energyBuffer(360)
    );

    public static final SlimefunItemStack Hydronator = new SlimefunItemStack("HYDRONATOR",
            Material.BLUE_ICE,
            "&b水合机",
            "",
            "&7用于凝固混凝土粉末",
            "",
            MachineLore.energyPerSecond(10),
            MachineLore.energyBuffer(50)
    );


    public static final SlimefunItemStack COBBLEGENS = new SlimefunItemStack(
            "COBBLE_GEN",
            Material.CHISELED_DEEPSLATE,
            "&8圆石发生器",
            "",
            "&7你认为它有什么作用?",
            MachineLore.energyPerSecond(48),
            MachineLore.energyBuffer(360)
    );

    public static final SlimefunItemStack INGOTEXTRACTOR = new SlimefunItemStack(
            "INGOTEXTRACTOR",
            Material.FURNACE,
            "&8铸锭萃取机",
            "",
            "&7将圆石转化成金属铸锭",
            "",
            MachineLore.speed(10),
            MachineLore.energyPerSecond(300)
    );

    public static final SlimefunItemStack GOLDREFINERY = new SlimefunItemStack(
            "GOLDREFINERY",
            Material.RAW_GOLD_BLOCK,
            "&6黄金精炼厂",
            "",
            "&7将黄金提炼成最纯净的形式",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(250)
    );

    public static final SlimefunItemStack URANIUMEXTRACTOR = new SlimefunItemStack(
            "URANIUMEXTRACTOR",
            Material.GREEN_CONCRETE,
            "&aEZ铀提取器",
            "",
            "&7从圆石中提取 &c铀",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(240)
    );


    public static final SlimefunItemStack TREEHOUSE = new SlimefunItemStack(
            "TREEHOUSE",
            Material.STRIPPED_OAK_WOOD,
            "&2EZ树屋",
            "",
            "&7催化生长:",
            "&7- &a树 &7(25s / 棵)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(36)
    );



    public static final SlimefunItemStack GREENHOUSE = new SlimefunItemStack(
            "GREENHOUSE",
            Material.LIME_STAINED_GLASS,
            "&2EZ温室",
            "",
            "&7催化生长:",
            "&7- &a树 &7(20s / 棵)",
            "&7- &a作物 &7(12s / 株)",
            "&7- &a花 &7(10s / 朵)",
            "&7- &a异域植物 &7(30s / 株)",
            "",
            MachineLore.energyPerSecond(48),
            MachineLore.energyBuffer(384)
    );

    public static final SlimefunItemStack ExtremeFreezer = new SlimefunItemStack(
            "EXTREMEFREEZER",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&b速冻机",
            "",
            "&7将水凝固成反应堆冷却剂",
            "",
            MachineLore.energyPerSecond(60),
            MachineLore.energyBuffer(360)
    );

    public static final SlimefunItemStack ItemProcessor = new SlimefunItemStack("ITEMPROCESSOR",
            Material.PISTON,
            "&6EZ解压机",
            "",
            "&7解压物品",
            "",
            MachineLore.energyPerSecond(12),
            MachineLore.energyBuffer(36)
    );



}
