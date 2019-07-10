package com.matthew.repository;

import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
//Spring无需为这个创建一个bean
@NoRepositoryBean
public interface BaseRepository<T, Longn> extends PagingAndSortingRepository<T, Long> {
	List<T> findTop3ByOrderByUpdateTimeDescIdAsc();
	
}
