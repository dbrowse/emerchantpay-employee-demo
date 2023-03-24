package testngTests.util;

import testngTests.listeners.LogListener;

import java.util.logging.Logger;


public class LoggerUtil {

	/** The logger. */
	private static Logger logger = Logger.getLogger(String.valueOf(LogListener.class));

	/**
	 * Log.
	 *
	 * @param message the message
	 */
	public static void log(String message) {
		logger.info(message);
	}

	/**
	 * Gets the logger.
	 *
	 * @return the logger
	 */
	public static Logger getLogger() {
		return logger;
	}
}
