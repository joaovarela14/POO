package aula11;
import java.util.*;

public class SimpleGradeCalculator implements IGradeCalculator {

    public double calculate(List<Double> grades) {
        double soma = 0;
        for (Double grade : grades) {
            soma += grade;
        }
        return soma / 3;

    }

}
