/* ClassName checkLowerUpperCase which describes
 *the solution to check whether a given input is
  * capital letter, small,letter,digit or special character */
package com.company;
import java.util.*;

import static java.lang.Character.*;

public class checkLowerUpperCase {
    public static void main(String [] args){
        char character;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        character = scanner.next().charAt(0);
        /*checking for uppercase*/
        if( isUpperCase(character)) {
            System.out.println("capital letter");
        }
        /*checking for lowercase*/
        else  if( isLowerCase(character)){
            System.out.println("small letter");

        }
        /*checking for digit*/
        else if(isDigit(character)){
            System.out.println("Digit");
        }
        /*if not uppercase,lowercase,digit then special character*/
        else{
            System.out.println("Special character");
        }


    }


}
