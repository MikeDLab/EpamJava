package com.labutin.task1b.reader;

public class DataParser {
	private final static String SPLITTER = "(\\s)";
	public DataParser() {
		// TODO Автоматически созданная заглушка конструктора
	}

	public String[] parse(String strData) {
		return strData.split(SPLITTER);
	}

	public double[] parseToDouble(String[] strData) {
		double[] parameters = new double[strData.length];
		for (int i = 0; i < strData.length; i++) {
			parameters[i] = Double.parseDouble(strData[i]);
		}
		return parameters;
	}

}
