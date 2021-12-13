package org.aepsilon.culturetek.quarkus;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;


/**
 * CF http://patorjk.com/software/taag
 */
@ApplicationScoped
public class BiereApplicationLifeCycle {
    private static final Logger LOGGER = Logger.getLogger(BiereApplicationLifeCycle.class);
void onStart(@Observes StartupEvent ev) {
 LOGGER.info(" _ _ _ ");
 LOGGER.info("██████╗ ███████╗███████╗██████╗      ██████╗ ██████╗ ███╗   ███╗██████╗  █████╗  ██████╗ ███╗   ██╗██╗   ██╗");
 LOGGER.info("██╔══██╗██╔════╝██╔════╝██╔══██╗    ██╔════╝██╔═══██╗████╗ ████║██╔══██╗██╔══██╗██╔════╝ ████╗  ██║╚██╗ ██╔╝");
 LOGGER.info("██████╔╝█████╗  █████╗  ██████╔╝    ██║     ██║   ██║██╔████╔██║██████╔╝███████║██║  ███╗██╔██╗ ██║ ╚████╔╝ ");
 LOGGER.info("██╔══██╗██╔══╝  ██╔══╝  ██╔══██╗    ██║     ██║   ██║██║╚██╔╝██║██╔═══╝ ██╔══██║██║   ██║██║╚██╗██║  ╚██╔╝  ");
 LOGGER.info("██████╔╝███████╗███████╗██║  ██║    ╚██████╗╚██████╔╝██║ ╚═╝ ██║██║     ██║  ██║╚██████╔╝██║ ╚████║   ██║   ");
 LOGGER.info("╚═════╝ ╚══════╝╚══════╝╚═╝  ╚═╝     ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   ");
 LOGGER.info(" Powered by Quarkus");
 LOGGER.info("The application Number is starting with profile " + ProfileManager.getActiveProfile());
}
void onStop(@Observes ShutdownEvent ev) {
 LOGGER.info("The application Beer is stopping...");
}
}
