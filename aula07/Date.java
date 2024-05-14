package aula07;
import util.userinput;

public abstract class Date {
    public abstract int getYear();
    public abstract int getMonth();
    public abstract int getDay();

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
        int day = getDay();
        int month = getMonth();
        int year = getYear();

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

        setData(day, month, year);
        
    }

    public void Decrement(){
        int day = getDay();
        int month = getMonth();
        int year = getYear();


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

        setData(day, month, year);
    }

    public abstract void setData(int day, int month, int year);


    public static int daysSince2000(DateAMD date) {
        int days = 0;
        DateAMD date2000 = new DateAMD(1, 1, 2000);
        if (date.compareTo(date2000) > 0) {
            while (date.compareTo(date2000) > 0) {
                date2000.Increment();
                days++;
            }
        } else {
            while (date.compareTo(date2000) < 0) {
                date2000.Decrement();
                days++;
            }
        }
        return days;
    }

    public int compareTo(Date date) {
        if (getYear() < date.getYear()) {
            return -1;
        } else if (getYear() > date.getYear()) {
            return 1;
        } else {
            if (getMonth() < date.getMonth()) {
                return -1;
            } else if (getMonth() > date.getMonth()) {
                return 1;
            } else {
                if (getDay() < date.getDay()) {
                    return -1;
                } else if (getDay() > date.getDay()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }




}
