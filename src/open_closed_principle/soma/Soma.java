package open_closed_principle.soma;

import open_closed_principle.operacao.Operacao;

public class Soma implements Operacao {

    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
}
