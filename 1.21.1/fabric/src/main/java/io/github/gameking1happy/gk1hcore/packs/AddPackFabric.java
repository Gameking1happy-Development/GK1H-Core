package io.github.gameking1happy.gk1hcore.packs;

import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.fabric.impl.resource.loader.ResourceManagerHelperImpl;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.data.CoreData.fnap;

/**
 * Fabric code for adding packs.
 * @see AddPack
 */
public class AddPackFabric implements AddPack {
    /**
     * @param modContainer ModContainer.
     * @param modID        Mod ID of the mod the pack is added by.
     * @param path         The path the pack is in, starting in the "resource/" directory.
     * @param displayName  Display name of the pack.
     * @param actType      See {@link ActivationType}.
     * @param unused1      Not used for Fabric.
     * @param unused2      Not used for Fabric.
     * @param unused3      Not used for Fabric.
     * @see AddPack#addPack(Object, String, String, String, ActivationType, PackType, PackSource, PackPosition)
     */
    @Override
    public void addPack(@NotNull Object modContainer, @NotNull String modID, @NotNull String path, @NotNull String displayName, @NotNull ActivationType actType, @NotNull PackType unused1, @NotNull PackSource unused2, @NotNull PackPosition unused3) {
        ResourceManagerHelperImpl.registerBuiltinResourcePack(
                fnap(modID, path),
                fnap(modID, path).getPath(),
                (ModContainer) modContainer,
                Component.literal(displayName),
                switch (actType) {
                    case ALWAYS -> ResourcePackActivationType.ALWAYS_ENABLED;
                    case NORMAL -> ResourcePackActivationType.NORMAL;
                    case DEFAULT -> ResourcePackActivationType.DEFAULT_ENABLED;
                }
        );
    }
}
