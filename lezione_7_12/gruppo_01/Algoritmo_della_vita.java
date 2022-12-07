import java.util.Scanner;

public class Algoritmo_della_vita {
    public static void main(String[] args) {
        System.out.println("Ops sei nato!");
        scuola();
        lavoro();
    }

    public static boolean scuola() {
        System.out.println("Sono stato bullizzato sia alle elementari dalle maestre... anche alle medie! :(");
        System.out.print("Quante volte sei stato bocciato? ");
        Scanner input = new Scanner(System.in);
        int n_bocciature = 0;
        int anno_superiori = 1;

        while (anno_superiori != 6 || n_bocciature == 4) {
            System.out.println("Seguo il " + anno_superiori + "° anno delle superiori");
            System.out.print("Sei stato bocciato? 0: NO - 1: SI ");
            int risposta = input.nextInt();
            if (risposta == 0) {
                anno_superiori += 1;
            } else {
                n_bocciature += 1;
            }
        }

        return true;
    }

    public static boolean lavoro() {
        System.out.println("Ho trovato un lavoro.. che schifo!");
        Scanner input = new Scanner(System.in);
        int anno_lavoro = 0;

        while (anno_lavoro != 20) {
            System.out.println("Sono al " + anno_lavoro + "° anno di lavoro, me ne restano " + (20 - anno_lavoro));
            System.out.print("Hai subito un infortunio debilitante? 0: NO - 1: SI ");
            int risposta = input.nextInt();

            if (risposta == 0) {
                anno_lavoro += 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
