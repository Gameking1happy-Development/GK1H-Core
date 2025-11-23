package io.github.gameking1happy.gk1hcore.packs;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.data.CoreData.fNaP;

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
     * @param actType     See {@link activationType}.
     * @param type        See {@link packType}.
     * @param source      See {@link packSource}.
     * @param position    See {@link packPosition}.
     * @see AddPack#addPack(Object, String, String, String, activationType, packType, packSource, packPosition)
     */
    @Override
    public void addPack(@NotNull Object object, @NotNull String modID, @NotNull String path, @NotNull String displayName, @NotNull activationType actType, @NotNull packType type, @NotNull packSource source, @NotNull packPosition position) {
        ((AddPackFindersEvent) object).addPackFinders(
                fNaP(modID, path),
                switch (type) {
                    case RESOURCE -> PackType.CLIENT_RESOURCES;
                    case DATA -> PackType.SERVER_DATA;
                },
                Component.literal(displayName),
                switch (source) {
                    case BUILT_IN -> PackSource.BUILT_IN;
                    case WORLD -> PackSource.WORLD;
                    case SERVER -> PackSource.SERVER;
                    case DEFAULT -> PackSource.DEFAULT;
                    case FEATURE -> PackSource.FEATURE;
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
