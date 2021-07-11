package com.skilldistillery.paraglidermanufacturer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.paraglidermanufacturer.data.ParagliderManufacturerDAO;

@Controller
public class ParagliderManufacturerController {

	@Autowired
	private ParagliderManufacturerDAO dao;

	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		
		model.addAttribute("paraglider", dao.findById(1));
		
		return "index";
		
	}

}
