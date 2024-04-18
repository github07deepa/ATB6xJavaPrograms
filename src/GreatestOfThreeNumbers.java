public class GreatestOfThreeNumbers {

    public static void main(String[] args) {
        
        int n1=10, n2=5, n3=15;
        
        int greatest=(n1>n2)?(n1>n3 ? n1 : n3):n2>n3?n2:n3;

        System.out.println("greatest = " + greatest);
    }
    
}
