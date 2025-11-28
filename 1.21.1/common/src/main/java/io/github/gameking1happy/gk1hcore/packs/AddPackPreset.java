package io.github.gameking1happy.gk1hcore.packs;

import io.github.gameking1happy.gk1hcore.Main;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.Main.packExclude;
import static io.github.gameking1happy.gk1hcore.packs.activationType.ALWAYS;
import static io.github.gameking1happy.gk1hcore.packs.packPosition.TOP;
import static io.github.gameking1happy.gk1hcore.packs.packSource.BUILT_IN;
import static io.github.gameking1happy.gk1hcore.packs.packType.DATA;
import static io.github.gameking1happy.gk1hcore.packs.packType.RESOURCE;
import static io.github.gameking1happy.gk1hcore.platform.Services.ADDPACK;

/**
 * Add pack presets, for adding to the {@link Main#PackExclusions} list, and commonly used parameters and display name formating.
 */
@SuppressWarnings("unused")
public class AddPackPreset {
    /**
     * Also adds the pack to {@link Main#PackExclusions}.
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     * @param modID Mod ID of the mod the pack is added by.
     * @param path The path the pack is in, starting in the "resource/" directory.
     * @param displayName Display name of the pack.
     * @param actType See {@link activationType}.
     * @param type See {@link packType}.
     * @param source See {@link packSource}.
     * @param position See {@link packPosition}.
     * @see AddPack#addPack(Object, String, String, String, activationType, packType, packSource, packPosition)
     */
    public static void addHiddenPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String displayName, @NotNull activationType actType, @NotNull packType type, @NotNull packSource source, @NotNull packPosition position) {
        packExclude(modID + ":" + path);
        ADDPACK.addPack(modContainerOrEvent, modID, path, displayName, actType, type, source, position);
    }

    /**
     * CDP = Configurable Datapack Preset, used for data packs which are toggled via configs.
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     * @param modID Mod ID of the mod the pack is added by.
     * @param path The path the pack is in, starting in the "resource/" directory.
     * @see AddPackPreset#addHiddenPack(Object, String, String, String, activationType, packType, packSource, packPosition)
     */
    public static void addCDP(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path) {
        addHiddenPack(modContainerOrEvent, modID, path, modID + path, ALWAYS, DATA, BUILT_IN, TOP);
    }
    /**
     * CRP = Configurable Resource Preset, used for resource packs which are toggled via configs.
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     * @param modID Mod ID of the mod the pack is added by.
     * @param path The path the pack is in, starting in the "resource/" directory.
     * @see AddPackPreset#addHiddenPack(Object, String, String, String, activationType, packType, packSource, packPosition)
     */
    public static void addCRP(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path) {
        addHiddenPack(modContainerOrEvent, modID, path, modID + path, ALWAYS, RESOURCE, BUILT_IN, TOP);
    }
}
