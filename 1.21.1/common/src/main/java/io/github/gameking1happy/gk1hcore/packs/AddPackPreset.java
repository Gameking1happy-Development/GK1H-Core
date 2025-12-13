package io.github.gameking1happy.gk1hcore.packs;

import io.github.gameking1happy.gk1hcore.Main;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.Main.packExclude;
import static io.github.gameking1happy.gk1hcore.packs.ActivationType.ALWAYS;
import static io.github.gameking1happy.gk1hcore.packs.PackPosition.TOP;
import static io.github.gameking1happy.gk1hcore.packs.PackSource.BUILT_IN;
import static io.github.gameking1happy.gk1hcore.packs.PackType.DATA;
import static io.github.gameking1happy.gk1hcore.packs.PackType.RESOURCE;
import static io.github.gameking1happy.gk1hcore.platform.Services.ADDPACK;

/**
 * Add pack presets, for adding to the {@link Main#packExclusions} list, and commonly used parameters and display name formating.
 */
@SuppressWarnings("unused")
public class AddPackPreset {
    /**
     * Also adds the pack to {@link Main#packExclusions}.
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     * @param modID Mod ID of the mod the pack is added by.
     * @param path The path the pack is in, starting in the "resource/" directory.
     * @param displayName Display name of the pack.
     * @param actType See {@link ActivationType}.
     * @param type See {@link PackType}.
     * @param source See {@link PackSource}.
     * @param position See {@link PackPosition}.
     * @see AddPack#addPack(Object, String, String, String, ActivationType, PackType, PackSource, PackPosition)
     */
    public static void addHiddenPack(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path, @NotNull String displayName, @NotNull ActivationType actType, @NotNull PackType type, @NotNull PackSource source, @NotNull PackPosition position) {
        packExclude(modID + ":" + path);
        ADDPACK.addPack(modContainerOrEvent, modID, path, displayName, actType, type, source, position);
    }

    /**
     * CDP = Configurable Datapack Preset, used for data packs which are toggled via configs.
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     * @param modID Mod ID of the mod the pack is added by.
     * @param path The path the pack is in, starting in the "resource/" directory.
     * @see AddPackPreset#addHiddenPack(Object, String, String, String, ActivationType, PackType, PackSource, PackPosition)
     */
    public static void addCdp(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path) {
        addHiddenPack(modContainerOrEvent, modID, path, modID + path, ALWAYS, DATA, BUILT_IN, TOP);
    }
    /**
     * CRP = Configurable Resource Preset, used for resource packs which are toggled via configs.
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     * @param modID Mod ID of the mod the pack is added by.
     * @param path The path the pack is in, starting in the "resource/" directory.
     * @see AddPackPreset#addHiddenPack(Object, String, String, String, ActivationType, PackType, PackSource, PackPosition)
     */
    public static void addCrp(@NotNull Object modContainerOrEvent, @NotNull String modID, @NotNull String path) {
        addHiddenPack(modContainerOrEvent, modID, path, modID + path, ALWAYS, RESOURCE, BUILT_IN, TOP);
    }
}
