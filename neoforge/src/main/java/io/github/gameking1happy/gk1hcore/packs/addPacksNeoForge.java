package io.github.gameking1happy.gk1hcore.packs;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;

@SuppressWarnings("unused")
public class addPacksNeoForge implements addPacks {
    public void registerpacksNF(AddPackFindersEvent event)    {
        addpacks(event);
    }
    @Override
    public void addPack(@NotNull Object object, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull String activationType, @NotNull String type, @NotNull String packSource, @NotNull String packPosition) {
        AddPackFindersEvent event = (AddPackFindersEvent) object;
        event.addPackFinders(
                fNAP(modID, path),
                switch (type) {
                    case "RESOURCE" -> PackType.CLIENT_RESOURCES;
                    case "DATA" -> PackType.SERVER_DATA;
                    default -> throw new IllegalArgumentException("Invalid pack type: " + type);
                },
                Component.literal(DisplayName),
                switch (packSource) {
                    case "BUILT_IN" -> PackSource.BUILT_IN;
                    case "WORLD" -> PackSource.WORLD;
                    case "SERVER" -> PackSource.SERVER;
                    case "DEFAULT" -> PackSource.DEFAULT;
                    case "FEATURE" -> PackSource.FEATURE;
                    default -> throw new IllegalArgumentException("Invalid pack source: " + packSource);
                },
                switch (activationType) {
                    case "ALWAYS_ENABLED" -> true;
                    case "NORMAL", "DEFAULT_ENABLED" -> false;
                    default -> throw new IllegalArgumentException("Invalid activation type: " + activationType);
                },
                switch (packPosition) {
                    case "TOP" -> Pack.Position.TOP;
                    case "BOTTOM" -> Pack.Position.BOTTOM;
                    default -> throw new IllegalArgumentException("Invalid pack position: " + packPosition);
                }
        );
    }
}
