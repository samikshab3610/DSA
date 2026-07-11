package Traversal.counting;
// Count duplicate values (using nested loops).

public class duplicateValues {
    public static void main(String[] args) {
        int count = 0;
        int arr[] = {0,1,2,6,3,4,1,0,5,2,6};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.print(count);
    }
}
