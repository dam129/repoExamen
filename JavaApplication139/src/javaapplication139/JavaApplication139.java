/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication139;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM129
 */
public class JavaApplication139 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double temperatura;
        char car;
        do {
            System.out.println("Introduce temperatura en ºC: ");
            temperatura = teclado.nextDouble();
            System.out.println("Grados Kelvin ..: " + (temperatura + 273));
            System.out.println("Repetir proceso (S/N): ");
            car = (char) System.in.read();
        } while (car == 'S' || car == 's');
    }
}
