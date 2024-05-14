package aula07;
import java.util.Objects;

public class DateAMD extends Date implements Comparable<DateAMD> {
    private int day;
    private int month;
    private int year;

    public DateAMD(int day, int month, int year){
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

    public static DateAMD create(int day, int month, int year){
        if (!valid(day, month, year)) {
            
            return null;
        }
        return new DateAMD(day, month, year);

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
        return String.format("%04d/%02d/%02d", year, month, day);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DateAMD)) {
            return false;
        }
        DateAMD dateAMD = (DateAMD) o;
        return day == dateAMD.day && month == dateAMD.month && year == dateAMD.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public int compareTo(DateAMD o) {
        if (this.year > o.year) {
            return 1;
        } else if (this.year < o.year) {
            return -1;
        } else {
            if (this.month > o.month) {
                return 1;
            } else if (this.month < o.month) {
                return -1;
            } else {
                if (this.day > o.day) {
                    return 1;
                } else if (this.day < o.day) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }




    

}