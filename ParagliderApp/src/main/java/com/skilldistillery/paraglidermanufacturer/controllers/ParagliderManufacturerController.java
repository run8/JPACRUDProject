package com.skilldistillery.paraglidermanufacturer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.paraglidermanufacturer.data.ParagliderManufacturerDAO;
import com.skilldistillery.paraglidermanufacturer.entities.ParagliderManufacturer;

@Controller
public class ParagliderManufacturerController {

	@Autowired
	private ParagliderManufacturerDAO dao;

	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		
		
		return "index";
		
	}
	
	@RequestMapping(path = "listAllManufacturers.do", method = RequestMethod.GET)
	public String showAllManufacurers(Model model) {
		model.addAttribute("pms", dao.listAllManufacturer());
		return "displayAllManufacturers";
	}

	@RequestMapping(path = "addManufacturer.do", method = RequestMethod.GET)
	public String addManufacturer() {
		return "enterManufacturerData";
	}

	@RequestMapping(path = "addM.do", method = RequestMethod.POST)
	public String enterManufacturer(Model model, ParagliderManufacturer pm) {
		model.addAttribute("pm", dao.addNewManufacturer(pm));
		return "displayManufacturerData";
	}
	
	@RequestMapping(path = "listManufacturerById.do", method = RequestMethod.GET)
	public String searchByManufacturerId(Model model, int id) {
		model.addAttribute("pm", dao.findById(id));
		return "displayManufacturerData";
	}
	
	@RequestMapping(path = "searchByCountry.do", method = RequestMethod.GET)
	public String searchByManufacturerCountry(Model model, String countryName) {
		model.addAttribute("pms", dao.findManufacturersByCountry(countryName));
		return "displayAllManufacturers";
	}
	
	@RequestMapping(path = "um.do", method = RequestMethod.GET)
	public String editManufacturerForm(Model model, int id) {	
		
		model.addAttribute("pm", dao.findById(id));
		
		return "updateManufacturerData";
	}
	
	@RequestMapping(path = "umf.do", method = RequestMethod.POST)
	public String updateManufacturer(Model model, ParagliderManufacturer pm) {	
		model.addAttribute("pm", dao.updateManufacturer(pm));
		return "displayManufacturerData";
	}

}
