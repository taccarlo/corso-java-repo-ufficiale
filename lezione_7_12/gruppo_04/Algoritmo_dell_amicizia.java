package lezione_7_12.gruppo_04;

import java.util.Scanner;

public class Algoritmo_dell_amicizia {
    public static boolean incipit() {

        System.out.println("Componi il numero della persona");
        Scanner input = new Scanner(System.in);
        String numero = input.nextLine();
        System.out.println("E' in casa?");
        boolean persona = input.nextBoolean();
        if(!persona) {
            System.out.println("Lascia un messaggio \n" +
                    " aspetta di essere richiamato");
        }
        System.out.println("Ti va di mangiare qualcosa insieme??");
        boolean risposta = input.nextBoolean();

        if(risposta){
            System.out.println("Mangiate qualcosa insieme");
        }

        return risposta;

    }

    public static void finale() {
        System.out.println("Siete diventati amici :)\n" +
                "Ora hai una persona in più a cui rompere le palle in caso di bisogno, e viceversa");
    }

    public static boolean bevanda() {
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

    public static void attivita() {
        System.out.println("cos' altro ti va di fare?");
        Scanner input = new Scanner(System.in);
        //not used
        input.nextLine();
        int n = 0;
        while (n<=6){
            System.out.println("è una cosa che va di fare anche a te?");
            boolean a = input.nextBoolean();
            if (a) {
                System.out.println("Scegli fra tutte le opzioni quella che ti sembra essere la meno disumana \n " +
                        "fattela piacere");
                break;
            }
            n++;
        }
        if(n<=6)
            System.out.println("E facciamolo insieme dai");

    }

    public static void main(String[] args) {
        System.out.println(incipit());
        attivita();
    }
}
