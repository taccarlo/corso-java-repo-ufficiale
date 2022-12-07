import java.util.Scanner;

public class bevanda {
    Scanner input = new Scanner(System.in);
    System.out.println("E di bere qualcosa di caldo?");
    boolean risposta = input.nextBoolean();

    if (risposta) {
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