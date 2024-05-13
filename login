package Aula01.SesiA;

import java.util.HashMap;
import java.util.Scanner;

public class SistemaDeLogin {
    private final HashMap<String, String> usuarios;

    public SistemaDeLogin() {
        this.usuarios = new HashMap<>();
    }

    public void cadastrarUsuario(String username, String senha) {
        usuarios.put(username, senha);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public boolean fazerLogin(String username, String senha) {
        if (usuarios.containsKey(username) && usuarios.get(username).equals(senha)) {
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
            return false;
        }
    }

    public static void main(String[] args) {
        SistemaDeLogin sistema = new SistemaDeLogin();
        Scanner scanner = new Scanner(System.in);
        boolean logado = false;

        while (!logado) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Fazer login");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome de usuário:");
                    String novoUsuario = scanner.nextLine();
                    System.out.println("Digite a senha:");
                    String novaSenha = scanner.nextLine();
                    sistema.cadastrarUsuario(novoUsuario, novaSenha);
                    break;
                case 2:
                    System.out.println("Digite o nome de usuário:");
                    String usuarioLogin = scanner.nextLine();
                    System.out.println("Digite a senha:");
                    String senhaLogin = scanner.nextLine();
                    logado = sistema.fazerLogin(usuarioLogin, senhaLogin);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    logado = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
