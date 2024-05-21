public class MaxArray {
    public static void main(String[] args) {
      //  int[] arr = {2, 9, 10, 70, 79, 5676};
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++) {
//            if(arr[i]>max)
//            {
//                max=arr[i];
//            }
//
//        }
//        System.out.println("Max is " + max);
        int[] arr = {2, 9, 10, 70, 79, 5676};
        int min=arr[0];
        for(int i=1;i<=arr.length-1;i++)
        {
            if(arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("MIn is "+ min);
    }

}
