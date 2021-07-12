package com.skilldistillery.paraglidermanufacturer.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

//import org.springframework.stereotype.Service;

import com.skilldistillery.paraglidermanufacturer.entities.ParagliderManufacturer;

//@Service
@Transactional
public class ParagliderManufacturerImpl implements ParagliderManufacturerDAO {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Paraglider Manufacturer");

	@PersistenceContext
	private EntityManager em;

	@Override
	public ParagliderManufacturer findById(int id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		ParagliderManufacturer pm = em.find(ParagliderManufacturer.class, id);
		em.getTransaction().commit();
		em.close();

		return pm;
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

	@Override
	public List<ParagliderManufacturer> findManufacturersByCountry(String country) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		// SELECT * FROM manufacturer WHERE manufacturer.country = 'Switzerland';
		String jpql = "SELECT m FROM ParagliderManufacturer m WHERE m.country = :c";
		List<ParagliderManufacturer> manufacturers = em.createQuery(jpql, ParagliderManufacturer.class)
				.setParameter("c", country).getResultList();

		em.getTransaction().commit();
		em.close();
		return manufacturers;
	}

	@Override
	public List<ParagliderManufacturer> listAllManufacturer() {
		// SELECT * FROM manufacturer;
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		String jpql = "SELECT m FROM ParagliderManufacturer m";
		List<ParagliderManufacturer> manufacturers = em.createQuery(jpql, ParagliderManufacturer.class).getResultList();

		em.getTransaction().commit();
		em.close();
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



}
