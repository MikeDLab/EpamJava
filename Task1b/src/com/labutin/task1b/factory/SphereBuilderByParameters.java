package com.labutin.task1b.factory;

import com.labutin.task1b.entity.Point;
import com.labutin.task1b.entity.Sphere;

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
