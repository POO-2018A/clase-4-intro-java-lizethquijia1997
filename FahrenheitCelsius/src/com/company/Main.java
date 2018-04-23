package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double celsius;

        System.out.println("\t\tCONVERTIR DE FAHERHEIT A CELSIUS");
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese valor fahrenheit:");
        double fahrenheit = scan.nextDouble();


        if (fahrenheit < 100 && fahrenheit > 0) {
            System.out.println("Valor fahrenheit:" + fahrenheit);
            celsius=((fahrenheit-32)*5)/9;
            System.out.println("Valor en celsius:"+celsius);

        }else{
            System.out.println("ERROR");
            System.out.println("Solo numeros entre el 1 y el 100");
        }
    }
}