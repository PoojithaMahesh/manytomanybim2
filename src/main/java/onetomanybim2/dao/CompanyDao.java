package onetomanybim2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybim2.dto.Company;
import onetomanybim2.dto.Employee;

public class CompanyDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}

	public void saveCompany(Company company) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();

	}

	public void updateCompany(Company company) {

		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Company dbCompany = entityManager.find(Company.class, company.getId());
		if (dbCompany != null) {
			entityTransaction.begin();
			company.setId(company.getId());
			entityManager.merge(company);
			entityTransaction.commit();
		}

	}

	public void getCompanyById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Company company=entityManager.find(Company.class, id);
		if(company!=null) {
			System.out.println(company);
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	public void deleteCompanyById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Company company=entityManager.find(Company.class, id);
		if(company!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			List<Employee> employees=company.getEmployees();
			for(Employee employee:employees) {
				employee.setCompany(null);
			}
			
			
			
			entityManager.remove(company);
			entityTransaction.commit();
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
