package com.sample.many_to._many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.many_to._many.entity.Customer;

@Repository
public interface Customer_Repository extends JpaRepository <Customer , Integer>{

}
