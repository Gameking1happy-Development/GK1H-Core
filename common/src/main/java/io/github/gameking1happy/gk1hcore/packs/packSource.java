package io.github.gameking1happy.gk1hcore.packs;

/**
 * NeoForge Only. Controls whether the datapack is enabled or disabled by default. Resource packs are always disabled by default unless you set alwaysActive to true.
 */
@SuppressWarnings("unused")
public enum packSource {
    /**
     * Packs built into the mod, usually you should use this, unless you want it to be toggled by players via the pack selection screen, then see {@link #FEATURE}.
     */
    BUILT_IN,
    /**
     * Used for data packs added to the datapack directory and world resource packs. ("if you have a file in a world called resources.zip it will auto apply that as a resource pack", informed this by thatgravyboat) Not recommended.
     */
    WORLD,
    /**
     * Used for resources packs given by a server to the client. Not recommended.
     */
    SERVER,
    /**
     * Used for packs that don't fall into any of the other cases. Not recommended.
     */
    DEFAULT,
    /**
     * Use this if you want the pack to be toggled by players via the pack selection screen.
     */
    FEATURE
}
