package me.ezcoins.slimefunaddon.Recipes.Materials;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Material;

public class MaterialsSetup {


    public static final SlimefunItemStack MACHINE_MOTOR = new SlimefunItemStack("MACHINE_MOTOR",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2IwNDMzZjFjMjI3OTYwOGY3YmQyY2VjZWI5OGNkMTc1Y2JhYWRjM2Y2Mjk5YWUzY2NhZTI1N2RjMjJhNTViMiJ9fX0=",
            "&cEZ马达"
    );


    public static final SlimefunItemStack BISMUTH = new SlimefunItemStack("BISMUTH",
            Material.BRICK,
            "&3铋锭"
    );

    public static final SlimefunItemStack BISMUTHPLATES = new SlimefunItemStack("BISMUTHPLATES",
            Material.NETHERITE_SCRAP,
            "&3&l铋板"
    );

    public static final SlimefunItemStack PLATINUM = new SlimefunItemStack("PLATINUM",
            Material.IRON_INGOT,
            "&f&l铂锭"
    );

    public static final SlimefunItemStack SOULARIUM = new SlimefunItemStack("SOULARIUM",
            Material.DRIED_KELP,
            "&6&l魂金锭"
    );


    public static final SlimefunItemStack MACHINEPLATING = new SlimefunItemStack("MACHINEPLATING",
            Material.PAPER,
            "&bEZ机械板"
    );

    public static final SlimefunItemStack MACHINECHASSIS = new SlimefunItemStack("MACHINECHASSIS",
            Material.NETHERITE_BLOCK,
            "&b机械底盘"
    );

    public static final SlimefunItemStack DARKPHOTO = new SlimefunItemStack("DARKPHOTO",
            Material.DAYLIGHT_DETECTOR,
            "&8暗光伏电池",
            "",
            "&7用于合成月光发电机"
    );

    public static final SlimefunItemStack FROZEN_LAVA = new SlimefunItemStack("FROZEN_LAVA",
            "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmI4NTEzYzYxNjQ5NTg0OWNmOTFiNzY1MzZlODcyZTIwMDFhNjFjNWRiNDJhYzQwZDFiMjBhNzM0MjVkM2E5NSJ9fX0=",
            "&4冻土熔岩"
    );

    public static final SlimefunItemStack COS = new SlimefunItemStack("COS",
            Material.BARRIER,
            "&c&l敬请期待!"
    );




    private static final String RAINBOW = "&d轮番展现彩虹的颜色!";
    public static final SlimefunItemStack RAINBOW_CARPET = new SlimefunItemStack("RAINBOW_CARPET", Material.WHITE_CARPET, "&5彩虹地毯", "", RAINBOW);
    
    private static final String RAINBOW_S = "&d轮番展现彩虹的颜色!";
    public static final SlimefunItemStack RAINBOW_SHULKER_BOX = new SlimefunItemStack("RAINBOW_SHULKER_BOX", Material.WHITE_SHULKER_BOX, "&5彩虹潜影盒", "", RAINBOW_S);



}
