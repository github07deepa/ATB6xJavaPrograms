

import java.util.Scanner;

public class CheckNum {
    //Check if a Number is Positive, Negative, or Zero.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is positive - " + num);
        } else if (num < 0) {
            System.out.println("Number is negative -" + num);
        } else {
            System.out.println("Number is zero - " + num);
        }
sc.close();
    }
}
