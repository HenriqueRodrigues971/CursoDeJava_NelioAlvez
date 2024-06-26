package Secao14_HerancaPolimorfismo.UpcastingDowncasting;

class Gerente extends Funcionario {
    Gerente(String nome, double salario) {
        super(nome, salario);
    }

    void conduzirReuniao() {
        System.out.println(nome + " está conduzindo uma reunião.");
    }

    void aprovarProjeto() {
        System.out.println(nome + " está aprovando um projeto.");
    }
}
