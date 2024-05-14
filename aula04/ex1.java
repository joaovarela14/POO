package aula04;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Círculo");
            System.out.println("2 - Triângulo");
            System.out.println("3 - Retângulo");
            System.out.println("4 - Terminar ");
            System.out.print("Opção: ");
    
            int opcao = sc.nextInt();
    
            switch (opcao) {
                case 1:
                    System.out.println("Opção escolhida: Círculo");
    
                    System.out.print("Raio do círculo: ");
                    double raio = sc.nextDouble();
    
                    Circulo circle = Circulo.create(raio);
                    System.out.println(circle);
    
                    Circulo circle2 =  Circulo.create(5);
    
                    System.out.printf("O círculo de raio %.1f é igual ao círculo de raio 5? ",raio );
                    System.out.println(circle.equals(circle2));
                    break;
    
                case 2:
                    System.out.println("Opção escolhida: Triângulo");
    
                    System.out.print("Lado 1:  ");
                    double lado1 = sc.nextDouble();
    
                    System.out.print("Lado 2:  ");
                    double lado2 = sc.nextDouble();
    
                    System.out.print("Lado 3:  ");
                    double lado3 = sc.nextDouble();
    
                    Triangulo triangle = Triangulo.create(lado1, lado2, lado3);
                    System.out.println(triangle);
    
                    Triangulo triangle2 = Triangulo.create(3, 4, 5);
                    if (triangle != null){
                        System.out.printf("O triângulo de lados %.1f  %.1f  %.1f é igual ao triângulo de lados 3,4,5? ",
                        lado1,lado2,lado3);
                        System.out.println(triangle.equals(triangle2));
                    }
                    break;
    
                case 3:
                    System.out.println("Opção escolhida: Retângulo");
    
                    System.out.print("Largura:  ");
                    double largura = sc.nextDouble();
    
                    System.out.print("Comprimento:  ");
                    double comprimento = sc.nextDouble();
    
                    Rectangulo rect = Rectangulo.create(largura, comprimento);
                    System.out.println(rect);
    
                    Rectangulo rect2 =  Rectangulo.create(5, 10);
                    System.out.printf("O retângulo de largura %.1f e comprimento %.1f é igual ao retângulo de largura 5 e comprimento 10? ",
                    largura,comprimento);
                    System.out.println(rect.equals(rect2));
    
                    break;
    
                case 4:
                    System.out.println("Programa terminado com sucesso!");
                    System.exit(0);
                    sc.close();
                    break;
                    
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
          
        }

    }
    
    
}
