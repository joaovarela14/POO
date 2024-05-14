package aula06;

import aula05.DateYMD;

public class Bolseiro extends Aluno {
    private Professor professor;
    private int montante_bolsa;
        
    Bolseiro(String nome, int cc, DateYMD data,  Professor professor, int montante_bolsa){
        super(nome, cc, data);
        this.setMontante_bolsa(montante_bolsa);
        this.setProfessor(professor);
    }
    
    public Professor  getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getMontante_bolsa() {
        return this.montante_bolsa;
    }

    public void setMontante_bolsa(int montante_bolsa) {
        this.montante_bolsa = montante_bolsa;
    }

    @Override
    public String toString() {
        
        return "Bolseiro: " + getNome() + ", NMec: "
        + getNMec() + ", Bolsa: " + getMontante_bolsa() + ", Orientador: " +
        getProfessor();


}
}
