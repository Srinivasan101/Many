package com.sample.many_to._many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.many_to._many.entity.Product;

@Repository
public interface Product_Repository extends JpaRepository <Product , Integer>{

}
