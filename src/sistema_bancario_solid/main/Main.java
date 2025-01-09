package sistema_bancario_solid.main;

import sistema_bancario_solid.banco.Banco;
import sistema_bancario_solid.model.conta_corrente.ContaCorrente;
import sistema_bancario_solid.model.conta_corrente.ContaCorrenteImpl;
import sistema_bancario_solid.model.conta_poupanca.ContaPoupanca;
import sistema_bancario_solid.model.conta_poupanca.ContaPoupancaImpl;
import sistema_bancario_solid.services.Email;
import sistema_bancario_solid.services.EmailImpl;
import sistema_bancario_solid.services.Sms;
import sistema_bancario_solid.services.SmsImpl;
import sistema_bancario_solid.user.Usuario;
import sistema_bancario_solid.user.UsuarioImpl;
import sistema_bancario_solid.util.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrenteImpl();
        ContaPoupanca contaPoupanca = new ContaPoupancaImpl();

        Email email = new EmailImpl();
        Sms sms = new SmsImpl();
        Usuario usuario = new UsuarioImpl();
        Menu menu = new Menu();

        int escolhaUsuarioMenuPrincipal = 0;
        int escolhaUsuarioTipoDeCoNTA = 0;
        String nomeUsuario = "";
        String emailUsuario = "";
        int telefoneUsuario = 0;




        System.out.println("========Olá, bem vindo!=========");
        System.out.println("Por favor, digite o seu nome:");
        nomeUsuario = menu.pedeNomeUsuario(scanner,nomeUsuario);

        System.out.println("Digite seu email:");
        emailUsuario = menu.pedeEmailUsuario(scanner, emailUsuario);

        System.out.println("Digite seu telefone:");
        telefoneUsuario = menu.pedeTelefoneUsuario(scanner, telefoneUsuario);


        Banco bancoAcessaConta = new Banco(contaCorrente, contaPoupanca,email, sms, usuario);


        do {

            menu.menuDeEscolha(nomeUsuario);

            try {
                escolhaUsuarioMenuPrincipal = scanner.nextInt();

            } catch (Exception e) {

                throw new RuntimeException(e);
            }

            if (escolhaUsuarioMenuPrincipal < 1 || escolhaUsuarioMenuPrincipal > 3) {
                System.out.println(" -- Por favor, apenas números de 1 a 3! -- ");
                continue;
            }

            switch (escolhaUsuarioMenuPrincipal){

                //Sacar
                case 1:
                    System.out.println("Escolha de onde quer sacar:");
                    System.out.println("1. Conta Corrente");
                    System.out.println("2. Poupança");
                    System.out.println("3. Sair");


                    do {
                        try {
                            escolhaUsuarioTipoDeCoNTA = scanner.nextInt();

                        } catch (Exception e) {
                            System.out.println("Por favor, apenas números de 1 a 3!");
                            throw new RuntimeException(e);
                        }
                    }while (escolhaUsuarioTipoDeCoNTA <1 || escolhaUsuarioTipoDeCoNTA >3);


                    switch (escolhaUsuarioTipoDeCoNTA) {
                        case 1:
                            System.out.println("Dinheiro sacado da Conta Corrente!");
                            bancoAcessaConta.saqueContaCorrente(emailUsuario, telefoneUsuario);
                            break;

                        case 2:
                            System.out.println("Dinheiro sacado da Poupança!");
                            bancoAcessaConta.saqueContaPoupanca(emailUsuario,telefoneUsuario);
                            break;

                        case 3:
                            break;
                    }
                break;
                //Depositar
                case 2:
                    System.out.println("Escolha onde quer depositar:");
                    System.out.println("1. Conta Corrente");
                    System.out.println("2. Poupança");
                    System.out.println("3. Sair");

                    do {
                        try {
                            escolhaUsuarioTipoDeCoNTA = scanner.nextInt();

                        } catch (Exception e) {
                            System.out.println("Por favor, apenas números de 1 a 3!");
                            throw new RuntimeException(e);
                        }
                    }while (escolhaUsuarioTipoDeCoNTA <1 || escolhaUsuarioTipoDeCoNTA >3);

                    switch (escolhaUsuarioTipoDeCoNTA) {
                        case 1:
                            System.out.println("Dinheiro depositado na Conta Corrente!");
                            bancoAcessaConta.depositoContaCorrente(emailUsuario, telefoneUsuario);
                            break;

                        case 2:
                            System.out.println("Dinheiro depositado na Poupança!");
                            bancoAcessaConta.depositoContaPoupanca(emailUsuario,telefoneUsuario);
                            break;

                        case 3:
                            break;
                    }
                    break;

                case 3:
                    scanner.close();
                    System.out.println("Saindo do sistema bancário...");
                    System.exit(0);
            }



        } while (escolhaUsuarioMenuPrincipal < 1 || escolhaUsuarioMenuPrincipal > 3);
    }
}
