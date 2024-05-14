package teste2022;
import java.time.LocalDate;
import java.util.*;


public class Event implements IEvent {
    LocalDate data;
    ArrayList<Activity> atividades = new ArrayList<>();

    public Event(LocalDate data) {
        this.data = data;
    }


    public boolean TemCatering() {
        for (Activity activity : atividades) {
            if (activity.getClass()==Catering.class) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Event addActivity(Activity activity) {
        if (activity.getClass()==Catering.class  && TemCatering()==true) {
            return this;
        }
        atividades.add(activity);
        return this;
    }

    @Override
    public LocalDate getDate() {
        return data;
    }

    @Override
    public double totalPrice() {
        double total = 0;
        for (Activity activity : atividades) {
            total += activity.getNumero_participantes()*activity.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Evento em  " + getDate() + " " +
            "Total= " + totalPrice() + "euros." ;
    }

}
