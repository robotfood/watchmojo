package ca.watch.mojo.config.test;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import ca.watch.mojo.config.WMConfig;

public class WmMConfigTest {

	private static final Logger LOGGER = LogManager.getLogger(WmMConfigTest.class);

	@Test(expected = ConfigurationException.class)
	public void testConfigurationWithBadPath() throws ConfigurationException {
		WMConfig.getConfig("foobar");
	}

	@Test
	public void testConfigurationWithDefaultPath() {
		Configuration wmConfig = WMConfig.getConfig();
		String apiKeyLocation = wmConfig.getString(WMConfig.API_KEY_LOCATION);
		LOGGER.info(apiKeyLocation);
		assert (apiKeyLocation.equalsIgnoreCase("/opt/conf/client_secret.json"));
	}
}
