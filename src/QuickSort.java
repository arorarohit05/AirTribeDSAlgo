import java.util.Arrays;

public class QuickSort {


    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    //  0 1 2 3 4 5 6
    // [5,3,8,4,2,7,1]
    //  l           h


    public static void quickSort(int arr[], int low, int high){
        if(low<high) {
            int pivotIndex = partition(arr, low, high); // partiotion - final pivot index
            quickSort(arr, low, pivotIndex);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }


    // arr , partiiton it around a pivot , and return the final pivot index
    public static int partition(int arr[], int low,int high){
        // choose pivot - random last/first/mid

        int pivot = arr[high]; // fixed // arr[low] // random // middle

        int i = low-1; // storing the last index for smaller elements
        for(int j = low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,high);
        return i+1;
        // return the final index of pivot
    }

    //                j
    // -1 0 1 2 3 4 5 6
    //    1,2,3,4,5,7,8
    //      i

    // pivot = 3
    // i = 0

    // pivot = arr[6]
    // i =  0

    // [0 1 2 3 4 5 6 35]
    //                p= 7

    //        35
    //    less    greater


    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2,7,1};

        print(arr);
        quickSort(arr, 0 , arr.length-1);
        print(arr);


        Arrays.sort(arr);
    }
}
