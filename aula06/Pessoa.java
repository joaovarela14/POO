package aula06;

import aula05.DateYMD;

public class Pessoa {
    private String nome; 
    private int cc; 
    private DateYMD dataNasc;

    public static Pessoa create(String nome,int cc, DateYMD d) {
        return new Pessoa(nome, cc, d);
    }

    public Pessoa(String nome, int cc, DateYMD dataNasc) {
        if (validar(nome, cc)) { 
            throw new IllegalArgumentException("Nome e/ou CC inválido!");
        }

        if (dataNasc == null) { 
            throw new IllegalArgumentException("Data de nascimento inválida!");
        }

        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCc() {
        return this.cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public DateYMD getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(DateYMD dataNasc) {
        this.dataNasc = dataNasc;
    }

    boolean validar(String nome, int cc){
        return ((nome == "") || (String.valueOf(cc).length() < 7));
    }

    @Override
    public String toString() {
        return getNome() + "; CC: " + getCc() + "; Data de Nascimento: " +  getDataNasc();
    }
}



