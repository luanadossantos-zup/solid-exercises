package open_closed_principle.subtracao;

import open_closed_principle.operacao.Operacao;

public class Subtracao implements Operacao {
    @Override
    public int calcular(int a, int b) {
        return a - b;
    }
}
