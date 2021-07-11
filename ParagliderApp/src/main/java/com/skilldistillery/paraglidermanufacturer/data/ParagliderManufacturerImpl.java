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
		return em.find(ParagliderManufacturer.class, id);
	}

	@Override
	public List<ParagliderManufacturer> findManufacturersByCountry(String country) {
		// SELECT * FROM manufacturer WHERE manufacturer.country = 'Switzerland';
		String jpql = "SELECT m FROM manufacturer m WHERE m.country = :c";
		List<ParagliderManufacturer> manufacturers = em.createQuery(jpql, ParagliderManufacturer.class)
				.setParameter("c", country).getResultList();
		System.out.println(manufacturers);
		return manufacturers;
	}

	@Override
	public List<ParagliderManufacturer> listAllManufacturer() {
		// SELECT * FROM manufacturer;
		String jpql = "SELECT m FROM manufacturer m";
		List<ParagliderManufacturer> manufacturers = em.createQuery(jpql, ParagliderManufacturer.class).getResultList();
		return manufacturers;
	}

	@Override
	public boolean addNewManufacturer(ParagliderManufacturer pm) {
		// start the transaction
		em.getTransaction().begin();
		System.out.println(pm);
		// write the customer to the database
		em.persist(pm);
		
		// update the "local" ParagliderManufacturer object
		em.flush();
		
		// commit the changes (actually perform the operation)
		em.getTransaction().commit();
		System.out.println(pm);

		return true;
	}
	
	@Override
	public boolean updateManufacturer(ParagliderManufacturer pm) {

		ParagliderManufacturer pmf = em.find(pm.getClass(), pm.getId());
		em.getTransaction().begin();

		pmf.setCompanyName(pm.getCompanyName());
		pmf.setCountry(pm.getCountry());
		pmf.setDescription(pm.getDescription());
		pmf.setUrl(pm.getUrl());
		pmf.setYearFounded(pm.getYearFounded());
		em.flush();
		em.getTransaction().commit();
		return true;
	}

}
