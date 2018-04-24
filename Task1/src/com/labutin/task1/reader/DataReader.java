package com.labutin.task1.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.labutin.task1.exception.NoDataException;

public class DataReader {
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}
	static Logger logger = Logger.getLogger(DataManager.class);

	public List<String> readSphereData(String fileName) throws NoDataException {
		List<String> dataList = null;
		
		try(Stream<String> stream = Files.lines(Paths.get(fileName))) {
			dataList = stream.collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Автоматически созданный блок catch
			e.printStackTrace();
			logger.error("No file", e);
		} 
		if (dataList == null) {
			throw new NoDataException();
		}
		return dataList;
	}
}
