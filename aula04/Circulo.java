package aula04;
import util.userinput;

class Circulo {
    private double raio;
    
    public static Circulo create(double raio){
        if (userinput.doublePositivo(raio)==false){
            System.out.println("Raio inválido");
            return null;
        }
        return new Circulo(raio);
    }
    
    public Circulo (double raio){
        this.raio = raio;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.raio, 2);
    }

    public double getPerimetro(){
        return 2*Math.PI*this.raio;
    }

    public void setRaio(double raio){
        this.raio = raio;

    }
    public double getRaio() {
        return raio;
    }

    @Override
    public String toString() {
      return "Circulo de raio " + this.raio + " área: "+ getArea() + " m² e perímetro: " + getPerimetro()+ " m";
    }

    public boolean equals(Circulo dois) {
        return this.raio == dois.raio;
    }
}

