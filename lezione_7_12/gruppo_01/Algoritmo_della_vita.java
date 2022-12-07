import java.util.Scanner;

public class Algoritmo_della_vita {
    public static void main(String[] args) {
        System.out.println("Ops sei nato!");
        scuola();
    }

    public static boolean scuola() {
        System.out.println("Sono stato bullizzato sia alle elementari dalle maestre... anche alle medie! :(");
        System.out.print("Quante volte sei stato bocciato? ");
        Scanner input = new Scanner(System.in);
        int n_bocciature = 0;
        int anno_superiori = 1;

        while (anno_superiori != 6 || n_bocciature == 4) {
            System.out.println(anno_superiori + " " + n_bocciature);
            System.out.println("Seguo il " + anno_superiori + " anno delle superiori");
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
}
