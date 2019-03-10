package com.matthew.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matthew.entity.Coffee;

public interface CoffeeRepository extends JpaRepository<Coffee, Long>{

}
