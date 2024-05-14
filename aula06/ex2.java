package aula06;
import java.util.Scanner;

import aula05.DateYMD;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        Pessoa p1 = new Pessoa("João",14917051, DateYMD.create(14, 4, 2003));
        Pessoa p2 = new Pessoa("Francisco",13458764, DateYMD.create(24, 12, 2007));
        Pessoa p3 = new Pessoa("Frederico",13651020, DateYMD.create(2, 1, 1999));


        Contacto c1 = new Contacto(p1,912345678,"joaovarela@gmail.com");
        Contacto c2 = new Contacto(p2, 963497755);
        Contacto c3 = new Contacto(p3, "jonitasv@gmail.com");
        Contacto c4 = new Contacto(p1, 912345678);

        while(opcao!=0){
            System.out.println("------------------------\nSelecione uma opção:");
            System.out.println("1. Inserir contacto");
            System.out.println("2. Alterar contacto");
            System.out.println("3. Apagar contacto");
            System.out.println("4. Procurar contacto");
            System.out.println("5. Listar contactos");
            System.out.println("0. Sair");
            System.out.print("\nOpção: ");

            opcao = sc.nextInt();
            System.out.println();
            switch (opcao) {
                case 1:
                    Contacto.addcontacto(c1);
                    Contacto.verificarPessoa(c2);
                    Contacto.verificarPessoa(c3);
                    Contacto.verificarPessoa(c4);
                    break;

                case 2:
                    if (Contacto.lista_contactos.size() == 0) {
                        System.out.println("Não existem contactos para alterar.");
                        break;
                    }
                    else{
                        System.out.print("Pesquisar o contacto para alterar por número (s/n)\nSe a resposta for n, então pesquisar por nome. Resposta: ");
                        String resposta = sc.next();
                        if (resposta.equals("s")){
                            System.out.print("Insira o número de telemóvel do contacto a alterar: ");
                            int numero = sc.nextInt();
                            int counter = 0;
                            for(int i=0; i<Contacto.lista_contactos.size(); i++){
                                if(Contacto.lista_contactos.get(i).getTelemovel() == numero){
                                    System.out.println("ID: " + Contacto.lista_contactos.get(i).getId()+" - "+Contacto.lista_contactos.get(i).getPessoa().getNome());
                                    counter++;
                                }
                            }
                            if (counter == 0){
                                System.out.println("Não existem contactos com esse número de telemóvel.");
                                break;
                            }
                            else{
                                System.out.print("Insira o ID do número de telemóvel que deseja alterar: ");
                                int id = sc.nextInt();
                                System.out.println("Alteração que quer fazer: \n 1- Alterar número de telemóvel\n 2- Alterar e-mail\n 3- Alterar ambos");
                                int alteracao = sc.nextInt();
                                switch(alteracao) {
                                    case 1:
                                        Contacto.alterarnumtele(id);
                                      break;
                                    case 2:
                                        Contacto.alteraremail(id);
                                      break;
                                    case 3:
                                        Contacto.alterarnumtele(id);
                                        Contacto.alteraremail(id);
                                      break;
                                    default:
                                        System.out.println("Opção inválida.");
                                  }
                            }
                        }
                        else if (resposta.equals("n")){
                            System.out.print("Insira o nome do contacto a alterar: ");
                            String nome = "João";
                            int counter = 0;

                            for(int i=0; i<Contacto.lista_contactos.size(); i++){
                                System.out.println(Contacto.lista_contactos.get(i).getPessoa().getNome().equals(nome));
                                if(Contacto.lista_contactos.get(i).getPessoa().getNome().equals(nome)){
                                    System.out.println("ID: " + Contacto.lista_contactos.get(i).getId()+" - "+Contacto.lista_contactos.get(i).getPessoa().getNome());
                                    counter++;
                                }
                            }
                            if(counter == 0){
                                System.out.println("Não existem contactos com esse nome.");
                                break;
                            }
                            else{
                                System.out.print("Insira o ID do número de telemóvel que deseja alterar: ");
                                int id = sc.nextInt();
                                System.out.println("Alteração que quer fazer: \n 1- Alterar número de telemóvel\n 2- Alterar e-mail\n 3- Alterar ambos");
                                int alteracao = sc.nextInt();
                                switch(alteracao) {
                                    case 1:
                                        Contacto.alterarnumtele(id);
                                      break;
                                    case 2:
                                        Contacto.alteraremail(id);
                                      break;
                                    case 3:
                                        Contacto.alterarnumtele(id);
                                        Contacto.alteraremail(id);
                                      break;
                                    default:
                                        System.out.println("Opção inválida.");
                                  }

                            }
                        }
                        else{
                            System.out.println("Resposta inválida, por favor tente novamente.");
                            break;
                        }
                    }
                    
                    break;
                case 3:
                    if (Contacto.lista_contactos.size() == 0) {
                        System.out.println("Não existem contactos para apagar.");
                        break;
                    }
                    else{
                        System.out.print("Pesquisar o contacto para remover por número (s/n)\nSe a resposta for n, então pesquisar por nome.\n Resposta: ");
                        String resposta = sc.next();

                        if(resposta.equals("s")){
                            System.out.print("Insira o número de telemóvel do contacto a remover: ");
                            int numero = sc.nextInt();
                            int counter = 0;
                            for(int i=0; i<Contacto.lista_contactos.size(); i++){
                                if(Contacto.lista_contactos.get(i).getTelemovel() == numero){
                                    System.out.println("ID: " + Contacto.lista_contactos.get(i).getId()+" - "+Contacto.lista_contactos.get(i).getPessoa().getNome());
                                    counter++;
                                }
                            }
                            if (counter == 0){
                                System.out.println("Não existem contactos com esse número de telemóvel.");
                                break;
                            }
                            else{
                                System.out.print("Insira o ID do número de telemóvel que deseja alterar: ");
                                int id = sc.nextInt();

                                for(int i=0; i<Contacto.lista_contactos.size(); i++){
                                    if(Contacto.lista_contactos.get(i).getId() == id){
                                        Contacto.removecontacto(Contacto.lista_contactos.get(i));
                                        System.out.println("Contacto removido com sucesso!");
                                        break;
                                    }
                                }

                            }
                        }

                        else if(resposta.equals("n")){
                            System.out.print("Insira o nome do contacto a remover: ");
                            String nome = sc.nextLine();
                            int counter = 0;

                            for(int i=0; i<Contacto.lista_contactos.size(); i++){
                                if(Contacto.lista_contactos.get(i).getPessoa().getNome().equals(nome)){
                                    System.out.println("ID: " + Contacto.lista_contactos.get(i).getId()+" - "+Contacto.lista_contactos.get(i).getPessoa().getNome());
                                    counter++;
                                }
                            }
                            if(counter == 0){
                                System.out.println("Não existem contactos com esse nome.");
                                break;
                            }
                            else{
                                for(int i=0; i<Contacto.lista_contactos.size(); i++){
                                    if(Contacto.lista_contactos.get(i).getPessoa().getNome().equals(nome)){
                                        Contacto.removecontacto(Contacto.lista_contactos.get(i));
                                        System.out.println("Contacto removido com sucesso!");
                                        break;
                                    }
                                }
                            }
                        }

                        else{
                            System.out.println("Resposta inválida, por favor tente novamente.");
                            break;
                        }

                    }
                    break;
                case 4:
                    if (Contacto.lista_contactos.size() == 0) {
                        System.out.println("Não existem contactos para procurar.");
                        break;
                    }
                    else {
                        System.out.print("Pesquisar o contacto por número (s/n)\nSe a resposta for n, então pesquisar por nome \n Resposta: ");
                        String resposta = sc.next();

                        if(resposta.equals("s")){
                            System.out.print("Insira o número de telemóvel do contacto a procurar: ");
                            int numero = sc.nextInt();
                            for(int i=0; i<Contacto.lista_contactos.size(); i++){
                                if(Contacto.lista_contactos.get(i).getTelemovel() == numero){
                                    System.out.println(Contacto.lista_contactos.get(i).toString());
                                    break;
                                }
                                else{
                                    System.out.println("Não existe nenhum contacto com esse número de telemóvel.");
                                    break;
                                }
                            }
                        }

                        if(resposta.equals("n")){
                            System.out.print("Insira o nome do contacto a procurar: ");
                            String nome =sc.nextLine();
                            for(int i=0; i<Contacto.lista_contactos.size(); i++){
                                if(Contacto.lista_contactos.get(i).getPessoa().getNome().equals(nome)){
                                    System.out.println(Contacto.lista_contactos.get(i).toString());
                                    break;
                                }
                                else{
                                    System.out.println("Não existe nenhum contacto com esse nome.");
                                    break;
                                }
                            }
                        }
                        else{
                            System.out.println("Resposta inválida, por favor tente novamente.");
                            break;
                        }
                    }
                    break;
                case 5:
                    if (Contacto.lista_contactos.size() == 0) {
                        System.out.println("Não existem contactos para listar.");
                        break;
                    }

                    for (int i = 0; i < Contacto.lista_contactos.size(); i++) {
                        System.out.println(Contacto.lista_contactos.get(i).toString());
                    }
                    
                    break;
                case 0:
                    System.out.println("Programa terminado com sucesso.\n\n");
                    break;
                default:
                    System.out.println("Opção inválida, por favor tente novamente.");
                    break;
            }
        }
        sc.close();
    }
}
