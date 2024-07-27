package Secao21_AcessoAoBancoDeDadosJdbc.RecuperarDados;

public class Dbexception extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public Dbexception(String msg) {
        super(msg);
    }
}
