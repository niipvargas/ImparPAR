package imparpar;

import java.util.Scanner;

public class Imparpar {

    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     
        System.out.print("Digite um número: ");
        int num = scn.nextInt(); 
 
    if (num%2==0) 
        System.out.println("Esse número é par.");
 
    else 
        System.out.println("Esse número é ímpar.");
        
    }
}
    
    

