package me.ezcoins.slimefunaddon.Machines.MobChamber;

import lombok.experimental.UtilityClass;

import me.ezcoins.slimefunaddon.Core.EzRecipeTypes;
import me.ezcoins.slimefunaddon.Core.Groups;
import me.ezcoins.slimefunaddon.EasySlimefunAddon;
import me.ezcoins.slimefunaddon.Recipes.Materials.MaterialsSetup;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Mob;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.core.Environment;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Random;


@UtilityClass
public final class MobData {

    private static final int CHAMBER_INTERVAL = 60;
    private static final int CHAMBER_BUFFER = 7500;
    private static final int CHAMBER_ENERGY = 0;
    private static final int INFUSER_ENERGY = 20000;


    public static final SlimefunItemStack EMPTY_DATA_CARD = new SlimefunItemStack(
            "EMPTY_DATA_CHIP",
            Material.GRAY_DYE,
            "&8EZ空生物芯片",
            "&7需要注入生物掉落物"
    );
    public static final SlimefunItemStack INFUSER = new SlimefunItemStack(
            "CHI_INFUSER",
            Material.NETHERITE_BLOCK,
            "&7&lEZ生物芯片注入器",
            "&7将生物掉落物注入生物芯片",
            "",
            MachineLore.energy(INFUSER_ENERGY) + "每次使用"
    );
    public static final SlimefunItemStack CHAMBER = new SlimefunItemStack(
            "MOB_CHAMBER",
            Material.SEA_LANTERN,
            "&8&lEZ生物模拟室",
            "&7使用生物芯片以激活",
            "",
            MachineLore.energyBuffer(CHAMBER_BUFFER),
            MachineLore.energyPerSecond(CHAMBER_ENERGY)
    );

    public static final SlimefunItemStack PASSIVE_SOUL_ESSENCE = new SlimefunItemStack(
            "PASSIVE_SOUL_ESSENCE",
            Material.GHAST_TEAR,
            "&a被动灵魂精华",
            "",
            "&7灵魂掠夺者的精华，用于被动生物"
    );

    public static final SlimefunItemStack NEUTRAL_SOUL_ESSENCE = new SlimefunItemStack(
            "NEUTRAL_SOUL_ESSENCE",
            Material.SLIME_BALL,
            "&e中立灵魂精华",
            "",
            "&7灵魂掠夺者的精华，用于中立生物"
    );

    public static final SlimefunItemStack HOSTILE_SOUL_ESSENCE = new SlimefunItemStack(
            "HOSTILE_SOUL_ESSENCE",
            Material.MAGMA_CREAM,
            "&6敌对灵魂精华",
            "",
            "&7灵魂掠夺者的精华，用于敌对生物"
    );

    public static final SlimefunItemStack ADVANCED_SOUL_ESSENCE = new SlimefunItemStack(
            "ADVANCED_SOUL_ESSENCE",
            Material.BLAZE_POWDER,
            "&c高级灵魂精华",
            "",
            "&7灵魂掠夺者的精华，用于高级生物"
    );

    public static final SlimefunItemStack BOSS_SOUL_ESSENCE = new SlimefunItemStack(
            "BOSS_SOUL_ESSENCE",
            Material.DRAGON_BREATH,
            "&4&lBoss灵魂精华",
            "",
            "&7灵魂掠夺者的精华，用于Boss生物"
    );

    public static final SlimefunItemStack SoulReaver = MobDataCard.create("灵魂掠夺者", MobDataTier.MISC);

    public static final SlimefunItemStack COW = MobDataCard.create("牛", MobDataTier.PASSIVE);
    public static final SlimefunItemStack SHEEP = MobDataCard.create("绵羊", MobDataTier.PASSIVE);
    public static final SlimefunItemStack CHICKEN = MobDataCard.create("鸡", MobDataTier.PASSIVE);
    public static final SlimefunItemStack PIG = MobDataCard.create("猪", MobDataTier.PASSIVE);
    public static final SlimefunItemStack SQUID = MobDataCard.create("鱿鱼", MobDataTier.PASSIVE);
    public static final SlimefunItemStack GLOWSQUID = MobDataCard.create("发光鱿鱼", MobDataTier.PASSIVE);
    public static final SlimefunItemStack MOOSHROOM = MobDataCard.create("哞菇", MobDataTier.PASSIVE);
    public static final SlimefunItemStack RABBIT = MobDataCard.create("兔子", MobDataTier.PASSIVE);
    public static final SlimefunItemStack TURTLE = MobDataCard.create("海龟", MobDataTier.PASSIVE);


