package sistema_bancario_solid.model.conta_corrente;

import sistema_bancario_solid.model.conta.Conta;

public class ContaCorrente implements Conta {



    @Override
    public void calculaTaxa() {
        System.out.println("Calcula taxa de 0,02% para Conta Corrente");
    }

    @Override
    public void deposita() {
        System.out.println("Deposita na Conta Corrente...");
    }

    @Override
    public void saca() {
        System.out.println("Saca da Conta Corrente...");
    }
}
