package com.skilldistillery.paraglidermanufacturer.entities.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.paraglidermanufacturer.data.ParagliderManufacturerImpl;
import com.skilldistillery.paraglidermanufacturer.entities.ParagliderManufacturer;

public class ManufacturerClient {

	public static void main(String[] args) {
		ManufacturerClient mc = new ManufacturerClient();
		ParagliderManufacturerImpl pm = new ParagliderManufacturerImpl();

//		mc.callListAllManufacturer(pm);

//		mc.callFindManufacturersByCountry("Switzerland", pm);
		
		mc.callFindById(3, pm);

	}

	private void callFindById(int id, ParagliderManufacturerImpl pm) {
		System.out.println(pm.findById(id));
	}

	public void callListAllManufacturer(ParagliderManufacturerImpl pm) {
		List<ParagliderManufacturer> pml = pm.listAllManufacturer();

		for (ParagliderManufacturer pmle : pml) {
			System.out.println(pmle.toString());
		}
	}

	public void callFindManufacturersByCountry(String country, ParagliderManufacturerImpl pm) {
		List<ParagliderManufacturer> pml = pm.findManufacturersByCountry(country);

		for (ParagliderManufacturer pmle : pml) {
			System.out.println(pmle.toString());
		}
	}
}
