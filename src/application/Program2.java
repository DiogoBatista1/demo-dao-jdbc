package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1: department findById ===");
		Department department = depDao.findById(2);
		System.out.println(department);
		
		System.out.println("=== Test #: department Insert ===");
		Department newDp = new Department(null, "Music");
		depDao.insert(newDp);
		System.out.println("Inserted! New id = " + newDp.getId());
	}
}
