package io.github.gameking1happy.gk1hcore.packs;

import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.Main.*;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;

@SuppressWarnings("unused")
public interface addPacks {
    default void registerpacksFa(String modID) {}
    default void addpacks(@NotNull Object modContainerOrEvent, @NotNull String modID) {
        if (PLATFORM.getPlatformName().equals("NeoForge") || modID.equals(MOD_ID)) {
            addCDP(modContainerOrEvent, MOD_ID, "test");
        }
    }
    default void addPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull String activationType, @NotNull String type, @NotNull String packSource, @NotNull String packPosition) {}
    default void addHiddenPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull String activationType, @NotNull String type, @NotNull String packSource, @NotNull String packPosition) {
        // packExclude(modID + ":" + path);
        addPack(modContainerOrEvent, modID, path, DisplayName, activationType, type, packSource, packPosition);
    }
    // CDP = Configurable Datapack Preset
    default void addCDP(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path) {
        addHiddenPack(modContainerOrEvent, modID, path, modID + path, "ALWAYS_ENABLED", "DATA", "BUILT_IN", "TOP");
    }
}