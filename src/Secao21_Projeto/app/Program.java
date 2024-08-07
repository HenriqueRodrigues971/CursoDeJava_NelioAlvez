package Secao21_Projeto.app;

import Secao21_Projeto.model.dao.DaoFactory;
import Secao21_Projeto.model.dao.SellerDao;
import Secao21_Projeto.model.entities.Department;
import Secao21_Projeto.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== Teste 1: Seller findById ===");

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==== Teste 2: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==== Teste 3: Seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==== Teste 4: Seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserido new id = " + newSeller.getId());

        System.out.println("\n==== Teste 5: Seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completo!");

        System.out.println("\n==== Teste 6: Seller delete ===");
        sellerDao.deleteById(10);
        System.out.println("delete Completo");
    }
}
