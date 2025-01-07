package interface_segregation_principle.main;

import interface_segregation_principle.atendente.AtendenteImpl;
import interface_segregation_principle.programador.ProgramadorImpl;

public class Main {

    public static void main(String[] args) {
        ProgramadorImpl programador = new ProgramadorImpl();
        AtendenteImpl atendente = new AtendenteImpl();

        atendente.atenderCliente();
        programador.programar();
    }
}
