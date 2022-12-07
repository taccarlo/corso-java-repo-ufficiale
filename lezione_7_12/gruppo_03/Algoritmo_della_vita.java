package lezione_7_12.gruppo_03;

import org.omg.CORBA.SystemException;

public class Algoritmo_della_vita {

    public static void funzione01() {
        // Inizio vita
        System.out.println("Il bro è nato!");
        System.out.println("Il bro segue le elementari e le medie!");
        int n_bocciature = 0;
        int anno_superiori = 1;
        while (true) {
            System.out.println("Il bro è al " + anno_superiori + " anno delle superiori");
            int roll_bocciatura = (int) (Math.random() * 100);
            if (roll_bocciatura <= 40) {
                n_bocciature++;
                System.out.println("Il bro è bocciato! Numero di bocciature: " + n_bocciature);
            } else {
                System.out.println("Il bro ha superato il " + (anno_superiori + 1) + " anno!");
                anno_superiori++;
            }
            if (n_bocciature >= 3) {
                System.out.println("Il bro è stata bocciato troppe volte e non può proseguire gli studi!");
                break;
            }
            if (anno_superiori == 5) {
                System.out.println("Il bro ha superato gli studi superiori!");
                break;
            }
        }
        funzione02();
    }

    public static void funzione02() {
        // Lavoro
        System.out.println("Il bro è stato assunto");
        int roll_infortunio = (int) (Math.random() * 100);
        int n = 0;
        boolean infortunio = false;
        while (n >= 20) {
            if (roll_infortunio <= 20) {
                System.out.println("Il bro è in ospedale, speriamo starà meglio");
                infortunio = true;
                break;
            }
        }
        if(!infortunio){
            System.out.println("Il bro è sopravvissuto");
            funzione03(false);
        } else {
            funzione03(true);
        }
    }

    public static void funzione03(boolean infortunio) {
        if (infortunio) {
            System.out.println("Il bro è stato infortunato, non può più lavorare");
            return;
        } else {
            int roll_promozione = (int) (Math.random() * 100);
            int n_promozioni = 0;
            int n = 0;
            while (n >= 20) {
                if (roll_promozione <= 20) {
                    n_promozioni++;
                    System.out.println("Il bro è stato promosso!");
                }
                n++;
            }
            if (n_promozioni > 3) {
                System.out.println("BRAVOOOO sei diventato capo di azienda");
            } else {
                System.out.println("Il bro è andato in pensione!");
            }
        }
    }

    public static void main(String args[]) {
        funzione01();
    }
}
