package teste2022;

public class Sport extends Activity{

    public enum Modality{
        KAYAK, HIKING, BIKE, BOWLING;
    }

    private Modality modality;

    public Sport(Modality modality, int numero_participantes) {
        super(numero_participantes);
        this.modality = modality;
    }

    public Modality getModality() {
        return this.modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "Sport: " + getModality() + super.toString();
    }

    @Override
    public double getPreco() {
        return 30;
    }

    
}
