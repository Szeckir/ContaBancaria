package br.edu.pucrs.poo33.banco.modelo;

public class Pessoa {

    //classe especifica para ser usada pelos titulares da conta
    private String nome;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    private String documento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
