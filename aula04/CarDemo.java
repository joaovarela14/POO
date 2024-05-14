package aula04;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public String toString() {
        return String.format("%s %s, %d, kms: %d", make, model, year, kms);
    } 
}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);
    static Car NewCar() {
        String dadosCarro = "";
        while (true)  {
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            dadosCarro = sc.nextLine();
            if (dadosCarro.equals("")) {
                return null;
            }
            String[] parts = dadosCarro.split("\\s+");
            String marca = parts[0];
            String modelo = parts[1];
            int ano=  Integer.parseInt(parts[2]);
            int quilometragem =  Integer.parseInt(parts[3]);


            if (!verificarDadosCarro(dadosCarro)) {
                System.out.println("Dados mal formatados. Tente novamente..");
            }
            return new Car(marca, modelo, ano, quilometragem);
        }
    }
    static int registerCars(Car[] cars) {
        int quantidadeCarros = 0;
        for (quantidadeCarros = 0; quantidadeCarros < 10; quantidadeCarros++) {
            Car car = NewCar();

            if (car == null)
                break;

            cars[quantidadeCarros] = car;
        }
        return quantidadeCarros;
   }

    static void registerTrips(Car[] cars, int numCars) {
        while (true){
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            String distância = sc.nextLine();
            if (distância == ""){
                break;
            }
            String[] parts = distância.split(":");
            int carro = Integer.parseInt(parts[0]);
            int dist = Integer.parseInt(parts[1]);
            if (!verificarDistancias(distância)) {
                System.out.println("Dados mal formatados. Tente novamente..");
            }

            cars[carro].drive(dist);
            }
        }


    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        for (int i=0; i < 10; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i]);
            }
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
    public static boolean verificarDadosCarro(String dados) {
        Pattern padrao = Pattern.compile("^\\w+\\s+\\w+(\\s+\\w+)*\\s+\\d{4}\\s+\\d+$");
        Matcher matcher = padrao.matcher(dados);
        return matcher.matches();
    }

    public static boolean verificarDistancias(String dados) {
        Pattern padraoViagem = Pattern.compile("^\\w+:\\d+$");
        Matcher matcher = padraoViagem.matcher(dados);
        return matcher.matches();
    }

}

