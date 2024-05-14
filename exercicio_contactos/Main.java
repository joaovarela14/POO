package exercicio_contactos;
import java.util.*;
import java.time.LocalDate;
public class Main {    public static void main(String[] args) {
        ContactManager cm = new ContactManager();
        try {
            cm.load("src//exercicio_contactos//contactos.txt");
            cm.save("src//exercicio_contactos//contactos_meu.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }


    


    Scanner scanner = new Scanner(System.in);

    int opcao = 0;
    do {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Adicionar contato");
        System.out.println("2. Modificar contato");
        System.out.println("3. Apagar contato");
        System.out.println("4. Procurar contato por nome");
        System.out.println("5. Procurar contato por telemóvel");
        System.out.println("6. Procurar contato por e-mail");
        System.out.println("7. Listar contatos");
        System.out.println("8. Listar contatos ordenados por nome");
        System.out.println("9. Listar contatos ordenados por telemóvel");
        System.out.println("10. Listar contatos ordenados por e-mail");
        System.out.println("11. Listar contatos ordenados por data de nascimento");
        System.out.println("12. Fechar");

        System.out.print("\nEscolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch(opcao){
            case 1:
                System.out.println("\n--- ADICIONAR CONTATO ---");
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Telemóvel: ");
                int telemovel = scanner.nextInt();
                scanner.nextLine();
                System.out.print("E-mail: ");
                String email = scanner.nextLine();
                System.out.print("Data de nascimento (AAAA-MM-DD): ");
                LocalDate data_nascimento = LocalDate.parse(scanner.nextLine());
                Contact c = new Contact(nome, telemovel, email, data_nascimento);
                cm.addContact(c);
                break;
            case 2:
                System.out.println("\n--- MODIFICAR CONTATO ---");
                System.out.print("ID do contato: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                System.out.print("Telemóvel: ");
                telemovel = scanner.nextInt();
                scanner.nextLine();
                System.out.print("E-mail: ");
                email = scanner.nextLine();
                System.out.print("Data de nascimento (AAAA-MM-DD): ");
                data_nascimento = LocalDate.parse(scanner.nextLine());
                // cm.updateContact(id, nome, telemovel, email, data_nascimento);
                break;
            case 3:
                System.out.println("\n--- APAGAR CONTATO ---");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                System.out.print("Telemóvel: ");
                telemovel = scanner.nextInt();
                scanner.nextLine();
                System.out.print("E-mail: ");
                email = scanner.nextLine();
                System.out.print("Data de nascimento (AAAA-MM-DD): ");
                data_nascimento = LocalDate.parse(scanner.nextLine());
                Contact c2 = new Contact(nome, telemovel, email, data_nascimento);
                cm.removeContact(c2);
                break;
            case 4:
                System.out.println("\n--- PROCURAR CONTATO POR NOME ---");
                System.out.print("Nome: ");
                nome = scanner.nextLine();
                cm.searchContactByName(nome);
                break;
            case 5:
                System.out.println("\n--- PROCURAR CONTATO POR TELEMÓVEL ---");
                System.out.print("Telemóvel: ");
                telemovel = scanner.nextInt();
                scanner.nextLine();
                String telemovelString = String.valueOf(telemovel);
                if (!cm.validatePhoneNumber(telemovelString)) {
                    System.out.println("Número de telemóvel inválido!");
                }
                else{
                    cm.searchContactByPhoneNumber(telemovel);}
                break;
            case 6:
                System.out.println("\n--- PROCURAR CONTATO POR E-MAIL ---");
                System.out.print("E-mail: ");
                email = scanner.nextLine();
                if (!cm.validateEmail(email)) {
                    System.out.println("E-mail inválido!");
                }
                else{
                    cm.searchContactByEmail(email);}
                
                break;
            case 7:
                System.out.println("\n--- LISTAR CONTATOS ---");
                cm.listAllContacts();
                break;
            case 8:
                System.out.println("\n--- LISTAR CONTATOS ORDENADOS POR NOME ---");
                cm.listContactsByName();
                break;
            case 9:
                System.out.println("\n--- LISTAR CONTATOS ORDENADOS POR TELEMÓVEL ---");
                cm.listContactsByPhoneNumber();
                break;
            case 10:
                System.out.println("\n--- LISTAR CONTATOS ORDENADOS POR E-MAIL ---");
                cm.listContactsByEmail();
                break;
            
            case 11:
                System.out.println("\n--- LISTAR CONTATOS ORDENADOS POR DATA DE NASCIMENTO ---");
                cm.listContactsByBirthDate();
                break;
            case 12:
                System.out.println("\n--- FECHAR ---");
                break;
        }
    
    }

    while (opcao != 12);

    scanner.close();

    
    }

}


