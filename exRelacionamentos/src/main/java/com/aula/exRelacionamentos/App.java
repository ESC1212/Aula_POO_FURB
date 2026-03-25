package com.aula.exRelacionamentos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa pessoa = new Pessoa("João Pão", 89);
        Carro carro = new Carro ("Chevrolet", "Celta", pessoa);
        
        System.out.println(carro.getMotorista().getNome());
    }
}
