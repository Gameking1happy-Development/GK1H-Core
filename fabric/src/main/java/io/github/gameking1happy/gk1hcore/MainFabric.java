package io.github.gameking1happy.gk1hcore;

import net.fabricmc.api.ModInitializer;

import static io.github.gameking1happy.gk1hcore.Main.MOD_ID;
import static io.github.gameking1happy.gk1hcore.platform.Services.ADDPACKS;

@SuppressWarnings("unused")
public class MainFabric implements ModInitializer {

    public void onInitialize() {
        // Initialize the mod.
        Main.init();
        ADDPACKS.registerpacksFa(MOD_ID);
    }
}