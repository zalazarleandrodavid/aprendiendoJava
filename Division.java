
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = input.nextInt();
        
        System.out.print("Ingrese el primer número double: ");
        double num3 = input.nextDouble();

        System.out.print("Ingrese el segundo número double: ");
        double num4 = input.nextDouble();
        
        
        System.out.println("División: " + ((double) num1 / num2));
        System.out.println("División con double: " + ((double) num3 / num4));

       
    }
}
