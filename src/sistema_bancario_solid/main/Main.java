package sistema_bancario_solid.main;

import sistema_bancario_solid.banco.Banco;
import sistema_bancario_solid.model.conta.Conta;
import sistema_bancario_solid.model.conta_corrente.ContaCorrente;
import sistema_bancario_solid.model.conta_poupanca.ContaPoupanca;
import sistema_bancario_solid.services.Comunicacao;
import sistema_bancario_solid.services.Email;

public class Main {

    public static void main(String[] args) {

        Comunicacao email = new Email();
        Conta contaCorrente = new ContaCorrente();
        Banco bancoAcessaContaCorrente = new Banco(contaCorrente, email);

        Conta contaPoupanca = new ContaPoupanca();
        Banco bancoAcessaContaPoupanca = new Banco(contaPoupanca, email);


        bancoAcessaContaPoupanca.saca();
        bancoAcessaContaCorrente.deposita();
    }
}
