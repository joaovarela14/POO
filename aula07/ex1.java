package aula07;

public class ex1 {
    public static void main(String[] args) {
        Forma[] formas = new Forma[6];
        formas[0] = new Triangle(3, 4, 5, "red");
        formas[1] = new Retangle(3, 4, "blue");
        formas[2] = new Circle(3, "green");
        formas[3] = new Triangle(3, 4, 5, "pink");
        formas[4] = new Circle(3, "green");
        formas[5] = new Retangle(5, 4, "black");

        for (int i = 0; i < formas.length; i++) {
            System.out.println(formas[i]+"\n");
        }

        System.out.println(formas[0].iguais( formas[3] ));  //cores diferentes
        System.out.println(formas[2].iguais( formas[4])); // tudo igual

        System.out.println(formas[2].iguais( formas[0]));  //formas diferentes

        System.out.println(formas[2].iguais( formas[1]));  

        System.out.println(formas[1].iguais( formas[5]));  



    

    }
}
