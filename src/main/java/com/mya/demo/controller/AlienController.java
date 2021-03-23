package com.mya.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mya.demo.dao.IAlienRepo;
import com.mya.demo.model.Alien;

@Controller
public class AlienController {
	@Autowired
	IAlienRepo repo;
	
	@RequestMapping("/hi")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
}
