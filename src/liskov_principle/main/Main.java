package liskov_principle.main;

import liskov_principle.quadrado.Quadrado;
import liskov_principle.retangulo.Retangulo;
import liskov_principle.exibir_forma.ExibirForma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        int lado, altura, largura;



        System.out.println("Digite o lado do quadrado:");
        lado = scanner.nextInt();
        ExibirForma exibirFormaQuadrada = new ExibirForma(lado, quadrado);


        System.out.println("Digite a altura do retângulo:");
        altura = scanner.nextInt();
        System.out.println("Digite a largura do retângulo:");
        largura = scanner.nextInt();
        ExibirForma exibirForma = new ExibirForma(altura,largura,retangulo);

    }
}
