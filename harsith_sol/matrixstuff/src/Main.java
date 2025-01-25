//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int[][] reverse(int[][] m) {

        int[][] p = new int[m.length][m[0].length];

        int row = m.length;
        int cols = m[0].length;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                // p[i][j]=m[j][row-(i+1)];
                p[i][j] = m[row-(1+i)][j];
            }
        }

        return p;

    }

    public static int[][] rotatematr(int[][] m) {

        int[][] p = new int[m.length][m[0].length];

        int row = m.length;
        int cols = m[0].length;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                // p[i][j]=m[j][row-(i+1)];
                //for rows reversal, go through each row
                //p[j][i] = m[row - (i + 1)][j];
                //for cols
                //go through each cols
                p[i][j] = m[row - (i + 1)][j];

            }
        }

        return p;

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int[][] m = {
                {1, 2, 3},
                {7, 5, 6},
                {4, 8, 9}
        };


        // p[i][j] = m[row - (i + 1)][j];

      //int[][]  p=rotatematr(m);

        int[][]  p=reverse(m);



        for(int i=0;i<m.length;i++) {
            for (int j = 0; j < m[0].length; j++) {

                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
}