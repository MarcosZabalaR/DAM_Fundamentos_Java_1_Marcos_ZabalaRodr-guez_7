package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Introduzca los números a comparar.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Los números introducidos son iguales");
        }else{
            if(a<b){
                System.out.println("El número " +a +" es menor que " +b);
            }else{
                System.out.println("El número " +b +" es menor que " +a);
            }
        }
    }
}
