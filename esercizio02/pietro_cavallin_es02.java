import java.util.Scanner;

public class pietro_cavallin_es02 {
    public static void main(String[] args)
    {
        esercizio01();
        esercizio02();
        esercizio03();
        esercizio04();
    }

    /**
     Memorizzare in un array di dieci posizioni i primi dieci numeri naturali.
     */
    private static void esercizio01() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
    }

    /**
     Dopo aver letto e memorizzato 8 numeri in un array,
     calcolare la somma di quelli negativi e memorizzare zero al loro posto.
     */
    private static void esercizio02() {
        int[] a = new int[8];
        int sum = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Inserisci un numero (anche negativo): ");
            a[i] = input.nextInt();
            if (a[i] < 0) {
                sum += a[i];
                a[i] = 0;
            }
        }
        System.out.println("La somma dei numeri negativi è: " + sum);
        input.close();
    }

    /**
     Leggere un array di interi di 5 posizioni e dopo averlo letto
     cercare al suo interno il massimo
     e scrivere il massimo e la posizione della cella in cui è memorizzato.
     */
    public static void esercizio03() {
        int[] a = new int[10];
        int max = 0;
        int maxIndex = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero: ");
            a[i] = input.nextInt();
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        System.out.println("Il valore massimo è: " + max + " e si trova in posizione: " + maxIndex);
        input.close();
    }

    /**
     Leggere un array di interi di 10 posizioni
     e dire se in tutte le posizioni pari dell’array è memorizzato un numero pari.
     */
    public static void esercizio04() {
        int[] a = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero: ");
            a[i] = input.nextInt();
            if (a[i] % 2 == 0 && i % 2 == 0) {
                System.out.println("Il numero " + a[i] + " in posizione " + i + " è pari e si trova in una posizione pari");
            }
        }
        input.close();
    }
}
