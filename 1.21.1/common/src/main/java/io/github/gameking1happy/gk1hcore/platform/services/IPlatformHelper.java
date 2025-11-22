package io.github.gameking1happy.gk1hcore.platform.services;

/**
 * Platform helper which provides information which platform the mod is running on.
 */
public interface IPlatformHelper {
    /**
     * Returns the name of the platform.
     * @return The platform name.
     */
    String getPlatformName();

    /**
     * Checks if a mod is loaded given its mod ID.
     * @param modId ID of the mod being checked.
     * @return True if the mod is loaded, otherwise returns false.
     */
    @SuppressWarnings("unused")
    boolean isModLoaded(String modId);

    /**
     * Checks if the current environment is a development environment.
     * @return True if current environment is a development environment, otherwise returns false.
     */
    boolean isDevelopmentEnvironment();

    /**
     * Returns the name of the current environment as a string.
     * @return The environment name.
     */
    default String getEnvironmentName() {
        return isDevelopmentEnvironment() ? "development" : "production";
    }
}