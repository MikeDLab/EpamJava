package com.labutin.task1b.observer;

import java.util.EventObject;

import com.labutin.task1b.entity.Sphere;

public class SphereEvent extends EventObject {

	public SphereEvent(Sphere sphere) {
		super(sphere);
		// TODO Автоматически созданная заглушка конструктора
	}
	public Sphere getSourse()
	{
		return (Sphere)super.getSource();
	}

}
