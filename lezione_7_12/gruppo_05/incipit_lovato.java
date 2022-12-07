package lezione_7_12.gruppo_05;

import java.util.Scanner;

public class incipit_lovato {
    public boolean incipit() {

        System.out.println("Componi il numero della persona");
        Scanner input = new Scanner(System.in);
        String numero = input.nextLine();
        System.out.println("E' in casa?");
        boolean persona = input.nextBoolean();
        if (!persona) {
            System.out.println("Lascia un messaggio \n" +
                    " aspetta di essere richiamato");
        }
        System.out.println("Ti va di mangiare qualcosa insieme?");
        boolean risposta = input.nextBoolean();

        if (risposta) {
            System.out.println("Mangiate qualcosa insieme");
        }

        return risposta;

    }
}