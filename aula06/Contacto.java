package aula06;
import java.util.ArrayList;
import java.util.Scanner;


public class Contacto {
    private int id;
    private static int n =1;
    private Pessoa pessoa;
    private int telemovel;
    private String email;

    static ArrayList <Contacto> lista_contactos = new ArrayList<Contacto>();

    public  static void addcontacto(Contacto c){
        lista_contactos.add(c);
        addId();
    }

    public static void addId(){
        lista_contactos.get(lista_contactos.size()-1).setId(n);
        n++;
    }

    public static void removecontacto(Contacto c){
        lista_contactos.remove(c);
    }

    public static void alterarnumtele(int id){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o novo número de telemóvel: ");
        int novo_numero = sc.nextInt();
        if(validarTelemovel(novo_numero)){
            for(int i=0; i<lista_contactos.size(); i++){
                if(lista_contactos.get(i).getId() == id){
                    lista_contactos.get(i).setTelemovel(novo_numero);
                    System.out.println("Contacto alterado com sucesso!");
                    break;
                }
            }
        }
        else{
            System.out.println("Número de telemóvel inserido inválido");
        }
    }

    public static void alteraremail(int id){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o novo e-mail: ");
        String novo_email = sc.next();
        if(validarEmail(novo_email)){
            for(int i=0; i<lista_contactos.size(); i++){
                if(lista_contactos.get(i).getId() == id){
                    lista_contactos.get(i).setEmail(novo_email);
                    System.out.println("Contacto alterado com sucesso!");
                    break;
                }
            }
        }
        else{
            System.out.println("E-mail inserido inválido");
        }
    }


    public static void verificarPessoa(Contacto c){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lista_contactos.size(); i++) {
            if (lista_contactos.get(i).getPessoa() == c.getPessoa()) {
                System.out.println("Já existe esta pessoa na lista! \n");
                System.out.println("Contacto: " + lista_contactos.get(i)) ;
                System.out.print("Inserir novo contacto? (s/n):  ");
                String resposta = sc.next();
                if (resposta.equals("s")) {
                    addcontacto(c);
                    
                    break;
                }
                else{
                    break;
                }
            }
            else{
                addcontacto(c);
                break;
            }
        }
    }


    public Contacto( Pessoa pessoa, int telemovel, String email) {
        if (validarEmail(email) == false) {
            throw new IllegalArgumentException("Email inválido!");
        }
        if (validarTelemovel(telemovel) == false) {
            throw new IllegalArgumentException("Telemóvel inválido!");
        }
        
        this.pessoa = pessoa;
        this.telemovel = telemovel;
        this.email = email;

    }
    public Contacto( Pessoa pessoa, String email) {
        if (validarEmail(email) == false) {
            throw new IllegalArgumentException("Email inválido!");
        }

        this.pessoa = pessoa;
        this.email = email;

    }
    public Contacto( Pessoa pessoa, int telemovel) {

        if (validarTelemovel(telemovel) == false) {
            throw new IllegalArgumentException("Telemóvel inválido!");
        }

        this.pessoa = pessoa;
        this.telemovel = telemovel;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getTelemovel() {
        return this.telemovel;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static ArrayList<Contacto> getLista_contactos() {
        return lista_contactos;
    }
    public static void setLista_contactos(ArrayList<Contacto> lista_contactos) {
        Contacto.lista_contactos = lista_contactos;
    }


    public static boolean validarEmail(String email) {
        if (email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")) {
            return true;
        } else {
            return false;
        }      
    }

    public static boolean validarTelemovel(int numtele) {
        String numero = Integer.toString(numtele);

        if (numero.matches("^9\\d{8}$")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        return "ID: " + getId() + " Contacto: " + getPessoa().toString() + "\nTelemóvel: " + getTelemovel() + " Email: " + getEmail() + "\n";
    }

}


