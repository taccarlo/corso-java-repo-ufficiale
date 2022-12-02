
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class edoardo_ridolfi_es03 {

    public static void main(String[] args) {
        es2();
    }

    /*Leggere un array di interi di 10 posizioni e stampare il numero che
    compare più volte all’interno dell’array, qualora ci siano più numeri che
    compaiano lo stesso numero di volte stampare quello che compare per primo.*/
    public static void es1() {
        int[] array = new int[10];
        int[] occorrenze = new int[10];
        int max = 0;
        int pos = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    occorrenze[i]++;
                }
            }
        }
        for (int i = 0; i < occorrenze.length; i++) {
            if (occorrenze[i] > max) {
                max = occorrenze[i];
                pos = i;
            }
        }
        System.out.println("Il numero che compare più volte è " + array[pos] + " e compare " + max + " volte");
    }

    /*Leggere un array di 10 interi e stampare solo i numeri che appaiono
    nell’array una volta soltanto. Ad esempio se l’array contiene 1, 2, 3, 1, 2, 4  il programma stamperà 3, 4*/
    public static void es2() {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Inserisci un numero: ");
            int n = input.nextInt();
            if (numbers.containsKey(n)) {
                numbers.put(n, numbers.get(n) + 1);
            } else {
                numbers.put(n, 1);
            }
            input.close();
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Il numero " + entry.getKey() + " è presente solo una volta");
            }
        }
    }

    /*Creare un array di interi con 8 posizione e riempirlo con numeri casuali
    compresi tra 1 e 90 senza ripetizioni. Stampare man mano il contenuto dell’array.*/
    public static void es3() {
        int[] array = new int[90];
        boolean[] alreadyUsedRandoms = new boolean[90];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                int rand = 1 + (int) (Math.random() * 90);
                if (!alreadyUsedRandoms[rand - 1]) {
                    array[i] = rand;
                    alreadyUsedRandoms[rand - 1] = true;
                    break;
                }
            }
            System.out.println(array[i]);
        }
    }

    /*Eseguire un bubble sort su un array in input*/
    public static void es4() {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
