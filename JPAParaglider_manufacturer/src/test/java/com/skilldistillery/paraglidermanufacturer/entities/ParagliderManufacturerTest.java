package com.skilldistillery.paraglidermanufacturer.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//The MySQL table is mapped to a valid JPA Entity and tested to ensure the mappings are working correctly.

class ParagliderManufacturerTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private ParagliderManufacturer pm;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory(null);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();

	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		pm = em.find(ParagliderManufacturer.class, 1);

	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		pm = null;
	}

	@Test
	@DisplayName("testing manufacturer mappings")
	void testNameMappings() {
		assertNotNull(pm);
		assertEquals("Ozone", pm.getCompanyName());
		assertEquals("France", pm.getCountry());
		assertEquals(1998, pm.getYearFounded());
		assertEquals("Ozone Gliders Limited is an aircraft manufacturer "
				+ "based in Le Bar-sur-Loup, France, although it is registered "
				+ "in Edinburgh, Scotland. The company specializes in the design "
				+ "and manufacture of paragliders in the form of ready-to-fly "
				+ "aircraft.", pm.getDescription());
		assertEquals("https://www.flyozone.com/", pm.getUrl());
	}
}
