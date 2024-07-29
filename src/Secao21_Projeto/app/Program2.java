package Secao21_Projeto.app;

import Secao21_Projeto.model.dao.DaoFactory;
import Secao21_Projeto.model.dao.DepartmentDao;
import Secao21_Projeto.model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== Test 1: Insert ====");
        Department department = new Department(null, "Smartphone");
        departmentDao.insert(department);
        System.out.println("Inserido novo id: " + department.getId());

        System.out.println("\n==== Teste 2: update ====");
        department = departmentDao.findById(6);
        department.setName("Teste de update");
        departmentDao.update(department);

        System.out.println("\n==== Teste 3: findById ====");
        department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n==== Teste 4: DeleteById ====");
        departmentDao.deleteById(8);

        System.out.println("\n==== Teste 5: findAll");
        List<Department> departments = departmentDao.findAll();
        for (Department dep : departments) {
            System.out.println(dep);
        }
    }

}
