//Primeiro projeto pessoal em java: To Do List!

import java.util.ArrayList;
import java.util.Scanner;

class Tarefa { //Abaixo são os atributos da classe Tarefas
    String aFazer;
    boolean concluida;

    //Criando um Método Construtor
    public Tarefa(String aFazer, boolean concluida) {
        this.aFazer = aFazer;
        this.concluida = false; //toda tarefa começa pendente 
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Tarefa> tarefas = new ArrayList<>();

        int entrada = 1;
        System.out.print("Olá, tecle (1) Iniciar o programa de Tarefas a Fazer OU (0) Sair ");
        entrada = teclado.nextInt();

        while (entrada == 1) {
            System.out.println("\n-=-=-=-=-=TO DO LIST-=-=-=-=-=");
            System.out.println("\n[ 1 ] Adicionar Tarefa ");
            System.out.println("[ 2 ] Listar Tarefas ");
            System.out.println("[ 3 ] Remover tarefa ");
            System.out.println("[ 4 ] Sair ");
            System.out.print("\nEscolha uma opção:");
            int opcao = teclado.nextInt();


        }
        
    }
}
