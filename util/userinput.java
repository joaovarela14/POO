package util;

public class userinput {
    public static boolean isPrime(int n) {
    if (n<=1){
        return false;
    }
    for (int i=2;i<n;i++){
        if(n%i == 0){
            return false;
        }
    }
    return true;       
    }

    public static boolean doublePositivo(double n){
        if (n>0) {
            return true;
        }
        return false;

    }


    public static boolean intPositivo(int n){
        if (n>0) {
            return true;
        }
        return false;

    }
    public static boolean Bissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaDentroDoIntervalo(int numero, int inferior, int superior) {
        return numero >= inferior && numero <= superior;
    }


    public static int contarDigitosNaString(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int contarEspaçosNaString(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int dias_mes(int mes,int ano){
        int dias_mes = 0;
        if (mes==2){
            if (userinput.Bissexto(ano)==true){
                dias_mes = 29;
            }
            else{
                dias_mes = 28;
            }
        }
        else if((mes == 4 || mes == 6 || mes == 9 || mes == 11)){
                dias_mes = 30;
            }
        else{
            dias_mes = 31;
        }

        return dias_mes;
    }

    public static void AumentarData(int day,int month,int year){
        if (day == dias_mes(month, year)) {
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

    public static void DiminuirData(int day,int month,int year){
        if (day == 1) {
            if (month == 1) {
                month = 12;
                year--;
            } else {
                month--;
            }
            day = dias_mes(month, year);
        } else {
            day--;
        }
    }
    
    public static boolean validarEmail(String email) {
        String regex = "^(.+)@(.+)$";
        return email.matches(regex);
    }


    public static boolean validarNumeroTelemovel(int numero) {
        String regex = "^(9)[0-9]{8}$";
        return String.valueOf(numero).matches(regex);

    }
}
