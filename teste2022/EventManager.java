package teste2022;
import java.util.*;
import java.time.LocalDate;

public class EventManager {

    private Map<Client,Event> eventos = new HashMap<>();


    private String nome;


    public EventManager() {
    }

    public EventManager(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Client addClient(String nome, String localidade){
        Client client = new Client(nome, localidade);
        return  client;
    }

    public Event addEvent(Client client, LocalDate data){
        Event event = new Event(data);
        eventos.put(client, event);
        return event;

    }

    public String listClients(){
        String texto = "\nClients: \n";
        for (Client client : eventos.keySet()) {
            texto += client + "\n";
        }

        return texto;

    }

    public String listEvents(){
        String texto = "Events: \n";
        for (Event event : eventos.values()) {
            texto += "*** " + event + "\n";
            for (Activity activity : event.atividades) {
                texto += "\t" + activity + "\n";
            }

            texto += "\n";
        }

        return texto;
    }


    public ArrayList<String>  getClientsWithEvents(){
        ArrayList<String> clients = new ArrayList<>();
        for (Client client : eventos.keySet()) {
            if (eventos.get(client).atividades.size() > 0){
                clients.add(client.toString());
            }
        }

        return clients;
    }

    public ArrayList<String> getNextEventsByDate(){

        ArrayList<String> eventos = new ArrayList<>();

        for (Event event : this.eventos.values()) {
            eventos.add(event.toString());
        }

        Collections.sort(eventos);

        return eventos;
    
    }



    @Override
    public String toString() {
        return 
            " Nome= " + getNome();
    }
}