package Secao21_AcessoAoBancoDeDadosJdbc.Trasacoes.app;

import Secao21_AcessoAoBancoDeDadosJdbc.Trasacoes.DB;
import Secao21_AcessoAoBancoDeDadosJdbc.Trasacoes.Dbexception;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();
            int rows1 = st.executeUpdate("update seller set BaseSalary = 2090 where DepartmentId = 1");

          /*  int x = 1;
            if (x < 2) {
                throw new SQLException("Fake error");
            }*/

            int rows2 = st.executeUpdate("update seller set BaseSalary = 3090 where DepartmentId = 2");
            System.out.println("roiws1: " + rows1);
            System.out.println("rows2: " + rows2);

            conn.commit();
        } catch (SQLException e) {
            try {
                conn.rollback();
                throw new Dbexception("Tansação não concluida! Causa do erro: " + e.getMessage());
            } catch (SQLException e1) {
                throw new Dbexception("Erro enquanto tentava voltar a transação(rollback): " + e.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
