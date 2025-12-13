package io.github.gameking1happy.gk1hcore.mixin;

import io.github.gameking1happy.gk1hcore.Main;
import net.minecraft.client.gui.screens.packs.PackSelectionModel;
import net.minecraft.server.packs.repository.Pack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

/**
 * Injects code after findNewPacks to remove certain packs from the pack selection screen, usually ones controlled via configs or/and are addons for other mods.
 * @see Main#packExclusions
 */
@Mixin(PackSelectionModel.class)
public abstract class PackSelectionModelMixin {
    @Shadow
    @Final
    List<Pack> selected;
    @Shadow
    @Final
    List<Pack> unselected;

    @Inject(
            method = "findNewPacks",
            at = @At("TAIL")
    )
    private void filterPacks(CallbackInfo ci) {
        selected.removeIf(pack -> Main.packContainsAnyFromList(pack, Main.packExclusions));
        unselected.removeIf(pack -> Main.packContainsAnyFromList(pack, Main.packExclusions));
    }
}