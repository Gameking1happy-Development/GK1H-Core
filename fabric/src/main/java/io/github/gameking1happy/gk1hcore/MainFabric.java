package io.github.gameking1happy.gk1hcore;

import io.github.gameking1happy.gk1hcore.packs.addPacksFabric;
import net.fabricmc.api.ModInitializer;

@SuppressWarnings("unused")
public class MainFabric implements ModInitializer {

    public void onInitialize() {
        // Initialize the mod.
        Main.init();
        addPacksFabric aPF = new addPacksFabric();
        aPF.registerpacks();
    }
}
