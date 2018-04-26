package com.labutin.task1b.repository;

import java.util.ArrayList;
import java.util.List;

import com.labutin.task1b.entity.Sphere;

public class SphereWarehouse{
	
	private static List<Sphere> items = new ArrayList<Sphere>();
	private SphereWarehouse() {
		// TODO Автоматически созданная заглушка конструктора
	}
	public List<Sphere> getItems()
	{
		return items;
	}
	private static class SingletonWarehouse
	{
		private final static SphereWarehouse warehouse = new SphereWarehouse();
	}
	public static SphereWarehouse getWarehouse()
	{
		return SingletonWarehouse.warehouse;
	}

}
