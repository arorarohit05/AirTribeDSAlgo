import java.util.Arrays;

public class MinCoins {
    //        0  1  2  3  4  5  6  7  8  9
    // dp = [ 0  1  2  3  1  2  1  2  2  3]
   //

    public static int findMinCoins(int[] coins, int target){
        int[] dp = new int[target+1];
        Arrays.fill(dp, target+1);
        dp[0] = 0;

        for(int i=1;i<=target;i++){
            for(int coin : coins){

                if(i-coin>=0){ // if that coin is useful
                    dp[i] = Math.min(dp[i] , 1 + dp[i-coin] );
                }
            }
        }

        if(dp[target] == target+1){
            return -1; // not possible
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int target = 8;
        int coins[] = {2,4,6};



        System.out.println(findMinCoins(coins, target));
    }
}
