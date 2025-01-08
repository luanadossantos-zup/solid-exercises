package dependency_inversion_principle.main;

import dependency_inversion_principle.computador.Computador;
import dependency_inversion_principle.dispositivo_entrada.DispositivoEntrada;
import dependency_inversion_principle.teclado.Teclado;

public class Main {

    public static void main(String[] args) {


        DispositivoEntrada teclado = new Teclado();
        Computador computadorComTeclado = new Computador(teclado);
        computadorComTeclado.digitar();




    }
}
