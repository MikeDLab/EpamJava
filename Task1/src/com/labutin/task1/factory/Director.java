package com.labutin.task1.factory;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.labutin.task1.entity.Point;
import com.labutin.task1.entity.Sphere;
import com.labutin.task1.reader.DataManager;

public class Director {
	static {
		new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
		}
		static Logger logger = Logger.getLogger(Director.class);
	public static Point createPoint(PointBuilderByCoordinates builder,double[] coordinates)
	{
		builder.buildPoint(coordinates[0], coordinates[1], coordinates[2]);
		logger.info("result is Point "  + builder.getPoint().toString());
		return builder.getPoint();
	}
	public static Sphere createSphere(SphereBuilderByParameters builder,double radius,Point centroid)
	{
		builder.buildPoint(centroid);
		builder.buildRadius(radius);
		return builder.getSphere();
	}
}
