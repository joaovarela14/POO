/*package aula04;
import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public int getYear(){
        return year;
    }

    public int getKms(){
        return kms;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public void drive(int distance) {
        this.kms+=distance;

    }

    @Override
    public String toString() {
        
        return getMake()+" " + getModel() + ", " + getYear() + ", kms: " + getKms();
    }
}


//MAIN 

public class SimpleCarDemo {

    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars) {
        System.out.println("Carros registados: ");
        for(Car c :cars){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car("Renault", "Megane Sport Tourer", 2015, 35356);
        cars[1] = new Car("Toyota", "Camry", 2010, 32456);
        cars[2] = new Car("Mercedes", "Vito", 2008, 273891);

        listCars(cars);  //printa antes das viagens

        // Adicionar 10 viagens geradas aleatoriamente
        for (int i=0; i<10; i++) {
            int j = (int)Math.round(Math.random()*2); // escolhe um dos 3 carros
            int kms = (int)Math.round(Math.random()*1000); // viagem até 1000 kms

            System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);
            cars[j].drive(kms);
        }

        listCars(cars);  // printa dps das viagens

        sc.close();

    }
}/* */