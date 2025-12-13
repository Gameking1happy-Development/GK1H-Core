package io.github.gameking1happy.gk1hcore.packs;
/**
 * The activation type of the pack.
 * @see #ALWAYS
 * @see #NORMAL
 * @see #DEFAULT
 */
@SuppressWarnings("unused")
public enum ActivationType {
    /**
     * NeoForge &amp; Fabric: The pack is forced active always.
     */
    ALWAYS,
    /**
     * NeoForge: Players have to manually activate the pack themselves. <br>
     * Fabric: Enabled by default. Players still have full control over the activation of the pack.
     */
    DEFAULT,
    /**
     * NeoForge: Players have to manually activate the pack themselves. <br>
     * Fabric: Normal activation. The user has full control over the activation of the resource pack.
     */
    NORMAL
}
