package sistema_bancario_solid.services;

public class Email implements Comunicacao{
    @Override
    public void enviaComunicacao() {
        System.out.println("Enviando e-mail...");
    }
}
