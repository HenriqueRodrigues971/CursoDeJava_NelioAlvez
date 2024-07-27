package Secao21_AcessoAoBancoDeDadosJdbc.DeletarDados.application;

import Secao21_AcessoAoBancoDeDadosJdbc.DeletarDados.db.DB;
import Secao21_AcessoAoBancoDeDadosJdbc.DeletarDados.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "delete from department where id = ?"
            );
            st.setInt(1, 2);
            int rowsAffected = st.executeUpdate();
            System.out.println("Pronto! linhas afetadas: " + rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
