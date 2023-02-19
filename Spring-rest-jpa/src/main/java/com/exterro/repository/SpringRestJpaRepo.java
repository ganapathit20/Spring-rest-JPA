package com.exterro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.exterro.model.Employee;

@RepositoryRestResource(path = "employee")
public interface SpringRestJpaRepo extends JpaRepository<Employee, Integer>{

}
