import java.util.Scanner;

public class PrintMarks {

    public static void main(String[] args) {
        //Create a Program which takes arrays and print all the marks
        Scanner sc = new Scanner(System.in);
        float[] marks=new float[6];
        System.out.println("enter the marks of 1st sub:");
        marks[0]=sc.nextFloat();
        System.out.println("enter the marks of 2nd sub:");
        marks[1]=sc.nextFloat();
        System.out.println("enter the marks of 3rd sub:");
        marks[2]=sc.nextFloat();

        System.out.println("enter the marks of 4th sub:");
        marks[3]=sc.nextFloat();

        System.out.println("enter the marks of 5th sub:");
        marks[4]=sc.nextFloat();

        System.out.println("enter the marks of 6th sub:");
        marks[5]=sc.nextFloat();
//print
        for(int i=0;i< marks.length;i++)
        {
            System.out.println("Marks " + marks[i]);
        }
    }
}
