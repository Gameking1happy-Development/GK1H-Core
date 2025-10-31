package io.github.gameking1happy.gk1hcore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
public class Main {
    public static void init() {
        // Gives a startup message to the log.
        LOG.info("GK1H Core running on {} in a {} environment.", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
    }
    // Mod constants.
    public static final String MOD_ID = "gk1hcore";
    public static final String MOD_NAME = "GK1H Core";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
}