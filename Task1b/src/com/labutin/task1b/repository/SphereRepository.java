package com.labutin.task1b.repository;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.labutin.task1b.entity.Sphere;


public class SphereRepository implements Repository{
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}
	static Logger logger = Logger.getLogger(SphereRepository.class);
	private List<Sphere> entities = new ArrayList<Sphere>();
	public SphereRepository() {
		// TODO Автоматически созданная заглушка конструктора
	}

	@Override
	public boolean add(Sphere item) {
		// TODO Автоматически созданная заглушка метода
		if(item != null)
		{
			entities.add(item);
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
	public Sphere find(FindSpecification specification) {
		logger.info("Result find is : " + specification.findSphere(entities));
		return specification.findSphere(entities);
	}
	public String toString()
	{
		return entities.toString();
	}
}
