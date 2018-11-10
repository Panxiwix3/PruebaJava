/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Usuario 2
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        int cont = -2;
        int cont1= -2;
        int cont3= 0;
        int num = cont3;
        int I;
        boolean primo;
        for(I = 1; I <= cont3; I++){
            if((cont3%I) == 0)
            {
             cont3++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 1+(cont=cont+2);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("[" + matrix[i][j]+"]");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = cont1=cont1+2;
                
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("[" + matrix[i][j]+"]");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]= cont3=cont3+1;
            }
        }
            for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("[" + matrix[i][j]+"]");
            }
            System.out.println();
        }
        /*condicion ligica
        int cont = 10;
        int i = 1;
        System.out.println("While Inicio");
        while(i<=cont){
            System.out.println("prueba: "+i);
            i++;
        }
            System.out.println("valor de cont: " + cont);
            cont = 1;
            System.out.println("Dowhile inicio");
        do{
            System.out.println("prueba: "+cont);
            cont++;
        }while(cont<=10); */
    }

}
