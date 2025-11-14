package io.github.gameking1happy.gk1hcore.packs;

import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.Main.packExclude;
import static io.github.gameking1happy.gk1hcore.packs.activationType.ALWAYS;
import static io.github.gameking1happy.gk1hcore.packs.packPosition.TOP;
import static io.github.gameking1happy.gk1hcore.packs.packSource.BUILT_IN;
import static io.github.gameking1happy.gk1hcore.packs.packType.DATA;
import static io.github.gameking1happy.gk1hcore.platform.Services.ADDPACK;

@SuppressWarnings("unused")
public class AddPackPreset {
    public static void addHiddenPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull activationType actType, @NotNull packType type, @NotNull packSource source, @NotNull packPosition position) {
        packExclude(modID + ":" + path);
        ADDPACK.addPack(modContainerOrEvent, modID, path, DisplayName, actType, type, source, position);
    }
    // CDP = Configurable Datapack Preset
    public static void addCDP(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path) {
        addHiddenPack(modContainerOrEvent, modID, path, modID + path, ALWAYS, DATA, BUILT_IN, TOP);
    }
}
