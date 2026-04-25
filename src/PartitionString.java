public class PartitionString {
// a - z

    // character - last occurence index

    // array 26 , a - z ,  last occurence index
    public static int maxPartitions(String str){
        int[] lastOccurence = new int[26];

        for(int i=0;i<str.length();i++){
            lastOccurence[str.charAt(i) - 'a'] = i; // last occurence of each character
        }


        // abacbc
        // 012345

        // a = 2
        // b = 4
        // c = 5

        // count = 0
        // pi = 5

        int count = 0;
        int partitionIndex = lastOccurence[str.charAt(0) - 'a'];

        //    c
        // abac
        // 0123

        // a = 2
        // b = 1
        // c = 3


        // aerihfvhervb a            f
        //              49 50          100
        // a =

        // pi = 100


        // count =0;
        // partitionindex = 3 . it maybe my first partition

        for(int i=1;i<str.length();i++){

            int lastOccCurrentChar = lastOccurence[str.charAt(i) - 'a'];
            if(lastOccCurrentChar > partitionIndex){
                partitionIndex = lastOccCurrentChar;
            }

            if(i == partitionIndex){  // actual partition - where we are sure to make a partition
                count++; // max no of parrtition
            }
        }

        return count;
    }

    // last[3] = 0

    // [ , , , ,                             ]
    //  0 1 2 3 4 5 6 7 8 9                 25
    //  a b c d e         m                  z


    // m - a
    // a+x -  a  =x

    // integer value of character - its ascii code

    // ascii

    // 'a' = 97

    // 'd' = 100

    public static void main(String[] args) {
        String str = "abacbc";
        System.out.println(maxPartitions(str));
    }
}
