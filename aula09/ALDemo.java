package aula09;
import aula06.Pessoa;
import aula05.DateYMD;
import aula07.Date;
import aula07.DateAMD;
import java.util.*;
 
public class ALDemo { 

  public static void main(String[] args) { 
    System.out.print("----------C1----------\n");
    ArrayList<Integer> c1 = new ArrayList<>(); 
    for (int i = 10; i <= 100; i+=10)  
      c1.add(i); 

    System.out.println("Size: " + c1.size()); 

    for (int i = 0; i < c1.size(); i++)  
      System.out.println("Elemento: " + c1.get(i)); 
    
      System.out.println();
      System.out.println();
     
    ArrayList<String> c2 = new ArrayList<>(); 
    System.out.print("----------C2----------\n");

    c2.add("Vento"); 
    c2.add("Calor"); 
    c2.add("Frio"); 
    c2.add("Chuva"); 
    System.out.println(c2); 
    Collections.sort(c2); 
    System.out.println(c2); 
    c2.remove("Frio");  
    c2.remove(0); 
    System.out.println(c2); 
    
    System.out.println();
    System.out.println();


    System.out.print("----------C3----------\n");
    Set<Pessoa> c3 = new HashSet<>(); 
    Pessoa p1 = new Pessoa("João", 1497051, new DateYMD(14, 4, 2003));
    c3.add(new Pessoa("Ana", 123456789, new DateYMD(7, 1, 2000)));
    c3.add(new Pessoa("Luisa", 2321533, new DateYMD(30, 5, 2001)));
    c3.add(new Pessoa("Rafael", 12713627, new DateYMD(4, 4, 2003)));
    c3.add(new Pessoa("Patrícia", 86273765, new DateYMD(3, 8, 1999)));
    c3.add(new Pessoa("Afonso", 123957463, new DateYMD(12, 9, 2007)));
    //verificar se é possivel adicionar multiplas vezes a mesma pessoa 
    c3.add(p1);
    c3.add(p1);
    c3.add(p1);
    c3.add(p1);

    for (Pessoa p : c3) 
      System.out.println(p);

    System.out.println();
    System.out.println();
    System.out.print("----------C4----------\n");
    Set<Date> c4 = new TreeSet<>(); 
    c4.add(new DateAMD(14, 4, 2003));
    c4.add(new DateAMD(7, 1, 2000));
    c4.add(new DateAMD(30, 5, 2001));
    c4.add(new DateAMD(4, 4, 2003));
    c4.add(new DateAMD(3, 8, 1999));

    for (Date d : c4) 
      System.out.println(d);


  } 
}