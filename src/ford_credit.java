/*
Wilhelm Bagcal
Ford Credit Software Engineering Intern Exercise
 */

import java.util.Scanner;

public class ford_credit {

    public static void main(String[] args){
        Scanner newNum = new Scanner(System.in);
        System.out.println("Enter a number: ");

        Integer numberOut = newNum.nextInt();
        printFord(numberOut);

    }

    public static void printFord(Integer val){
        if(val % 3 == 0){
            System.out.println("Mustang");
        }
        else if(val % 5 == 0){
            System.out.println("Bronco");
        }
        else if((val % 3 == 0) && (val % 5  == 0)){
            System.out.println("MustangBronco");
        }
        else{
            System.out.println(val);
        }
    }
}