    public static final SlimefunItemStack BEE = MobDataCard.create("蜜蜂", MobDataTier.NEUTRAL);
    public static final SlimefunItemStack SLIME = MobDataCard.create("史莱姆", MobDataTier.NEUTRAL);
    public static final SlimefunItemStack MAGMA_CUBE = MobDataCard.create("岩浆怪", MobDataTier.NEUTRAL);
    public static final SlimefunItemStack PIGLIN = MobDataCard.create("僵尸猪灵", MobDataTier.NEUTRAL);
    public static final SlimefunItemStack SPIDER = MobDataCard.create("蜘蛛", MobDataTier.NEUTRAL);

    public static final SlimefunItemStack WITCH = MobDataCard.create("女巫", MobDataTier.HOSTILE);
    public static final SlimefunItemStack ZOMBIE = MobDataCard.create("僵尸", MobDataTier.HOSTILE);
    public static final SlimefunItemStack SKELETON = MobDataCard.create("骷髅", MobDataTier.HOSTILE);
    public static final SlimefunItemStack CREEPER = MobDataCard.create("苦力怕", MobDataTier.HOSTILE);

    public static final SlimefunItemStack WITHER_SKELETON = MobDataCard.create("凋零骷髅", MobDataTier.ADVANCED);
    public static final SlimefunItemStack ENDERMAN = MobDataCard.create("末影人", MobDataTier.ADVANCED);
    public static final SlimefunItemStack GUARDIAN = MobDataCard.create("守卫者", MobDataTier.ADVANCED);
    public static final SlimefunItemStack IRON_GOLEM = MobDataCard.create("铁傀儡", MobDataTier.ADVANCED);
    public static final SlimefunItemStack BLAZE = MobDataCard.create("烈焰人", MobDataTier.ADVANCED);

    public static final SlimefunItemStack WITHER = MobDataCard.create("凋灵", MobDataTier.BOSS);
    public static final SlimefunItemStack ENDER_DRAGON = MobDataCard.create("末影龙", MobDataTier.BOSS);
    public static final SlimefunItemStack ELDER_GUARDIAN = MobDataCard.create("远古守卫者", MobDataTier.BOSS);

    public static void setup(EasySlimefunAddon plugin) {

        new MobSimulationChamber(Groups.EzChamber, CHAMBER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                MaterialsSetup.SOULARIUM, MaterialsSetup.MACHINECHASSIS, MaterialsSetup.SOULARIUM,
                MaterialsSetup.MACHINE_MOTOR, SlimefunItems.PROGRAMMABLE_ANDROID_BUTCHER, MaterialsSetup.MACHINE_MOTOR,
                MaterialsSetup.SOULARIUM, MaterialsSetup.MACHINECHASSIS, MaterialsSetup.SOULARIUM,
        }, CHAMBER_ENERGY, CHAMBER_INTERVAL).register(plugin);

