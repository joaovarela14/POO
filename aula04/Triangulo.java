package aula04;
import util.userinput;

class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public static Triangulo create(double lado1,double lado2,double lado3){
        if (userinput.doublePositivo(lado1)==false || userinput.doublePositivo(lado2)==false || userinput.doublePositivo(lado3)==false){
            System.out.println("Lados inválidos");
            return null;
        }
        if (!(lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2)) {
            System.out.println("Os lados não formam um triângulo válido.");
            return null;
            
        } 
        return new Triangulo(lado1,lado2,lado3);
    }

    public Triangulo (double lado1,double lado2,double lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public double getArea(){
        double p = (this.lado1 + this.lado2 + this.lado3) / 2;
        double area = Math.sqrt(p * (p - this.lado1) * (p - this.lado2) * (p - this.lado3));
        return area;
    }
    
    public double getPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }

    @Override
    public String toString() {
        return "Triângulo: lado1 = " + this.lado1 + ", lado2 = " + this.lado2 + ", lado3 = " + this.lado3 + ", área = " + getArea()
                + " m², perímetro = " + getPerimetro() + " m";
    }

    public void setLados(double lado1,double lado2,double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }
    public double getLados(int lado) {
        switch (lado) {
            case 1:
                return lado1;
            case 2:
                return lado2;
            case 3:
                return lado3;
            default:
                return 0;
        }
    }

    public boolean equals(Triangulo dois) {
        return this.lado1 == dois.lado1 && this.lado2 == dois.lado2 && this.lado3 == dois.lado3;
    }

}
