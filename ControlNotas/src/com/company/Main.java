package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Declarar las variables y arreglos
        Scanner teclado = new Scanner(System.in);
        double notas[];
        String nombre[];
        String apellido[];
        int cantidadEstudiantes;
        double promedio;
        double notaMayor;
        double notaMenor;
        double promovido;


        //Asignar la cantidad de estudiantes
        System.out.println("Ingrese la candidad de estudiantes: ");
        cantidadEstudiantes = teclado.nextInt();

        // Asignar el tamaño de los arreglos a partir de la cantidad de estudiantes
        notas = new double[cantidadEstudiantes];
        nombre = new String[cantidadEstudiantes];
        apellido = new String[cantidadEstudiantes];

        // Solicitar los datos e ingresarlos en los arreglos "recorrido del arreglo"
        for (int i = 0; i < notas.length; i++)
        {
            System.out.println("Ingrese el nombre del estudiante " + (i+1) + ": ");
            nombre[i] = teclado.next();
            System.out.println("Ingrese el apellido del estudiante " + (i+1) + ": ");
            apellido[i] = teclado.next();

            //Ingresando las notas y restringiendolas entre 0 y 10
            do {
                System.out.println("Ingrese la nota del estudiante " + (i+1) + " (recuerde usar comas para los decimales): ");
                notas[i] = teclado.nextDouble();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("La nota debe estar comprendida entre 0 y 10");
                    continue;
                }
                break;

            } while (true);
        }

        // Calcular el promedio de las calificaciones
        promedio = 0;
        for (int i = 0; i < notas.length; i++){
            promedio += notas[i];
        }
        promedio/= notas.length;
        System.out.println("El promedio de las calificaciones es: " +promedio);

        //Calcular la nota mayor y menor
        notaMayor = notas[0];
        notaMenor = notas[0];
        for (int i = 0; i < notas.length; i++){
            if (notaMayor < notas[i]) {
                notaMayor = notas[i];
            }
            if (notaMenor > notas[i]) {
                notaMenor = notas[i];
            }
        }
        System.out.println("La nota mayor es: " +notaMayor);
        System.out.println("La nota menor es: " +notaMenor);

        //Alumnos que se promueben con notas >= 7
        promovido = 7;
        for (int i = 0; i < notas.length; i++){
            if (notas[i] >= promovido) {
                System.out.println("los estudiantes promovidos son : " +nombre[i]+ " " +apellido[i]);
            }
        }

        teclado.close();
    }
}
