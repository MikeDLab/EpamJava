package com.labutin.task1b.observer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.labutin.task1b.action.SphereAction;
import com.labutin.task1b.entity.Sphere;

public class SphereRegistrator {
	private double area;
	private double volume;
	private Long id;
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
	}
	static Logger logger = Logger.getLogger(SphereRegistrator.class);
	public SphereRegistrator() {
		// TODO Автоматически созданная заглушка конструктора
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	//вынести в отдельный класс
	public void recount(Sphere sphere) {
		this.area = SphereAction.countArea(sphere);
		this.volume = SphereAction.countVolume(sphere);
		logger.info("result is Area:  " + area + " Volume: " + volume);
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public Long getId()
	{
		return id;
	}
}
