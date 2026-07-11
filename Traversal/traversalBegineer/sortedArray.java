package Traversal.traversalBegineer;

public class sortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,4,8,9,10};

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
