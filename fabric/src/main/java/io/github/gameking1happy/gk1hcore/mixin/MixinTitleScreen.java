package io.github.gameking1happy.gk1hcore.mixin;

import io.github.gameking1happy.gk1hcore.GK1HCore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MixinTitleScreen {
    
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        // Logs the Minecraft version type.
        GK1HCore.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
    }
}