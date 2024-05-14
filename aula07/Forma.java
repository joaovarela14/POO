package aula07;

public abstract class Forma {
    String cor;
    public abstract double getPerimeter();
    public abstract double getArea();
    abstract String cor();

    public String iguais(Forma  f) {
        if (cor.equals(f.cor()) && (this.getArea() == f.getArea())) {
            return "Figuras iguais";
        } else {
            return "Figuras diferentes";
        }
    }
    
}
