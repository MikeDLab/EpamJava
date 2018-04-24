package com.labutin.task1.factory;

import com.labutin.task1.entity.Point;
import com.labutin.task1.entity.Sphere;

public class SphereBuilderByParameters implements SphereBuilder {
	private Sphere sphere = new Sphere();
	
	@Override
	public Sphere getSphere() {
		return sphere;
	}

	public void buildPoint(Point centroid) {
		sphere.setCentroid(centroid);
	}

	public void buildRadius(double radius) {
		sphere.setRadius(radius);
	}

}
