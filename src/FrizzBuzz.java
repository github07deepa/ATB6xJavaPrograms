public class FrizzBuzz {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
 if(i%3==0)
{
    System.out.println("Multiples of 3 -"+ i);
    }
if(i%5==0)
{
    System.out.println("Buzz "+i);
}
if(i%3==0 && i%5==0)
{
    System.out.println("FrizzBuzz - " + i);
}
}
}}



