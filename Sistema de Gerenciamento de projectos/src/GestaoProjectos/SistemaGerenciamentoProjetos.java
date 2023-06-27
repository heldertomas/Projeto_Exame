package GestaoProjectos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.List;

public class SistemaGerenciamentoProjetos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaTarefas filaTarefas = new FilaTarefas();
        PilhaAcoes pilhaAcoes = new PilhaAcoes();
        ListaCircularMarcos listaMarcos = new ListaCircularMarcos();
        ArvoreBinariaTarefas arvoreTarefas = new ArvoreBinariaTarefas();
        GrafoTarefas grafoTarefas = new GrafoTarefas();

        int opcao = -1;
        while (opcao != 0) {
            exibirMenuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    menuFila(filaTarefas, scanner);
                    break;
                case 2:
                    menuPilha(pilhaAcoes, scanner);
                    break;
                case 3:
                    menuListaCircular(listaMarcos, scanner);
                    break;
                case 4:
                    menuArvoreBinaria(arvoreTarefas, scanner);
                    break;
                case 5:
                    menuGrafos(grafoTarefas, scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n=== Sistema de Gerenciamento de Projetos ===");
        System.out.println("Selecione uma estrutura de dados:");
        System.out.println("1. Fila");
        System.out.println("2. Pilha");
        System.out.println("3. Lista Circular");
        System.out.println("4. Árvore Binária");
        System.out.println("5. Grafos");
        System.out.println("0. Sair do programa");
        System.out.print("Opção: ");
    }

    private static void exibirMenuFila() {
        System.out.println("\n=== Fila ===");
        System.out.println("Selecione uma operação:");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Remover tarefa");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("Opção: ");
    }

    private static void menuFila(FilaTarefas filaTarefas, Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            exibirMenuFila();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarTarefa(filaTarefas, scanner);
                    break;
                case 2:
                    removerTarefa(filaTarefas);
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirMenuPilha() {
        System.out.println("\n=== Pilha ===");
        System.out.println("Selecione uma operação:");
        System.out.println("1. Realizar ação");
        System.out.println("2. Desfazer ação");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("Opção: ");
    }

    private static void menuPilha(PilhaAcoes pilhaAcoes, Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            exibirMenuPilha();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    realizarAcao(pilhaAcoes, scanner);
                    break;
                case 2:
                    desfazerAcao(pilhaAcoes);
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirMenuListaCircular() {
        System.out.println("\n=== Lista Circular ===");
        System.out.println("Selecione uma operação:");
        System.out.println("1. Adicionar marco");
        System.out.println("2. Percorrer marcos");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("Opção: ");
    }

    private static void menuListaCircular(ListaCircularMarcos listaMarcos, Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            exibirMenuListaCircular();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarMarco(listaMarcos, scanner);
                    break;
                case 2:
                    percorrerMarcos(listaMarcos);
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirMenuArvoreBinaria() {
        System.out.println("\n=== Árvore Binária ===");
        System.out.println("Selecione uma operação:");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Percorrer tarefas");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("Opção: ");
    }

    private static void menuArvoreBinaria(ArvoreBinariaTarefas arvoreTarefas, Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            exibirMenuArvoreBinaria();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarTarefaArvore(arvoreTarefas, scanner);
                    break;
                case 2:
                    percorrerArvore(arvoreTarefas);
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirMenuGrafos() {
        System.out.println("\n=== Grafos ===");
        System.out.println("Selecione uma operação:");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Adicionar dependência");
        System.out.println("3. Exibir tarefas críticas");
        System.out.println("4. Obter caminho mais curto");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("Opção: ");
    }

    private static void menuGrafos(GrafoTarefas grafoTarefas, Scanner scanner) {
        int opcao = -1;
        while (opcao != 0) {
            exibirMenuGrafos();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarTarefaGrafo(grafoTarefas, scanner);
                    break;
                case 2:
                    adicionarDependenciaGrafo(grafoTarefas, scanner);
                    break;
                case 3:
                    exibirTarefasCriticas(grafoTarefas);
                    break;
                case 4:
                    obterCaminhoMaisCurto(grafoTarefas, scanner);
                    break;
                case 0:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    // Métodos para cada estrutura de dados
    private static void adicionarTarefa(FilaTarefas filaTarefas, Scanner scanner) {
        System.out.print("Descrição da tarefa: ");
        String descricao = scanner.nextLine();
        System.out.print("Prazo da tarefa (formato: dd/MM/yyyy): ");
        String prazoStr = scanner.nextLine();
        System.out.print("Responsável pela tarefa: ");
        String responsavel = scanner.nextLine();

        try {
            Date prazo = new SimpleDateFormat("dd/MM/yyyy").parse(prazoStr);
            Tarefa tarefa = new Tarefa(descricao, prazo, responsavel);
            filaTarefas.adicionarTarefa(tarefa);
            System.out.println("Tarefa adicionada à fila com sucesso!");
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. A tarefa não foi adicionada à fila.");
        }
    }

    private static void removerTarefa(FilaTarefas filaTarefas) {
        if (filaTarefas.isEmpty()) {
            System.out.println("A fila de tarefas está vazia.");
        } else {
            Tarefa tarefaRemovida = filaTarefas.removerTarefa();
            System.out.println("Tarefa removida da fila: " + tarefaRemovida.getDescricao());
        }
    }

    private static void realizarAcao(PilhaAcoes pilhaAcoes, Scanner scanner) {
        System.out.print("Descrição da ação: ");
        String descricao = scanner.nextLine();
        pilhaAcoes.realizarAcao(descricao);
        System.out.println("Ação realizada e adicionada à pilha.");
    }

    private static void desfazerAcao(PilhaAcoes pilhaAcoes) {
        if (pilhaAcoes.isEmpty()) {
            System.out.println("A pilha de ações está vazia.");
        } else {
            String acaoDesfeita = pilhaAcoes.desfazerAcao();
            System.out.println("Ação desfeita: " + acaoDesfeita);
        }
    }

    private static void adicionarMarco(ListaCircularMarcos listaMarcos, Scanner scanner) {
        System.out.print("Descrição do marco: ");
        String descricao = scanner.nextLine();
        System.out.print("Prazo do marco (formato: dd/MM/yyyy): ");
        String prazoStr = scanner.nextLine();

        try {
            Date prazo = new SimpleDateFormat("dd/MM/yyyy").parse(prazoStr);
            MarcoProjeto marco = new MarcoProjeto(descricao, prazo);
            listaMarcos.adicionarMarco(marco);
            System.out.println("Marco adicionado à lista circular com sucesso!");
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. O marco não foi adicionado à lista circular.");
        }
    }

    private static void percorrerMarcos(ListaCircularMarcos listaMarcos) {
        if (listaMarcos.isEmpty()) {
            System.out.println("A lista circular de marcos está vazia.");
        } else {
            System.out.println("Percorrendo marcos:");
            listaMarcos.percorrerMarcos();
        }
    }

    private static void adicionarTarefaArvore(ArvoreBinariaTarefas arvoreTarefas, Scanner scanner) {
        System.out.print("Descrição da tarefa: ");
        String descricao = scanner.nextLine();
        System.out.print("Prioridade da tarefa: ");
        int prioridade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Tarefa tarefa = new Tarefa(descricao, null, null);
        arvoreTarefas.inserirTarefa(tarefa);
        System.out.println("Tarefa adicionada à árvore binária com sucesso!");
    }


    private static void percorrerArvore(ArvoreBinariaTarefas arvoreTarefas) {
        if (arvoreTarefas.isEmpty()) {
            System.out.println("A árvore binária de tarefas está vazia.");
        } else {
            System.out.println("Percorrendo tarefas:");
            arvoreTarefas.percorrerArvore();
        }
    }

    private static void adicionarTarefaGrafo(GrafoTarefas grafoTarefas, Scanner scanner) {
        System.out.print("Descrição da tarefa: ");
        String descricao = scanner.nextLine();
        System.out.print("Prazo da tarefa (formato: dd/MM/yyyy): ");
        String prazoStr = scanner.nextLine();
        System.out.print("Responsável pela tarefa: ");
        String responsavel = scanner.nextLine();

        try {
            Date prazo = new SimpleDateFormat("dd/MM/yyyy").parse(prazoStr);
            Tarefa tarefa = new Tarefa(descricao, prazo, responsavel);
            grafoTarefas.adicionarTarefa(tarefa);
            System.out.println("Tarefa adicionada ao grafo com sucesso!");
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. A tarefa não foi adicionada ao grafo.");
        }
    }

    private static void adicionarDependenciaGrafo(GrafoTarefas grafoTarefas, Scanner scanner) {
        System.out.print("ID da tarefa de origem: ");
        int idOrigem = scanner.nextInt();
        System.out.print("ID da tarefa de destino: ");
        int idDestino = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Tarefa tarefaOrigem = grafoTarefas.obterTarefaPorId(idOrigem);
        Tarefa tarefaDestino = grafoTarefas.obterTarefaPorId(idDestino);

        if (tarefaOrigem == null || tarefaDestino == null) {
            System.out.println("ID da tarefa inválido. Não foi possível adicionar a dependência.");
        } else {
            grafoTarefas.adicionarDependencia(tarefaOrigem, tarefaDestino);
            System.out.println("Dependência adicionada ao grafo com sucesso!");
        }
    }

    private static void exibirTarefasCriticas(GrafoTarefas grafoTarefas) {
        List<Tarefa> tarefasCriticas = grafoTarefas.obterTarefasCriticas();
        if (tarefasCriticas.isEmpty()) {
            System.out.println("Não há tarefas críticas no grafo.");
        } else {
            System.out.println("Tarefas críticas:");
            for (Tarefa tarefa : tarefasCriticas) {
                System.out.println("- " + tarefa.getDescricao());
            }
        }
    }

    private static void obterCaminhoMaisCurto(GrafoTarefas grafoTarefas, Scanner scanner) {
        System.out.print("ID da tarefa de origem: ");
        int idOrigem = scanner.nextInt();
        System.out.print("ID da tarefa de destino: ");
        int idDestino = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Tarefa tarefaOrigem = grafoTarefas.obterTarefaPorId(idOrigem);
        Tarefa tarefaDestino = grafoTarefas.obterTarefaPorId(idDestino);

        if (tarefaOrigem == null || tarefaDestino == null) {
            System.out.println("ID da tarefa inválido. Não foi possível obter o caminho mais curto.");
        } else {
            List<Tarefa> caminhoMaisCurto = grafoTarefas.obterCaminhoMaisCurto(tarefaOrigem, tarefaDestino);
            if (caminhoMaisCurto.isEmpty()) {
                System.out.println("Não há caminho entre as tarefas.");
            } else {
                System.out.println("Caminho mais curto:");
                for (Tarefa tarefa : caminhoMaisCurto) {
                    System.out.println("- " + tarefa.getDescricao());
                }
            }
        }
    }
}
