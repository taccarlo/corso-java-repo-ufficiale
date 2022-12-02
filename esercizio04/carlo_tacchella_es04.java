package esercizio04;

import java.util.Scanner;

public class carlo_tacchella_es04 {
    /** 
        Write a program to print the area of a rectangle by creating a class 
        named 'Area' having two methods. First method named as 'setDim' takes 
        length and breadth of rectangle as parameters and the second method 
        named as 'getArea' returns the area of the rectangle. Length and 
        breadth of rectangle are entered through keyboard.
    */

    public static void main(String[] args) {
        Area ex = new Area();

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la base del rettangolo: ");
        int dim1 = input.nextInt();
        System.out.print("Inserisci l'altezza del rettangolo: ");
        int dim2 = input.nextInt();

        ex.setDim(dim1, dim2);
        ex.getArea();

        input.close();
    }

    public static class Area {
        private int dim1, dim2;
        public void setDim(int dim1, int dim2){
           this.dim1 = dim1;
           this.dim2 = dim2;
        }
        public void getArea() {
            int area = dim1 * dim2;
            System.out.println("L'area del rettangolo e' " + area);
        }
    }
}
