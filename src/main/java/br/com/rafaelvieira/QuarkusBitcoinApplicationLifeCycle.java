package br.com.rafaelvieira;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ConfigUtils;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import org.jboss.logging.Logger;

@ApplicationScoped
public class QuarkusBitcoinApplicationLifeCycle {
    private static final Logger LOGGER = Logger.getLogger(QuarkusBitcoinApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("");
        LOGGER.info("");
        LOGGER.info("The application Quarkus-Bitcoin is starting with profile " + ConfigUtils.getProfiles());
        LOGGER.info("");
        LOGGER.info("");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application Quarkus-Bitcoin is stopping...");
    }
}
