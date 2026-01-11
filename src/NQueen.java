import java.util.ArrayList;
import java.util.Scanner;

public class NQueen {

    public  static  char[][] nQueen(int n){
        char[][] board = new char[n][n]; // created a 2d matrix

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }

        // fill this board with queens if possible otherwise not
        boolean isPossible  = backtrack(0, board, n);

        if(isPossible){
            return board;
        }
        return null;
    }

    // n*n -> n
    // return true - if it will be able to fill n queens, otherwise false

    // 0th row - truy all columns

    // 4       x
    // 3 [ . Q . . ]
    // 2 [ . Q . . ]
    // 1 [ . . . Q ]
    // 0 [ Q . . . ]
    //     0 1 2 3


    // to check by placing at row, col is it safe or not
    public static boolean isSafe(int row, int col, char[][] board,int n){

        // check the complete column, in all rows // no need to check row
        for(int i=0;i<row;i++){
            if(board[i][col] == 'Q')
                return false;
        }

        // diagonals
        // left
        for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q')
                return false;
        }
        //right
        for (int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    // O(n*n!) - tc -> N! recursive * N
    // O(n^2)

    // Rat in a maze
    // Sudoku -

    // main backtracking happening - recursive
    public static boolean backtrack(int row, char[][] board,int n){
        if(row == n){ // forget
            return true;
        }

        for(int col=0;col<n;col++){
            if(isSafe(row,col,board,n)){ // no one to cut row, col, diagnaot -

                // placed the queen
                board[row][col] = 'Q';

                // explore further path
                if(backtrack(row+1,board,n)){
                    return true;
                }

                // rollback
                board[row][col] = '.';

            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5

        char[][] board = nQueen(n);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+ "     ");
            }
            System.out.println();
            System.out.println();
        }
    }
}

// . . . .
// . . . .
// . . . .
// . . . .


//


// 1 2 3 4 5 ->




//

// pseudo code - n queen
// n*n -> n queens

// 1 - Try PLACing 1 QUEEN IN each ROW
// 2 - TRY ALL COLUMNS - cell by cell
// 3 - Move to next row, place queen cell by cell
// 3 - IF STUCK -> RETURN AND ROLLBACK

//
//[ . . Q .]
//[ Q . . .]