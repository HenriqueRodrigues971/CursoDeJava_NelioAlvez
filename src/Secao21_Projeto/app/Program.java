package Secao21_Projeto.app;

import Secao21_Projeto.model.entities.Department;
import Secao21_Projeto.model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1,"Books");

        Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(),3000.0, obj);
        System.out.println(seller);
    }
}