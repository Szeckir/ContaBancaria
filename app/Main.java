package br.edu.pucrs.poo33.banco.app;

import br.edu.pucrs.poo33.banco.modelo.Conta;
import br.edu.pucrs.poo33.banco.modelo.ContaInvestimento;
import br.edu.pucrs.poo33.banco.modelo.Pessoa;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        //minhaConta: variavel que referencia o objeto
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Joao da Silva");
        titular1.setDocumento("8080888");

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 9987);

        minhaConta.depositar(15_000);
        minhaConta.sacar(1000);
        minhaConta.creditarInvestimento(0.8);


        //acessando variavel de instancia
        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());


    }
}