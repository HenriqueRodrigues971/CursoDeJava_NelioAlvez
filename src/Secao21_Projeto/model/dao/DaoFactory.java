package Secao21_Projeto.model.dao;

import Secao21_Projeto.db.DB;
import Secao21_Projeto.model.dao.impl.DepartmentDaoJDBC;
import Secao21_Projeto.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
