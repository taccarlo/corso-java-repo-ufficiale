import java.util.Scanner;

public class Algoritmo_della_vita {
    public static void main(String[] args) {
        System.out.println("Ops sei nato!\n");
        scuola();
        if(lavoro()){
            if (ultimi_anni_lavoro()) {
                System.out.println("Sei il presidente mega galattico della federazione internazionale del lavoro pulito!\n");
            } else {
                System.out.println("Hai finito la tua carriera da operaio sfruttato!\n");
            }
        }

        System.out.println("Si va in pensione");
    }

    public static boolean scuola() {
        System.out.println("Sono stato bullizzato alle elementari dalle maestre... anche alle medie! :(\n");
        Scanner input = new Scanner(System.in);
        int n_bocciature = 0;
        int anno_superiori = 1;

        while (anno_superiori != 6 || n_bocciature > 3) {
            System.out.println("Seguo il " + anno_superiori + "' anno delle superiori");
            System.out.print("Sei stato bocciato? 0: NO - 1: SI ");
            int risposta = input.nextInt();
            if (risposta == 0) {
                anno_superiori += 1;
            } else {
                n_bocciature += 1;
            }
        }

        System.out.println("");
        return true;
    }

    public static boolean lavoro() {
        System.out.println("Ho trovato un lavoro.. che schifo!");
        Scanner input = new Scanner(System.in);
        int anno_lavoro = 1;

        while (anno_lavoro < 21) {
            System.out.println("Sono al " + anno_lavoro + "' anno di lavoro, me ne restano " + (20 - anno_lavoro));
            System.out.print("Hai subito un infortunio debilitante? 0: NO - 1: SI ");
            int risposta = input.nextInt();

            if (risposta == 0) {
                anno_lavoro += 1;
            } else {
                System.out.println("Mi disp 🤕 ma anche no godo!");
                return false;
            }
        }

        System.out.println("");
        return true;
    }

    public static boolean ultimi_anni_lavoro() {
        System.out.println("Manca poco ce la possiamo fare!");
        Scanner input = new Scanner(System.in);
        System.out.print("Quante promozioni hai ricevuto? ");
        int promozioni = input.nextInt();

        if (promozioni > 3) {
            System.out.println("");
            return true;
        } else {
            System.out.println("");
            return false;
        }
    }
}
