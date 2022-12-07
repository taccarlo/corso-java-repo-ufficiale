package lezione_7_12.gruppo_03;

public class Algoritmo_della_vita {

    public static void funzione01(){
        System.out.println("La persona è nata!");
        System.out.println("La persona segue le elementari e le medie!");
        int n_bocciature = 0;
        int anno_superiori = 1;
        while(true){
            System.out.println("La persona è al " + anno_superiori + " delle superiori");
            int roll_bocciatura = (int)Math.random() * 100;
            if(roll_bocciatura <= 20){
                n_bocciature++;
                System.out.println("La persona è bocciata! Numero di bocciature: " + n_bocciature);
            }
            if(n_bocciature >= 3){
                System.out.println("La persona è stata bocciata troppi volte e non può proseguire gli studi!");
                break;
            }
            if(anno_superiori == 5){
                System.out.println("La persona ha superato gli studi superiori!");
                break;
            }
            funzione02();
        }
    }


    public static void funzione02(){

    }

    public static void funzione03(){

    }

    public static void main(String args[]){
        funzione01();
    }
}
