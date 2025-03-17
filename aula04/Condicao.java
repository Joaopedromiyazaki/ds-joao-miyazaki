package aula04;

import java.util.Scanner;
// deu tudo errado nessa merda
public class Condicao {
    public static void main(String[] args) {
       Scanner roberto = new Scanner(System.in);
       System.out.println("Enter a number: ");
       
       int roberto1 = roberto.nextInt(); 
       int roberto2 = roberto.nextInt();

       if (roberto1 > roberto2) {
           System.out.println( roberto1 + " e maior que " + roberto2);
       }      
       }
    }
