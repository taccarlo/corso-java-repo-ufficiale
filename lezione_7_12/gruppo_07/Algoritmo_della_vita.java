import java.util.Scanner;

public class Algoritmo_della_vita {
    public static void main(String[] args) {
        funzione1();
        //funzione2();
    }

    private static void funzione1() {
        int n_bocciature=0;
        int anno_superiori=1;
        boolean bocciato=false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sei nato!");
        System.out.println("hai fatto le scuole elementari e medie");

        for (int i=0;i<5;i++){

            System.out.println("Anno di superiori numero" + anno_superiori);
            System.out.println("Sei stato bocciato? (true/false)");
            bocciato = sc.nextBoolean()
            if (bocciato==true){
                n_bocciature++;
            }
            if (n_bocciature>3){
                funzione2();
            }
            if (anno_superiori==5)
                funzione2();
        }

    }
    private static void funzione2() {
        int anno=1;
        boolean infortunio=false;
        Scanner sc = new Scanner(System.in);
        
        while (anno <= 20 && infortunio == false){
            System.out.println("anno di lavoro num: " + anno);
            System.out.println("hai subito un infortunio debilitante? (true/false)");
            infortunio = sc.nextBoolean();
            anno++;
        }
        if(infortunio == true){
            System.out.println("Vai in pensione dopo " + anno + " anni di lavoro per un infortunio debilitante");
        }else {
            System.out.println("hai completato 20 anni di lavoro");
            funzione3();
        }
        
    }

    private static void funzione3() {
        int promozioni=0;
        System.out.println("Quante promoioni hai ricevuto?");
        Scanner sc = new Scanner(System.in);
        promozioni = sc.nextInt();
        if(promozioni>3) {
            System.out.println("Congratulazioni sei diventato il capo dell'azienda");
            System.out.println("Puoi andare in pensione");
        }else {
            System.out.println("Durante la tua cariera hai ricevuto " + promozioni + "promozioni non sei diventato il capo dell'azienda");
            System.out.println("Puoi andare in pensione");
        }
    }
}