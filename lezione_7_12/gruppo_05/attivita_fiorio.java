package lezione_7_12.gruppo_05;

import java.util.Scanner;

public class attivita_fiorio {
    System.out.println("cos' altro ti va di fare?");
    Scanner input = new Scanner(System.in);
    // not used
    input.nextLine();
    int n = 0;
    while(n<=6)
    {
        System.out.println("è una cosa che va di fare anche a te?");
        boolean a = input.nextBoolean();
        if (a) {
            System.out.println("Scegli fra tutte le opzioni quella che ti sembra essere la meno disumana \n " +
                    "fattela piacere");
            break;
        }
        n++;
    }if(n<=6)System.out.println("E facciamolo insieme dai");
}}
