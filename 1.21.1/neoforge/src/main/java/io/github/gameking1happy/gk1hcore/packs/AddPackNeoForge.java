package io.github.gameking1happy.gk1hcore.packs;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.repository.Pack;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.data.CoreData.fnap;

/**
 * NeoForge code for adding packs.
 * @see AddPack
 */
public class AddPackNeoForge implements AddPack {
    /**
     * @param object      AddPackFindersEvent.
     * @param modID       Mod ID of the mod the pack is added by.
     * @param path        The path the pack is in, starting in the "resource/" directory.
     * @param displayName Display name of the pack.
     * @param actType     See {@link ActivationType}.
     * @param type        See {@link PackType}.
     * @param source      See {@link PackSource}.
     * @param position    See {@link PackPosition}.
     * @see AddPack#addPack(Object, String, String, String, ActivationType, PackType, PackSource, PackPosition)
     */
    @Override
    public void addPack(@NotNull Object object, @NotNull String modID, @NotNull String path, @NotNull String displayName, @NotNull ActivationType actType, @NotNull PackType type, @NotNull PackSource source, @NotNull PackPosition position) {
        ((AddPackFindersEvent) object).addPackFinders(
                fnap(modID, path),
                switch (type) {
                    case RESOURCE -> net.minecraft.server.packs.PackType.CLIENT_RESOURCES;
                    case DATA -> net.minecraft.server.packs.PackType.SERVER_DATA;
                },
                Component.literal(displayName),
                switch (source) {
                    case BUILT_IN -> net.minecraft.server.packs.repository.PackSource.BUILT_IN;
                    case WORLD -> net.minecraft.server.packs.repository.PackSource.WORLD;
                    case SERVER -> net.minecraft.server.packs.repository.PackSource.SERVER;
                    case DEFAULT -> net.minecraft.server.packs.repository.PackSource.DEFAULT;
                    case FEATURE -> net.minecraft.server.packs.repository.PackSource.FEATURE;
                },
                switch (actType) {
                    case ALWAYS -> true;
                    case NORMAL, DEFAULT -> false;
                },
                switch (position) {
                    case TOP -> Pack.Position.TOP;
                    case BOTTOM -> Pack.Position.BOTTOM;
                }
        );
    }
}
