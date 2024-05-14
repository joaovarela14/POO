package aula05;
import util.userinput;

class Calendario{
    private int firstWeekdayOfYear, year;
    private int[][] events;
    private String[] meses = { "January", "February", "March", "April", "May", "June", "July", "August",
    "September", "October", "November", "December" };

    public static Calendario create(int firstWeekdayOfYear,int year) {
        if(userinput.estaDentroDoIntervalo(firstWeekdayOfYear, 1, 7) && userinput.intPositivo(year)){
            return new Calendario( firstWeekdayOfYear, year);
        }
        System.out.println("Dados inválidos.");
        return null;
    }

    public Calendario( int firstWeekdayOfYear, int year) {
        this.firstWeekdayOfYear = firstWeekdayOfYear;
        this.year = year;

        events = new int[13][32];

    }

    public int getFirstWeekdayOfYear() {
        return this.firstWeekdayOfYear;
    }

    public void setFirstWeekdayOfYear(int firstWeekdayOfYear) {
        this.firstWeekdayOfYear = firstWeekdayOfYear;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int firstWeekdayOfMonth(int month){
        int firstDay = this.firstWeekdayOfYear;
        for (int i = 1; i <= month;i++) {
            firstDay += DateYMD.monthDays(i, this.year);
        }
        firstDay %= 7;

        if (firstDay==7){
            return 0;
        }
        else{
            return firstDay;
        }

    }


    public void addEvent(DateYMD date){
        int month = date.getMonth();
        int day = date.getDay();
        events[month-1][day-1]++;
    }

    public void removeEvent(DateYMD date){
        int month = date.getMonth();
        int day = date.getDay() ;
        events[month-1][day-1]--;
    }   


    public String PrintMes(int mes,int counter ){
        StringBuilder resposta = new StringBuilder();
        String titulo = String.format("\n%10s %04d\n",meses[mes],year);
        resposta.append(titulo);
        
        resposta.append("Su  Mo  Tu  We  Th  Fr  Sa \n");


        if (counter !=0){
            for (int i = 1; i <= counter; i++) {
                
                resposta.append("    ") ;             
            }
        }

        for (int i = 1; i<=DateYMD.monthDays(mes+1 ,year);i++){
            if(i < 10){
                if(events[mes][i] >= 1){
                    resposta.append("*"+i+" ");
                }else{
                    resposta.append(" "+i+"  ");
                    
                }
            }else{
                if(events[mes][i] >= 1){
                    resposta.append("*"+i+" ");
                }else{
                    resposta.append(i+"  ");
                }
            }

            counter++;

            if (counter>=7){
                counter = 0;
     
                resposta.append("\n");
            }
        }
        resposta.append("\n");
        return resposta.toString();
    }
    
    public String PrintAno(){
        StringBuilder resposta = new StringBuilder();
        int counter = firstWeekdayOfYear-1;

        for (int mes = 0; mes <12;mes++){
            String titulo = String.format("\n%10s %04d\n",meses[mes],year);
            resposta.append(titulo);
            
            resposta.append("Su  Mo  Tu  We  Th  Fr  Sa \n");

            if (counter !=0){
                for (int i = 1; i <= counter; i++) {
                    resposta.append("    ") ;             
                }
            }

            for (int i = 1; i<=DateYMD.monthDays(mes+1 ,year);i++){
                if(i < 10){
                    if(events[mes][i] >= 1){
                        resposta.append("*"+i+" ");
                    }else{
                        resposta.append(" "+i+"  ");
                        
                    }
                }else{
                    if(events[mes][i] >= 1){
                        resposta.append("*"+i+" ");
                    }else{
                        resposta.append(i+"  ");
                    }
                }

                counter++;

                if (counter>=7){
                    counter = 0;
         
                    resposta.append("\n");
                }
            }
            resposta.append("\n");
            
        }
        return resposta.toString();


    }


}
