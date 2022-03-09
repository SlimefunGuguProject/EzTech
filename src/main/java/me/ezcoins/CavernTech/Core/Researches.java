package me.ezcoins.CavernTech.Core;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;

import me.ezcoins.CavernTech.CavernTech;
import me.ezcoins.CavernTech.Machines.MobChamber.MobData;
import me.ezcoins.CavernTech.Machines.MobChamber.MobDataCard;

public final class Researches {

    private static final int FIRST_ID = 31548524;

    public static void setup(CavernTech plugin) {


        create(0, "soul_reaver", "Fetch me their souls!", 80,
                MobData.SoulReaver
        );

        create(1, "passive_soul", "Passive soul essence", 30,
                MobData.PASSIVE_SOUL_ESSENCE
        );

        create(2, "neutral_soul", "Neutral soul essence", 45,
                MobData.NEUTRAL_SOUL_ESSENCE
        );

        create(3, "hostile_soul", "Hostile soul essence", 50,
                MobData.HOSTILE_SOUL_ESSENCE
        );

        create(4, "advanced_soul", "Advanced soul essence", 75,
                MobData.ADVANCED_SOUL_ESSENCE
        );

        create(5, "boss_soul", "Boss soul essence", 100,
                MobData.BOSS_SOUL_ESSENCE
        );

        create(6, "passive_chips", "All passive data chips", 150,
                MobData.COW, MobData.SHEEP, MobData.CHICKEN, MobData.PIG, MobData.SQUID, MobData.GLOWSQUID, MobData.MOOSHROOM, MobData.RABBIT, MobData.TURTLE
        );

        create(7, "neutral_chips", "All neutral data chips", 175,
                MobData.BEE, MobData.SLIME, MobData.MAGMA_CUBE, MobData.SPIDER, MobData.PIGLIN
        );

        create(8, "zombie_chip", "Zombie data chip", 75,
                MobData.ZOMBIE
        );

        create(9, "skeleton_chip", "Skeleton data chip", 75,
                MobData.SKELETON
        );

        create(10, "creeper_chip", "Creeper data chip", 75,
                MobData.CREEPER
        );

        create(11, "witch_chip", "Witch data chip", 75,
                MobData.WITCH
        );

        create(12, "guardian_chip", "Guardian data chip", 100,
                MobData.GUARDIAN
        );

        create(13, "wither_skeleton_chip", "Wither skeleton data chip", 125,
                MobData.WITHER_SKELETON
        );

        create(14, "iron_golem_chip", "Iron golem data chip", 125,
                MobData.IRON_GOLEM
        );

        create(15, "blaze", "Blaze data chip", 125,
                MobData.BLAZE
        );

        create(16, "enderman", "Enderman data chip", 100,
                MobData.ENDERMAN
        );

        create(17, "elderguardian", "Elder guardian data chip", 150,
                MobData.ELDER_GUARDIAN
        );

        create(18, "enderdragon", "Ender dragon data chip", 200,
                MobData.ENDER_DRAGON
        );

        create(19, "wither", "Wither data chip", 200,
                MobData.WITHER
        );

    }


        private static void create(int id, String key, String name, int cost, SlimefunItemStack... items) {
            new Research(CavernTech.createKey(key), FIRST_ID + id, name, cost).addItems(items).register();
    }
}
