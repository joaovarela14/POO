package TPRÁTICO;

import java.time.LocalDate;
import java.util.Objects;

public class Booking {
    CampingSpace campingSpace;
    LocalDate data_inicio;
    LocalDate data_fim;

    public Booking(CampingSpace campingSpace, LocalDate data_inicio, LocalDate data_fim) {
        this.campingSpace = campingSpace;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }


    public Booking() {
    }

    public CampingSpace getCampingSpace() {
        return this.campingSpace;
    }

    public void setCampingSpace(CampingSpace campingSpace) {
        this.campingSpace = campingSpace;
    }

    public LocalDate getData_inicio() {
        return this.data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_fim() {
        return this.data_fim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Booking)) {
            return false;
        }
        Booking booking = (Booking) o;
        return Objects.equals(campingSpace, booking.campingSpace) && Objects.equals(data_inicio, booking.data_inicio) && Objects.equals(data_fim, booking.data_fim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campingSpace, data_inicio, data_fim);
    }

    @Override
    public String toString() {
        return "{" +
            " campingSpace='" + getCampingSpace() + "'" +
            ", data_inicio='" + getData_inicio() + "'" +
            ", data_fim='" + getData_fim() + "'" +
            "}";
    }
    
    
}
