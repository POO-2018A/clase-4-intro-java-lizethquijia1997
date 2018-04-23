package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("\t\tMAYOR O MENOR DE EDAD");
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su edad:");
        int edad= scan.nextInt();

       if(edad>=18){
           System.out.println("\n\tEres MAYOR de edad");
       }else{
           System.out.println("\n\tEres MENOR de edad");
       }

    }
}
