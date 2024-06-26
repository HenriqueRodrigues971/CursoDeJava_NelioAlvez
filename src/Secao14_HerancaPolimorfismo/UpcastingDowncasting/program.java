package Secao14_HerancaPolimorfismo.UpcastingDowncasting;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        // Criando uma lista de funcionários usando upcasting
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Empregado("Alice", 3000));
        funcionarios.add(new Gerente("Bob", 8000));
        funcionarios.add(new Empregado("Carlos", 3200));
        funcionarios.add(new Gerente("Diana", 9000));

        // Processando todos os funcionários
        for (Funcionario funcionario : funcionarios) {
            funcionario.trabalhar();
            funcionario.exibirSalario();

            
            
            System.out.println("----Entrando no Downcasting----");
            // Downcasting para acessar métodos específicos da subclasse
            if (funcionario instanceof Empregado) {
                Empregado empregado = (Empregado) funcionario;
                empregado.realizarTarefa();
            } else if (funcionario instanceof Gerente) {
                Gerente gerente = (Gerente) funcionario;
                gerente.conduzirReuniao();
                gerente.aprovarProjeto();
            }
            System.out.println("----Saindo Downcasting---\n");
        }
    }
}

