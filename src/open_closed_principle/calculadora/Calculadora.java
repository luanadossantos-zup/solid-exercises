package open_closed_principle.calculadora;


import open_closed_principle.multiplicacao.Multiplicacao;
import open_closed_principle.soma.Soma;
import open_closed_principle.subtracao.Subtracao;

import java.util.Scanner;

public class Calculadora{

    public void soma (int a, int b) {
        Soma soma = new Soma();
        System.out.println(soma.calcular(a, b));
    }

    public void subtracao (int a, int b) {
        Subtracao subtracao = new Subtracao();
        System.out.println(subtracao.calcular(a,b));
    }

    public void multiplicacao(int a , int b) {
        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println(multiplicacao.calcular(a,b));
    }













}
