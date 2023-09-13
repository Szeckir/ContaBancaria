package br.edu.pucrs.poo33.banco.modelo;

import java.util.Objects;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    //construtor default
    Conta(){
    }

    //construtor implementado
    public Conta(Pessoa titular, int agencia, int numero){
        Objects.requireNonNull(titular);

        this.titular= titular;
        this.agencia = agencia;
        this.numero = numero;

    }

    //sintaxe basica de um metodo: retorno nomeMetodo (){}
    public void depositar (double valor) throws IllegalAccessException {
        if (valor <= 0) {
            throw new IllegalAccessException("Valor menor do que zero!");
        }
        setSaldo(getSaldo() + valor);
    }

    public void sacar (double valor) throws IllegalAccessException {

        if (valor <= 0) {
            throw new IllegalAccessException("Valor menor do que zero!");
        }

        if (getSaldo() - valor < 0){
            throw new IllegalAccessException("Conta sem saldo!! ");
        }

        setSaldo(getSaldo() - valor);
    }

    public void sacar (double valor, int taxaSaque) throws IllegalAccessException {
        sacar(valor + taxaSaque);
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
