package teste2022;

public class Culture extends Activity {

    private Option option;

    public enum Option {
        ART_MUSEUM,ARCHITECTURAL_TOUR,RIVER_TOUR,WINE_TASTING;
    }

    public Culture(Option option, int numero_participantes) {
        super(numero_participantes);
        this.option = option;
    }


    public Option getOption() {
        return this.option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Culture: " + getOption() + super.toString();
    }

    @Override
    public double getPreco() {
        return 22;
    }

    
    

}
