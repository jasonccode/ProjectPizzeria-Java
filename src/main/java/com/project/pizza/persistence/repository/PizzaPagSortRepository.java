package com.project.pizza.persistence.repository;

import com.project.pizza.persistence.entity.PizzaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import org.springframework.data.domain.Pageable;


public interface PizzaPagSortRepository extends ListPagingAndSortingRepository<PizzaEntity, Integer> {
    Page<PizzaEntity> findByAvailableTrue(Pageable pageable);
}
