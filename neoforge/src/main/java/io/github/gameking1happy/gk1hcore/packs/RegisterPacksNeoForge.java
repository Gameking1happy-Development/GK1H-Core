package io.github.gameking1happy.gk1hcore.packs;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.Main.AddPacksList;

/**
 * NeoForge code for registering packs.
 * @see RegisterPacks
 */
public class RegisterPacksNeoForge implements RegisterPacks {
    /**
     * @param event AddPackFindersEvent, this is necessary for NeoForge.
     */
    public static void registerpacksNF(@NotNull AddPackFindersEvent event) {
        for (AddPacks aP : AddPacksList) {
            aP.addPacks(event);
        }
    }

    /**
     * @param event Required for this to work.
     */
    @Override
    public void registerpacks(@NotNull Object event) {
        ((IEventBus) event).addListener(RegisterPacksNeoForge::registerpacksNF);
    }
}
