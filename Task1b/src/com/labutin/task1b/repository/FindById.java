package com.labutin.task1b.repository;

import java.util.Iterator;
import java.util.List;

import com.labutin.task1b.entity.Sphere;

public class FindById implements FindSpecification {
	private Long key;
	public FindById(Long key) {
		// TODO Автоматически созданная заглушка конструктора
		this.key = key;
	}

	@Override
	public Sphere findSphere(List<Sphere> items) {
		// TODO Автоматически созданная заглушка метода
		Iterator<Sphere> iterator = items.iterator();
		while (iterator.hasNext()) {		
			Sphere result = iterator.next();
			if(result.getId().compareTo(key) == 0)
			{			
				return result;
			}
		}
		return null;
	}
}
