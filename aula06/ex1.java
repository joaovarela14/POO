package aula06;

import aula05.DateYMD;

public class ex1 {   public static void main(String[] args)  { 
    Aluno al = new Aluno ("Andreia Melo", 9855678, 
         DateYMD.create(18, 7, 1990),  DateYMD.create(1, 9, 2018)); 

    Professor p1 = new Professor("Jorge Almeida", 3467225,  DateYMD.create(13, 3, 1967), 
  "Associado", "Informática"); 

  Professor p2 = new Professor("Ilídio Geométrico", 14917051,  DateYMD.create(18, 8, 1976), 
  "Associado", "Informática"); 

    Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, DateYMD.create(11, 5, 1985), p1, 
  900); 

  Bolseiro bls1 = new Bolseiro ("Carolina prata", 15831014,  DateYMD.create(6, 3, 2004), p2, 
  15000); // teste de NMec 
  

    bls.setMontante_bolsa(1050); 
     
    System.out.println("Aluno: " + al.getNome()); 
    System.out.println(al); 
          
    System.out.println("Bolseiro: " + bls.getNome() + ", NMec: "  
      + bls.getNMec() + ", Bolsa: " +  bls.getMontante_bolsa() + ", Orientador: " +  
  bls.getProfessor()); 

  System.out.println(bls1); // teste de toString do bolseiro 

     } 
  }

