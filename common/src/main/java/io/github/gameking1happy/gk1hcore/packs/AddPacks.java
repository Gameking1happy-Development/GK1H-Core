package io.github.gameking1happy.gk1hcore.packs;

import org.jetbrains.annotations.NotNull;

/**
 * Implemented by mods to add their packs.
 * @see RegisterPacks
 */
public interface AddPacks {
    /**
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     */
    void addPacks(@NotNull Object modContainerOrEvent);

    /**
     * @return Mods are supposed to have this method return their own mod ID.
     */
    @NotNull String getModID();
}
