package io.github.gameking1happy.gk1hcore;

import io.github.gameking1happy.gk1hcore.config.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static io.github.gameking1happy.gk1hcore.platform.Services.PLATFORM;
public class GK1HCore {
    public static void init() {
        LOG.info("GK1H Core running on {} in a {} environment.", PLATFORM.getPlatformName(), PLATFORM.getEnvironmentName());
        if (!PLATFORM.isModLoaded("forgeconfigapiport")) {
            throw new IllegalArgumentException("FCAP IS NOT LOADED!!!");
        }
    }
    public static final String MOD_ID = "gk1hcore";
    public static final String MOD_NAME = "GK1H Core";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
}