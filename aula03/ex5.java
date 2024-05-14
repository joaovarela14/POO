package aula03;

import java.util.Scanner;
import util.userinput;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Mês: ");
        int mes = sc.nextInt();
        while(userinput.estaDentroDoIntervalo(mes, 1, 12)==false){
            System.out.print("Insira um mês válido: ");
            mes = sc.nextInt();
        }

        System.out.print("Ano: ");
        int ano = sc.nextInt();
        while(userinput.intPositivo(ano)==false){
            System.out.print("Insira um ano válido: ");
            ano = sc.nextInt();
        }


        System.out.print("Dia da semana no qual começa o mês?\n1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo\nDia: ");
        int dia_inicial = sc.nextInt();
        while(userinput.estaDentroDoIntervalo(dia_inicial, 1, 7)==false){
            System.out.print("Insira um dia inicial válido: ");
            dia_inicial = sc.nextInt();
        }

        int dias_mes = 0;
        if (mes==2){
            if (userinput.Bissexto(ano)==true){
                dias_mes = 29;
            }
            else{
                dias_mes = 28;
            }
        }
        else if((mes == 4 || mes == 6 || mes == 9 || mes == 11)){
                dias_mes = 30;
            }
        else{
            dias_mes = 31;
        }
        

        String nome_mes = " ";
        switch (mes) {
            case 1: nome_mes = "January"; break;
            case 2: nome_mes = "February"; break;
            case 3: nome_mes= "March"; break;
            case 4: nome_mes= "April"; break;
            case 5: nome_mes= "May"; break;
            case 6: nome_mes= "June"; break;
            case 7: nome_mes= "July"; break;
            case 8: nome_mes= "August"; break;
            case 9: nome_mes= "September"; break;
            case 10:nome_mes = "October"; break;
            case 11:nome_mes = "November"; break;
            case 12:nome_mes = "December"; break;
        }


        System.out.println("\n");
        System.out.printf("%10s %d\n",nome_mes,ano);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int counter = dia_inicial;
        if (dia_inicial !=7){
            for (int i = 1; i < dia_inicial+1; i++) {
                System.out.print("   ");                
            }
        }
        else{
            counter=0;
        }

        
        for (int i = 1; i<dias_mes+1;i++){
            if(i<10){
                System.out.print(" "+i+" ");

            }
            else{
                System.out.print(i+" ");
            }
            
            counter++;
            if (counter==7){
                counter = 0;
                System.out.print("\n");
            }

        }
        sc.close();
        }
    }

