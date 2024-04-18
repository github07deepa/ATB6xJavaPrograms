public class IncrementOperator {

    public static void main(String[] args) {
        int a=10;
        int res1=(++a + a  + a++);
        System.out.println("res = " + res1);//33

        int b=10;
        int res2=(--b + b  + b--);
        System.out.println("res = " + res2);//27


    }

}
