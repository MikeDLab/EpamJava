package com.labutin.task1b.repository;

import com.labutin.task1b.entity.Sphere;

public interface Repository {
	boolean add(Sphere item);
	boolean remove(Sphere item);
	Sphere find(FindSpecification specification);	
}
