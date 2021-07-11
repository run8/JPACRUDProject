package com.skilldistillery.paraglidermanufacturer.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.paraglidermanufacturer.data.ParagliderManufacturerImpl;
import com.skilldistillery.paraglidermanufacturer.entities.ParagliderManufacturer;

public class ManufacturerClient {

	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Paraglider Manufacturer");
//		EntityManager em = emf.createEntityManager();
		ParagliderManufacturerImpl pm = new ParagliderManufacturerImpl();
		List<ParagliderManufacturer> pml = pm.listAllManufacturer();
		
		for (ParagliderManufacturer pmle : pml) {
			System.out.println(pmle.toString());
		} 
//		findManufacturersByCountry();
	}

}
