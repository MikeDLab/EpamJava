package com.labutin.task1b.factory;

import com.labutin.task1b.entity.Point;

public class PointBuilderByCoordinates implements PointBuilder  {
	private Point point = new Point();

	@Override
	public Point getPoint() {
		return point;
	}

	public void buildPoint(double x, double y, double z) {
		point.setX(x);
		point.setY(y);
		point.setZ(z);
	}

}
