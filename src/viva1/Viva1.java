/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva1;

import java.util.Scanner;

/**
 *
 * @author Lo
 */
public class Viva1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        int reverseNumber = 0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter an integer :");
       int num = sc.nextInt();
        while (num != 0) {
            
          int digit = num%10;
          reverseNumber = reverseNumber*10 + digit;    
          num = num /10;
        }
        System.out.println("Reversed integer :" + reverseNumber);
   }
       
       
    }}
