import java.util.Scanner;

public class francesco_fiorio_es03 {
    public static void main(String[] args) {
        es02();

    }
    public static void es01(){
        int array[] = new int[10];
        int max = 0;
        int maxIndex = 0;
        int occurrence = 0;
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero: ");
            array[i] = tastiera.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (array[i] == array[j]) {
                    occurrence++;
                }
            }
            if (occurrence > max) {
                max = occurrence;
                maxIndex = i;
            }
            occurrence = 0;
        }
        System.out.println(array[maxIndex] + "si ripete " + max + " volte");
        tastiera.close();
    }

    public static void es02() {

    }
}