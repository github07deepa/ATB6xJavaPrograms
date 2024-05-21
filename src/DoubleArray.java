public class DoubleArray {
    public static void main(String[] args) {
        //Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}

        int[] arr1 = {3, 6, 7};

        int[] arr2 = new int[arr1.length];

//copying
        for(int i = 0; i < arr1.length; i++) {
            arr1[i]=arr1[i]*2;
            arr2[i]=arr1[i];
        }

        for (int i : arr2) {
            System.out.println("New array= " + i);
        }
    }
}
