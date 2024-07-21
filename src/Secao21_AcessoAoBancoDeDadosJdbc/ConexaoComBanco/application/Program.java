package Secao21_AcessoAoBancoDeDadosJdbc.ConexaoComBanco.application;

import Secao21_AcessoAoBancoDeDadosJdbc.ConexaoComBanco.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
