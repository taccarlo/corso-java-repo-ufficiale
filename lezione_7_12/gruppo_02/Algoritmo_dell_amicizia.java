package esercitazione;

import java.util.Scanner;

public class Algoritmo_dell_amicizia {
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

    public void finale() {
        System.out.println("Siete diventati amici :)\n" +
                "Ora hai una persona in più a cui rompere le palle in caso di bisogno, e viceversa");
    }

    public boolean bevanda() {

        return true;
    }

    public void attivita() {


    }
}
