package com.aula.Lista08;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MensalidadeEnsino me = new MensalidadeEnsino(7, 300);
        PrevidenciaPrivada pp = new PrevidenciaPrivada(1000);
        ContaAgua ca = new ContaAgua(10, 7);
        Contas c = new Contas();
        c.incluirConta(me);
        c.incluirConta(pp);
        c.incluirConta(ca);
        System.out.println("Total R$:"+c.calcularTotalContas());
    }
}
