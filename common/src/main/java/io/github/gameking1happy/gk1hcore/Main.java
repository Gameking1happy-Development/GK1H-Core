package io.github.gameking1happy.gk1hcore;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.repository.Pack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
public class Main {
    public static void init() {
        // Gives a startup message to the log.
        LOG.info("GK1H Core running on {} in a {} environment.", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
    }
    public static ResourceLocation fNAP(String namespace, String path) {
        return ResourceLocation.fromNamespaceAndPath(namespace, path);
    }
    public static boolean packContainsAnyFromList(Pack pack, List<String> list) {
        for (String str : list) {
            if (pack.getId().contains(str)) {
                return true;
            }
        }
        return false;
    }
    @SuppressWarnings("unused")
    public static void packExclude(String Exclusion) {
        PackExclusions.add(Exclusion);
    }
    // Mod constants.
    public static List<String> PackExclusions = new java.util.ArrayList<>();
    public static final String MOD_ID = "gk1hcore";
    public static final String MOD_NAME = "GK1H Core";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
}