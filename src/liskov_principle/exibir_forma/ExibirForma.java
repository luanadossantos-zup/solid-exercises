package liskov_principle.exibir_forma;

import liskov_principle.quadrado.Quadrado;
import liskov_principle.retangulo.Retangulo;

public class ExibirForma {

    public ExibirForma(int lado, Quadrado quadrado) {
        quadrado.setLado(lado);
        System.out.println("A área do quadrado é " + quadrado.getArea());
    }

    public ExibirForma(int altura, int largura, Retangulo retangulo) {
        retangulo.setAltura(altura);
        retangulo.setLargura(largura);
        System.out.println("A área do retângulo é " + retangulo.getArea());
    }
}
