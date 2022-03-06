package me.ezcoins.slimefunaddon.Core;

import lombok.experimental.UtilityClass;

import org.bukkit.Location;
import me.mrCookieSlime.Slimefun.api.BlockStorage;

@UtilityClass
public final class Utils {


    public static int getIntData(String key, Location block) {
        String val = BlockStorage.getLocationInfo(block, key);
        if (val == null) {
            BlockStorage.addBlockInfo(block, key, "0");
            return 0;
        }
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException x) {
            BlockStorage.addBlockInfo(block, key, "0");
            return 0;
        }
    }

}
