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
    public static final boolean metBun = PLATFORM.isModLoaded("metalbundles");
    /**
     * Netherited
     */
    public static final boolean neted = PLATFORM.isModLoaded("netherited");
    /**
     * Universal Enchants
     */
    public static final boolean uniEnc = PLATFORM.isModLoaded("universalenchants");
    /**
     * Spiky Spikes
     */
    public static final boolean spiSpi = PLATFORM.isModLoaded("spikyspikes");
    /**
     * Advanced Netherite
     */
    public static final boolean advNet = PLATFORM.isModLoaded("advancednetherite");
    /**
     * Accessories
     */
    public static final boolean access = PLATFORM.isModLoaded("accessories");
    /**
     * Accessories Compat Layer
     */
    public static final boolean accCom = PLATFORM.isModLoaded("accessories_compat_layer");
    /**
     * Curios
     */
    public static final boolean curi = PLATFORM.isModLoaded("curios");
    /**
     * Trinkets
     */
    public static final boolean trink = PLATFORM.isModLoaded("trinkets");
    /**
     * Reinforced Shulker Boxes
     */
    public static final boolean reinfShu = PLATFORM.isModLoaded("reinfshulker");
    /**
     * GK1H Tags
     */
    public static final boolean gk1hTags = PLATFORM.isModLoaded("gk1htags");
    /**
     * Netherite Extras
     */
    public static final boolean netExt = PLATFORM.isModLoaded("netheriteextras");
    /**
     * Enchanting Infuser
     */
    public static final boolean encInf = PLATFORM.isModLoaded("enchantinginfuser");
    /**
     * GK1H Recipes
     */
    public static final boolean gk1hRecipes = PLATFORM.isModLoaded("gk1hrecipes");
    /**
     * Sword Blocking Mechanics
     */
    public static final boolean swoBloMec = PLATFORM.isModLoaded("swordblockingmechanics");
    /**
     * Ender Zoology
     */
    public static final boolean endZoo = PLATFORM.isModLoaded("enderzoology");
}
