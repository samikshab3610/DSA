package Traversal.traversalBegineer;

// Find the second largest element
public class secondLargest {
    public static void main(String[] args) {

        int arr[] = {15, 22, 19, 14, 25, 20, 17, 28, 24, 10};

        if (arr.length < 2) {
            System.out.println("No second largest element");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
}