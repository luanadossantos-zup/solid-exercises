package open_closed_principle.main;
import open_closed_principle.calculadora.Calculadora;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Calculadora calculadora = new Calculadora();


        System.out.println("Digite o primeiro número:");
        int a = scanner.nextInt();
        System.out.println("Digite a operacao:");
        String operacao = scanner.next();
        System.out.println("Digite o segundo número:");
        int b = scanner.nextInt();


        switch (operacao) {
            case "+":
                calculadora.soma(a, b);
                break;

            case "-":
                calculadora.subtracao(a, b);
                break;

            case "*":
                calculadora.multiplicacao(a, b);
                break;
        }


    }
}
