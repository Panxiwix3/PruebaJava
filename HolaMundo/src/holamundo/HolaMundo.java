/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;


/**
 *
 * @author guillermofuentesquijada
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Hola\tMundo!\n");
        System.out.print("Hol\tMund!\n");
        String hola = "HOLA MUNDO!!";
        System.out.println(hola);
        System.out.println(hola.substring(0, 3));
        int entero = 7;
        System.out.println(entero);
        float decimalPequenio = (float) 6.95;
        System.out.println(decimalPequenio);
        boolean logico = true;
        System.out.println(logico);
        double decimalGrande = 6.95;
        System.out.println(decimalGrande);
        char caracter = 'A';
        System.out.println(caracter);
        double suma = entero + decimalPequenio + decimalGrande;

        int contador = 0;
        contador = contador + 1;
        contador = contador - 1;
        int cont = 0;
        cont++;
        cont--;
        cont += 2;
        System.out.println("***********");
        
        cont = hola.charAt(0);
        System.out.println(cont);
        System.out.println(hola.charAt(0));
        
        cont = 64;
        char c = (char)cont;
        System.out.println(c);
        
        if('@' == 63){
            System.out.println("Puedo hacer un @ con ALT+64");
        }else{
            System.out.println("Me equivoque de número");
        }
        
        if(63%2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        
        int opcion = 2;
        
        switch(opcion){
            case 0:
                //instrucciones
                break;
            case 1:
                //instr 2
                break;
            default:
                //hacemos el por defecto
                break;
        }
        
        for (int i = 0; i <= 100; i++) {
            System.out.println("valor de i = " + i);
            if(i%2 == 0){
                System.out.println("par");
            }else{
                System.out.println("impar");
            }
        }
        
        int[] arreglo = new int[10];
        String[] arregloMeses = {"Enero", "Febrero", "Marzo"};
        
        for (int i = 0; i < 10; i++) {
            arreglo[i] = i + 1;
        }
        
        int cantidad = 21;
        int parar = cantidad;
        int add = 0;
        
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < parar; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i + add; j++) {
                System.out.print("*");
            }
            add++;
            parar--;
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < cantidad - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*****");
        }

        System.out.println("********************************************");
        System.out.println();
        
        
        System.out.println("Ingrese su Nombre: ");
        Scanner teclado = new Scanner(System.in);
        
        String leido = teclado.nextLine();
        
        System.out.println("Nombre ingresado es: " + leido);
        
        System.out.println("Ingrese su Edad:");
        int edad = teclado.nextInt();
        
        System.out.println("Ingrese la cantidad de alumnos:");
        int cant = teclado.nextInt();
        
        double[] notas = new double[cant];
        String[] nombres = new String[cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre del alumno " + i + ": ");
            nombres[i] = teclado.next();
            System.out.println("Ingrese la nota de " + nombres[i] + ": ");
            notas[i] = teclado.nextDouble();
        }
        
        for (int i = 0; i < cant; i++) {
            System.out.println("La nota de " + nombres[i] + " es: " + notas[i]);
        }
        double sumanotas = 0;
        for (int i = 0; i < cant; i++) {
            sumanotas += notas[i];
        }
        
        sumanotas = sumanotas/notas.length;
        
        System.out.println("El promedio de los estudiantes es: " + sumanotas);
    }
    
}
