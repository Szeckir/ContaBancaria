package br.edu.pucrs.poo33.banco.modelo;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(Pessoa titular, int agencia, int numero){
      //  super();
        super(titular,agencia,numero);
    }

    public void creditarInvestimento(double percentualJuros) throws IllegalAccessException {
        double valorRendimento = getSaldo() * percentualJuros / 100;
        depositar(valorRendimento);
    }
}
