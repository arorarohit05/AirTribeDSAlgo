import java.util.Scanner;

public class BSRotatedSorted {



    // [ , , , , , , , , , , , , ,  ,, , , , ]
    // l       p            [m]              h

    // 56                  451


    //   907
    public static int binarySearchRotatedSorted(int arr[] , int k) {

        int low = 0;
        int high = arr.length-1;

 // conditional binary search
        // first you are checking which half is sorted - you are making the decisionb to discard
        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == k){
                return mid; // returned
            }

            // earlier left sorted
            if(arr[mid] >= arr[low]){
                if(k>=arr[low] && k<arr[mid]){
                    high = mid -1;
                }
                else{
                    low = mid+1;
                }
            }
            // or right half is sorted - make the decision here
            else{
                if(k>arr[mid] && k<=arr[high]){
                    low = mid+1;// ignore the left half
                }
                else{
                    high = mid-1;
                }
            }

        }


        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 10
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // 75

        int pos = binarySearchRotatedSorted(arr, k);

        System.out.println(pos); // -1  -> index if not found
    }
}
