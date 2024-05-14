package aula09;

import java.util.*;

public class CollectionTester {
    final static int[] DIM = {1000, 5000, 10000, 20000, 40000, 100000};
    public static void main(String[] args) {
        System.out.println("\n_________________________________________________________________________________");
        System.out.print("Collection");


        for(int i : DIM){
            System.out.print("\t" + i);
        }

        System.out.println();

        print(new ArrayList<>());
        print(new LinkedList<>());
        print(new HashSet<>());
        print(new TreeSet<>());
        System.out.println("\n_________________________________________________________________________________");
        
    }

    private static void print(Collection<Integer> colS){

        double[][] p = new double[3][6];
        double[] t = new double[3];

        for(int i = 0; i<6; i++){
            t = checkPerformance(colS, DIM[i]);
            p[0][i] = t[0];
            p[1][i] = t[1];
            p[2][i] = t[2];

        }

        System.out.println("\n" + colS.getClass().getSimpleName());
        System.out.print("add:\t\t");
        for(int i = 0; i<6; i++){
            System.out.printf("%.2f\t", p[0][i]);
        }
        System.out.println("");
        System.out.print("search:\t\t");
        for(int i = 0; i<6; i++){
            System.out.printf("%.2f\t", p[1][i]);
        }
        System.out.println("");
        System.out.print("remove:\t\t");
        for(int i = 0; i<6; i++){
            System.out.printf("%.2f\t", p[2][i]);
        }
        System.out.println();
    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, delta;
        // Add

        double[] list = new double[3]; 

        start = System.nanoTime(); // clock snapshot before

        for(int i=0; i<DIM; i++ ){
            col.add( i );
        }
        
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert to milliseconds
        // System.out.println(col.size()+ ": Add to "+col.getClass().getSimpleName() +" took "+ delta+ "ms"); //Search
        
        list[0] = delta;

        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
            if (!col.contains(n))
                System.out.println(n + " - Não encontrado");
        }

        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        // System.out.println(col.size()+ ": Search to "+ col.getClass().getSimpleName() +" took "+ delta+ "ms");// Remove
        
        list[1] = delta;

        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        // System.out.println(col.size() + ": Remove from "+ col.getClass().getSimpleName() +" took "+ delta+ "ms");
        
        list[2] = delta;

        return list;
    }
}