        new MobDataInfuser(Groups.EzChamber, INFUSER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                MaterialsSetup.BISMUTHPLATES, MaterialsSetup.SOULARIUM, MaterialsSetup.BISMUTHPLATES,
                MaterialsSetup.SOULARIUM, MaterialsSetup.MACHINECHASSIS, MaterialsSetup.SOULARIUM,
                MaterialsSetup.BISMUTHPLATES, MaterialsSetup.SOULARIUM, MaterialsSetup.BISMUTHPLATES
        }, INFUSER_ENERGY).register(plugin);

        new SlimefunItem(Groups.EzChamber, EMPTY_DATA_CARD, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.POWER_CRYSTAL, SlimefunItems.REINFORCED_PLATE,
                MaterialsSetup.SOULARIUM, SlimefunItems.CARBONADO, MaterialsSetup.SOULARIUM,
                SlimefunItems.REINFORCED_PLATE, MaterialsSetup.MACHINEPLATING, SlimefunItems.REINFORCED_PLATE
        }).register(plugin);

        new MobDataCard(SoulReaver, MobDataTier.MISC, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 4), SlimefunItems.NECROTIC_SKULL, new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 4),
                new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 16), EMPTY_DATA_CARD, new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 16),
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 4), new SlimefunItemStack(MaterialsSetup.SOULARIUM, 8), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 4)
        }).addDrop(MobData.PASSIVE_SOUL_ESSENCE, 4)
                .addDrop(MobData.NEUTRAL_SOUL_ESSENCE, 5)
                .addDrop(MobData.HOSTILE_SOUL_ESSENCE, 10)
                .addDrop(MobData.ADVANCED_SOUL_ESSENCE, 25)
                .addDrop(MobData.BOSS_SOUL_ESSENCE, 100)
                .register(plugin);

        new SlimefunItem(Groups.EzChamber, PASSIVE_SOUL_ESSENCE, EzRecipeTypes.SOULREAVER, new ItemStack[] {
        }).register(plugin);

        new SlimefunItem(Groups.EzChamber, NEUTRAL_SOUL_ESSENCE, EzRecipeTypes.SOULREAVER, new ItemStack[] {
        }).register(plugin);

        new SlimefunItem(Groups.EzChamber, HOSTILE_SOUL_ESSENCE, EzRecipeTypes.SOULREAVER, new ItemStack[] {
        }).register(plugin);

        new SlimefunItem(Groups.EzChamber, ADVANCED_SOUL_ESSENCE, EzRecipeTypes.SOULREAVER, new ItemStack[] {
        }).register(plugin);

        new SlimefunItem(Groups.EzChamber, BOSS_SOUL_ESSENCE, EzRecipeTypes.SOULREAVER, new ItemStack[] {
        }).register(plugin);


        if (EasySlimefunAddon.environment() == Environment.TESTING) {
            return;
        }

        new MobDataCard(COW, MobDataTier.PASSIVE, new ItemStack[] {
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_COW_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32),
                new ItemStack(Material.BEEF, 64), EMPTY_DATA_CARD, new ItemStack(Material.LEATHER, 64),
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_COW_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32)
        }).addDrop(Material.BEEF, 1, 1)
                .addDrop(Material.BEEF, 2, 1)
                .addDrop(Material.BEEF, 3, 1)
                .addDrop(Material.LEATHER, 1)
                .addDrop(Material.LEATHER, 2, 1)
                .register(plugin);

        new MobDataCard(SHEEP, MobDataTier.PASSIVE, new ItemStack[] {
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 64), getItem("FILLED_SHEEP_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 64),
                new ItemStack(Material.MUTTON, 64), EMPTY_DATA_CARD, new ItemStack(Material.WHITE_WOOL, 64),
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 64), getItem("FILLED_SHEEP_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 64)
        }).addDrop(Material.MUTTON, 1, 1)
                .addDrop(Material.MUTTON, 2, 1)
                .addDrop(Material.WHITE_WOOL, 1, 1)
                .register(plugin);

        new MobDataCard(CHICKEN, MobDataTier.PASSIVE, new ItemStack[] {
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_COW_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32),
                new ItemStack(Material.BEEF, 64), EMPTY_DATA_CARD, new ItemStack(Material.LEATHER, 64),
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_COW_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32)
        }).addDrop(Material.CHICKEN, 1)
          .addDrop(Material.FEATHER, 1)
          .addDrop(Material.EGG, 5)
          .register(plugin);

        new MobDataCard(PIG, MobDataTier.PASSIVE, new ItemStack[] {
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 16), getItem("FILLED_CHICKEN_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 16),
                new ItemStack(Material.PORKCHOP, 64), EMPTY_DATA_CARD, new ItemStack(Material.PORKCHOP, 64),
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 16), getItem("FILLED_CHICKEN_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 16)
        }).addDrop(Material.PORKCHOP, 1)
                .addDrop(Material.PORKCHOP, 2, 1)
                .register(plugin);

        new MobDataCard(SQUID, MobDataTier.PASSIVE, new ItemStack[] {
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_SQUID_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32),
                new ItemStack(Material.INK_SAC, 64), EMPTY_DATA_CARD, new ItemStack(Material.INK_SAC, 64),
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_SQUID_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32)
        }).addDrop(Material.INK_SAC,1,1)
                .addDrop(Material.INK_SAC, 2, 1)
                .addDrop(Material.INK_SAC, 3,1)
                .register(plugin);


        new MobDataCard(GLOWSQUID, MobDataTier.PASSIVE, new ItemStack[] {
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 64), getItem("FILLED_SQUID_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 64),
                new ItemStack(Material.GLOW_INK_SAC, 64), EMPTY_DATA_CARD, new ItemStack(Material.GLOW_INK_SAC, 64),
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 64), getItem("FILLED_SQUID_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 64)
        }).addDrop(Material.GLOW_INK_SAC,1,1)
                .addDrop(Material.GLOW_INK_SAC, 2, 1)
                .addDrop(Material.GLOW_INK_SAC, 3,1)
                .register(plugin);

        new MobDataCard(MOOSHROOM, MobDataTier.PASSIVE, new ItemStack[] {
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_MUSHROOM_COW_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32),
                new ItemStack(Material.BROWN_MUSHROOM, 64), EMPTY_DATA_CARD, new ItemStack(Material.RED_MUSHROOM, 64),
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_MUSHROOM_COW_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32)
        }).addDrop(Material.BEEF, 1, 1)
                .addDrop(Material.BEEF, 2, 1)
                .addDrop(Material.BEEF, 3, 1)
                .addDrop(Material.BROWN_MUSHROOM, 2)
                .addDrop(Material.RED_MUSHROOM, 2)
                .register(plugin);

        new MobDataCard(RABBIT, MobDataTier.PASSIVE, new ItemStack[] {
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_RABBIT_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32),
                new ItemStack(Material.RABBIT_FOOT, 8), EMPTY_DATA_CARD, new ItemStack(Material.RABBIT_FOOT, 64),
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), getItem("FILLED_RABBIT_SOUL_JAR"), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32)
        }).addDrop(Material.RABBIT, 1)
                .addDrop(Material.RABBIT_HIDE, 1)
                .addDrop(Material.RABBIT_FOOT, 10)
                .register(plugin);

        new MobDataCard(TURTLE, MobDataTier.PASSIVE, new ItemStack[] {
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), new SlimefunItemStack(MaterialsSetup.SOULARIUM, 8), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32),
                new ItemStack(Material.TURTLE_EGG, 64), EMPTY_DATA_CARD, new ItemStack(Material.SCUTE, 64),
                new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32), new SlimefunItemStack(MaterialsSetup.SOULARIUM, 8), new SlimefunItemStack(MobData.PASSIVE_SOUL_ESSENCE, 32)
        }).addDrop(Material.SCUTE, 5)
                .addDrop(Material.TURTLE_EGG, 5)
                .addDrop(Material.KELP, 1)
                .register(plugin);

        new MobDataCard(BEE, MobDataTier.NEUTRAL, new ItemStack[] {
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 20), new ItemStack(Material.HONEY_BLOCK, 4), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 20),
                new ItemStack(Material.HONEYCOMB, 64), EMPTY_DATA_CARD, new ItemStack(Material.HONEY_BOTTLE, 16),
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 20), new ItemStack(Material.HONEYCOMB_BLOCK, 16), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 20)
        }).addDrop(Material.HONEYCOMB, 1)
                .addDrop(Material.HONEY_BOTTLE, 1)
                .register(plugin);

        new MobDataCard(SLIME, MobDataTier.NEUTRAL, new ItemStack[] {
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 32), getItem("FILLED_SLIME_SOUL_JAR"), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 32),
                new ItemStack(Material.SLIME_BLOCK, 32), EMPTY_DATA_CARD, new ItemStack(Material.SLIME_BLOCK, 32),
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 32), getItem("FILLED_SLIME_SOUL_JAR"), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 32)
        }).addDrop(Material.SLIME_BALL, 1)
                .register(plugin);

        new MobDataCard(MAGMA_CUBE, MobDataTier.NEUTRAL, new ItemStack[] {
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 48), getItem("FILLED_MAGMA_CUBE_SOUL_JAR"), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 48),
                new ItemStack(Material.MAGMA_CREAM, 64), EMPTY_DATA_CARD, new ItemStack(Material.MAGMA_CREAM, 64),
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 48), getItem("FILLED_MAGMA_CUBE_SOUL_JAR"), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 48)
        }).addDrop(Material.MAGMA_CREAM, 1)
                .register(plugin);


        new MobDataCard(SPIDER, MobDataTier.NEUTRAL, new ItemStack[] {
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 32), getItem("FILLED_SPIDER_SOUL_JAR"), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 32),
                new ItemStack(Material.COBWEB, 32), EMPTY_DATA_CARD, new ItemStack(Material.COBWEB, 32),
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 32), getItem("FILLED_SPIDER_SOUL_JAR"), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 32)
        }).addDrop(Material.STRING, 1)
                .addDrop(Material.STRING, 2, 1)
                .addDrop(Material.SPIDER_EYE, 2)
                .register(plugin);

        new MobDataCard(PIGLIN, MobDataTier.NEUTRAL, new ItemStack[] {
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 40), getItem("FILLED_ZOMBIFIED_PIGLIN_SOUL_JAR"), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 40),
                new ItemStack(Material.GOLD_BLOCK, 32), EMPTY_DATA_CARD, new ItemStack(Material.ROTTEN_FLESH, 64),
                new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 40), getItem("FILLED_ZOMBIFIED_PIGLIN_SOUL_JAR"), new SlimefunItemStack(MobData.NEUTRAL_SOUL_ESSENCE, 40)
        }).addDrop(Material.GOLD_NUGGET, 1)
                .addDrop(Material.GOLD_NUGGET, 2, 1)
                .addDrop(Material.GOLD_INGOT, 5)
                .addDrop(Material.ROTTEN_FLESH, 1)
                .addDrop(Material.ROTTEN_FLESH, 2, 1)
                .register(plugin);


        new MobDataCard(ZOMBIE, MobDataTier.HOSTILE, new ItemStack[] {
                new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 16), getItem("FILLED_ZOMBIE_SOUL_JAR"), new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 16),
                new ItemStack(Material.CARROT, 64), EMPTY_DATA_CARD, new ItemStack(Material.POTATO, 64),
                new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 16), getItem("FILLED_ZOMBIE_SOUL_JAR"), new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 16)
        }).addDrop(Material.ROTTEN_FLESH, 1)
                .addDrop(Material.ROTTEN_FLESH, 2, 1)
                .addDrop(Material.CARROT, 1)
                .addDrop(Material.POTATO, 1)
                .addDrop(Material.IRON_INGOT, 5)
                .register(plugin);

        new MobDataCard(SKELETON, MobDataTier.HOSTILE, new ItemStack[] {
                new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 16), getItem("FILLED_SKELETON_SOUL_JAR"), new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 16),
                new ItemStack(Material.BONE, 64), EMPTY_DATA_CARD, new ItemStack(Material.ARROW, 64),
                new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 16), getItem("FILLED_SKELETON_SOUL_JAR"), new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 16)
        }).addDrop(Material.BONE, 1)
                .addDrop(Material.BONE,2, 1)
                .addDrop(Material.ARROW, 1)
                .addDrop(Material.ARROW,2, 1)
                .register(plugin);

        new MobDataCard(CREEPER, MobDataTier.HOSTILE, new ItemStack[] {
                new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 24), getItem("FILLED_CREEPER_SOUL_JAR"), new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 24),
                new ItemStack(Material.GUNPOWDER, 64), EMPTY_DATA_CARD, new ItemStack(Material.GUNPOWDER, 64),
                new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 24), getItem("FILLED_CREEPER_SOUL_JAR"), new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 24)
        }).addDrop(Material.GUNPOWDER, 1)
                .register(plugin);

        new MobDataCard(WITCH, MobDataTier.HOSTILE, new ItemStack[] {
                new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 32), getItem("FILLED_WITCH_SOUL_JAR"), new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 32),
                new ItemStack(Material.GUNPOWDER, 64), EMPTY_DATA_CARD, new ItemStack(Material.GLOWSTONE_DUST, 64),
                new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 32), getItem("FILLED_WITCH_SOUL_JAR"), new SlimefunItemStack(MobData.HOSTILE_SOUL_ESSENCE, 32)
        }).addDrop(Material.STICK, 1)
                .addDrop(Material.GLASS_BOTTLE, 1)
                .addDrop(Material.SUGAR, 1)
                .addDrop(Material.REDSTONE, 1)
                .addDrop(Material.GUNPOWDER, 1)
                .addDrop(Material.GLOWSTONE_DUST, 1)
                .register(plugin);

        new MobDataCard(GUARDIAN, MobDataTier.ADVANCED, new ItemStack[] {
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 16), getItem("FILLED_GUARDIAN_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 16),
                new ItemStack(Material.PRISMARINE_CRYSTALS, 32), EMPTY_DATA_CARD, new ItemStack(Material.PRISMARINE_CRYSTALS, 32),
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 16), getItem("FILLED_GUARDIAN_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 16)
        }).addDrop(Material.PRISMARINE_SHARD, 1)
                .addDrop(Material.PRISMARINE_CRYSTALS, 1 ,2)
                .register(plugin);

        new MobDataCard(WITHER_SKELETON, MobDataTier.ADVANCED, new ItemStack[] {
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 32), getItem("FILLED_WITHER_SKELETON_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 32),
                new SlimefunItemStack(SlimefunItems.CARBONADO, 32), EMPTY_DATA_CARD, new ItemStack(Material.WITHER_SKELETON_SKULL, 32),
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 32), getItem("FILLED_WITHER_SKELETON_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 32)
        }).addDrop(Material.BONE, 1)
                .addDrop(Material.COAL, 1)
                .register(plugin);

        new MobDataCard(IRON_GOLEM, MobDataTier.ADVANCED, new ItemStack[] {
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 32), getItem("FILLED_IRON_GOLEM_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 32),
                new ItemStack(Material.IRON_BLOCK, 64), EMPTY_DATA_CARD, new ItemStack(Material.CARVED_PUMPKIN, 64),
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 32), getItem("FILLED_IRON_GOLEM_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 32)
        }).addDrop(Material.IRON_INGOT, 3,1)
                .addDrop(Material.IRON_INGOT, 4,1)
                .addDrop(Material.IRON_INGOT, 5,1)
                .addDrop(Material.POPPY, 1,2)
                .register(plugin);

        new MobDataCard(BLAZE, MobDataTier.ADVANCED, new ItemStack[] {
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 24), getItem("FILLED_BLAZE_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 24),
                new ItemStack(Material.BLAZE_ROD, 64), EMPTY_DATA_CARD, new ItemStack(Material.BLAZE_ROD, 64),
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 24), getItem("FILLED_BLAZE_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 24)
        }).addDrop(Material.BLAZE_ROD, 1)
                .register(plugin);

        new MobDataCard(ENDERMAN, MobDataTier.ADVANCED, new ItemStack[] {
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 24), getItem("FILLED_ENDERMAN_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 24),
                new ItemStack(Material.ENDER_PEARL, 16), EMPTY_DATA_CARD, new ItemStack(Material.ENDER_PEARL, 16),
                new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 24), getItem("FILLED_ENDERMAN_SOUL_JAR"), new SlimefunItemStack(MobData.ADVANCED_SOUL_ESSENCE, 24)
        }).addDrop(Material.ENDER_PEARL, 1)
                .register(plugin);

        new MobDataCard(ELDER_GUARDIAN, MobDataTier.MINI_BOSS, new ItemStack[] {
                new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 6), getItem("GUARDIAN_DATA_CHIP"), new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 6),
                new ItemStack(Material.SPONGE, 64), EMPTY_DATA_CARD, new ItemStack(Material.SEA_LANTERN, 64),
                new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 6), getItem("GUARDIAN_DATA_CHIP"), new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 6)
        }).addDrop(Material.PRISMARINE_SHARD, 3, 1)
                .addDrop(Material.PRISMARINE_CRYSTALS, 3, 1)
                .addDrop(Material.SPONGE, 1, 50)
                .register(plugin);

        new MobDataCard(ENDER_DRAGON, MobDataTier.BOSS, new ItemStack[] {
                new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 12), getItem("ENDERMAN_DATA_CHIP"), new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 12),
                new ItemStack(Material.ENDER_EYE, 64), EMPTY_DATA_CARD, new ItemStack(Material.END_CRYSTAL, 64),
                new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 12), getItem("ENDERMAN_DATA_CHIP"), new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 12)
        }).addDrop(Material.ENDER_EYE, 4, 1)
                .addDrop(Material.ENDER_EYE, 5, 1)
                .register(plugin);

        new MobDataCard(WITHER, MobDataTier.MINI_BOSS, new ItemStack[] {
                new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 20), getItem("WITHER_SKELETON_DATA_CHIP"), new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 20),
                new ItemStack(Material.NETHER_STAR, 64), EMPTY_DATA_CARD, new SlimefunItemStack(SlimefunItems.WITHER_ASSEMBLER, 5),
                new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 20), getItem("WITHER_SKELETON_DATA_CHIP"), new SlimefunItemStack(MobData.BOSS_SOUL_ESSENCE, 20)
        }).addDrop(Material.NETHER_STAR, 1, 1)
                .addDrop(SlimefunItems.CARBON, 4,2)
                .addDrop(SlimefunItems.COMPRESSED_CARBON, 2,5)
                .register(plugin);


        new SlimefunItem(Groups.EzChamber, MaterialsSetup.COS, RecipeType.NULL,
                new ItemStack[]{null,null,null,
                                null, new ItemStack(Material.BARRIER), null
                }).register(EasySlimefunAddon.plugin);




    }

    @Nullable
    private static ItemStack getItem(@Nonnull String id) {
        SlimefunItem item = SlimefunItem.getById(id);
        return item != null ? item.getItem() : null;

    }

}