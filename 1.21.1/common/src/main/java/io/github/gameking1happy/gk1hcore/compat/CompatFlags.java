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
    public static final boolean MET_BUN = PLATFORM.isModLoaded("metalbundles");
    /**
     * Netherited
     */
    public static final boolean NETED = PLATFORM.isModLoaded("netherited");
    /**
     * Universal Enchants
     */
    public static final boolean UNI_ENC = PLATFORM.isModLoaded("universalenchants");
    /**
     * Spiky Spikes
     */
    public static final boolean SPI_SPI = PLATFORM.isModLoaded("spikyspikes");
    /**
     * Advanced Netherite
     */
    public static final boolean ADV_NET = PLATFORM.isModLoaded("advancednetherite");
    /**
     * Accessories
     */
    public static final boolean ACCESS = PLATFORM.isModLoaded("accessories");
    /**
     * Accessories Compat Layer
     */
    public static final boolean ACC_COM = PLATFORM.isModLoaded("accessories_compat_layer");
    /**
     * Curios
     */
    public static final boolean CURI = PLATFORM.isModLoaded("curios");
    /**
     * Trinkets
     */
    public static final boolean TRINK = PLATFORM.isModLoaded("trinkets");
    /**
     * Reinforced Shulker Boxes
     */
    public static final boolean REINF_SHU = PLATFORM.isModLoaded("reinfshulker");
    /**
     * GK1H Tags
     */
    public static final boolean GK1H_TAGS = PLATFORM.isModLoaded("gk1htags");
    /**
     * Netherite Extras
     */
    public static final boolean NET_EXT = PLATFORM.isModLoaded("netheriteextras");
    /**
     * Enchanting Infuser
     */
    public static final boolean ENC_INF = PLATFORM.isModLoaded("enchantinginfuser");
    /**
     * GK1H Recipes
     */
    public static final boolean GK1H_RECIPES = PLATFORM.isModLoaded("gk1hrecipes");
    /**
     * Sword Blocking Mechanics
     */
    public static final boolean SWO_BLO_MEC = PLATFORM.isModLoaded("swordblockingmechanics");
    /**
     * Ender Zoology
     */
    public static final boolean END_ZOO = PLATFORM.isModLoaded("enderzoology");
}
