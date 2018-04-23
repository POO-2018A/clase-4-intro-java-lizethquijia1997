package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la temperatura:");
        double temperatura= scan.nextDouble();
        System.out.println(temperatura+" "+"grados centigrados");
        System.out.println("\t¿Está nevando?");
        System.out.println("Escriba true si es verdadero");
        System.out.println("Escriba false si es falso");
        boolean nevando= scan.nextBoolean();

        System.out.println("\t¿Está lloviendo?");
        System.out.println("Escriba TRUE si es verdadero");
        System.out.println("Escriba FALSE si es falso");
        boolean lloviendo= scan.nextBoolean();

        if(temperatura<10 || lloviendo || nevando==true){

            System.out.println("\n\tNos quedamos en casa!");
        }else{
            System.out.println("\n\tVamos fuera!");
        }
    }
}

