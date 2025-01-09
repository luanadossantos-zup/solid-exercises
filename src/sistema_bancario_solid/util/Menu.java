package sistema_bancario_solid.util;

import java.util.Scanner;

public class Menu {

    public String pedeNomeUsuario (Scanner scanner, String nomeUsuario) {

        try {
            nomeUsuario = scanner.next();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return nomeUsuario;
    }


    public String pedeEmailUsuario (Scanner scanner, String emailUsuario) {
        try {
            emailUsuario = scanner.next();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return emailUsuario;
    }

    public int pedeTelefoneUsuario (Scanner scanner, int telefoneUsuario) {
        do {
            try {
                telefoneUsuario = scanner.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Digite somente números!");
                scanner.nextLine();

            }

        }while (true);


        return telefoneUsuario;
    }




    public void menuDeEscolha(String nomeUsuario) {
        System.out.println("\t=========== Olá " + nomeUsuario + " ==========");
        String mensagemMenuDeEscolha = """
                \t Por favor, digite um número para selecionar:
                \t 1. Sacar
                \t 2. Depositar
                \t 3. Sair
                \t =================================
                """;
        System.out.println(mensagemMenuDeEscolha);
    }
}
