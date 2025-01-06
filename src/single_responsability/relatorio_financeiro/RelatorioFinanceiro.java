package single_responsability.relatorio_financeiro;

import single_responsability.enviar_email.EnviarEmail;
import single_responsability.gerar_relatorio.GerarRelatorio;

public class RelatorioFinanceiro {

    public static void main(String[] args) {

        GerarRelatorio gerarRelatorio = new GerarRelatorio();
        gerarRelatorio.gerarRelatorio();

        EnviarEmail enviarEmailRelatorio = new EnviarEmail();
        enviarEmailRelatorio.enviarPorEmail();


    }
}
