package esercizio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class andrea_lovato_es03 {

    public andrea_lovato_es03() {

        int arr[] = { 1, 4, 3, 6, 7, 2, 8, 5, 9 };

        maggiore(arr);
        singolo();
        bubbleSort(arr);
    }

    public void maggiore(int arr[]) {
        int maggiore;
        int nvmaggiore;
        int attuale;
        int nvolteattuale;

        maggiore = arr[0];
        nvmaggiore = 1;
        for (int i = 0; i < arr.length; i++) {
            attuale = arr[i];
            nvolteattuale = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    nvolteattuale++;
                }
            }
            if (nvolteattuale > nvmaggiore) {
                maggiore = attuale;
                nvmaggiore = nvolteattuale;
            }
            System.out.println("il numero che compaie più volte è : " + maggiore + ", " + nvmaggiore);
        }

    }

    public void singolo(){
        Map<Integer, Integer> n = new HashMap<>();
        
        for(int i = 0; i < 10; i++){
            Scanner tastiera = new Scanner(System.in);
            System.out.println("Inserisci un numero: ");
            int numoro = tastiera.nextInt();
            
            if(n.containsKey(numoro)){
                n.put(numoro, n.get(numoro) + 1);
            } else {
                n.put(numoro, 1);
            }
            tastiera.close();
        }
        
        for (Map.Entry<Integer, Integer> iniziale : n.entrySet()) {
            if(iniziale.getValue() == 1){
                System.out.println("Il numero " + iniziale.getKey() + " si ripete una volta");
            }
        }
    }
    
    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
