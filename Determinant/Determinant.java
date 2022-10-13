import java.util.Scanner;

class Determinant {
    public static int det(int[][] mat) {
        int n = mat.length;
        if (n == 1)
            return mat[0][0];
        else {
            int m = 1, s = 0;
            for (int i = 0; i < n; i++) {
                s += m * mat[0][i] * det(minor(mat, 0, i));
                m *= -1;
            }
            return s;
        }
    }

    public static int[][] minor(int[][] mat, int ri, int cj) {
        int n = mat.length - 1, r = 0, c = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i <= n; i++) {
            if (i == ri)
                continue;
            c = 0;
            for (int j = 0; j <= n; j++) {
                if (j == cj)
                    continue;
                arr[r][c] = mat[i][j];
                c++;
            }
            r++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the ORDER of MATRIX = ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("\nEnter the ELEMENT(s) :\n");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        System.out.println("\nDETERMINANT = " + det(mat));
        sc.close();
    }
}
