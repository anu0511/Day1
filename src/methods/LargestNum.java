package methods;

public class LargestNum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};

        System.out.println("Largest number: " + findLargest(a));


    }
    static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
