package com.labutin.task1b.repository;
import java.util.List;

import com.labutin.task1b.entity.Sphere;
public interface SphereSpecification {
	Sphere querry(List<Sphere> items);
}
