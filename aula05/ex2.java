package aula05;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendario calendar = null;
        int opcao = -1;
        while (opcao != 0) {
            System.out.println();
            System.out.println("-".repeat(30));
            System.out.println("Calendar Operations:");
            System.out.println("1 - Create new calendar");
            System.out.println("2 - Print calendar month");
            System.out.println("3 - Print calendar");
            System.out.println("4 - Add event");
            System.out.println("5 - Remove event");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");
            opcao = sc.nextInt();
            DateYMD data = null;


            switch (opcao) {
                case 1:
                    System.out.print("Ano: ");
                    int year = sc.nextInt();

                    System.out.printf("%9s | %9s | %9s | %9s | %9s | %9s | %9s\n", "1=Domingo", "2=Segunda", "3=Terça",
                            "4=Quarta", "5=Quinta", "6=Sexta", "7=Sábado");
                    System.out.print("Insira o primeiro dia do ano: ");
                    int firstWeekdayOfYear = sc.nextInt();

                    calendar = new Calendario(firstWeekdayOfYear, year);

                    System.out.println("Calendário criado com sucesso.");
                    break;
                case 2:
                    if (calendar==null){
                        System.out.println("Sem calendário criado.");
                    }
                    else {
                        System.out.print("Introduz o mês (1-12): ");
                        int print_mes = sc.nextInt();
                        System.out.println(calendar.firstWeekdayOfMonth(print_mes-1));
                        System.out.println(calendar.PrintMes(print_mes-1, calendar.firstWeekdayOfMonth(print_mes-1)-1));    
                    }
                    break;
                case 3:
                    if (calendar==null){
                        System.out.println("Sem calendário criado.");
                    }
                    else {
                        System.out.println(calendar.PrintAno());;
                    }
                    break;
                case 4:
                    System.out.print("Data do evento para adicionar(DD/MM): ");
                    String addevent = sc.next();
                    String[] partes = addevent.split("/");
                    int day = Integer.parseInt(partes[0]);
                    int month = Integer.parseInt(partes[1]);
                    data = DateYMD.create(day+1, month, calendar.getYear() );
                    calendar.addEvent(data);
                    break;

                case 5:
                    System.out.print("Data do evento para remover(DD/MM): ");
                    String removeevent = sc.next();
                    String[] parts_rem = removeevent.split("/");
                    int day1 = Integer.parseInt(parts_rem[0]);
                    int month1 = Integer.parseInt(parts_rem[1]);
                    data = DateYMD.create(day1+1, month1, calendar.getYear() );
                    calendar.removeEvent(data);
                    break;

                case 0:
                    System.out.println("Programa terminado com sucesso");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        sc.close();
    }

}


