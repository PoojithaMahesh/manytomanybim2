package onetomanybim2.cont;

import javax.persistence.EntityManagerFactory;

import onetomanybim2.dao.CompanyDao;
import onetomanybim2.dao.EmployeeDao;

public class UpdateController {
public static void main(String[] args) {
	CompanyDao companyDao=new CompanyDao();
//	companyDao.getCompanyById(2);
	companyDao.deleteCompanyById(2);
	
	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.getEMployeeById(2);
//	employeeDao.deleteEmployeeById(2);
	
	
	
}
}
