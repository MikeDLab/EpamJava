package com.labutin.task1b.action;

import com.labutin.task1b.entity.Sphere;
import com.labutin.task1b.exception.IncorrectParameterException;

public class SphereAction {
	
	public static double countArea(Sphere sphere) {
		return 4 * Math.PI * Math.pow(sphere.getRadius(), 2);
	}

	public static double countVolume(Sphere sphere) {
		return 4 * Math.PI * Math.pow(sphere.getRadius(), 3) / 3;
	}

	public static boolean checkOnTouchfCoordinatePlanes(Sphere sphere) {
		return Math.abs(sphere.getCentroid().getZ()) == sphere.getRadius()
				|| Math.abs(sphere.getCentroid().getX()) == sphere.getRadius()
				|| Math.abs(sphere.getCentroid().getY()) == sphere.getRadius();
	}
	
	public static double countVolumeRatio(Sphere sphere, double coordinateCuttingPlane) throws IncorrectParameterException {
		if (Math.abs(coordinateCuttingPlane) >= sphere.getRadius()) {
			throw new IncorrectParameterException();
		}
		return countVolumeSegment(sphere, Math.abs(coordinateCuttingPlane - sphere.getRadius())) / countVolume(sphere);
	}

	private static double countVolumeSegment(Sphere sphere, double height) {
		return Math.PI * Math.pow(height, 2) * (sphere.getRadius() - height / 3);
	}
}
