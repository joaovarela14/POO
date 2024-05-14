package TPRÁTICO;
import java.util.*;
import java.util.Objects;

import java.time.LocalDate;

public class CampingService implements CampingServiceInterface {
    private String nome;
    private String endereco;
    private List<Client> clients = new ArrayList<Client>();
    private List<CampingSpace> espaços_campismo = new ArrayList<CampingSpace>();

    private Map<Booking, Client> reservas_cliente = new HashMap<Booking, Client>();

    public CampingService(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CampingService)) {
            return false;
        }
        CampingService campingService = (CampingService) o;
        return Objects.equals(nome, campingService.nome) && Objects.equals(endereco, campingService.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco);
    }

    @Override
    public String toString() {
        return " nome= " + getNome() + " " +
            ", endereco= " + getEndereco();
    }

    public boolean registerClient(int taxId, String name, ClientType type) {
        Client client = new Client(taxId, name, type);
        if (clients.contains(client)) {
            return false;
        }
        clients.add(client);
        return true;

    }

    public void addCampingSpace(CampingSpace campingSpace) {
        espaços_campismo.add(campingSpace);
    }

    public void addCampingSpaces(Collection<CampingSpace> campingSpaces) {
        espaços_campismo.addAll(campingSpaces);
    }

    public Client getClient(int taxId) {
        for (Client client : clients) {
            if (client.getNumero_contribuinte() == taxId) {
                return client;
            }
        }
        return null;
    }

    public boolean bookCampingSpace(Client client, CampingSpace campingSpace, LocalDate startDate, int duration){
        if (campingSpace.getType() == SpaceType.CARAVAN && client.getTipo_cliente() == ClientType.NORMAL) {
            return false;
        }

        if (duration > campingSpace.getDuracao_maxima_aluguer()){
            return false;
        }

        if (!checkAvailability(campingSpace, startDate, startDate.plusDays(duration))) {
            return false;
        }

        LocalDate endDate = startDate.plusDays(duration);
        Booking booking = new Booking(campingSpace, startDate, endDate);

        reservas_cliente.put(booking, client);
        return true;

        }

    public boolean checkAvailability(CampingSpace campingSpace, LocalDate startDate, LocalDate endDate) {
        for (Booking booking : reservas_cliente.keySet()) {
            if (booking.getCampingSpace() == campingSpace) {
                if (booking.getData_inicio().isBefore(startDate) && booking.getData_fim().isAfter(startDate)) {
                    return false;
                }
                if (booking.getData_inicio().isBefore(endDate) && booking.getData_fim().isAfter(endDate)) {
                    return false;
                }
                if (booking.getData_inicio().isAfter(startDate) && booking.getData_fim().isBefore(endDate)) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<CampingSpace> findAvailableCampingSpaces(SpaceType spaceType, LocalDate fromDate, int duration, int[] minDimensions) {
        List<CampingSpace> campingSpaces = new ArrayList<CampingSpace>();
        for (CampingSpace campingSpace : espaços_campismo) {
            if (campingSpace.getType() == spaceType && campingSpace.getLargura_comprimento()[0] >= minDimensions[0] && campingSpace.getLargura_comprimento()[1] >= minDimensions[1]) {
                if (checkAvailability(campingSpace, fromDate, fromDate.plusDays(duration))) {
                    campingSpaces.add(campingSpace);
                }
            }
        }
        return campingSpaces;
    }

    public double calculateTotalCost(CampingSpace campingSpace, int duration) {
        return campingSpace.getPreco() * duration;
    }

    public List<String> listBookings() {
        List<String> bookings = new ArrayList<String>();
        for (Booking booking : reservas_cliente.keySet()) {
            bookings.add(booking.toString() + " " + reservas_cliente.get(booking).toString());
        }
        return bookings;
    }

    public List<String> listBookings(SpaceType spaceType) {
        List<String> bookings = new ArrayList<String>();
        for (Booking booking : reservas_cliente.keySet()) {
            if (booking.getCampingSpace().getType() == spaceType) {
                bookings.add(booking.toString() + " " + reservas_cliente.get(booking).toString());
            }
        }
        return bookings;
    }

    public List<String> getAvailableSpacesByTotalArea(LocalDate data_inico, int duracao) {
        List<String> espaços = new ArrayList<String>();
        for (CampingSpace campingSpace : espaços_campismo) {
            int area = campingSpace.getLargura_comprimento()[0] * campingSpace.getLargura_comprimento()[1];
            if (checkAvailability(campingSpace, data_inico, data_inico.plusDays(duracao))) {
                espaços.add(campingSpace.toString() + " " + area);
            }
        }



        return espaços;

}




}

    

