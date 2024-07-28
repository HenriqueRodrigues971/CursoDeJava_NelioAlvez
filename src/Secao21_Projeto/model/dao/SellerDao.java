package Secao21_Projeto.model.dao;

import Secao21_Projeto.model.entities.Department;
import Secao21_Projeto.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();

List<Seller> findByDepartment(Department department);
}
