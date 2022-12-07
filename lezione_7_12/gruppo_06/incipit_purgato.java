package lezione_7_12.gruppo_06;
import java.util.Scanner;

public class incipit_purgato {
    public boolean incipit(){
        System.out.println("Componi il numero di telefono della persona");
        Scanner input = new Scanner(System.in);
        String numerotel = input.nextLine();
        boolean persona = input.nextBoolean();
        if (!persona){
            System.out.println("Lascia un messaggio, aspetta di essere richiamato");   
        }
            System.out.println("Ti va di mangiare qualcosa insieme?");
            boolean risposta = input.nextBoolean();

        if (risposta){
                System.out.println("Mangiate qualcosa insieme");
        }
        
        return risposta;
        

        

    }
}
