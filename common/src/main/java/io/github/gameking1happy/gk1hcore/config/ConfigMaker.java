package io.github.gameking1happy.gk1hcore.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.neoforged.neoforge.common.ModConfigSpec.*;
public class ConfigMaker {
    // A method to reduce boilerplate when making config values.
    public static <T> ConfigValue<T> makeConfig(@NotNull Builder BUILDER, @NotNull String name, @NotNull T defaultValue, @Nullable String comment, @Nullable String translationKey) {
        return BUILDER
                .translation(translationKey)
                .comment(comment)
                .define(name, defaultValue);
    }
}