/* ClassName random which the user can
* guess the number like a game it is*/
package com.company;
import java.util.*;
public class Random {
    public static void main(String[] args){
        /*Random class to generate a random number*/
        Random random = new Random();
        int rand_int;
        rand_int = random.nextInt(50);
//        System.out.println(rand_int);
        System.out.println("Enter a number to guess in the range 1 - 50");
        Scanner scanner = new Scanner(System.in);
        int check = scanner.nextInt();
        /*checking for conditions*/
        if(check < rand_int){
            System.out.println("Number guessed is lesser");
        }
        if(check > rand_int){
            System.out.println("Number guessed is greater");
        }
        if(check == rand_int){
            System.out.println("Number guessed is correct");
        }

    }
}
