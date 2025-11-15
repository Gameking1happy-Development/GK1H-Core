package io.github.gameking1happy.gk1hcore.platform;

import io.github.gameking1happy.gk1hcore.packs.AddPack;
import io.github.gameking1happy.gk1hcore.packs.RegisterPacks;
import io.github.gameking1happy.gk1hcore.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

import static io.github.gameking1happy.gk1hcore.Main.LOG;

/**
 * Loads services, allowing platform-specific code to be called in common.
 */
@SuppressWarnings("unused")
public class Services {
    /**
     * @see IPlatformHelper
     */
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    /**
     * @see AddPack
     */
    public static final AddPack ADDPACK = load(AddPack.class);
    /**
     * @see RegisterPacks
     */
    public static final RegisterPacks REGISTERPACKS = load(RegisterPacks.class);

    /**
     * This code is used to load a service for the current environment.
     * @param <T> The specific class type.
     * @param clazz The class as the {@link Class} type.
     * @return The specific class type.
     */
    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}