//Primeiro projeto pessoal em java: To Do List!
//OBS: A fim de obter uma aprendizagem maior, todas as linhas do meu código possuem comentários.

import java.util.ArrayList;
import java.util.Scanner;

class Tarefa { //Abaixo são os atributos da classe Tarefas
    String aFazer;
    boolean concluida;

    //Criando um Método Construtor
    public Tarefa(String aFazer) {
        this.aFazer = aFazer;
        this.concluida = false; //toda tarefa começa pendente 
    }
}

class GereciadorTarefas { 
    //Abaixo estou declarando uma lista
    ArrayList<Tarefa> lista; //Criando um "lugar" chamado lista, que irá guardar várias Tarefas

    public GereciadorTarefas() { //Construtor da classe
        lista = new ArrayList<>(); //Criando uma lista vazia
    }

    public void adicionarTarefa (String descricao) {
        Tarefa t = new Tarefa(descricao); //A tarefa é definida com a descrição, e será armazeada na variavel local 't'
        lista.add(t); //Adicionando a tarefa na lista
        System.out.println("Tarefa adicionada com sucesso.");
    }

    public void listarTarefa() {
        if (lista.isEmpty()) {
            System.out.println("Lista de Tarefas vazia, adicione uma tarefa")
        }
    }

    public void removerTarefa() {

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
