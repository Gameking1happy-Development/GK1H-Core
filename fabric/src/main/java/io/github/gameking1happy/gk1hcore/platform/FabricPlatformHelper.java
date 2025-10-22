package io.github.gameking1happy.gk1hcore.platform;

import io.github.gameking1happy.gk1hcore.platform.services.IPlatformHelper;

import static net.fabricmc.loader.api.FabricLoader.getInstance;
public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return getInstance().isDevelopmentEnvironment();
    }
}
