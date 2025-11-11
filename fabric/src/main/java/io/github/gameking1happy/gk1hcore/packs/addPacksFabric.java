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
    public void registerpacksFa(@NotNull Object modID) {
        String MODID = (String) modID;
        FabricLoader.getInstance().getModContainer(MODID).ifPresent(this::addpacks);
    }
    @Override
    public void addPack(@NotNull Object modContainer, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull String activationType, @NotNull String unused1, @NotNull String unused2, @NotNull String unused3) {
        ResourceManagerHelperImpl.registerBuiltinResourcePack(
                fNAP(modID, path),
                fNAP(modID, path).getPath(),
                (ModContainer) modContainer,
                Component.literal(DisplayName),
                switch (activationType) {
                    case "ALWAYS_ENABLED" -> ResourcePackActivationType.ALWAYS_ENABLED;
                    case "NORMAL" -> ResourcePackActivationType.NORMAL;
                    case "DEFAULT_ENABLED" -> ResourcePackActivationType.DEFAULT_ENABLED;
                    default -> throw new IllegalArgumentException("Invalid activation type: " + activationType);
                }
        );
    }
}
