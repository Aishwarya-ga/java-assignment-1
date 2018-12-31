/* ClassName Main describes
*the solution for palindrome
* along with the sum of even number*/
package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long num;
        long digit;
        long rev=0;
        long sum=0;
        long temp;
        /*taking the input from user using scanner class*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to check");
        num = input.nextInt();
        temp = num;
        while(num>0){
            digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
        /*checking for whether a number is palindrome or not*/
        if(temp==rev){
            System.out.print(rev +" "+"is a Palindrome"+" ");
            while(rev>0){
                num=rev%10;
                /*checking for even number and adding up*/
                if(rev%2==0){
                    sum=sum+num;
                }
                rev=rev/10;
            }
            if(sum>25) {
                System.out.println("sum is " +sum+"and sum of evenis greater than 25");
            }
            else{
                System.out.println("sum is " +sum+" "+"and sum of even is less than 25");
            }
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
