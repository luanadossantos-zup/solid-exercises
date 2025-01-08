package sistema_bancario_solid.model.conta_poupanca;

import sistema_bancario_solid.model.conta.Conta;

public class ContaPoupanca implements Conta {
    @Override
    public void calculaTaxa() {
        System.out.println("Calcula taxa de 0,01% para Conta Poupança");
    }

    @Override
    public void deposita() {
        System.out.println("Deposita na poupança");
    }

    @Override
    public void saca() {
        System.out.println("Saca da poupança");
    }
}
