public class DP {


// recursive
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }


    // top down approach - memoization
    // recursion + memoization
    public static int fibonacciTD(int n, int dp[]){
        if(n <= 1){
            return n;
        }

        if(dp[n] !=0){ // some value is there , it is already computed earlier
            return dp[n];  // resusing
        }

        // go further and solve it???
        return dp[n] =  fibonacci(n-1) + fibonacci(n-2); // store
    }
    // fib(5)

    // dp[5] = fib(4) + fib(3) - again - reus
            // x +  y
    //         fib(3)+fib(2)


    // bottom up - tabulation
    public static int fibonacciBU(int n){
        int[] dp = new int[n+1]; // 11 -> table form

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // bottom up - space optization - just store what u need at that point of time and futher
    public static int fibonacciBUSO(int n){
        int a = 0;
        int b = 1;
// 0 1 1  2  3 ->
//        a b
        for(int i=2;i<=n;i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
         // 0 1 2  3   4  5
//arr    // 5,5,10,100,10,5
// dp    // 5 5 15 105 105 110

    public static int findMaxSumNoTwoElementsAdj(int arr[]){

        int n = arr.length;
        int dp[] = new int[n];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1] , arr[i] + dp[i-2]);
        }

        return dp[n-1]; // at the last index, i have answer of max sum till here
    }

    // max sum such that no 3 elements are adjacent
    // 1 2 3
    // 5

    // 3000 , 2000 , 1000 ,3, 10
    // 5013

    //


    public static void main(String[] args) {
        int n = 10;
        // 0 1 1 2 3 5 8 13 21 34 55
        // 0 1 2 3 4 5 6 7  8  9   10

        System.out.println(fibonacci(n));

        System.out.println(fibonacciBU(n));

        System.out.println(fibonacciBUSO(n));

        int dp[] = new int[n+1];
        // [-1 , -1, -1, -1, -1, -1,-1 ,-1]

        //[ 4 6 7 9 4 7 ]

      //  for(int i=0;i<=n;i++){
       //     dp[i] = -1;
       // }
        System.out.println(fibonacciTD(n, dp));


//        int dppp[] = new int[40];
//        for(int i=0;i<40;i++){
//            System.out.print(dppp[i] + " ");
//        }


        int arr[] = {5,5,10,100,10,5};  // 5 + 100 + 5 = 110
        System.out.println(findMaxSumNoTwoElementsAdj(arr));
    }
}



//  Ques  -> array of positive integers
// find maximum sum of integers inside that array, such that no 2 elements are adjacent



// 5 5 10 100 1000 5000
// x   x       x
// x       x       x
// x   x           x

// x    x  -> skip 1
// x        x -> skip 2


//                       maxsum (6)

//        pick 1st + maxsum(3-6)           |    pick 1st + maxSum(4-6)   |   pick 2 + maxSum(4-6)  | pick 2 + maxSum(5-6)

//     100
//     1 - 50   51 - 100

///     know   +
//  1 2 3 4 5 6 7 ...... 100
//

// 5    100   5 = 110

// 3 2 7 10
// 3 10 = 13

// 3 2 5 10 7
// 3+5+7 = 15


//  0     1       2               3
//   3    2      7              10
//   3    3      10           13

// 100
// 98     99        100
// maxa    maxb      y + maxa / maxb

// bottom up



// max sum such that no 2 elements are adjacent till that index
