import java.util.Scanner;

public class Bonnes_Cristiano{
    public static void main(String[] args) {
        es4();
    }
    public static void es1(){
        int[] array=new int[10];
        int numero=0,contatore=0;
        while(contatore<10){
            numero++;
            if((numero==2)||(numero==3)||(numero==5)||(numero==7)||(numero==11)){
                array[contatore]=numero;
                contatore++;
            }else if(!((numero%2==0)||(numero%3==0)||(numero%5==0)||(numero%7==0)||(numero%11==0))){
                array[contatore]=numero;
                contatore++;
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(array[i]);
        }
    }
    public static void es2(){
       Scanner input = new Scanner(System.in);
       int[] numeri = new int[8];
       int somma=0;
       for(int i=0;i<8;i++){
        System.out.println("Inserisci il numero "+i+" : ");
        numeri[i]= input.nextInt();
       }
       for(int i=0;i<8;i++){
        if(numeri[i]<0){
            somma=somma+numeri[i];
            numeri[i]=0;
        }
        System.out.println(numeri[i]);
       }
       System.out.println("SOMMA NUMERI NEGATIVI: "+somma);
    }
    public static void es3(){
        Scanner input = new Scanner(System.in);
        int[] numeri = new int[5];
        int max=0,posizione=0;
        for(int i=0;i<5;i++){
         System.out.println("Inserisci il numero "+i+" : ");
         numeri[i]= input.nextInt();
        }
        for(int i=0 ;i<5;i++){
            if(numeri[i]>=max){
                max=numeri[i];
                posizione=i;
            }
        }
        System.out.println("Il numeor più grande è: "+max+" nella posizione: "+posizione);
    }
    public static void es4(){
        Scanner input = new Scanner(System.in);
        int[] numeri = new int[10];
        int max=0,posizione=0;
        for(int i=0;i<numeri.length;i++){
         System.out.println("Inserisci il numero "+i+" : ");
         numeri[i]= input.nextInt();
        }
        boolean vero=true;
        for(int i=0;i<numeri.length;i++){
            if(!((i%2==0)&&(numeri[i]%2==0))){
                vero=false;
            }
        }
        System.out.println("nella posizioni pari è sempre un numero pari: "+vero);
    }
}