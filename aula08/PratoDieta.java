package aula08;

import java.util.ArrayList;

public class PratoDieta extends Prato{
    ArrayList <Alimento> composição_dieta = new ArrayList<Alimento>();
    double limiteCalorias;

    public PratoDieta(String nome, double limiteCalorias) {
        super(nome);
        this.limiteCalorias = limiteCalorias;
    }

    public ArrayList<Alimento> getComposição_dieta() {
        return this.composição_dieta;
    }

    public int Ingredienteseguinte(){
        return this.composição_dieta.size()+1;
    
    }

    public Boolean addAlimento(Alimento alimento) {
        if(caloriasTotais() + alimento.getCalorias() * alimento.getPeso() / 100 <= limiteCalorias) {
            composição_dieta.add(alimento);
            return true;
        }
        else{
            return false;
        }
    }

    public void removeAlimento(Alimento alimento) {
        composição_dieta.remove(alimento);
    }

    
    public double pesoTotal() {
        double pesoTotal = 0;
        for (Alimento alimento : composição_dieta) {
            pesoTotal += alimento.getPeso();
        }
        return pesoTotal;
    }

    public double caloriasTotais() {
        double caloriasTotais = 0;
        for (Alimento alimento : composição_dieta) {
            caloriasTotais += alimento.getCalorias() * alimento.getPeso() / 100;
        }
        return caloriasTotais;
    }

    public double proteinasTotais() {
        double proteinasTotais = 0;
        for (Alimento alimento : composição_dieta) {
            proteinasTotais += alimento.getProteinas() * alimento.getPeso() / 100;
        }
        return proteinasTotais;
    }

    @Override
    public String toString() {
        return "Prato "+
                getNome() + '\'' +
                " composto por " + composição.size() + " Ingredientes - Dieta ("+ caloriasTotais() + " calorias) " ;
    }
}
