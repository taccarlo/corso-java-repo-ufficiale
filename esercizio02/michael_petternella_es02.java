package esercizio02;

public class michael_petternella_es02 {
    public static void main(String[] args) {
        int diecinumeri[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i : diecinumeri) {
            System.out.println(i);
        }
        ottoNumeri();
        maxNumber();
        numPari();
    }

    public static void ottoNumeri() {
        int ottonumeri[] = { 0, 1, 2, -3, 4, 5, 6, -7 };
        int sum = 0;
        for (int x = 0; x < ottonumeri.length; x++) {
            if (ottonumeri[x] < 0) {
                sum += ottonumeri[x];
                ottonumeri[x] = 0;
            }
        }
        System.out.println(sum);
        for (int i : ottonumeri) {
            System.out.println(i);
        }
    }

    public static void maxNumber() {
        int max = 0;
        int position = 0;
        int cinquenumeri[] = { 0, 19, 2, -3, 4 };
        for (int i = 0; i < cinquenumeri.length; i++) {
            if(cinquenumeri[i] > max){
                max = cinquenumeri[i];
                position = i;
            }
        }
        System.out.println("max: " + max + " position: " + position);
    }

    public static void numPari() {
        int diecinumeri[] = { 0, 1, 2, 3, 43, 5, 6, 7, 8, 9 };
        boolean verifica = true;
        for (int i = 0; i < diecinumeri.length; i += 2) {
            if (diecinumeri[i] % 2 != 0) {
                verifica = false;
            }
        }
        if (!verifica) {
            System.out.println("I numeri non sono pari nelle posizioni pari");
            return;
        }
        System.out.println("I numeri sono pari nelle posizioni pari");
    }
}
