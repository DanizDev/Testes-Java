
package Daniel.metodo;

import java.util.Scanner;

public class DigitarScanner {
    public static void main(String[] args) {
        
       Scanner x = new Scanner(System.in);
       
        System.out.println("Digite o primeiro valor: ");
        int numberOne = x.nextInt();
        
         System.out.println("Digite o segundo valor: ");
        int numberTwo = x.nextInt();
        
        int resultado = numberOne + numberTwo;
        
        System.out.println("O resultado da soma é: " + resultado);
        
        
        
        
        
       
    }
    
    
}
