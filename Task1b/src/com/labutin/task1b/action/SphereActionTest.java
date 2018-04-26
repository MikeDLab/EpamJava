package com.labutin.task1b.action;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.labutin.task1b.entity.Point;
import com.labutin.task1b.entity.Sphere;
import com.labutin.task1b.exception.IncorrectParameterException;

public class SphereActionTest {
  private Sphere sphere = new Sphere();
  private Point centroid = new Point();
  @Test
  public void checkOnTouchCoordinatePlanesTest() {
	  centroid.setPoint(0.0,0.0,3.0);
	  sphere.setRadius(3.0);  
	  sphere.setCentroid(centroid);
	  boolean act = SphereAction.checkOnTouchfCoordinatePlanes(sphere);
	  boolean exp = true;
	  Assert.assertEquals(act, exp);
  }
  @Test
  public void countVolumeTset()
  {
	  centroid.setPoint(0.0,0.0,0.0);
	  sphere.setCentroid(centroid);
	  sphere.setRadius(3.0);
	  double actVolume = SphereAction.countVolume(sphere);
	  double expVolume = 113.09;
	  Assert.assertTrue(Math.abs(expVolume - actVolume) <= 0.01);  
  }
  @Test(expectedExceptions = IncorrectParameterException.class)
  public void countVolumeRatioTest() throws IncorrectParameterException
  {
	  centroid.setPoint(0.0,0.0,0.0);
	  sphere.setCentroid(centroid);
	  sphere.setRadius(3.0);
	  double coordinateCuttingPlane = 6.0;
	  double actVolume = SphereAction.countVolumeRatio(sphere,coordinateCuttingPlane);
	  double expVolume =0.074;
	  Assert.assertTrue(Math.abs(expVolume - actVolume) <= 0.01);
	  
  }
  @Test
  public void countVolumeRatioTestExcepion() throws IncorrectParameterException
  {
	  centroid.setPoint(0.0,0.0,0.0);
	  sphere.setCentroid(centroid);
	  sphere.setRadius(3.0);
	  double coordinateCuttingPlane = 2.0;
	  double actVolume = SphereAction.countVolumeRatio(sphere,coordinateCuttingPlane);
	  double expVolume =0.074;
	  Assert.assertTrue(Math.abs(expVolume - actVolume) <= 0.01);
	  
  }
  @Test
  public void countAreaTest()
  {
	  centroid.setPoint(0.0,0.0,0.0);
	  sphere.setCentroid(centroid);
	  sphere.setRadius(3.0);
	  double actArea = SphereAction.countArea(sphere);
	  double expArea = 113.09;
	  Assert.assertTrue(Math.abs(expArea - actArea) <= 0.01);
  }
  
}
