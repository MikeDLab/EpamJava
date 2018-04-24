package com.labutin.task1.entity;

public class Sphere {
	private Point centroid;
	private double radius;

	public Sphere() {
	}

	public Sphere(Point centroid, double radius) {
		this.centroid = centroid;
		this.radius = radius;
	}

	public Point getCentroid() {
		return centroid;
	}

	public void setCentroid(Point centroid) {
		this.centroid = centroid;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centroid == null) ? 0 : centroid.hashCode());
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sphere other = (Sphere) obj;
		if (centroid == null) {
			if (other.centroid != null)
				return false;
		} else if (!centroid.equals(other.centroid))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sphere [centroid=" + centroid + ", radius=" + radius + "]";
	}
	

}
