package ca.watch.mojo.config;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WMConfig  {
	
	public static final String LOCAL_SOUNDS_DIRECTORY = "directories.local.audio";
    public static final String REMOTE_SOUNDS_DIRECTORY = "directories.remote.audio";
	private static final Logger LOGGER = LogManager.getLogger(WMConfig.class);

	public static XMLConfiguration config = null;

	protected WMConfig() {}

   public static XMLConfiguration getConfig() {
		try {
            config = new XMLConfiguration("/opt/conf/config.xml");
		} catch (ConfigurationException e) {
            LOGGER.error("Couldn't find configuration under /opt/conf/config.xml " + e.getMessage());
            try {
                LOGGER.info("Trying to fetch conf in app...");
                config = new XMLConfiguration("config.xml");
            } catch (ConfigurationException e1) {
                LOGGER.error("Couldn't find any configuration " + e1.getLocalizedMessage());
            }
		}
	   return config;
   }
}
