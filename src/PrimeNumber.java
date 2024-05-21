import java.util.Scanner;

public class PrimeNumber {


    public static void primeTest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num<=0)
        {
            System.out.println("Invalid Num -" + num);
        }
       else if (num == 1)
       {
           System.out.println("Number is unique -" + num);
        }
       else if (num % 2 == 0)
       {
            System.out.println("Even Prime " + num);
        }
       else if(num%5==0){
            System.out.println("Is not prime " + num);
        }
       else if(num%1==num && num%0==0
        )
        {
            System.out.println("Is  prime " + num);
        }
    }

    public static void main(String[] args) {
primeTest();

    }

}
