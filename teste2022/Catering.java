package teste2022;

public class Catering extends Activity {

    public enum Option {
        FULL_MENU,LIGHT_BITES,DRINKS_AND_SNACKS;
    }
    

    private Option option;

    public Catering(Option option, int numero_participantes) {
        super(numero_participantes);
        this.option = option;
    }

    public Option geOption() {
        return this.option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Catering: " + geOption() + super.toString();
    }

    @Override
    public double getPreco() {
        return 25;
    }

}
