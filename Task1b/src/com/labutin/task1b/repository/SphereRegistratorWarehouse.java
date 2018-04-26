package com.labutin.task1b.repository;

import java.util.List;

import com.labutin.task1b.entity.Sphere;

public class SphereRegistratorWarehouse {
	private List<Sphere> items;
	private SphereRegistratorWarehouse() {
		// TODO Автоматически созданная заглушка конструктора
	}
	public List<Sphere> getItems()
	{
		return items;
	}
	private static class SingletonWarehouse
	{
		private final static SphereRegistratorWarehouse warehouse =getWarehouse();
	}
	public static SphereRegistratorWarehouse getWarehouse()
	{
		return SingletonWarehouse.warehouse;
	}

}
