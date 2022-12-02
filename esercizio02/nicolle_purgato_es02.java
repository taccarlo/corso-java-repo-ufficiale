package esercizio02;
import java.util.Scanner;

public class nicolle_purgato_es02 {
    
    static void esercizio1(){
        int[] array = new int[10] ;
        for(int i=0; i<10; i++){
            array[i]=i;
        }
    }


    public static void esercizio2() {
        int array[] = new int[8];
        int somma = 0;
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Inserisci un numero: ");
            array[i] = tastiera.nextInt();
            if (array[i] < 0) {
                somma += array[i];
                array[i] = 0;
            }
        }
        System.out.println("La somma dei numeri negativi è: " + somma);
        tastiera.close();
    }

    public static void esercizio3() {
        int array[]= {0, 13, 62, -8, -12};
        int max = 0;
        int posizione = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                posizione = i;
            }
         }

         System.out.println("Il numero massimo è: " + max + " " + "e la sua posizione è': "+ posizione);
            
        }
    
        public static void esercizio4(){
            int array[] = new int[10];
            Scanner tastiera = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.println("Inserisci un numero: ");
                array[i] = tastiera.nextInt();
                if (array[i] % 2 == 0 && i % 2 == 0) {
                    System.out.println("Il numero " + array[i] + " in posizione " + i + " è pari e si trova in una posizione pari");
                }
            }
        }

        public static void main(String[] args) {
            esercizio1();
            esercizio2();
            esercizio3();
            esercizio4();
        }
}
