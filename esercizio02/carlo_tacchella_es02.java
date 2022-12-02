package esercizio02;

import java.util.Scanner;

public class carlo_tacchella_es02 {

    /**
     *      Memorizzare in un array di dieci posizioni i
     *      primi dieci numeri naturali.
     */
    static void esA(){
        int[] array = new int[10] ;
        for(int i=0; i<10; i++){
            array[i]=i;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }

    /**
     * Dopo aver letto e memorizzato 8 numeri in un array, calcolare la somma di 
     * quelli negativi e memorizzare zero al loro posto.
     */
    static void esB(){
        Scanner input = new Scanner(System.in);
        int[] array = new int[10] ;
        int input_num;
        int sum = 0;
        for(int i=0; i<10; i++){
            System.out.println("Inserire un numero");
            input_num = input.nextInt(); 
            array[i] = input_num >0 ? input_num : 0;
            if(input_num<0){
                sum+=input_num;
            }
        }
        
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("La somma è "+sum);
        input.close();
    }

/**
 * Leggere un array di interi di 5 posizioni e dopo averlo letto cercare al 
 * suo interno il massimo e scrivere il massimo e la posizione della cella in 
 * cui è memorizzato.
 */
    static void esC(){
        Scanner input = new Scanner(System.in);
        final int len = 5;
        int[] array = new int[len] ;
        int input_num;
        int max = array[0];
        int pos = 0;

        for(int i=0; i<len; i++){
            System.out.println("Inserire un numero");
            input_num = input.nextInt(); 
            array[i] = input_num;
            if(input_num>max){
                max=input_num;
                pos = i;
            }
        }
        
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("Il massimo è "+max+" alla postazione "+pos);
        input.close();
    }

/**
 * Leggere un array di interi di 10 posizioni e dire se in tutte le posizioni 
 * pari dell’array è memorizzato un numero pari.
 */
    static void esD(){

        Scanner input = new Scanner(System.in);
        final int len = 10;
        int[] array = new int[len] ;

        for(int i=0; i<len; i++){
            array[i]=input.nextInt();
        }

        for (int i : array) {
            if(array[i]%0==0)
                System.out.println("L'array di posizione "+i+" è un numero pari.");
        }

        input.close();
    }

    public static void main(String[] args) {
        // esA();
        esB();
        // esC();
        // esD();
    }

}
