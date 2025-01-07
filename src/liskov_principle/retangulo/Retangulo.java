package liskov_principle.retangulo;

import liskov_principle.forma.Forma;

public class Retangulo implements Forma {
    private int altura;
    private int largura;


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int getArea() {
        return getAltura() * getLargura();
    }
}
