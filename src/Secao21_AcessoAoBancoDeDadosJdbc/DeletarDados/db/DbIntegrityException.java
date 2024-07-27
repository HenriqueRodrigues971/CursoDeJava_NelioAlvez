package Secao21_AcessoAoBancoDeDadosJdbc.DeletarDados.db;

public class DbIntegrityException extends RuntimeException {
    public DbIntegrityException(String msg) {
        super(msg);
    }
}
