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
    /**
     * Accessories
     */
    public static final boolean Access = PLATFORM.isModLoaded("accessories");
    /**
     * Accessories Compat Layer
     */
    public static final boolean AccCom = PLATFORM.isModLoaded("accessories_compat_layer");
    /**
     * Curios
     */
    public static final boolean Curi = PLATFORM.isModLoaded("curios");
    /**
     * Trinkets
     */
    public static final boolean Trink = PLATFORM.isModLoaded("trinkets");
    /**
     * Reinforced Shulker Boxes
     */
    public static final boolean ReinfShu = PLATFORM.isModLoaded("reinfshulker");
    /**
     * GK1H Tags
     */
    public static final boolean GK1HTags = PLATFORM.isModLoaded("gk1htags");
    /**
     * Netherite Extras
     */
    public static final boolean NetExt = PLATFORM.isModLoaded("netheriteextras");
    /**
     * Enchanting Infuser
     */
    public static final boolean EncInf = PLATFORM.isModLoaded("enchantinginfuser");
    /**
     * GK1H Recipes
     */
    public static final boolean GK1HRecipes = PLATFORM.isModLoaded("gk1hrecipes");
    /**
     * Sword Blocking Mechanics
     */
    public static final boolean SwoBloMec = PLATFORM.isModLoaded("swordblockingmechanics");
    /**
     * Ender Zoology
     */
    public static final boolean EndZoo = PLATFORM.isModLoaded("enderzoology");
}
