package Secao21_Projeto.app;

import Secao21_Projeto.model.dao.DaoFactory;
import Secao21_Projeto.model.dao.SellerDao;
import Secao21_Projeto.model.entities.Department;
import Secao21_Projeto.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");


        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
