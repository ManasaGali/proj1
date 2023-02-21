public class SmallestNumberInArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 2, 9, 4};
        int smallest = findSmallest(arr);
        System.out.println("The smallest number in the array is: " + smallest);
    }

    public static int findSmallest(int[] arr) {
        // Initialize the smallest number as the first element in the array
        int smallest = arr[0];
        // Loop through the rest of the array and compare each element to the current smallest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
