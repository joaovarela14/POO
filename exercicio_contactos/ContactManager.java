package exercicio_contactos;
import java.io.FileReader;
import java.util.*;
import java.time.LocalDate;
import java.io.*;
import java.util.Set;
import util.userinput;



public class ContactManager implements ContactManagerInterface {

    private Set<Contact> contacts = new HashSet<Contact>();

    public void load(String filePath) {
        
        try {
            Scanner sc = new Scanner(new FileReader(filePath));


            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                //separa a linha por tabs e espaços
                String[] parts = line.split("\t|\\s+");
                
                String nome = parts[0] + " " + parts[1];
                int telemovel = Integer.parseInt(parts[2]);
                String email = parts[3];
                LocalDate data_nascimento = LocalDate.parse(parts[4]);

                Contact c = new Contact(nome, telemovel, email, data_nascimento);

                contacts.add(c);

            }
            
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }


    }

    public void save(String filePath) {
        //cria um file writer

        try {
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file);

            fw.write("Nome\tTelemovel\tEmail\tData de Nascimento\n");
            for (Contact c : contacts) {
                fw.write(c.toString());
                fw.write("\n");
                
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean validateEmail(String email) {
        String regex = "^(.+)@(.+)$";
        return email.matches(regex);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        int numero = Integer.parseInt(phoneNumber);
        String regex = "^(9)[0-9]{8}$";
        return String.valueOf(numero).matches(regex);
    }

    public boolean addContact(Contact person) {
        return contacts.add(person);
    }

    public boolean removeContact(Contact person) {
        return contacts.remove(person);
    }

    public Contact searchContactByName(String name) {
        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }

        return null;
    }

    public Contact searchContactByEmail(String email) {
        for (Contact c : contacts) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }

        return null;
    }

    public Contact searchContactByPhoneNumber(int phoneNumber) {
        for (Contact c : contacts) {
            if (c.getTelemovel() == phoneNumber) {
                return c;
            }
        }

        return null;
    }

    public void listAllContacts() {
        for (Contact c : contacts) {
            System.out.println(c.toString());
        }
    }

    public void listContactsByName() {
        ArrayList<Contact> lista = new ArrayList<Contact>(contacts);
        Collections.sort(lista, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getName().compareTo(c2.getName());
            }
        });

        System.out.println("Lista de contactos ordenados por nome: ");
        for (Contact c : lista) {
            System.out.println(c.toString());
        }
        System.out.println("\n");

    }

    public void listContactsByPhoneNumber() {
        //cria um arraylist com os nomes dos contactos ordenados por numero de telemovel
        ArrayList<Contact> lista = new ArrayList<Contact>(contacts);
        Collections.sort(lista, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getTelemovel() - c2.getTelemovel();
            }
        });

        System.out.println("Lista de contactos ordenados por numero de telemovel: ");
        for (Contact c : lista) {
            System.out.println(c.toString());
        }
        System.out.println("\n");
    }

    public void listContactsByBirthDate() {
        //cria um arraylist com os nomes dos contactos ordenados por data de nascimento
        ArrayList<Contact> lista = new ArrayList<Contact>(contacts);
        Collections.sort(lista, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getData_nascimento().compareTo(c2.getData_nascimento());
            }
        });

        System.out.println("Lista de contactos ordenados por data de nascimento: ");
        for (Contact c : lista) {
            System.out.println(c.toString());
        }
        System.out.println("\n");
    }

    public void listContactsByEmail() {
        //cria um arraylist com os nomes dos contactos ordenados por email
        ArrayList<Contact> lista = new ArrayList<Contact>(contacts);
        Collections.sort(lista, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getEmail().compareTo(c2.getEmail());
            }
        });

        System.out.println("Lista de contactos ordenados por email: ");
        for (Contact c : lista) {
            System.out.println(c.toString());
        }
        System.out.println("\n");
    }


    
}
