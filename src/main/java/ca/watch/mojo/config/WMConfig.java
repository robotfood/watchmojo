package ca.watch.mojo.config;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WMConfig {

	public static final String API_KEY_LOCATION = "security.apiKeyLocation";
	private static final Logger LOGGER = LogManager.getLogger(WMConfig.class);

	private static Configuration configuration;

	public static Configuration getConfig(String configPath) throws ConfigurationException {
		return new PropertiesConfiguration(configPath);
	}

	public static Configuration getConfig() {
		try {
			configuration = new PropertiesConfiguration("/opt/conf/config.properties");
		} catch (ConfigurationException e) {
			LOGGER.error("Couldn't find configuration under /opt/conf/config.properties " + e.getMessage());
		}
		return configuration;
	}
}
