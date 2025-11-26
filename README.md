# 📝 To Do List em Java

Como meu primeiro projeto em java, pensei em fazer um To do List. Eu, gaby como uma pessoa muito planejadora e organizada não poderia ter escolhido projeto melhor rsrs! Foi desenvolvido também para praticar conceitos fundamentais de Programação Orientada a Objetos, listas, condicionais e lógica de interação via console. O sistema simula uma **lista de tarefas (To Do List)** simples, onde o usuário pode adicionar, listar, remover e marcar tarefas como concluídas.

---

## 📌 Objetivo

Criar um programa funcional que:

* Armazene tarefas em uma lista
* Permita ao usuário gerenciá-las interativamente
* Utilize classes, objetos e métodos
* Reforce a compreensão de ArrayList, Scanner e estruturas de repetição

---

## 🧱 Estrutura do Projeto

O programa é composto pelas seguintes classes:

### **✔️ Classe `Tarefa`**

Representa uma tarefa individual.

* `aFazer` — descrição da tarefa
* `concluida` — indica se ela foi concluída
* Possui um **construtor** que define a descrição e marca a tarefa como pendente

### **✔️ Classe `GereciadorTarefas`**

É responsável por **gerenciar a lista de tarefas**.
Contém funcionalidades como:

* Adicionar tarefa
* Listar todas as tarefas
* Marcar tarefa como concluída
* Remover tarefa da lista

### **✔️ Classe `App` (Main)**

Interface do usuário via console.
Apresenta um menu com opções:

* `[1]` Adicionar tarefa
* `[2]` Listar tarefas
* `[3]` Marcar como concluída
* `[4]` Remover tarefa
* `[5]` Sair

---

## 🛠️ Funcionalidades

### **➕ Adicionar tarefa**

O usuário digita uma descrição e a tarefa é armazenada no ArrayList.

### **📋 Listar tarefas**

Mostra todas as tarefas cadastradas com numeração.

### **✔️ Marcar como concluída**

* Usuário escolhe o número da tarefa concluída
* Pode optar por removê-la após concluir

### **❌ Remover tarefa**

Remove diretamente da lista pelo número informado.

---

## ▶️ Como executar o projeto

1. Certifique-se de ter o **Java instalado**.
2. Compile os arquivos:

```sh
javac App.java
```

3. Execute o programa:

```sh
java App
```

---

## 📚 Conceitos utilizados

* Programação Orientada a Objetos (POO)
* Construtores
* ArrayList
* Scanner para entrada do usuário
* Estrutura switch-case
* Loops while
* Manipulação de listas

---

## 💡 Possíveis melhorias futuras

* Salvar as tarefas em arquivo (persistência)
* Criar uma interface gráfica (JavaFX ou Swing)
* Permitir editar tarefas
* Mostrar indicador visual de concluído

---

## 👩‍💻 Autora

Projeto desenvolvido por **gabriellyfn** como prática de Java e lógica de programação.
