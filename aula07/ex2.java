package aula07;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        DateAMD data = null;
        while (true) {
            System.out.println();
            System.out.println("-".repeat(30));
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Criar nova data");
            System.out.println("2 - Mostrar data atual");
            System.out.println("3 - Incrementar data");
            System.out.println("4 - Decrementar data");
            System.out.println("5 - Dias entre a data inserida e 1/1/2000");

            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            int option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.print("Data(AAAA/MM/DD): ");
                    String string_data = sc.next();
                    String[] parts = string_data.split("/");

                    int year = Integer.parseInt(parts[0]);
                    int month = Integer.parseInt(parts[1]);
                    int day = Integer.parseInt(parts[2]);
                    data = DateAMD.create(day, month, year);

                    if (data==null){
                        System.out.println("Introduza uma data válida!");
                       
                    }
                    else{
                        System.out.println("Data criada com sucesso!");
                    }

                    break;

                case 2:
                    if(data == null){
                        System.out.println("Sem data criada.");
                    }
                    else{
                        System.out.println(data);
                    }
                        break;

                case 3:
                    if(data == null){
                        System.out.println("Sem data criada.");
                    }
                    else{
                        data.Increment();
                        System.out.println(data);
                    }            
                    break;

                case 4:
                    if(data == null){
                        System.out.println("Sem data criada.");
                    }
                    else{
                        data.Decrement();
                        System.out.println(data);
                    }
                    break;
                case 5:
                    if (data == null) {
                        System.out.println("Data inválida");
                    } else {
                        DateND distancia = DateND.create(data);
                        System.out.println("Distância entre "+ data +" e 1/1/2000:" + distancia);

                    }
                    break;
                case 0:
                    System.out.println("Programa terminado com sucesso!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

    }
    
}
}
