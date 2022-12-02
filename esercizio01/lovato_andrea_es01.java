import java.lang.reflect.Array;
import java.util.Scanner;

public class lovato_andrea_es01 {

    /**
     * 
     */
    public lovato_andrea_es01() {

        System.out.println("BELLA RAGAAAAAA 130");
        int n[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    }

    public void otton() {
        int n[] = { 0, 1, 2, -3, 4, 5, 6, -7 };
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] < 0) {
                sum += n[i];
                n[i] = 0;
            }
        }
    }

    public void max() {
        int n[] = new int[5];
        int m = 0;
        int position = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.println("Inserire un numero");
            Scanner scanner = new Scanner(System.in);
            m = scanner.nextInt();
            if (n[i] > m) {
                m = n[i];
                position = i;
            }
            System.out.println("Il numero più grande è : " + m + "," + position);
        }
    }

    public void pari() {
        int n[] = new int[10];
        int m = 0;
        int position = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.println("Inserire un numero");
            Scanner scanner = new Scanner(System.in);
            n[i] = scanner.nextInt();
        }
        for (int i = 0; i < n.length; i+=2) {
            if(n[i] % 2 == 0){
                System.out.println("E' pari");
            }
        }
    }
}