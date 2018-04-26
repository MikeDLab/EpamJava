package com.labutin.task1b.reader;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.labutin.task1b.exception.NoDataException;

public class DataManager {
	private String fileName;
	private List<double[]> filteredData;
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}
	static Logger logger = Logger.getLogger(DataManager.class);

	public DataManager(String fileName) {
		// TODO Автоматически созданная заглушка конструктора
		this.fileName = fileName;
	}

	public void manageSphereData() {
		DataReader reader = new DataReader();
		DataValidator validator = new DataValidator();
		DataParser parser = new DataParser();
		try {
			if (reader.readSphereData(fileName) != null) {
				filteredData = new ArrayList<>();
				for (int i = 0; i < reader.readSphereData(fileName).size(); i++) {
					String data[] = parser.parse(reader.readSphereData(fileName).get(i));
					if (data != null) {
						if (validator.validateSphereData(data)) {
							filteredData.add(parser.parseToDouble(data));
						}
					}
				}
			}
		} catch (NoDataException e) {
			// TODO Автоматически созданный блок catch
			// log4j !!!
			e.printStackTrace();
			logger.error("No data");
		}

	}

	public List<double[]> getData() {
		if (filteredData == null) {
			filteredData = new ArrayList<>();
		}
		return filteredData;
	}

}
