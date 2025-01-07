package liskov_principle.quadrado;

import liskov_principle.forma.Forma;

public class Quadrado implements Forma {
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }





    @Override
    public int getArea() {
        return getLado() * getLado();
    }
}
