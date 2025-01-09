package sistema_bancario_solid.model.conta_corrente;

public class ContaCorrenteImpl implements ContaCorrente {



    @Override
    public void calculaTaxa() {
        System.out.println("Calcula taxa de 0,02% para Conta Corrente");
    }

    @Override
    public void depositoContaCorrente() {
    }

    @Override
    public void saqueContaCorrente() {
    }
}
