package io.github.gameking1happy.gk1hcore.packs;

import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.fabric.impl.resource.loader.ResourceManagerHelperImpl;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;

@SuppressWarnings({"unused", "UnstableApiUsage"})
public class addPacksFabric implements addPacks {
    @Override
    public void registerpacksFa(String modID) {
        FabricLoader.getInstance().getModContainer(modID).ifPresent(modContainer -> addpacks(modContainer,modID));
    }
    @Override
    public void addPack(@NotNull Object modContainer, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull activationType actType, @NotNull packType unused1, @NotNull packSource unused2, @NotNull packPosition unused3) {
        ResourceManagerHelperImpl.registerBuiltinResourcePack(
                fNAP(modID, path),
                fNAP(modID, path).getPath(),
                (ModContainer) modContainer,
                Component.literal(DisplayName),
                switch (actType) {
                    case ALWAYS -> ResourcePackActivationType.ALWAYS_ENABLED;
                    case NORMAL -> ResourcePackActivationType.NORMAL;
                    case DEFAULT -> ResourcePackActivationType.DEFAULT_ENABLED;
                }
        );
    }
}
