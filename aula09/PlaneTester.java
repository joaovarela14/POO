package aula09;

import java.util.LinkedList;
import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlane(planeManager, scanner);
                    
                    break;
                case 2:
                    removePlane(planeManager, scanner);
                    break;
                case 3:
                    searchPlane(planeManager, scanner);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addPlane(PlaneManager planeManager, Scanner scanner) {
        // System.out.println("(c)ommercial or (m)ilitary? ");
        // String type = scanner.next();
        CommercialPlane plane1 = new CommercialPlane("CP1", "Boeing", "747", 2010, 400, 900, 20);
        CommercialPlane plane2 = new CommercialPlane("CP2", "Airbus", "A380", 2015, 500, 950, 25);
        CommercialPlane plane3 = new CommercialPlane("CP3", "Boeing", "737", 2018, 200, 800, 10);
        MilitaryPlane plane4 = new MilitaryPlane("MP1", "Lockheed", "F-22", 2010, 2, 2000, 8);
        MilitaryPlane plane5 = new MilitaryPlane("MP2", "Tap", "F-35", 2015, 2, 2500, 12);
        MilitaryPlane plane6 = new MilitaryPlane("MP3", "Delicias do mar ", "F-16", 2023, 1, 1500, 4);
        planeManager.addPlane(plane1);
        planeManager.addPlane(plane2);
        planeManager.addPlane(plane3);
        planeManager.addPlane(plane4);
        planeManager.addPlane(plane5);
        planeManager.addPlane(plane6);

        // if (type.equals("c")) {
        //     System.out.println("Indroduza o identificador do avião: ");
        //     String id = scanner.next();
        //     System.out.println("Indroduza o fabricante do avião: ");
        //     String manufacturer = scanner.next();
        //     System.out.println("Indroduza o modelo do avião: ");
        //     String model = scanner.next();
        //     System.out.println("Indroduza o ano de produção do avião: ");
        //     int prodYear = scanner.nextInt();
        //     System.out.println("Indroduza o número máximo de passageiros do avião: ");
        //     int passengers = scanner.nextInt();
        //     System.out.println("Indroduza a velocidade máxima do avião: ");
        //     int speed = scanner.nextInt();
        //     System.out.println("Indroduza o número máximo de tripulantes do avião: ");
        //     int crew = scanner.nextInt();
        //     CommercialPlane aviao_comercial = new CommercialPlane(id, manufacturer, model, prodYear, passengers, speed, crew);
        //     planeManager.addPlane(aviao_comercial);

        // } else if (type.equals("m")) {
        //     System.out.println("Indroduza o identificador do avião: ");
        //     String id = scanner.next();
        //     System.out.println("Indroduza o fabricante do avião: ");
        //     String manufacturer = scanner.next();
        //     System.out.println("Indroduza o modelo do avião: ");
        //     String model = scanner.next();
        //     System.out.println("Indroduza o ano de produção do avião: ");
        //     int prodYear = scanner.nextInt();
        //     System.out.println("Indroduza o número máximo de passageiros do avião: ");
        //     int passengers = scanner.nextInt();
        //     System.out.println("Indroduza a velocidade máxima do avião: ");
        //     int speed = scanner.nextInt();
        //     System.out.println("Indroduza o número máximo de tripulantes do avião: ");
        //     System.out.println("Indroduza o número de munições do avião: ");
        //     int misseis = scanner.nextInt();
        //     MilitaryPlane aviao_militar = new MilitaryPlane(id, manufacturer, model, prodYear, passengers, speed, misseis);
        //     planeManager.addPlane(aviao_militar);
        // }

    }

    private static void removePlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("Indroduza o identificador do avião: ");
        String id = scanner.next();

        planeManager.removePlane(id);

    }

    private static void searchPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("Indroduza o identificador do avião: ");
        String id = scanner.next();
        planeManager.searchPlane(id);
        

    }

    private static void printAllPlanes(PlaneManager planeManager) {
        planeManager.printAllPlanes();
    }

    private static void printCommercialPlanes(PlaneManager planeManager) {
        if (planeManager.getCommercialPLanes().isEmpty()) {
            System.out.println("Não existem aviões comerciais na frota.");
        }
        else{
            for (Plane plane : planeManager.getCommercialPLanes()) {
                System.out.println(plane);
            }
        }

        
    }

    private static void printMilitaryPlanes(PlaneManager planeManager) {
        if (planeManager.getMilitaryPlanes().isEmpty()) {
            System.out.println("Não existem aviões militares na frota.");
        }
        else{
            for (Plane plane : planeManager.getMilitaryPlanes()) {
                System.out.println(plane);
            }
        }
    }

    private static void printFastestPlane(PlaneManager planeManager) {
        System.out.println(planeManager.getFastestPlane());
    }
}
