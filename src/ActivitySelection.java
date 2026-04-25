import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

//    static class Activity{
//        int start;
//        int end;
//        String name;
//
//        public Activity(int start, int end, String name) {
//            this.start = start;
//            this.end = end;
//            this.name = name;
//        }
//    }



    //    sort it on the basis of end time
    // u will choose 1st activity
    // start from next activity - start time  < last choosen end time

    //  2   10
    //  7   12

    // tie it up in a single entity
    // [ , ] - first activituy
    // [ , ] - second ativity
    // [ , ]

    // sort this 2d array on the basis of 2nd column

    // start[0]   finish[0]
    // while sorting they should be tied


    class Pair{
        int start;
        int end;
    }

    public static int maxActivities(int[] start, int[] finish){
        int n = start.length;
        int[][] arr = new int[n][2];

       // int[] arr = new Pair[n]; // array of pairs

        for(int i=0;i<n;i++){
            arr[i][0] = start[i];
            arr[i][1] = finish[i];
        }

        Arrays.sort(arr , Comparator.comparingInt(a -> a[1]));  // 2d array  - 1st index
        // for every element a - sort it on the basis of 1st column , 2nd element in each element
//
        int count = 1; // we will definitely choose the first activity
        int j = 0; // choosen the 0th activity - previous activity choosen

        for(int i = 1;i<n;i++){   // 2nd activity - nth activity
            if(arr[i][0] > arr[j][1])
            {
                count ++;
                j = i;   // previous choosen activity
            }
        }// 1st row to n-1 row

        return count;
    }

    public static void main(String[] args) {
//        Activity[] arr = new Activity[10];
//        arr[0] = new Activity(5,10,"EodingQuiz");
//        arr[1] = new Activity(10,20,"Dance");
//
//        Arrays.sort(arr); // on the basis of what parameter
//
//        System.out.println(arr[0].name);

        int[] start =  {2,1,6};
        int[] finish = {5,10,8};
        System.out.println(maxActivities(start, finish));

    }

    // 2 5      6 8      1 10


}

// 2 -> 5
// 1 -> 10
// 6 -> 8

// sort it on basis of valuujes

// iterate on this hashmap -
