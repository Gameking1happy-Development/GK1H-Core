package io.github.gameking1happy.gk1hcore.packs;

/**
 * Used to register the added packs.
 */
public interface RegisterPacks {
    /**
     * @param modBus Required for NeoForge to work. Note that Fabric does <strong>NOT</strong> require doing this with ModContainer. (In fact, this would be problematic since each mod needs its own ModContainer to be used.)
     */
    void registerPacks(Object modBus);
}
