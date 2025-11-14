package io.github.gameking1happy.gk1hcore;

import io.github.gameking1happy.gk1hcore.packs.AddPacks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.repository.Pack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
import static io.github.gameking1happy.gk1hcore.platform.Services.REGISTERPACKS;

public class Main {
    public static void init(Object modBus) {
        // Gives a startup message to the log.
        LOG.info("GK1H Core running on {} in a {} environment.", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
        REGISTERPACKS.registerpacks(modBus);
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
    public static void packExclude(String Exclusion) {
        PackExclusions.add(Exclusion);
    }
    @SuppressWarnings("unused")
    public static void addClass(AddPacks aP) {
        AddPacksList.add(aP);
    }
    // Mod constants.
    public static List<String> PackExclusions = new ArrayList<>();
    public static List<AddPacks> AddPacksList = new ArrayList<>();
    public static final String MOD_ID = "gk1hcore";
    public static final String MOD_NAME = "GK1H Core";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
}