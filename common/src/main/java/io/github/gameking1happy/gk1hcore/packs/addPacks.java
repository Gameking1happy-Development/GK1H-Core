package io.github.gameking1happy.gk1hcore.packs;

import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.Main.*;
import static io.github.gameking1happy.gk1hcore.packs.activationType.*;
import static io.github.gameking1happy.gk1hcore.packs.packType.*;
import static io.github.gameking1happy.gk1hcore.packs.packSource.*;
import static io.github.gameking1happy.gk1hcore.packs.packPosition.*;

@SuppressWarnings("unused")
public interface addPacks {
    default void registerpacksFa(String modID) {}
    default void addpacks(@NotNull Object modContainerOrEvent, @NotNull String modID) {}
    default void addPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull activationType actType, @NotNull packType type, @NotNull packSource source, @NotNull packPosition position) {}
    default void addHiddenPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull activationType actType, @NotNull packType type, @NotNull packSource source, @NotNull packPosition position) {
        packExclude(modID + ":" + path);
        addPack(modContainerOrEvent, modID, path, DisplayName, actType, type, source, position);
    }
    // CDP = Configurable Datapack Preset
    default void addCDP(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path) {
        addHiddenPack(modContainerOrEvent, modID, path, modID + path, ALWAYS, DATA, BUILT_IN, TOP);
    }
}