package com.labutin.task1b.repository;

import java.util.List;

import com.labutin.task1b.entity.Sphere;

public class SphereWarehouse{
	
	private List<Sphere> items;
	private SphereWarehouse() {
		// TODO Автоматически созданная заглушка конструктора
	}
	public List<Sphere> getItems()
	{
		return items;
	}
	private static class SingletonWarehouse
	{
		private final static SphereWarehouse warehouse =getWarehouse();
	}
	public static SphereWarehouse getWarehouse()
	{
		return SingletonWarehouse.warehouse;
	}

}
