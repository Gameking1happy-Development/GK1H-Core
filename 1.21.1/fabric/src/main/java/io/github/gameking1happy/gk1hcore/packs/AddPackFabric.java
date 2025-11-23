package io.github.gameking1happy.gk1hcore.packs;

import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.fabric.impl.resource.loader.ResourceManagerHelperImpl;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.data.CoreData.fNaP;

/**
 * Fabric code for adding packs.
 * @see AddPack
 */
@SuppressWarnings({"UnstableApiUsage"})
public class AddPackFabric implements AddPack {
    /**
     * @param modContainer ModContainer.
     * @param modID        Mod ID of the mod the pack is added by.
     * @param path         The path the pack is in, starting in the "resource/" directory.
     * @param displayName  Display name of the pack.
     * @param actType      See {@link activationType}.
     * @param unused1      Not used for Fabric.
     * @param unused2      Not used for Fabric.
     * @param unused3      Not used for Fabric.
     * @see AddPack#addPack(Object, String, String, String, activationType, packType, packSource, packPosition)
     */
    @Override
    public void addPack(@NotNull Object modContainer, @NotNull String modID, @NotNull String path, @NotNull String displayName, @NotNull activationType actType, @NotNull packType unused1, @NotNull packSource unused2, @NotNull packPosition unused3) {
        ResourceManagerHelperImpl.registerBuiltinResourcePack(
                fNaP(modID, path),
                fNaP(modID, path).getPath(),
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
