package aula06;

import aula05.DateYMD;

public class Professor extends Pessoa {
    private String categoria;
    private String departamento;

    Professor (String nome, int cc, DateYMD dataNasc, String categoria, String departamento){
        super(nome, cc, dataNasc);
        
        setCategoria(categoria) ;
        setDepartamento(departamento);

        if (validar(nome, cc)) { 
            throw new IllegalArgumentException("Nome e/ou CC inválido!");
        }

        if (!(categoria.equals("Auxiliar") || categoria.equals("Associado") || categoria.equals("Catedrático"))) { 
            throw new IllegalArgumentException("Categoria inválida!");
        }
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    boolean validar(String nome, int cc){
        return ((nome == "") || (String.valueOf(cc).length() < 7));
    }

    public String toString() {
        return "Professor " + getNome()+" [categoria=" + categoria + ", departamento=" + departamento + "]";
    }
    
}
