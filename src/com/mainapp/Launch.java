package com.mainapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// So, the Tomcat server only provides us the impl of Servlet and the JSP, so to be able to work with the Hibernate framework
// we need to add jars of the Hibernate 2.1 and the JPA 2.2

public class Launch {

	public static void main(String[] args) {
		
		// The Persistence is the class that gives the object of the Hibernate impl of the JPA's EntityManagerFactory (I).
		// This ef gives us the connection pool of 20 conns for testing, no improvement in it.
		// The config is mapped with the persistence.xml 
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("config");
		
		// em is the actual obj through which we perform CRUD ops
		EntityManager em = ef.createEntityManager();
		
		System.out.println(em); // ---> SessionImpl(589610983<open>)
		
		em.close();
		ef.close();

	}

}
