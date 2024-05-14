package exercicio_contactos;
import java.time.LocalDate;


public class Contact {
    private int id ;
    static int next_id = 0;
    private String name ;
    private int telemovel;
    private String email;
    private LocalDate data_nascimento;

    public Contact( String name, int telemovel, String email, LocalDate data_nascimento) {
        this.name = name;
        this.telemovel = telemovel;
        this.email = email;
        this.data_nascimento = data_nascimento;
        this.id = next_id++;

    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDate getData_nascimento() {
        return this.data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return 
            " id= " + getId() + " " +
            ", name= " + getName() + " " +
            ", telemovel= " + getTelemovel() + " " +
            ", email= " + getEmail() + " " +
            ", data_nascimento= " + getData_nascimento();
    }
    
    
}
