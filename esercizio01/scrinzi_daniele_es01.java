import java.util.*;

public class scrinzi_daniele_es01 {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 

        printArray();  
        //saveArray();
        bubbleSort();

    }

    public static void printArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void saveArray() {

        int[] array2 = new int[8];

        System.out.print("Inserisci 8 numeri: ");

        for(int i = 0; i < 8; i++) {
            Scanner input = new Scanner(System.in);
            array2[i] = input.nextInt();
            if(array2[i] < 0) {
                array2[i] = 0;
            }
        }

        System.out.println(Arrays.toString(array2));

    }

    public static void bubbleSort() {
        int[] a = {20, 3, 1, 12, 43, 21, 2};

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length-1; j++) {
                if(a[j] > a[j+1]) {
                    int b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }
            }
            System.out.println(Arrays.toString(a));
        }   
    }
}