package sistema_bancario_solid.banco;

import sistema_bancario_solid.model.conta.Conta;
import sistema_bancario_solid.services.Comunicacao;
import sistema_bancario_solid.services.Email;

public class Banco {
    private Conta conta;
    private Comunicacao email;

    public Banco(Conta conta, Comunicacao email) {
        this.conta = conta;
        this.email = email;
    }

    public void calculaTaxa () {
        conta.calculaTaxa();
    }

    public void deposita () {
        conta.deposita();
        email.enviaComunicacao();
    }

    public void saca() {
        conta.saca();
        email.enviaComunicacao();
    }



}
