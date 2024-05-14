package aula05;

import util.userinput;

public class DateYMD{
    private int day;
    private int month;
    private int year;
    public DateYMD(int day, int month, int year){

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }  

    public static DateYMD create(int day, int month, int year){
        if (!valid(day, month, year)) {
            
            return null;
        }
        return new DateYMD(day, month, year);

    }

    public void setData(int day, int month, int year) {
        if (!valid(day, month, year)) {
            System.out.println("Data inválida.");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public static boolean validMonth(int month){
        if(userinput.estaDentroDoIntervalo(month, 0, 12)==true){
            return true;
        }

        return false;
    }

    public static boolean leapYear(int year){
        return userinput.Bissexto(year);
    }

    public static int monthDays(int month,int year){
        return userinput.dias_mes(month, year);
    }

    public static boolean valid(int day, int month, int year) {
        if(validMonth(month)==false){
            return false;
        }

        if (userinput.intPositivo(day)==false || userinput.intPositivo(month)==false || userinput.intPositivo(year)==false){
            return false;
        }

        if(day>monthDays(month, year)){
            return false;
        }

        return true;
    }

    public void Increment(){
        if (day == userinput.dias_mes(month, year)) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else {
            day++;
        }
        
    }

    public void Decrement(){
        if (day == 1) {
            if (month == 1) {
                month = 12;
                year--;
            } else {
                month--;
            }
            day = userinput.dias_mes(month, year);
        } else {
            day--;
        }
    }
    

}