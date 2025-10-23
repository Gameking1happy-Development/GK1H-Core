package io.github.gameking1happy.gk1hcore;

import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.gk1hcore.GK1HCore.MOD_ID;
@Mod(MOD_ID)
public class GK1HCoreNeoForge {
    public GK1HCoreNeoForge() {
        // Initialize the mod.
        GK1HCore.init();
    }
}