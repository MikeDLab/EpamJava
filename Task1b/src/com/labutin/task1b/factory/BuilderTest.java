package com.labutin.task1b.factory;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.labutin.task1b.entity.Point;
import com.labutin.task1b.entity.Sphere;

public class BuilderTest {
  @Test
  public void sphereBuilderTest() {
	  SphereBuilderByParameters builder = new SphereBuilderByParameters();
	  Point pointForBuilder = new Point(1.0,2.0,3.0);
	  double radius = 4.0;
	  Sphere expected = new Sphere(pointForBuilder,radius); 
	  Sphere act =Director.createSphere(builder, radius, pointForBuilder);
	  Assert.assertEquals(act, expected);
  }
  @Test
  public void pointBuilderTest() {
	  PointBuilderByCoordinates builder = new PointBuilderByCoordinates();
	  double[] data = {4.0,3.0,3.0};  
	  Point act = Director.createPoint(builder, data);
	  Point exp = new Point(3.0,3.0,3.0);
	  Assert.assertEquals(act, exp);
  }
}
