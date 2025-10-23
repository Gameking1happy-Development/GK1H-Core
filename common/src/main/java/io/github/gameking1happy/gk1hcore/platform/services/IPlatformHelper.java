package io.github.gameking1happy.gk1hcore.platform.services;

public interface IPlatformHelper {
    // Returns the name of the platform.
    String getPlatformName();
    // Checks if a mod is loaded given its mod ID.
    boolean isModLoaded(String modId);
    // Checks if the current environment is a development environment.
    boolean isDevelopmentEnvironment();
    // Returns the name of the current environment as a string.
    default String getEnvironmentName() {
        return isDevelopmentEnvironment() ? "development" : "production";
    }
}