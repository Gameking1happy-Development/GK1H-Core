package io.github.gameking1happy.gk1hcore.packs;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;

import static io.github.gameking1happy.gk1hcore.Main.addPacksList;

/**
 * Fabric code for registering packs.
 * @see RegisterPacks
 */
public class RegisterPacksFabric implements RegisterPacks {
    /**
     * Method that registers every mods' packs by mod.
     */
    public static void registerPacksFabric() {
        for (AddPacks aP : addPacksList) {
            FabricLoader.getInstance().getModContainer(aP.getModID()).ifPresent(aP::addPacks);
        }
    }

    /**
     * @param unused Fabric does <strong>NOT</strong> require using this for ModContainer. (In fact, this would be problematic since each mod needs its own ModContainer to be used.)
     */
    @Override
    public void registerPacks(Object unused) {
        ClientLifecycleEvents.CLIENT_STARTED.register((minecraft) -> registerPacksFabric());
    }
}
