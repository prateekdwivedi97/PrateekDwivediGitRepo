package com.capg.test;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.entities.Author;
import com.capg.entities.Book;

public class TestApp {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Assignment2JPA");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
				Author auth=new Author(101, "SD");
		Author auth1=new Author(102,"Dr.Verman");
		Book b=new Book(104,"Leo",111,"D",4500);
		
		entityManager.getTransaction().begin();
		entityManager.persist(auth);
		entityManager.persist(auth1);
		entityManager.persist(b);
		entityManager.getTransaction().commit();
		System.out.println("Data Saved");
		Query namedquery=entityManager.createNamedQuery("getbook");
		List<Author> author=namedquery.getResultList();
		for(Author auth:author)
		{
			System.out.println(auth);
			System.out.println("Executed the Result");
		}
		entityManagerFactory.close();
		

		
	}

}
