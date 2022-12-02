package esercizio02;

import java.util.Scanner;

public class lorenzo_carta_es02 {

    public static void firstTenNumbers() {
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
    }

    public static void negativeNumbers() {
        int a[] = new int[8];
        int sum = 0;
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Inserisci un numero: ");
            a[i] = tastiera.nextInt();
            if (a[i] < 0) {
                sum += a[i];
                a[i] = 0;
            }
        }
        System.out.println("La somma dei numeri negativi è: " + sum);
        tastiera.close();
    }

    public static void maxValue(){
        int a[] = new int[10];
        int max = 0;
        int maxIndex = 0;
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero: ");
            a[i] = tastiera.nextInt();
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        System.out.println("Il valore massimo è: " + max + " e si trova in posizione: " + maxIndex);
        tastiera.close(); 
    }

    public static void evenNumbersOnEvenIndexes(){
        int a[] = new int[10];
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero: ");
            a[i] = tastiera.nextInt();
            if (a[i] % 2 == 0 && i % 2 == 0) {
                System.out.println("Il numero " + a[i] + " in posizione " + i + " è pari e si trova in una posizione pari");
            }
        }
        tastiera.close(); 
    }


    public static void main(String[] args) {
        firstTenNumbers();
        negativeNumbers();
        maxValue();
        evenNumbersOnEvenIndexes();
    }
}
