package io.github.gameking1happy.gk1hcore;

import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.gk1hcore.Main.MOD_ID;

@Mod(MOD_ID)
public class MainNeoForge {
    public MainNeoForge() {
        // Initialize the mod.
        Main.init();
    }
}