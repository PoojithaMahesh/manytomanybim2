package onetomanybim2.cont;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybim2.dao.CompanyDao;
import onetomanybim2.dao.EmployeeDao;
import onetomanybim2.dto.Company;
import onetomanybim2.dto.Employee;

public class SaveController {

	public static void main(String[] args) {
		Company company1=new Company();
		company1.setId(2);
		company1.setName("tvss");
		
		
		
		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setName("mahadev");
		employee2.setCompany(company1);
		
		
		
		
//		List<Employee> employeesOfInfosys=new ArrayList<Employee>();
//		employeesOfInfosys.add(employee1);
//		employeesOfInfosys.add(employee2);
//		
		
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.saveCompany(company1);
////		
		Employee employee1=new Employee();
		employee1.setId(6);
		employee1.setName("Raja");
		employee1.setCompany(company1);
		
		EmployeeDao dao=new EmployeeDao();
		dao.saveEmployee(employee2);
		
		
		
		
		
		
		
	
		
//		Company company2=new Company();
//		company2.setId(2);
//		company2.setName("TCS");
//		
//		Employee employee3=new Employee();
//		employee3.setId(3);
//		employee3.setName("sai");
//		employee3.setCompany(company2);
//		
//		Employee employee4=new Employee();
//		employee4.setId(4);
//		employee4.setName("ajay");
//		employee4.setCompany(company2);
//		
//		List<Employee> employeesOFTCs=new ArrayList<Employee>();
//		employeesOFTCs.add(employee3);
//		employeesOFTCs.add(employee4);
//		
//		
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.saveCompany(company1);
//		
		
		
		
		
		
		
		
//		
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		entityTransaction.begin();
//		entityManager.persist(company1);
//		entityManager.persist(company2);
//		entityManager.persist(employee1);
//		entityManager.persist(employee2);
//		entityManager.persist(employee3);
//		entityManager.persist(employee4);
//		
//		entityTransaction.commit();
		
		
		
		
		
	}
}
