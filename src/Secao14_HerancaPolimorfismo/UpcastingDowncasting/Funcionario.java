package Secao14_HerancaPolimorfismo.UpcastingDowncasting;

class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    void exibirSalario() {
        System.out.println(nome + " tem um salário de " + salario);
    }
}
