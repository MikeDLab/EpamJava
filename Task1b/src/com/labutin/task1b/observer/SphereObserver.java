package com.labutin.task1b.observer;

public class SphereObserver implements Observer {
	private SphereRegistrator registrator;

	public SphereObserver(SphereRegistrator reg) {
		// TODO Автоматически созданная заглушка конструктора
		this.registrator = reg;
	}

	@Override
	public void handleEvent(SphereEvent event) {
		if(registrator != null)
		{
		registrator.recount();
		}
	}

}
