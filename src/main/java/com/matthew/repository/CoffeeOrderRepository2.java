package com.matthew.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.matthew.entity.CoffeeOrder;

@Repository
public interface CoffeeOrderRepository2 extends BaseRepository<CoffeeOrder, Long>{
	/**
	 * @param customer
	 * @return
	 */
	List<CoffeeOrder> findByCustomerOrderById(String customer);
	
	List<CoffeeOrder> findByItems_Name(String name);

}
