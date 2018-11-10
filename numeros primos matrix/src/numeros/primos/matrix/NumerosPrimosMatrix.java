/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.primos.matrix;

/**
 *
 * @author Usuario 2
 */
public class NumerosPrimosMatrix {

    /**
     * @param args the command line arguments
     */

        // TODO code application logic here

        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if(esPrimo(matriz[i][j]))  //Si es true, el valor es primo
        }
    }



public bool esPrimo(int num){
    for(int i=2; i<num/2; i++)
    {
        if(num%i==0)
            return false;
    }
    return true;
}