package Secao14_HerancaPolimorfismo.UpcastingDowncasting;



class Empregado extends Funcionario {
    Empregado(String nome, double salario) {
        super(nome, salario);
    }

    void realizarTarefa() {
        System.out.println(nome + " está realizando uma tarefa específica.");
    }
}


