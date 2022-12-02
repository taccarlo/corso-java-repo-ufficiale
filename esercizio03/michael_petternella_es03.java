package esercizio03;

import java.util.HashMap;
import java.util.Map;

public class michael_petternella_es03 {
    public static void main(String[] args) {
        esUno();
        esDue();
        esTre();
    }

    public static void esDue() {
        int diecinumeri[] = { 0, 1, 9, 3, 4, 9, 6, 7, 8, 9 };
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int number : diecinumeri) {
            if (numbers.containsKey(number)) {
                numbers.put(number, numbers.get(number) + 1);
            } else {
                numbers.put(number, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Il numero " + entry.getKey() + " si ripete una volta");
            }
        }
    }

    public static void esUno() {
        int diecinumeri[] = { 0, 1, 9, 3, 4, 9, 6, 7, 8, 9 };
        int max = 0;
        int key = 0;
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int number : diecinumeri) {
            if (numbers.containsKey(number)) {
                numbers.put(number, numbers.get(number) + 1);
            } else {
                numbers.put(number, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        System.out.println("Il numero " + key + " si ripete " + max + " volte");
    }

    public static void esTre() {
        int[] lista = new int[8];
        int vol = 0;
        boolean verifica = true;
        for (int i = 0; i < 8; i++) {
            int random_int = (int) Math.floor(Math.random() * 91);
            lista[i] = random_int;
            // System.out.println(lista[i]);
        }
        while (verifica) {
            verifica = false;
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    vol = lista[j + 1];
                    lista[j + 1] = lista[j];
                    lista[j] = vol;
                    verifica = true;
                }
            }
        }
        for (int i : lista) {
            System.out.println(i);
        }
    }
}

