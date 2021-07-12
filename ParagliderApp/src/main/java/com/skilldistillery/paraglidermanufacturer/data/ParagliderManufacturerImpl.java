package com.skilldistillery.paraglidermanufacturer.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.paraglidermanufacturer.entities.ParagliderManufacturer;

@Service
@Transactional
public class ParagliderManufacturerImpl implements ParagliderManufacturerDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public ParagliderManufacturer findById(int id) {
		ParagliderManufacturer pm = em.find(ParagliderManufacturer.class, id);
		System.out.println("/////////////////////Find by ID: " + pm);
		return em.find(ParagliderManufacturer.class, id);
	}

	@Override
	public List<ParagliderManufacturer> findManufacturersByCountry(String country) {
		// SELECT * FROM manufacturer WHERE manufacturer.country = 'Switzerland';
		String jpql = "SELECT m FROM ParagliderManufacturer m WHERE m.country = :c";
		List<ParagliderManufacturer> manufacturers = em.createQuery(jpql, ParagliderManufacturer.class)
				.setParameter("c", country).getResultList();
		System.out.println(manufacturers);
		return manufacturers;
	}

	@Override
	public List<ParagliderManufacturer> listAllManufacturer() {
		// SELECT * FROM manufacturer;
		String jpql = "SELECT m FROM ParagliderManufacturer m";
		List<ParagliderManufacturer> manufacturers = em.createQuery(jpql, ParagliderManufacturer.class).getResultList();
		return manufacturers;
	}

	@Override
	public ParagliderManufacturer addNewManufacturer(ParagliderManufacturer pm) {
	
		// write the customer to the database
		em.persist(pm);
		
	
		return pm;
	}
	
	@Override
	public ParagliderManufacturer updateManufacturer(ParagliderManufacturer pm) {
//		System.out.println("++++++++++++++++++++++++++PM: " + pm.getId());
		ParagliderManufacturer pmf = em.find(ParagliderManufacturer.class, pm.getId());
//		System.out.println("PMF: " + pmf);
		pmf.setCompanyName(pm.getCompanyName());
		pmf.setCountry(pm.getCountry());
		pmf.setDescription(pm.getDescription());
		pmf.setUrl(pm.getUrl());
		pmf.setYearFounded(pm.getYearFounded());
		em.flush();
		return pmf;
	}

}
