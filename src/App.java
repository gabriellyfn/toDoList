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
        System.out.println("Tarefa adicionada com sucesso. ");
    }

    public void listarTarefa() {
        if (lista.isEmpty()) {
            System.out.println("Lista de Tarefas vazia, adicione uma tarefa ");
        } else {
            System.out.println("Lista de Tarefas: ");
            for (int i = 0; i < lista.size(); i++) {
                Tarefa t = lista.get(i); //Pegando a tarefa na posição i
                System.out.println();
                System.out.println((i + 1) + ". " + t.aFazer);//Mostra a tarefa 
            } 
        }
        }
    
    public void marcaComoConcluida() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Deseja marcar alguma tarefa como concluida (1 SIM / 0 NÃO)? ");
        int resposta = teclado.nextInt();
        if (resposta == 1) {
            System.out.print("Digite o número da tarefa concluida: ");
            int numeroTarefa = teclado.nextInt();
            int i = numeroTarefa - 1;
            Tarefa t = lista.get(i); //Pegando a tarefa na posicao i
            System.out.println("\nTarefa " + t.aFazer + " marcada como concluída.");
            System.out.print("\nDeseja remover a tarefa da lista? (1 SIM / 0 NÃO): ");
            int remover = teclado.nextInt();
            if (remover == 1) {
                lista.remove(i);
                System.out.println("\nTarefa removida da lista. ");
            }
        }
    }

    public void removerTarefa() {
        Scanner teclado = new Scanner(System.in); //criando um scanner pra ler a entrada do usuário
        System.out.print("Digite o número da tarefa a ser removida:");
        int numeroTarefa = teclado.nextInt();
        if (numeroTarefa < 1 || numeroTarefa > lista.size()) { 
            System.out.println("Número inválido!");
        } else {
            lista.remove(numeroTarefa - 1); //Removendo a tarefa da lista
            System.out.println("Tarefa removida com sucesso.");
        }
        }
}
    
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Tarefa> tarefas = new ArrayList<>();

        int entrada = 1;
        System.out.print("Olá, tecle (1) Iniciar o programa de Tarefas a Fazer OU (0) Sair ");
        entrada = teclado.nextInt();

        GereciadorTarefas gerenciador = new GereciadorTarefas(); //Criando um objeto da classe GereciadorTarefas

        while (entrada == 1) {
            System.out.println("\n-=-=-=-=-=TO DO LIST-=-=-=-=-=");
            System.out.println("\n[ 1 ] Adicionar Tarefa ");
            System.out.println("[ 2 ] Listar Tarefas ");
            System.out.println("[ 3 ] Marcar como concluída");
            System.out.println("[ 4 ] Remover tarefa ");
            System.out.println("[ 5 ] Sair ");
            System.out.print("\nEscolha uma opção: ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa:\n");
                    String descricao = teclado.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    gerenciador.listarTarefa();
                    break;
                case 3:
                    gerenciador.marcaComoConcluida();
                    break;
                case 4:
                    gerenciador.removerTarefa();
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    entrada = 0;
                    break;
            }
            
        }
        
    }
}
