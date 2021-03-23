package com.mya.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.mya.demo.model.Alien;

public interface IAlienRepo extends CrudRepository<Alien, Integer> {
	
	
}
