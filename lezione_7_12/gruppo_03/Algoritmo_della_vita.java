package lezione_7_12.gruppo_03;

public class Algoritmo_della_vita {

    public static void funzione01() {
        // Inizio vita
        System.out.println("Il bro è nato!");
        System.out.println("Il bro segue le elementari e le medie!");
        int n_bocciature = 0;
        int anno_superiori = 1;
        while (true) {
            System.out.println("Il bro è al " + anno_superiori + " delle superiori");
            int roll_bocciatura = (int) (Math.random() * 100);
            System.out.println(roll_bocciatura);
            if (roll_bocciatura <= 40) {
                n_bocciature++;
                System.out.println("Il bro è bocciata! Numero di bocciature: " + n_bocciature);
            } else {
                System.out.println("Il bro ha superato il " + (anno_superiori + 1) + " anno!");
                anno_superiori++;
            }
            if (n_bocciature >= 3) {
                System.out.println("Il bro è stata bocciata troppi volte e non può proseguire gli studi!");
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
        System.out.println("Il bro è stato assunto 🤓");
        int roll_infortunio = (int) (Math.random() * 100);
        int n = 0;
        while (n >= 20) {
            if (roll_infortunio <= 20) {
                System.out.println("Il bro è in ospedale, speriamo starà meglio🙏 ");
                funzione03(true);
            }
        }
        System.out.println("Il bro è sopravvissuto 🎉");
        funzione03(false);
    }

    public static void funzione03(boolean infortunio) {

    }

    public static void main(String args[]) {
        funzione01();
    }
}
