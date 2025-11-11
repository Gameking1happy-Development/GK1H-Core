package io.github.gameking1happy.gk1hcore;

import io.github.gameking1happy.gk1hcore.packs.addPacksNeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import static io.github.gameking1happy.gk1hcore.Main.MOD_ID;

@Mod(MOD_ID)
public class MainNeoForge {
    public MainNeoForge(IEventBus modBus) {
        // Initialize the mod.
        Main.init();
        addPacksNeoForge aPN = new addPacksNeoForge();
        modBus.addListener(aPN::registerpacksNF);
    }
}