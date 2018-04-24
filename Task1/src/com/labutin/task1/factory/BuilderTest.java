package com.labutin.task1.factory;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.labutin.task1.entity.Point;
import com.labutin.task1.entity.Sphere;

public class BuilderTest {
  @Test
  public void sphereBuilderTest() {
	  SphereBuilderByParameters builder = new SphereBuilderByParameters();
	  Point pointForBuilder = new Point(1.0,2.0,3.0);
	  double radius = 4.0;
	  Sphere expected = new Sphere(pointForBuilder,radius);
	  builder.buildPoint(pointForBuilder);
	  builder.buildRadius(radius);
	  Sphere act = builder.getSphere();
	  Assert.assertEquals(act, expected);
  }
  @Test
  public void pointBuilderTest() {
	  PointBuilderByCoordinates builder = new PointBuilderByCoordinates();
	  double[] data = {3.0,3.0,3.0};
	  Director.createPoint(builder, data);
	  Point act = builder.getPoint();
	  Point exp = new Point(3.0,3.0,3.0);
	  Assert.assertEquals(act, exp);
  }
}
