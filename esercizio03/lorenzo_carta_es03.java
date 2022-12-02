package esercizio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lorenzo_carta_es03 {

    public static void maxOccurrence(){
        int a[] = new int[10];
        int maxOccurrence = 0;
        int maxOccurrenceIndex = 0;
        int occurrence = 0;
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero: ");
            a[i] = tastiera.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] == a[j]) {
                    occurrence++;
                }
            }
            if (occurrence > maxOccurrence) {
                maxOccurrence = occurrence;
                maxOccurrenceIndex = i;
            }
            occurrence = 0;
        }
        System.out.println("Il numero che si ripete più volte è: " + a[maxOccurrenceIndex] + " e si ripete " + maxOccurrence + " volte");
        tastiera.close(); 
    }

    public static void singleOccurence(){
        Map<Integer, Integer> numbers = new HashMap<>();
        for(int i = 0; i < 10; i++){
            Scanner tastiera = new Scanner(System.in);
            System.out.println("Inserisci un numero: ");
            int number = tastiera.nextInt();
            if(numbers.containsKey(number)){
                numbers.put(number, numbers.get(number) + 1);
            } else {
                numbers.put(number, 1);
            }
            tastiera.close();
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if(entry.getValue() == 1){
                System.out.println("Il numero " + entry.getKey() + " si ripete una volta");
            }
        }
    }

    public static void randomNumbers(){
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    public static void bubbleSortArray(){
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args){
        maxOccurrence();
        singleOccurence();
        bubbleSortArray();
    }
}
