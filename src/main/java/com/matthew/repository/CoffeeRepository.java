package com.matthew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matthew.entity.Coffee;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long>{

}
