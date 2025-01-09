package sistema_bancario_solid.banco;

import sistema_bancario_solid.model.conta_corrente.ContaCorrente;
import sistema_bancario_solid.model.conta_poupanca.ContaPoupanca;
import sistema_bancario_solid.services.Email;
import sistema_bancario_solid.services.Sms;
import sistema_bancario_solid.user.Usuario;


public class Banco {
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;
    private Email email;
    private Sms sms;
    private Usuario usuario;

    public Banco(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca, Email email, Sms sms ,Usuario usuario) {
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
        this.email = email;
        this.sms = sms;
        this.usuario = usuario;
    }

    public void calculaTaxa () {
        contaCorrente.calculaTaxa();
    }

    public void depositoContaCorrente(String emailUsuario, int telefoneUsuario) {
        contaCorrente.depositoContaCorrente();
        email.enviaEmail(emailUsuario);
        sms.enviaSms(telefoneUsuario);

    }

    public void saqueContaCorrente(String emailUsuario, int telefoneUsuario) {
        contaCorrente.saqueContaCorrente();
        email.enviaEmail(emailUsuario);
        sms.enviaSms(telefoneUsuario);
    }


    public void depositoContaPoupanca(String emailUsuario, int telefoneUsuario) {
        contaPoupanca.depositoContaPoupanca();
        email.enviaEmail(emailUsuario);
        sms.enviaSms(telefoneUsuario);

    }

    public void saqueContaPoupanca(String emailUsuario, int telefoneUsuario) {
        contaPoupanca.saqueContaPoupanca();
        email.enviaEmail(emailUsuario);
        sms.enviaSms(telefoneUsuario);
    }


}
