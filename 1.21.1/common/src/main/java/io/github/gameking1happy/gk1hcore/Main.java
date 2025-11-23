package io.github.gameking1happy.gk1hcore;

import io.github.gameking1happy.gk1hcore.mixin.PackSelectionModelMixin;
import io.github.gameking1happy.gk1hcore.packs.*;
import net.minecraft.server.packs.repository.Pack;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
import static io.github.gameking1happy.gk1hcore.platform.Services.REGISTERPACKS;

/**
 * The main class for the mod.
 */
@SuppressWarnings("CanBeFinal")
public class Main {
    /**
     * The mod ID.
     */
    public static final String MOD_ID = "gk1hcore";
    /**
     * The mod name.
     */
    public static final String MOD_NAME = "GK1H Core";
    /**
     * The mod logger.
     */
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
    /**
     * List of packs to be excluded from the pack selection screen.
     * @see AddPackPreset#addHiddenPack(Object, String, String, String, activationType, packType, packSource, packPosition)
     * @see PackSelectionModelMixin
     */
    public static List<String> PackExclusions = new ArrayList<>();
    /**
     * List of {@link AddPacks} classes given by other mods for their packs to be added.
     */
    public static List<AddPacks> AddPacksList = new ArrayList<>();

    /**
     * Common method for initializing the mod.
     * @param modBus Required for {@link RegisterPacks} to work.
     */
    public static void init(Object modBus) {
        LOG.info("GK1H Core running on {} in a {} environment.", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
        REGISTERPACKS.registerpacks(modBus);
    }

    /**
     * Method to check if a pack ID contains any of the strings in a list.
     * @param pack Current pack being checked.
     * @param list Supposed to be {@link Main#AddPacksList}, but technically this method can be used for other purposes which could use other lists.
     * @return True if the pack ID does contain one of the strings in the list, otherwise returns false.
     * @see PackSelectionModelMixin
     */
    public static boolean packContainsAnyFromList(@NotNull Pack pack, @NotNull List<String> list) {
        for (String str : list) {
            if (pack.getId().contains(str)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a string to {@link Main#AddPacksList}.
     * @param Exclusion String to add to {@link Main#AddPacksList}.
     * @see PackSelectionModelMixin
     */
    public static void packExclude(String Exclusion) {
        PackExclusions.add(Exclusion);
    }

    /**
     * List of {@link AddPacks} classes given by mods.
     * @param aP {@link AddPacks} class given by mod.
     * @see RegisterPacks
     */
    @SuppressWarnings("unused")
    public static void addClass(AddPacks aP) {
        AddPacksList.add(aP);
    }
}