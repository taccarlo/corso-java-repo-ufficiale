package esercizio04;

import java.util.Scanner;

public class lorenzo_carta_es04 {
    public static void main(String[] args){
        Area a = new Area();
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo: ");
        int b = input.nextInt();
        System.out.println("Inserisci l'altezza del rettangolo: ");
        int h = input.nextInt();
        a.setDim(b, h);
        System.out.println(a.getArea());
        input.close();
    }

    public static class Area{
        private int height, base;
        public void setDim(int h, int b){
            h = height;
            b = base;
        }
        public int getArea(){
            return (height * base);
        }
    }

    public static class Average{
        private int a, b, c;
        public void setNs(int a, int b, int c){
            a = this.a;
            b = this.b;
            c = this.c;
        }
        public int getAverage(){
            return ((a + b + c) / 3);
        }
    }

    public static class Employee{
        private String name;
        private int joinYear, salary, address;

        public void setName(String name){
            name = this.name;
        }
        public void setJoinYear(int joinYear){
            joinYear = this.joinYear;
        }
        public void setSalary(int salary){
            salary = this.salary;
        }
        public void setAddress(int address){
            address = this.address;
        }

        public String getName(){
            return name;
        }
        public int getJoinYear(){
            return joinYear;
        }
        public int getSalary(){
            return salary;
        }
        public int getAddress(){
            return address;
        }
    }
}
