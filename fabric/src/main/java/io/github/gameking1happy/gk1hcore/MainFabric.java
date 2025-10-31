package io.github.gameking1happy.gk1hcore;

import net.fabricmc.api.ModInitializer;

import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;

public class MainFabric implements ModInitializer {

    public void onInitialize() {
        // Ensures that the Forge Config API Port is loaded, probably unnecessary but just in case.
        if (!PLATFORM.isModLoaded("forgeconfigapiport")) {
            throw new IllegalArgumentException("FCAP IS NOT LOADED!!!");
        }
        // Initialize the mod.
        Main.init();
    }
}
