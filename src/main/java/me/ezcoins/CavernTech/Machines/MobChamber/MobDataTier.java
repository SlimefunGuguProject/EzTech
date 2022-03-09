package me.ezcoins.CavernTech.Machines.MobChamber;

import org.bukkit.Material;

public enum MobDataTier {

    // ex: chicken
    PASSIVE(1, 75, Material.LIME_DYE),


    //
    MISC(1, 1000, Material.HONEYCOMB),

    // ex: slime
    NEUTRAL(1, 150, Material.YELLOW_DYE),

    // ex: zombie
    HOSTILE(2, 300, Material.ORANGE_DYE),

    // ex: endermen
    ADVANCED(4, 600, Material.RED_DYE),

    // ex: wither
    MINI_BOSS(32, 2000, Material.BLACK_DYE),

    // ex: ender dragon
    BOSS(200, 2000, Material.BLACK_DYE);

    final int xp;
    final int energy;
    final Material material;

    MobDataTier(int xp, int energy, Material material) {
        this.xp = (int) (xp * MobSimulationChamber.XP_MULTIPLIER);
        this.energy = energy;
        this.material = material;
    }

}