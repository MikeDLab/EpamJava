package com.labutin.task1b.repository;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.labutin.task1b.entity.Point;
import com.labutin.task1b.entity.Sphere;

public class SphereRepositoryTest {
	private Sphere sphere = new Sphere();
	private Point centroid = new Point();
	private SphereRepository repository = new SphereRepository();

	@Test
	public void FindByIdSpecificationTest() {
		centroid.setPoint(0.0, 0.0, 0.0);
		sphere.setRadius(1.0);
		sphere.setCentroid(centroid);
		sphere.setId(10L);
		repository.add(sphere);
		boolean act = (sphere == repository.find(new FindById(10L)));
		boolean exp = true;
		Assert.assertEquals(act, exp);
	}
}
