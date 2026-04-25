import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashing {


    public static void countElements(int arr[]){
        HashMap<Integer,Integer> hm =new HashMap<>();
        HashSet<Integer> hs = new HashSet<>(); // searching od elements fdaster
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+ 1);
            }
            else{
                hm.put(arr[i] , 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }


    }

    // 3 -> 3

    // use hashmap
    // return those 2 numbers or their postiion
    public static int[] findTwoNumbersHavingSumK(int arr[], int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
       // hs.add()
        //        hs.contains()

           //             [5 -> "rohit"]
            //            [6 -> "mohit"]
        //                [100 -> "arora"]
        //
        //            hm.put(5,"airtribe")

        // hm.get(100)

        // hashset ->  [5 6 100]
        // hs.contains(100) ->

        // hashset = [4 6 2]
        // hashing:
        //    x%4 ->

        // Note -> hashmap

        //  0 ->[ [4 ]  [ ,]    ]
        //  1  -> [9]
        //  2 -> [6 , 2]
        //  3


        for(int i=0;i<arr.length;i++){
            int complement = k - arr[i];

            if(hm.containsKey(complement)){
                return new int[]{arr[i],arr[hm.get(complement)]};
            }

            hm.put(arr[i],i);
        }

        return new int[]{};
    }

    // a + b = k

    // a + b + c + d = k

    // a+b

    // k - (current sum)

    // n^2 -> n

    // n^4 -> n^2

    public static void main(String[] args) {
        int arr[] = {5,3,7,2,9,8,2};

        //countElements(arr);
        int[] positions = findTwoNumbersHavingSumK(arr, 16);
        System.out.println(positions[0] + " "+ positions[1]);
    }

    // 2 3 5 7 8 100
    // i       j

    // n^2 -> nlogn -> O(n)
    // arr =  5 3 7 2 9 8 2
            //        i


    // give me the index of those 2 elements

    // 4
    // key , value
    // k- arr[i]
    // 5,0
    // 3,1
    // 7 ,2
    // 2 ,3
    // 9 , 4
    // 8  , 5
    // 6,3 - > find position

    // kv    // data

    // k = 12

    // 5 7 - answer

    // find 2 numbers such that sum is k

}

//  array --> find subarray with sum = k

// 1 2 3  -> k = 3
// [1 2]  [3]

// [1]  [2]  [3]  [1 2]  [2 3] [1 2 3 ]

// [1,2]


// list ->   [ 100 integers ]
// set ->    [ 100 integers]

// hs.contains(40)  -> O(1)

// 40%7 -> 5
// 47%7 -> 5

// 5 -> [40 45]