package dependency_inversion_principle.computador;

import dependency_inversion_principle.dispositivo_entrada.DispositivoEntrada;
import dependency_inversion_principle.teclado.Teclado;

public class Computador {

    private DispositivoEntrada dispositivoEntrada;

    public Computador(DispositivoEntrada dispositivoEntrada) {
        this.dispositivoEntrada = dispositivoEntrada;
    }

    public void digitar () {
        dispositivoEntrada.usar();
    }
}
