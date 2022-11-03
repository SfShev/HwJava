import java.util.Arrays;

public class MoveKnigth {
    public static final int N = 5;
    public static final int[] row = {2, 1, -1, -2, -2, -1, 1, 2, 2};
    public static final int[] col = {1, 2, 2, 1, -1, -2, -2, -1, 1};


    private static boolean canPlace(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >= N) {
            return false;
        }

        return true;
    }


    private static void print(int[][] board) {
        for (var r : board) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }

    public static void backtrack(int[][] board, int x, int y, int pos)
    {

        board[x][y] = pos;


        if (pos >= N*N)
        {
            print(board);
            board[x][y] = 0;
            return;
        }


        for (int k = 0; k < 8; k++)
        {

            int newX = x + row[k];
            int newY = y + col[k];


            if (canPlace(newX, newY) && board[newX][newY] == 0) {
                backtrack(board, newX, newY, pos + 1);
            }
        }


        board[x][y] = 0;
    }
    public static void main(String[] args)
    {
        int[][] board = new int[N][N];
        int pos = 1;
        backtrack(board, 0, 0, pos);
    }
}



