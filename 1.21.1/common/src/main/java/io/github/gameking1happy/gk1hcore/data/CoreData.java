package io.github.gameking1happy.gk1hcore.data;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

/**
 * Useful things for data-related stuff.
 */
@SuppressWarnings("unused")
public class CoreData {
    /**
     * Method to more simply call the {@link ResourceLocation#fromNamespaceAndPath(String, String)} method.
     * @param namespace Namespace.
     * @param path Path.
     * @return ResourceLocation.
     */
    public static @NotNull ResourceLocation fnap(@NotNull String namespace, @NotNull String path) {
        return ResourceLocation.fromNamespaceAndPath(namespace, path);
    }

    /**
     * Method to more simply call the {@link TagKey#create(ResourceKey, ResourceLocation)} method. All other TagKey methods end up to using this one.
     * @param registry Actually is the resource key.
     * @param location Resource location.
     * @param <T> In reality is the registry.
     * @return Tag key.
     */
    public static @NotNull <T> TagKey<T> tkc(@NotNull ResourceKey<? extends Registry<T>> registry, @NotNull ResourceLocation location) {
        return TagKey.create(registry, location);
    }

    /**
     * Method to more simply call the {@link TagKey#create(ResourceKey, ResourceLocation)} method. Uses {@link CoreData#fnap(String, String)} for giving namespace and path directly.
     * @param registry Actually is the resource key.
     * @param namespace Namespace.
     * @param path Path.
     * @param <T> In reality is the registry.
     * @return Tag key.
     */
    public static @NotNull <T> TagKey<T> tkc(@NotNull ResourceKey<? extends Registry<T>> registry, @NotNull String namespace, @NotNull String path) {
        return tkc(registry, fnap(namespace, path));
    }

    /**
     * Method to more simply call the {@link TagKey#create(ResourceKey, ResourceLocation)} method. Specifically for item registry.
     * @param location Resource location.
     * @return Tag key.
     */
    public static @NotNull TagKey<Item> itkc(@NotNull ResourceLocation location) {
        return tkc(Registries.ITEM, location);
    }

    /**
     * Method to more simply call the {@link TagKey#create(ResourceKey, ResourceLocation)} method. Specifically for item registry. Uses {@link CoreData#fnap(String, String)} for giving namespace and path directly.
     * @param namespace Namespace.
     * @param path Path.
     * @return Tag key.
     */
    public static @NotNull TagKey<Item> itkc(@NotNull String namespace, @NotNull String path) {
        return itkc(fnap(namespace, path));
    }
}
