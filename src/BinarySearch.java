import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class BinarySearch {

    public static int linearSearch(int arr[], int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){ // comparisons - n times
                return i; // index of k
            }
        }

        return -1;
    }

    // [ , , , , , , , , , , , , ] -> sorted
    //  l            mid        h
    //  0                       10



    // l     m     h
    // 34    54     75

    // 54
    // 44
    // 66

    //  low + high/2 - unsafe

    // low + (high-low)/2; - safe


    // array is very big
    // 100

    // 90 100

    // 0 1 2 3  4  5  6  7
    // 3 6 9 23 56 78 89 99
    //          h l
    //


    // 57

    public static int binarySearch(int arr[] , int k){
        int low = 0;
        int high = arr.length-1;

        // everytime you are searching between low and high
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid]<k){
                low = mid+1; // searching right half
            }
            else{
                high = mid-1; // searching the left half
            }
        }

        return -1;
    }
    // l             h
    // 0 1 2...      49
    // 3 6 9  ...    99
    //      mid

    //  57-> k

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 10
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // 75

        //int pos = linearSearch(arr, k);

        int pos = binarySearch(arr, k);

        System.out.println(pos); // -1  -> index if not found
    }

}
