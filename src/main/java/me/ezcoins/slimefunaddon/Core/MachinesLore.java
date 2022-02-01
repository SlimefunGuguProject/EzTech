package me.ezcoins.slimefunaddon.Core;

import java.text.DecimalFormat;

import me.ezcoins.slimefunaddon.Machines.*;

import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;

public final class MachinesLore {

    private static final DecimalFormat FORMAT = new DecimalFormat("###,###,###,###,###,###.#");
    private static final double TPS = 20D / Slimefun.getTickerTask().getTickRate();
    private static final String PREFIX = "&8\u21E8 &e\u26A1 &7";

    public static String ENERGY_CONSUMPTION(int energy) {
        return PREFIX + formatEnergy(energy) + " J/s";
    }


    public static String energyBuffer(int energy) {
        return PREFIX + format(energy) + " J Buffer";
    }


    public static String energyPerSecond(int energy) {
        return PREFIX + format(energy) + " J ";
    }


    public static String speed(int speed) {
        return PREFIX + "Speed: &b" + speed + 'x';
    }


    public static String formatEnergy(int energy) {
        return FORMAT.format(energy * TPS);
    }

    public static String format(double number) {
        return FORMAT.format(number);
    }

}