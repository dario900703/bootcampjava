package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día:");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año:");
        int año = sc.nextInt();
        if(año>=1900){
            if (mes>=1  && mes<=12){
                if (mes == 2){

                    if (año % 4 == 0){
                        if(dia>=1 && dia<=29){
                            System.out.println("La fecha es: " +dia +"/" +mes +"/" +año);
                        }
                    }else{
                        if(dia>=1 && dia <=28) {
                        System.out.println("La fecha ingresada es: " +dia +"/" +mes +"/" +año);
                    } else {
                        System.out.println("día no válido");
                    }
                    }

                }else {
                    if(dia>=1 && dia <=30) {
                        System.out.println("La fecha ingresada es: " +dia +"/" +mes +"/" +año);
                    } else {
                        System.out.println("día no válido");
                    }
                }
            } else {
                System.out.println("mes no valido");
            }
        } else {
            System.out.println("año no valido");
        }
    }
}