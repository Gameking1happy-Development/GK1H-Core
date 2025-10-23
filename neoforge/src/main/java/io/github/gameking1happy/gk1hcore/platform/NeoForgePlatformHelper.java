package io.github.gameking1happy.gk1hcore.platform;

import io.github.gameking1happy.gk1hcore.platform.services.IPlatformHelper;
import net.neoforged.fml.ModList;

import static net.neoforged.fml.loading.FMLLoader.isProduction;
public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        // Returns the name of the platform.
        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {
        // Checks if a mod is loaded given its mod ID.
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        // Checks if the current environment is a development environment.
        return !isProduction();
    }
}