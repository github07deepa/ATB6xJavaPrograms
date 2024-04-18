public class Solve {

    public static void main(String[] args) {
        double x=4;
        double sqx=Math.sqrt(4);

        int y=2;
        double sqy=Math.sqrt(5);


        double modz= x%y;

                double sum=Math.cbrt(sqx+sqy-modz);
        System.out.println("sum = " + sum);


    }
}
