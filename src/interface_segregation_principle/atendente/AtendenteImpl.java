package interface_segregation_principle.atendente;

public class AtendenteImpl implements Atendente{

    @Override
    public void atenderCliente() {
        System.out.println("Atendendo cliente...");
    }
}
