package dependency_inversion_principle.teclado;

import dependency_inversion_principle.dispositivo_entrada.DispositivoEntrada;

public class Teclado implements DispositivoEntrada {
    @Override
    public void usar() {
        System.out.println("Digitando...");
    }
}
