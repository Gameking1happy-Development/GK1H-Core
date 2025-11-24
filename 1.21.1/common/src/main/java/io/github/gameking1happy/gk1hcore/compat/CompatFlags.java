package io.github.gameking1happy.gk1hcore.compat;

import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;

/**
 * Checks for if other mods are loaded.
 */
@SuppressWarnings("unused")
public class CompatFlags {
    /**
     * Metal Bundles
     */
    public static final boolean MetBun = PLATFORM.isModLoaded("metalbundles");
    /**
     * Netherited
     */
    public static final boolean Neted = PLATFORM.isModLoaded("netherited");
    /**
     * Universal Enchants
     */
    public static final boolean UniEnc = PLATFORM.isModLoaded("universalenchants");
    /**
     * Spiky Spikes
     */
    public static final boolean SpiSpi = PLATFORM.isModLoaded("spikyspikes");
    /**
     * Advanced Netherite
     */
    public static final boolean AdvNet = PLATFORM.isModLoaded("advancednetherite");
}
