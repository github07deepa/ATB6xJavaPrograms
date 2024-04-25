import java.util.Scanner;

public class SwitchEx {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        double num1 = sc.nextDouble();

        System.out.println("Enter 2nd number");
        double num2 = sc.nextDouble();

        System.out.println("Enter operator - +, -, *, /. ");
        char op = sc.next().charAt(0);

    switch(op){
        case '+':
            double res=num1+num2;
            System.out.println("Sum ->"+ res);
            break;

    case '-':
        double res1=num1-num2;
        System.out.println("Diff ->"+ res1);
        break;

    case '*':
        double res2=num1*num2;
        System.out.println("Prod ->"+ res2);
        break;
    case '/':
        double res3=num1/num2;
        System.out.println("Div ->"+ res3);
        break;

    }sc.close();
}}
