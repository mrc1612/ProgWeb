/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Lucas Eduardo
 */
public class Uni3Exe04 {
    
    public static void main(String[] args){
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a primeira nota: ");
        double primeiraNota = teclado.nextDouble();
        
        System.out.print("Informe a segunda nota: ");
        double segundaNota = teclado.nextDouble();
        
        System.out.print("Informe a terceira nota: ");
        double terceiraNota = teclado.nextDouble();
        
        double media = (primeiraNota + segundaNota + terceiraNota) / 3;
        
        System.out.println("Média final é de: " + df.format(media));
        
    }
    
}
