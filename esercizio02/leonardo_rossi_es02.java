package esercizio02;

import java.util.Scanner;

public class leonardo_rossi_es02 {

    public static void main(String[] args) {
        esercizio2();
    }


     // Memorizzare in un array di dieci posizioni i primi dieci numeri naturali.
     public static void esercizio1(){
        int a[] = new int[10]; 
        for(int i=0; i<10; i++){
            a[i] = i;  
        }
    }

    // Dopo aver letto e memorizzato 8 numeri in un array, calcolare la somma di 
    // quelli negativi e memorizzare zero al loro posto.

    public static void esercizio2(){
        int a[] = new int[8]; 
        System.out.println("inserisci 8 numeri");
        Scanner tastiera = new Scanner (System.in);           
        for(int i=0; i<8; i++){
            a[i] = tastiera.nextInt();   
            if(a[i]<0){
                a[i] = 0; 
            }
        }       
       
    }

    // Leggere un array di interi di 5 posizioni e dopo averlo letto cercare al 
    // suo interno il massimo e scrivere il massimo e la posizione della cella in 
    // cui è memorizzato.

    // Leggere un array di interi di 10 posizioni e dire se in tutte le posizioni 
    // pari dell’array è memorizzato un numero pari. 
}
