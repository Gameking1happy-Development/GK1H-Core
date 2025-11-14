package io.github.gameking1happy.gk1hcore.packs;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;

import static io.github.gameking1happy.gk1hcore.Main.AddPacksList;

public class RegisterPacksFabric implements RegisterPacks {
    @Override
    public void registerpacks(Object unused) {
        ClientLifecycleEvents.CLIENT_STARTED.register((minecraft) -> registerpacksFa());
    }
    public static void registerpacksFa() {
        for (AddPacks aP : AddPacksList) {
            FabricLoader.getInstance().getModContainer(aP.getModID()).ifPresent(aP::addPacks);
        }
    }
}
