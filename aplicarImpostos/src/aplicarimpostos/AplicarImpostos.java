/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicarimpostos;

import java.util.Scanner;

/**
 *
 * @author giovani.70091
 */

public class AplicarImpostos {

    /**
     * @param args the command line arguments
     */
    
    public static Double aplicarImpostos(Double valor, Double taxa){
        valor += (valor * taxa) / 100;
        return valor;
    }
    
    public static void main(String[] args) {
       Double valor = 0.0, taxa = 0.0;
       Scanner input = new Scanner(System.in);
       
        System.out.print("Digite um valor: ");
        valor = input.nextDouble();
        
        System.out.print("Digite uma taxa para aplicar sobre o valor: ");
        taxa = input.nextDouble();
        
        System.out.printf("O valor com impostos é R$" + "%.2f", aplicarImpostos(valor, taxa));
    }
    
}
