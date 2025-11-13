package io.github.gameking1happy.gk1hcore.packs;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import static io.github.gameking1happy.gk1hcore.Main.*;
import static io.github.gameking1happy.gk1hcore.packs.activationType.*;
import static io.github.gameking1happy.gk1hcore.packs.packType.*;
import static io.github.gameking1happy.gk1hcore.packs.packSource.*;
import static io.github.gameking1happy.gk1hcore.packs.packPosition.*;
import static io.github.gameking1happy.gk1hcore.platform.Services.ADDPACKS;

@SuppressWarnings("unused")
public interface addPacks {
    List<String> ModIDs = new ArrayList<>();
    static void addModID(@NotNull String modID) {
        ModIDs.add(modID);
    }
    static void addpacks(@NotNull Object modContainerOrEvent, @NotNull String modID) {}
    void addPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull activationType actType, @NotNull packType type, @NotNull packSource source, @NotNull packPosition position);
    static void addHiddenPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull activationType actType, @NotNull packType type, @NotNull packSource source, @NotNull packPosition position) {
        packExclude(modID + ":" + path);
        ADDPACKS.addPack(modContainerOrEvent, modID, path, DisplayName, actType, type, source, position);
    }
    // CDP = Configurable Datapack Preset
    static void addCDP(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path) {
        addHiddenPack(modContainerOrEvent, modID, path, modID + path, ALWAYS, DATA, BUILT_IN, TOP);
    }
}