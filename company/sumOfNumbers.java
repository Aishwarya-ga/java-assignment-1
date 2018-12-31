/* Classname sumOfNumbers wherein a the sum
* of entered number is found*/
package com.company;
import java.util.*;

public class sumOfNumbers {
    public static void main(String [] args) {

            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            System.out.println("Enter the number");
            while(scanner.hasNextInt()) //hasNext() checks whether  there any number next;
            {
                System.out.println("Enter the number");
                sum += scanner.nextInt();  //summing the digits entered
            }
            System.out.println("Sum of numbers entered" + " " + sum);
        }
    }

