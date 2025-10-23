package io.github.gameking1happy.gk1hcore.platform;

import io.github.gameking1happy.gk1hcore.platform.services.IPlatformHelper;

import static net.fabricmc.loader.api.FabricLoader.getInstance;
public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    // Returns the name of the platform.
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {
        // Checks if a mod is loaded given its mod ID.
        return getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        // Checks if the current environment is a development environment.
        return getInstance().isDevelopmentEnvironment();
    }
}
