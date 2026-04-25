public class MergeSort {


    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    // recursivily dividing the array and then merging
    public static void mergeSort(int arr[], int left, int right){

        if(left == right){
            return;
        }

        int mid = left + (right - left)/2;
        mergeSort(arr, left, mid); // sort left half
        mergeSort(arr,mid+1, right); // sort right half
        merge(arr, left , mid, right); // merge them to create the fully sorted array
        // left - mid ,  mid+1 - right
    }


    // left - mid [sorted]   0    3
    // mid+1 - right [sorted] 4    7

    // make[ 0 - 7]


    // a b c d     e f g h
    // 2 8 9 20    4 3 7 42

    // temp = 4

    // arr1  a b c d  4 8 9 20
    // arr2  e f g h  2 3 7 42

    // 0 3   7
    public static void merge(int arr[], int left, int mid, int right){
        int n1 = mid - left +1; // 4
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0;i<n1;i++){
            leftArr[i] = arr[left+i]; // n1 element starting from left
        }
        for(int i=0;i<n2;i++){
            rightArr[i] = arr[mid+1+i]; // n2 element starting from mid+1
        }

        // left[0 1 2 3  ]     right[4 5 6 7]
        //              i              j


        // 2 pointer approach

        int i = 0;
        int j = 0;
        int k = left;

        //   left  mid+1  right
        // left to right


// 2 pointer merge
        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k++] = leftArr[i++];
            }
            else{
                arr[k++] = rightArr[j++];
            }
        }

        // copy remaining elements

        while(i<n1){
            arr[k++] = leftArr[i++];
        }

        while(j<n2){
            arr[k++] = rightArr[j++];
        }
    }

    // 0 1 2 3 4 5 6 7
    //       m
    // 0 1 2 3
    //   m







    // 1 base condition
    // 2 recursive call

    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2,7,1};

        print(arr);
        mergeSort(arr,0,arr.length-1);
        print(arr);

    }
}


// 100
// mergesort(arr,0,99)

// 0 1 2 3 4
// [0 , 4]
