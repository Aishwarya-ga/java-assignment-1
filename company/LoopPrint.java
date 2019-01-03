/* ClassName loopPrint
* in order to print the digit in
* specified format*/
package com.company;
import java.util.*;
public class LoopPrint {
    public static void main(String [] args){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        number = scanner.nextInt();
        System.out.println("------------------");
        /*loop for printing the number as 122333444455555....etc*/
        for(int i = 0; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
        }
    System.out.println("");
    }
}
