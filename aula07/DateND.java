package aula07;

public class DateND extends Date {

    private int daysSince2000;

    // método create
    public static DateND create(DateAMD date) {
        if (date == null) {
            return null;
        }
        return new DateND(Date.daysSince2000(date));
    }

    // construtor
    public DateND(int daysSince2000) {
        this.daysSince2000 = daysSince2000;
    }

    // métodos get
    public int getDay() {
        DateAMD date = new DateAMD(1, 1, 2000);
        if (daysSince2000 > 0) {
            for (int i = 0; i < daysSince2000; i++){
                date.Increment();
            }
            
        } else {
            for (int i = 0; i < -daysSince2000; i++){
                date.Decrement();
            }
           
        }
        return date.getDay();
    }

    public int getMonth() {
        DateAMD date = new DateAMD(1, 1, 2000);
        if (daysSince2000 > 0) {
            for (int i = 0; i < daysSince2000; i++){
                date.Increment();
            }

            
        } else {
            for (int i = 0; i < -daysSince2000; i++){
                date.Decrement();
            }
        }
        return date.getMonth();
    }

    public int getYear() {
        DateAMD date = new DateAMD(1, 1, 2000);
        if (daysSince2000 > 0) {
            for (int i = 0; i < daysSince2000; i++){
                date.Increment();
            }
        } else {
            for (int i = 0; i < -daysSince2000; i++){
                date.Decrement();
            }
        }
        return date.getYear();
    }

    @Override
    public void setData(int day, int month, int year) {
        if (Date.valid(day, month, year)) {
            daysSince2000 = Date.daysSince2000(DateAMD.create(day, month, year));
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    @Override
    public String toString() {
        return String.format(" %d dias", daysSince2000);
    }
}
