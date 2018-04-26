package com.labutin.task1b.observer;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.labutin.task1b.entity.Point;
import com.labutin.task1b.entity.Sphere;

public class ResgistratorTest {
	  private Sphere sphere = new Sphere();
	  private Point centroid = new Point();
	  private SphereRegistrator reg = new SphereRegistrator();
  @Test
  public void testReg() {
	  centroid.setPoint(0.0,0.0,0.0);
	  sphere.setRadius(1.0);  
	  sphere.setCentroid(centroid);
	  reg.setSphere(sphere);
	  sphere.setRadius(3.0);
	  double expArea = 113.09;
	  double actArea = reg.getArea();
	  Assert.assertTrue(Math.abs(expArea - actArea) <= 0.01);
  }
}
