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
        
//         System.out.println("""
//                                  1
//                                 121
//                                32123
//                               4321234
//                              543212345                                                                                                    
//                                              
//                          """        




//         int reverseNumber = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int num = sc.nextInt();
//         while (num != 0) {
//             
//           int digit = num%10;
//           reverseNumber = reverseNumber*10 + digit;    
//           num = num /10;
//         }
//         System.out.println("Reversed integer :" + reverseNumber);
//    }
//        
//        
       

//Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int num1 = scanner.nextInt();
//        int inputNum = num1;
//        int digit;
//        int fact =1;
//        int sum =0;
// while( num1 > 0){
// digit = num1%10 ;
//    
// for(int i=1;i<=digit;i++){
// fact = fact*i;}
//    sum = fact + sum;
//    num1 = num1/10;
//    fact = 1;
// }
//        
//if (sum == inputNum){System.out.println("This is a Strong Number");}
//else{System.out.println("This is not a Strong Number");}

Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String password = sc.nextLine();
        int uppercase =0;
        int lowercase =0;
        int specialc = 0;
        int digit = 0;
        
        
        for(int i=0;i<password.length();i++){
        char c1 = password.charAt(i);
            if(Character.isUpperCase(c1)){
               uppercase++;}
            
            if(Character.isLowerCase(c1)){
               lowercase++;}
                    
            if (c1 == '@' || c1 =='#'||c1=='#'||c1 == '$'||c1=='%'||c1=='^'
                ||c1=='&'||c1=='('||c1==')'||c1=='-'||c1=='+') 
            {specialc++;}
                        
            if (Character.isDigit(c1)){
                 digit++;  }                                      
        }
                
        System.out.println(digit);
        if (uppercase>0 && lowercase>0 && specialc>0 && digit>0 && password.length()>=8){
            System.out.println("This is a strong password");}
        
        else if (uppercase>0 && lowercase>0 && specialc>0 && password.length()>=6){
        System.out.println("This is a moderate password");}
        
        else{System.out.println("This a weak password");}
        }}
        

