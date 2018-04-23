package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("\t\tLOS MESES");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 1");
        System.out.println("Ingrese 2");
        System.out.println("Ingrese 3");
        System.out.println("Ingrese 4");
        System.out.println("Ingrese 5");
        System.out.println("Ingrese 6");
        System.out.println("Ingrese 7");
        System.out.println("Ingrese 8");
        System.out.println("Ingrese 9");
        System.out.println("Ingrese 10");
        System.out.println("Ingrese 11");
        System.out.println("Ingrese 12");
        System.out.println("Escriba una opcion:");
        int numero= scan.nextInt();

        switch(numero){
            case 1:
                System.out.print("\t\tEnero");
                break;
            case 2:
                System.out.print("\t\tFebrero");
                break;
            case 3:
                System.out.print("\t\tMarzo");
                break;
            case 4:
                System.out.print("\t\tAbril");
                break;
            case 5:
                System.out.print("\t\tMayo");
                break;
            case 6:
                System.out.print("\t\tJunio");
                break;
            case 7:
                System.out.print("\t\tJulio");
                break;
            case 8:
                System.out.print("\t\tAgosto");
                break;
            case 9:
                System.out.print("\t\tSeptiembre");
                break;
            case 10:
                System.out.print("\t\tOctubre");
                break;

                case 11:
                System.out.print("\t\tNoviembre");
                break;

            case 12:
                System.out.print("\t\tDiciembre");
                break;


            default:
                System.out.print("\t\tERROR");



        }

    }
}
