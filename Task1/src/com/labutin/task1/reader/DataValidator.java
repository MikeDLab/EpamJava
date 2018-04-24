package com.labutin.task1.reader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class DataValidator {
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}
	static Logger logger = Logger.getLogger(DataValidator.class);
	private final int RADIUS_POSITION = 4;
	private final int QUANTITY_PARAMETERS = 4;

	public boolean validateSphereData(String str[]) {
		boolean result = true;
		double number;
		try {
			if (str.length != QUANTITY_PARAMETERS) {
				return false;
			}
			for (int i = 0; i < QUANTITY_PARAMETERS; i++) {
				number = Double.parseDouble(str[i]);
				if (number <= 0 && i == RADIUS_POSITION - 1) {
					result = false;
				}
			}
		} catch (NumberFormatException ex) {
			logger.error("number format data ex",ex);
			return false;
		}
		return result;
	}

}
