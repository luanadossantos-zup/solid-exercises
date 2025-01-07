package open_closed_principle.multiplicacao;

import open_closed_principle.operacao.Operacao;

public class Multiplicacao implements Operacao {
    @Override
    public int calcular(int a, int b) {
        return a * b;
    }
}
