/* ClassName appending which describes
 *the solution for appending the
 * substring number of times required*/
package com.company;
import java.util.*;
public class Appending {
    public static void main(String [] args){
        int number;
        String string;
        String sub_string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        string =  scanner.nextLine();
        System.out.println("Enter a number");
        number = scanner.nextInt();
        /*takes the substring at the mentioned position*/
        sub_string = string.substring(number);
        System.out.println(sub_string);

        StringBuffer sb = new StringBuffer(sub_string);
        for( int i = 0 ; i< number; i++){
            /*appends the string at the end*/
            sb.append(sub_string);
        }
        System.out.println("stackroute"+sb);

    }
}
