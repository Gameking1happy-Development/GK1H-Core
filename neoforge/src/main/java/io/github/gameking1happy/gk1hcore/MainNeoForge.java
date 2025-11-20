package io.github.gameking1happy.gk1hcore;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.gk1hcore.Main.MOD_ID;

/**
 * The NeoForge main class for the mod.
 */
@SuppressWarnings("unused")
@Mod(MOD_ID)
public class MainNeoForge {
    /**
     * Runs the NeoForge mod initializer.
     * @param modBus The NeoForge IEventBus.
     */
    public MainNeoForge(IEventBus modBus) {
        Main.init(modBus);
    }
}