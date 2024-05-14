package aula04;
import util.userinput;

class Rectangulo {
    private double largura;
    private double comprimento;

    public static Rectangulo create(double largura,double comprimento){
        if (userinput.doublePositivo(comprimento) == false || userinput.doublePositivo(largura ) == false){
            System.out.println("Lados inválidos");
            return null;
        }
        return new Rectangulo(largura,comprimento);
    }

    public Rectangulo(double largura, double comprimento){
        this.largura = largura;
        this.comprimento =  comprimento;
    }

    public void setLados(double largura,double comprimento){
        this.largura= largura;
        this.comprimento = comprimento;
    }
    public double getLados(int lado){
        switch (lado) {
            case 1:
                return comprimento;
            case 2:
                return largura;
            default:
                return 0;
        }
    }
    public double getArea() {
        return Math.round(this.comprimento * this.largura * 100) / 100.0;
    }

    public double getPerimetro() {
        return 2 * this.comprimento + 2 * this.largura;
    }

    @Override
    public String toString() {
        return "Retângulo: comprimento=" + this.comprimento + ", altura=" + this.largura + ", área=" + getArea() + "m², perímetro="
                + getPerimetro() + "m";
    }

    public boolean equals(Rectangulo dois) {
        return this.comprimento == dois.comprimento && this.largura == dois.largura;
    }

}
