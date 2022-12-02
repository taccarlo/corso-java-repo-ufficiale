package esercizio02;

import java.util.Arrays;
import java.util.Scanner;

public class rodley_orosa_es02 {
  public static void main(String[] args) {
    // tenNumbers();
    // sumNegatives();
    // maxNumber();
    positiveNumber();
  }

  public static void tenNumbers() {
    int array[] = new int[10];
    for(int i = 0; i < 10; i++) {
      array[i] = i;
      System.out.print(array[i]);
    }
  }

  public static void sumNegatives() {
    int array[] = new int[8];
    int sum = 0;
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < 8; i++) {
      System.out.println("Aggiungi un numero: ");
      array[i] = input.nextInt();
      if(array[i] < 0) {
        sum += array[i];
        array[i] = 0;
      }
    }
    System.out.println("L'array è " + Arrays.toString(array));
    System.out.println("La somma dei numeri negativi: " + sum);
    input.close();
  }

  public static void maxNumber() {
    int array[] = new int[5];
    int max = 0;
    int maxIndex = 0;
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < 5; i++) {
      System.out.println("Aggiungere un numero: ");
      array[i] = input.nextInt();
      if(array[i] > max) {
        max = array[i];
        maxIndex = i;
      }
    }
    System.out.println("Il numero massimo è: " + max);
    System.out.println("L'array: " + Arrays.toString(array));
    System.out.println("La posizione del numero massimo è: " + maxIndex);
    input.close();
  }

  public static void positiveNumber() {
    int array[] = new int[10];
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < 10; i++) {
      System.out.println("Aggiungere un numero: ");
      array[i] = input.nextInt();
      if(i % 2 == 0) {
        if(array[i] % 2 == 0) {
          System.out.println("Questo numero è pari ed è in posizione pari(posizione " + i + ")");
        }
      }
    }
    input.close();
  }
}