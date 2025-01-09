package sistema_bancario_solid.services;

public class EmailImpl implements Email {

    @Override
    public void enviaEmail(String emailUsuario) {
        System.out.println("Enviando email para " + emailUsuario );
    }


}
