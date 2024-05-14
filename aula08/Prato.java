package aula08;

import java.util.ArrayList;

public class Prato {
    String nome;
    ArrayList <Alimento> composição = new ArrayList<Alimento>();

    public Prato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Alimento> getComposição() {
        return composição;
    }


    public Boolean addAlimento(Alimento alimento) {
        composição.add(alimento);
        return true;
    }

    public void removeAlimento(Alimento alimento) {
        composição.remove(alimento);
    }

    public double pesoTotal() {
        double pesoTotal = 0;
        for (Alimento alimento : composição) {
            pesoTotal += alimento.getPeso();
        }
        return pesoTotal;
    }

    public double caloriasTotais() {
        double caloriasTotais = 0;
        for (Alimento alimento : composição) {
            caloriasTotais += alimento.getCalorias() * alimento.getPeso() / 100;
        }
        return caloriasTotais;
    }

    public double proteinasTotais() {
        double proteinasTotais = 0;
        for (Alimento alimento : composição) {
            proteinasTotais += alimento.getProteinas() * alimento.getPeso() / 100;
        }
        return proteinasTotais;
    }

    @Override
    public String toString() {
        return "Prato "+
                 nome + '\'' +
                " composto por " + composição.size() + " Ingredientes";
    }
}
