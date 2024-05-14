package aula03;

import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Número de alunos = ");
        int alunos = sc.nextInt();
        double[][] notasFinais = new double[alunos][3];
        System.out.println("NotaT   NotaP   Pauta");
        
        for (int i=0;i<alunos;i++){
            double notaP = random.nextDouble(0,20);
            double notaT = random.nextDouble(0,20);
            notasFinais[i][0] = notaT;
            notasFinais[i][1] = notaP;
            System.out.printf("%5.1f %7.1f %7d\n",
            notasFinais[i][0], notasFinais[i][1], Math.round(notas(notasFinais[i][0], notasFinais[i][1])));
        }
        sc.close();
        }

    public static double notas(double notaP,double notaT) {

        if (notaP < 7.0 || notaT < 7.0){
            return 66.0;
        }
        else{
            double notaFinal = 0.4*notaT + 0.6*notaP;
            return Math.round(notaFinal);
        }
    }
}
    

