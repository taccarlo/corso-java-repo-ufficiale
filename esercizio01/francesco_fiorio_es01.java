import java.util.Scanner;
import java.util.function.Function;

public class francesco_fiorio_es01{
    // ඞ
    public static void main(String[] args) {
    }
 public static void function(){
    int[] lore = new int[10];
    int gig = 0, count = 0;
    while(lore.length<10){
        gig++;
        if(!(gig%2==0)||(gig%3==0)||(gig%5==0)||(gig%7==0)||(gig%11==0)){
            lore[count]=gig;
            count++;
        }else if((gig==2)||(gig==3)||(gig==5)||(gig==7)||(gig==11)){
            lore[count] = gig;
            count++;
        }
    }
    for(int i=0; i<10;i++){
        System.out.println(lore[i]);
    }
 }

 public static void es2() {
    Scanner txt = new Scanner(System.in);
    int[] numeri = new int[8];
    int somma= 0;
    for(int i=0;i<8;i++){
        System.out.println("inserire il prossimo numero " + i + ": ");
        numeri[i] = txt.nextInt();
    }
    for(int i=0; i<8; i++){
        if(numeri[i]<0){
            somma=somma+numeri[i];
            System.out.println(numeri[i]);

        }
        System.out.println("somma numeri negativi" +somma);
    }
 }

 public static void es3() {
    Scanner txt = new Scanner(System.in);
    int[] numeri = new int[5];
    int max = 0, posizione = 0;
    for (int i = 0; i < 5; i++) {
         System.out.println("inserire il prossimo numero " + i + ": ");
         numeri[i] = txt.nextInt();
     }
     for(int i=0; i<5;i++){
        if(numeri[i]>=max){
            max=numeri[i];
            posizione=i;
        }
     }
 }

 public static void es4() {
     Scanner txt = new Scanner(System.in);
     int[] numeri = new int[10];
     int max = 0, posizione = 0;
     for (int i = 0; i < numeri.length; i++) {
         System.out.println("inserire il prossimo numero " + i + ": ");
         numeri[i] = txt.nextInt();
     }
     for (int i = 0; i < 5; i++) {
         if(!(i%2==0)&&(numeri[i]%2==0)) {
             max = numeri[i];
             posizione = i;
         }
     }
 }



}