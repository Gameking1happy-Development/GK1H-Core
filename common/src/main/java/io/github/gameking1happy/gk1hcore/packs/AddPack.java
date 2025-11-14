package io.github.gameking1happy.gk1hcore.packs;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface AddPack {
    void addPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull activationType actType, @NotNull packType type, @NotNull packSource source, @NotNull packPosition position);
}