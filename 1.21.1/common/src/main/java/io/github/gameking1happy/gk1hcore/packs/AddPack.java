package io.github.gameking1happy.gk1hcore.packs;

import org.jetbrains.annotations.NotNull;

/**
 * Simplifies adding packs by allowing using a method in common instead of separate methods for Fabric &amp; NeoForge.
 * @see AddPacks
 */
public interface AddPack {
    /**
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     * @param modID Mod ID of the mod the pack is added by.
     * @param path The path the pack is in, starting in the "resource/" directory.
     * @param displayName Display name of the pack.
     * @param actType See {@link ActivationType}.
     * @param type See {@link PackType}.
     * @param source See {@link PackSource}.
     * @param position See {@link PackPosition}.
     */
    void addPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String displayName, @NotNull ActivationType actType, @NotNull PackType type, @NotNull PackSource source, @NotNull PackPosition position);
}