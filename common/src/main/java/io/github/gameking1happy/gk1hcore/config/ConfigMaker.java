package io.github.gameking1happy.gk1hcore.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static net.neoforged.neoforge.common.ModConfigSpec.*;
// Methods to reduce boilerplate when making config values.
public class ConfigMaker {
    // Boolean
    public static BooleanValue makeConfig(@NotNull Builder BUILDER, @NotNull String path, boolean defaultValue, @Nullable String comment, @Nullable String translationKey) {
        return BUILDER
                .translation(translationKey)
                .comment(comment)
                .define(path, defaultValue);
    }
    // Double
    public static DoubleValue makeConfig(@NotNull Builder BUILDER, @NotNull String path, double defaultValue, double min, double max, @Nullable String comment, @Nullable String translationKey) {
        return BUILDER
                .translation(translationKey)
                .comment(comment)
                .defineInRange(path, defaultValue, min, max);
    }
    // Int
    public static IntValue makeConfig(@NotNull Builder BUILDER, @NotNull String path, int defaultValue, int min, int max, @Nullable String comment, @Nullable String translationKey) {
        return BUILDER
                .translation(translationKey)
                .comment(comment)
                .defineInRange(path, defaultValue, min, max);
    }
    // Long
    public static LongValue makeConfig(@NotNull Builder BUILDER, @NotNull String path, long defaultValue, long min, long max, @Nullable String comment, @Nullable String translationKey) {
        return BUILDER
                .translation(translationKey)
                .comment(comment)
                .defineInRange(path, defaultValue, min, max);
    }
    // Object
    public static <T> ConfigValue<T> makeConfig(@NotNull Builder BUILDER, @NotNull String path, @NotNull T defaultValue, @Nullable String comment, @Nullable String translationKey) {
        return BUILDER
                .translation(translationKey)
                .comment(comment)
                .define(path, defaultValue);
    }
    // Whitelist
    public static <T> ConfigValue<T> makeConfig(@NotNull Builder BUILDER, @NotNull String path, @NotNull T defaultValue, @NotNull List<T> acceptableValues, @Nullable String comment, @Nullable String translationKey) {
        return BUILDER
                .translation(translationKey)
                .comment(comment)
                .defineInList(path, defaultValue, acceptableValues);
    }
    // List
    public static <T> ConfigValue<List<? extends T>> makeConfig(@NotNull Builder BUILDER, @NotNull List<String> path, @NotNull Supplier<List<? extends T>> defaultSupplier, @NotNull Predicate<Object> elementValidator, @Nullable Supplier<T> newElementSupplier, @Nullable Range<Integer> sizeRange, @Nullable String comment, @Nullable String translationKey) {
            return BUILDER
                    .translation(translationKey)
                    .comment(comment)
                    .defineList(path, defaultSupplier, newElementSupplier, elementValidator, sizeRange);
    }
}