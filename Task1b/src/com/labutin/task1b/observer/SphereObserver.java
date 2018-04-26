package com.labutin.task1b.observer;

import com.labutin.task1b.action.SphereAction;
import com.labutin.task1b.repository.SphereRegistratorWarehouse;

public class SphereObserver implements Observer {
	public SphereObserver() {
		// TODO Автоматически созданная заглушка конструктора
	}

	@Override
	public void handleEvent(SphereEvent event) {
		SphereRegistratorWarehouse.getWarehouse().getItems().get(1).setRadius(SphereAction.countArea(event.getSourse()));
	}

}
