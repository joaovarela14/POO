package aula06;
import java.time.LocalDate;

import aula05.DateYMD;

public class Aluno extends Pessoa{
    private DateYMD DataInsc;
    private static int n = 100;
    private int NMec;

    //NO CASO DE NÃO SER DADA DATA DE INSCRIÇÃO - UTILIZAÇÃO DA DATA ATUAL
    Aluno(String nome, int cc, DateYMD dataNasc){
        super(nome, cc, dataNasc);
        setNMec(n);
        n++;
        
        LocalDate today = LocalDate.now();

        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();
        DataInsc = new DateYMD(day, month, year);
    }
    
    Aluno(String nome, int cc, DateYMD dataNasc, DateYMD datainsc){
        super(nome, cc, dataNasc);
        setNMec(n);
        n++;
        DataInsc = datainsc;
    }

    public DateYMD getDataInsc() {
        return this.DataInsc;
    }

    public void setDataInsc(DateYMD DataInsc) {
        this.DataInsc = DataInsc;
    }

    public int getNMec() {
        return this.NMec;
    }

    public void setNMec(int NMec) {
        this.NMec = NMec;
    }
    
    @Override
    public String toString() {
        ///Adicionei o print da DataInsc para testar se estava a dar para colocar datas manualmente
        return getNome() + "; CC: " + getCc()+ "; Data de Nascimento: " + getDataNasc() + "; Data de inscrição: " +
         getDataInsc() +"; Núm mecanográfico: " + getNMec();
    
}
}