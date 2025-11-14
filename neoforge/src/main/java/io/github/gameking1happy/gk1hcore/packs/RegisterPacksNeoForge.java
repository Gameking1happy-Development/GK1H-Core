package io.github.gameking1happy.gk1hcore.packs;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.AddPackFindersEvent;

import static io.github.gameking1happy.gk1hcore.Main.AddPacksList;

public class RegisterPacksNeoForge implements RegisterPacks {
    @Override
    public void registerpacks(Object object) {
        ((IEventBus) object).addListener(RegisterPacksNeoForge::registerpacksNF);
    }
    public static void registerpacksNF(AddPackFindersEvent event)    {
        for(AddPacks aP : AddPacksList) {
            aP.addPacks(event);
        }
    }
}
