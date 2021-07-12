package com.skilldistillery.paraglidermanufacturer.data;

import java.util.List;

import com.skilldistillery.paraglidermanufacturer.entities.ParagliderManufacturer;

public interface ParagliderManufacturerDAO {
	public ParagliderManufacturer findById(int id);
	public List<ParagliderManufacturer> findManufacturersByCountry(String country);
	public List<ParagliderManufacturer> listAllManufacturer();
	public boolean updateManufacturer(ParagliderManufacturer pm);
	public boolean addNewManufacturer(ParagliderManufacturer pm);
	


}
