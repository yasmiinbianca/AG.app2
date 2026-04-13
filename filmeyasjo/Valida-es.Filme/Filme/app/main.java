package app;

import java.util.Scanner;

import model.Filme;
import util.Validacoes

public class main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Filme filme = new Filme("Teste", "Aventura", 120);
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(filme.toString());
                    break;
                case 2:
                    alterarNome(filme, scanner);
                    break;
                case 3:
                    alterarGenero(filme, scanner);
                    break;
                case 4:
                    alterarLancamento(filme, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Acesso ===");
        System.out.println("1. Mostrar dados do filme");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar gênero");
        System.out.println("4. Alterar lançamento");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Filme filme, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        if (Validacoes.nomeValido(novoNome)) {
            filme.setNome(novoNome);
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoNome));
        }
    }

    public static void alterarNome(Filme filme, Scanner scanner) {
        System.out.print("Digite o novo genero: ");
        String novoGenero = scanner.nextLine();
        if (Validacoes.nomeValido(novoGenero)) {
            filme.setGenero(novoGenero);
            System.out.println("Gênero alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroNome(novoGenero));
        }
    }
    }

    public static void alterarQuantidade(Filme filme, Scanner scanner) {
        System.out.print("Digite a nova data de lançamento do filme: ");
        try {
            double novoLancamento = Double.parseDouble(scanner.nextLine());
            if (Validacoes.lancamentoValida(novoLancamento)) {
                filme.setLancamento(novoLancamento);
                System.out.println("Data de lançamento alterada com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroLancamento(novoLancamento));
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número válido para o lançamento!");
        }
    }

}
    }
}
