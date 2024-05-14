package aula11;
import java.util.*;
import java.io.*;


public class Gradebook {
    private Map<String, List<Double>> mapa_alunos = new TreeMap<>();

    public void load (String filename) throws FileNotFoundException, IOException{
        String name = "src//aula11//" + filename;
        BufferedReader input = new BufferedReader(new FileReader(name));
        String linha = input.readLine();
        while (linha != null) {

            String nome_aluno = linha.split("\\|")[0];
            Double nota1 = Double.parseDouble(linha.split("\\|")[1]);
            Double nota2 = Double.parseDouble(linha.split("\\|")[2]);
            Double nota3 = Double.parseDouble(linha.split("\\|")[3]);

            ArrayList<Double> notas = new ArrayList<>();
            notas.add(nota1);
            notas.add(nota2);
            notas.add(nota3);

            mapa_alunos.put(nome_aluno, notas);

            linha = input.readLine();
        }
    input.close();
    }

    public void addStudent(Student student){
        mapa_alunos.put(student.getName(), student.getGrades());
    }

    public void removeStudent(String name){
        mapa_alunos.remove(name);
    }

    public Student getStudent(String name){
        return new Student(name, mapa_alunos.get(name));
    }

    public double calculateAverageGrade(String name){
        SimpleGradeCalculator simpleGradeCalculator = new SimpleGradeCalculator();
        double média = simpleGradeCalculator.calculate(mapa_alunos.get(name));
        return Math.round(média * 100.0) / 100.0;
    }

    public void printAllStudents(){
        mapa_alunos.forEach((k,v) -> System.out.println(k + " : " + v));
    }
    
}
