package sistema_bancario_solid.caixa_eletronico;

import sistema_bancario_solid.model.conta.Conta;

public class CaixaEletronico {
    private Conta conta;

    public CaixaEletronico(Conta conta) {
        this.conta = conta;
    }

    public void calculaTaxa () {
        conta.calculaTaxa();
    }

    public void deposita () {
        conta.deposita();
    }

    public void saca() {
        conta.saca();
    }

}
