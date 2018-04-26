package com.labutin.task1b.repository;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.labutin.task1b.entity.Sphere;

public class SphereRepository implements Repository {
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}
	static Logger logger = Logger.getLogger(SphereRepository.class);

	public SphereRepository() {
		// TODO Автоматически созданная заглушка конструктора
	}

	@Override
	public boolean add(Sphere item) {
		// TODO Автоматически созданная заглушка метода
		SphereWarehouse entities = SphereWarehouse.getWarehouse();
		if (item != null) {
			entities.getItems().add(item);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(Sphere item) {
		// TODO Автоматически созданная заглушка метода
		return true;
	}

	@Override
	public Sphere querry(SphereSpecification specification) {
		logger.info("Result find is : " + specification.querry(SphereWarehouse.getWarehouse().getItems()));
		return specification.querry(SphereWarehouse.getWarehouse().getItems());
	}

	public String toString() {
		return SphereWarehouse.getWarehouse().getItems().toString();
	}
}
