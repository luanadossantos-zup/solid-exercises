package sistema_bancario_solid.services;

public class SmsImpl implements Sms {


    @Override
    public void enviaSms(int telefoneUsuario) {
        System.out.println("Enviando sms para o telefone " + telefoneUsuario);
    }
}
