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
    
        return true;
    }

    public void attivita() {
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
}
