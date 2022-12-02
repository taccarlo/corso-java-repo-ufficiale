import java.util.Scanner;

public class edoardo_ridolfi_es02 {

    /*Memorizzare in un array di dieci posizioni i primi dieci numeri naturali.*/
    public static void e1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    /*Dopo aver letto e memorizzato 8 numeri in un array, calcolare la somma di
    quelli negativi e memorizzare zero al loro posto.*/
    public static void e2() {
        int[] array = new int[8];
        int somma = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] < 0) {
                somma += array[i];
                array[i] = 0;
            }
        }
        input.close();
        System.out.println("La somma è " + somma);
    }

    /*Leggere un array di interi di 5 posizioni e dopo averlo letto cercare al
    suo interno il massimo e scrivere il massimo e la posizione della cella in
    cui è memorizzato.*/
    public static void e3() {
        int[] array = new int[5];
        int max = Integer.MIN_VALUE;
        int pos = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                pos = i;
            }
        }
        System.out.println("Il massimo è " + max + " e si trova in posizione " + pos);
    }

    /*Leggere un array di interi di 10 posizioni e dire se in tutte le posizioni
    pari dell’array è memorizzato un numero pari.*/
    public static void e4() {
        int[] array = new int[10];
        boolean pari = true;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                pari = false;
                break;
            }
        }
        System.out.println("Nelle posizioni pari " + (pari ? "" : "non ") + "ci sono solo numeri pari");
    }

}