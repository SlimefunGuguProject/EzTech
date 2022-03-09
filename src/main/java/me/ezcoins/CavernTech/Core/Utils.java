package me.ezcoins.CavernTech.Core;

import lombok.experimental.UtilityClass;

import org.bukkit.Location;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.block.BlockFace;

import javax.annotation.Nonnull;

@UtilityClass
public class Utils {



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

    @Nonnull
    public static BlockFace getFaceFromYaw(float yaw) {
        double rot = yaw % 360;

        if (rot < 0) {
            rot += 360;
        }

        if ((0 <= rot && rot < 45) || (315 <= rot && rot < 360.0)) {
            return BlockFace.SOUTH;
        } else if (45 <= rot && rot < 135) {
            return BlockFace.WEST;
        } else if (135 <= rot && rot < 225) {
            return BlockFace.NORTH;
        } else if (225 <= rot && rot < 315) {
            return BlockFace.EAST;
        } else {
            throw new IllegalArgumentException("impossible rotation: " + rot);
        }
    }

}
