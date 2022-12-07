package esercitazione;

import java.util.Scanner;

public class Algoritmo_dell_amicizia {
    public boolean incipit() {

        return true;

    }

    public void finale() {
        System.out.println("Siete diventati amici :)\n" +
                "Ora hai una persona in più a cui rompere le palle in caso di bisogno, e viceversa");
    }

    public boolean bevanda() {
        Scanner input = new Scanner(System.in);
        System.out.println("E di bere qualcosa di caldo?");
        boolean risposta = input.nextBoolean();

        if(risposta){
            System.out.println("Scegli:\n" +
                    "1. Tè\n" +
                    "2. Caffè\n" +
                    "3. Cioccolata");
            int bevandaScelta = input.nextInt();
            switch (bevandaScelta) {
                case 1:
                    System.out.println("Fatevi sto tè");
                    break;
                case 2:
                    System.out.println("Fatevi sto caffè");
                    break;
                case 3:
                    System.out.println("Fatevi sta cioccolata");
                    break;
            }
            return true;
        }
        return false;
    }

    public void attivita() {
        

    }
}
