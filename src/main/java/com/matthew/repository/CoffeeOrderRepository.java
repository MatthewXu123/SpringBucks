package com.matthew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matthew.entity.CoffeeOrder;

@Repository
public interface CoffeeOrderRepository extends JpaRepository<CoffeeOrder, Long>{

}
