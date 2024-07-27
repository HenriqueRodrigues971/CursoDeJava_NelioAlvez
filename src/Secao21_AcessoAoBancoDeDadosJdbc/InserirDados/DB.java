package Secao21_AcessoAoBancoDeDadosJdbc.InserirDados;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Properties loadProperts() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {

            Properties props = new Properties();
            props.load(fs);
            return props;

        } catch (IOException e) {
            throw new Dbexception(e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (conn == null) {
            try {

                Properties ps = loadProperts();
                String url = ps.getProperty("dburl");
                conn = DriverManager.getConnection(url, ps);
            } catch (SQLException e) {
                throw new Dbexception(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new Dbexception(e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new Dbexception(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new Dbexception(e.getMessage());
            }
        }
    }
}
