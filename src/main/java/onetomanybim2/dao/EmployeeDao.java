package onetomanybim2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybim2.dto.Company;
import onetomanybim2.dto.Employee;

public class EmployeeDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}

	public void saveEmployee(List<Employee> employees) {
		
		
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		for (Employee employee : employees) {
			entityManager.persist(employee);
		}
		entityTransaction.commit();
	}

	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void saveEmployee(Employee employee) {
//		employee=id name company=1 infosys
		CompanyDao companyDao=new CompanyDao();
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Company company=entityManager.find(Company.class, employee.getCompany().getId());
		System.out.println(company);
//		id name employeesss=emp1 emp2 
		if(company!=null) {
//			company is present then you can add employee to that company
			entityTransaction.begin();
			entityManager.persist(employee);
			if(company.getEmployees().isEmpty()) {
//				when that company is not having any employee
				List<Employee>   employees=new ArrayList<Employee>();
				employees.add(employee);
				company.setEmployees(employees);
			
			}else {
//				employees are already present to that company
				List<Employee> employees=company.getEmployees();
				employees.add(employee);
				company.setEmployees(employees);
				
			}
			entityTransaction.commit();
		}else {
			System.out.println("Sorry that company is not present");
		}
		
	}

	public void getEMployeeById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Employee employee=entityManager.find(Employee.class, id);
		if(employee!=null) {
			System.out.println(employee);
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	public void deleteEmployeeById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Employee employee=entityManager.find(Employee.class, id);
		if(employee!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
