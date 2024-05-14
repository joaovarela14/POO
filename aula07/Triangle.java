package aula07;

public class Triangle extends Forma {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangle(double lado1,double lado2,double lado3, String cor){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.cor = cor;
    }
    
    public String getName(){
        return "Triangle";
    }

    @Override
    public double getPerimeter() {
        return this.lado1+this.lado2+this.lado3;
    }

    @Override
    public double getArea() {
        double semiper = (this.lado1+this.lado2+this.lado3)/2;
        double area = Math.sqrt(semiper*(semiper-lado1)*(semiper-lado2)*(semiper-lado3));
        return Math.round(area);
    }
    
    @Override
    String cor() {
        return cor;
    }


    @Override
    public String toString() {
        return getName() + ": lado1= " + lado1 + ", lado2= " + lado2 + ", lado3= " + lado3 + ", cor= " + cor + ", perimeter= " + getPerimeter() + ", area= " + getArea();
}
}
