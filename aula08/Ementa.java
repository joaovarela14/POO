package aula08;

import java.util.ArrayList;

public class Ementa {
    String local , nome;
    ArrayList <Prato> lista_pratos = new ArrayList<Prato>();

    public Ementa(String local, String nome) {
        this.local = local;
        this.nome = nome;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Prato> getLista_pratos() {
        return this.lista_pratos;
    }

    public void setLista_pratos(ArrayList<Prato> lista_pratos) {
        this.lista_pratos = lista_pratos;
    }


    public void addPrato(Prato prato, DiaSemana dia ) {
        lista_pratos.add(prato);
    }

    public void removePrato(Prato prato) {
        lista_pratos.remove(prato);
    }

    @Override
    public String toString() {
        String resposta = "";
        for (Prato prato : lista_pratos) {
            resposta += prato.toString()+ ", dia "+ DiaSemana.values()[lista_pratos.indexOf(prato)] + "\n";
        }
        
        return resposta;

    }
}
