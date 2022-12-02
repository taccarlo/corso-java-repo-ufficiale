package esercizio03;

import java.util.HashMap;
import java.util.Map;

public class lorenzo_carta_es03 {

    public static final int ARRAY_SIZE = 100;

    public static int[] randomArray(){
        int a[] = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        return a;
    }

    public static void maxOccurrence(){
        int a[] = new int[ARRAY_SIZE];
        a = randomArray();
        int maxOccurrence = 0;
        int maxOccurrenceIndex = 0;
        int occurrence = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
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
    }

    public static void singleOccurence(){
        Map<Integer, Integer> numbers = new HashMap<>();
        for(int i = 0; i < 10; i++){
            int number = (int) (Math.random() * 10);
            if(numbers.containsKey(number)){
                numbers.put(number, numbers.get(number) + 1);
            } else {
                numbers.put(number, 1);
            }
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
            System.out.println("I 10 numeri casuali :) " + a[i]);
        }
    }

    public static void bubbleSortArray(){
        int a[] = new int[ARRAY_SIZE];
        a = randomArray();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE-1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args){
        maxOccurrence();
        singleOccurence();
        randomNumbers();
        bubbleSortArray();
    }
}
