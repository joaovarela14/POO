package aula08;

import java.util.ArrayList;

public class PratoVegetariano extends Prato{
    ArrayList<Alimento> composição_vegetariano = new ArrayList<Alimento>();

    public PratoVegetariano(String nome) {
        super(nome);
    }

    public ArrayList<Alimento> getComposição_vegetariano() {
        return composição_vegetariano;
    }

    public int Ingredienteseguinte(){
        return this.composição_vegetariano.size()+1;
    
    }

    public Boolean addAlimento(Alimento alimento) {
        if(alimento instanceof Vegetariano) {
            composição_vegetariano.add(alimento);
            return true;
        }
        else{
            return false;
        }
    }

    public void removeAlimento(Alimento alimento) {
        composição_vegetariano.remove(alimento);
    }

    
    public double pesoTotal() {
        double pesoTotal = 0;
        for (Alimento alimento : composição_vegetariano) {
            pesoTotal += alimento.getPeso();
        }
        return pesoTotal;
    }

    public double caloriasTotais() {
        double caloriasTotais = 0;
        for (Alimento alimento : composição_vegetariano) {
            caloriasTotais += alimento.getCalorias() * alimento.getPeso() / 100;
        }
        return caloriasTotais;
    }

    public double proteinasTotais() {
        double proteinasTotais = 0;
        for (Alimento alimento : composição_vegetariano) {
            proteinasTotais += alimento.getProteinas() * alimento.getPeso() / 100;
        }
        return proteinasTotais;
    }
    
    @Override
    public String toString() {
        return "Prato "+
                getNome() + '\'' +
                " composto por " + composição.size() + " Ingredientes - Prato Vegetariano";
    }

}
