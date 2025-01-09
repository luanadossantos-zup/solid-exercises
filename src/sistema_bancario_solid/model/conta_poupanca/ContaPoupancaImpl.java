package sistema_bancario_solid.model.conta_poupanca;

public class ContaPoupancaImpl implements ContaPoupanca {
    @Override
    public void calculaTaxa() {
        System.out.println("Calcula taxa de 0,01% para Conta Poupança");
    }

    @Override
    public void depositoContaPoupanca() {

    }

    @Override
    public void saqueContaPoupanca() {

    }
}
