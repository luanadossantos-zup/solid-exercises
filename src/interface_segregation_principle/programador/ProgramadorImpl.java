package interface_segregation_principle.programador;

public class ProgramadorImpl implements  Programador{
    @Override
    public void programar() {
        System.out.println("Programando...");
    }
}
