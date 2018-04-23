package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("\t\tPAR O IMPAR");
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número:");
        int numero= scan.nextInt();

        if(numero%2==0){
            System.out.println("\n\tEl número dado es PAR");
        }else{
            System.out.println("\n\tEl número dado es IMPAR");
        }


    }
}
