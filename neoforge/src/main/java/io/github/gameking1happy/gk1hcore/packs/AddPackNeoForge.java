package io.github.gameking1happy.gk1hcore.packs;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.Main.fNAP;

public class AddPackNeoForge implements AddPack {
    @Override
    public void addPack(@NotNull Object object, @NotNull String modID, @NotNull String path, @NotNull String DisplayName, @NotNull activationType actType, @NotNull packType type, @NotNull packSource source, @NotNull packPosition position) {
        AddPackFindersEvent event = (AddPackFindersEvent) object;
        event.addPackFinders(
                fNAP(modID, path),
                switch (type) {
                    case RESOURCE -> PackType.CLIENT_RESOURCES;
                    case DATA -> PackType.SERVER_DATA;
                },
                Component.literal(DisplayName),
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
