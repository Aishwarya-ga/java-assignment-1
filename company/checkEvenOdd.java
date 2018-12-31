/* ClassName checkEvenOdd which describes
 *the solution for checking whether a given number is
 * odd or evn and is present in the given range*/
package com.company;
import java.util.*;

public class checkEvenOdd {
    public static void main(String [] args){
        int number;
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 20 and 30");
        number = input.nextInt();
        /*condition for checking a number is even*/
        if(number % 2 == 0){
            if(number >= 20 && number <= 30){
                System.out.println("Jerry");
            }
            else{
                System.out.println("Number is even but lesser than 20");
            }

        }
        else{
            if(number >= 20 && number <= 30){
                System.out.println("Tom");
            }
            else{
                System.out.println("Number is odd but lesser than 20");
            }
        }




    }
}
