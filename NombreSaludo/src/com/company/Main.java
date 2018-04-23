package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("\t\tNOMBRE_USUARIO");
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre:");
        String nombre= scan.nextLine();

        System.out.println("Hola" + " " +nombre);

    }
}
