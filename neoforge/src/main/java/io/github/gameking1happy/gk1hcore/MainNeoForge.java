package io.github.gameking1happy.gk1hcore;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.gk1hcore.Main.*;

@Mod(MOD_ID)
public class MainNeoForge {
    public MainNeoForge(IEventBus modBus) {
        // Initialize the mod.
        Main.init(modBus);
    }
}