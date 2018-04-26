package com.labutin.task1b.reader;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataManagerTest {
	public String fileName = "data/data.txt";
	@Test
	public void testSphereData() {
		DataManager manager = new DataManager(fileName);
		manager.manageSphereData();
		int actual = manager.getData().size();
		int expected = 5;
		Assert.assertEquals(actual, expected);
	}
}
