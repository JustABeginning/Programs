import java.io.*;

public class Logo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter an ODD no. = ");
        int n = Integer.parseInt(br.readLine());
        if (n % 2 != 0) {
            char cj = 'J', ca = 'A', cb = 'B';
            int r = (n + 1) / 2, shH = 5, shV = 1;
            System.out.print("\nEnter VERTICAL Shift = ");
            shV = Integer.parseInt(br.readLine());
            System.out.print("\nEnter HORIZONTAL Shift = ");
            shH = Integer.parseInt(br.readLine());
            BufferedWriter bw = new BufferedWriter(new FileWriter("Logo.txt"));
            for (int i = 1; i <= shV; i++) {
                System.out.println();
                bw.newLine();
            }
            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= shH; j++) {
                    System.out.print(" ");
                    bw.write(" ");
                }
                // Pattern 1
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + cj);
                    bw.write(" " + cj);
                }
                for (int s = 1; s <= (2 * (r - i) - 1); s++) {
                    System.out.print(" " + " ");
                    bw.write(" " + " ");
                }
                int l = (i == r) ? (i - 1) : i;
                for (int j = 1; j <= l; j++) {
                    System.out.print(" " + cj);
                    bw.write(" " + cj);
                }
                // Pattern 2
                for (int s = 1; s < i; s++) {
                    System.out.print(" " + " ");
                    bw.write(" " + " ");
                }
                for (int j = 1; j <= (2 * (r - i) + 1); j++) {
                    System.out.print(" " + ca);
                    bw.write(" " + ca);
                }
                for (int s = 1; s < i; s++) {
                    System.out.print(" " + " ");
                    bw.write(" " + " ");
                }
                // Pattern 3
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + cb);
                    bw.write(" " + cb);
                }
                for (int s = 1; s <= (2 * (r - i) - 1); s++) {
                    System.out.print(" " + " ");
                    bw.write(" " + " ");
                }
                l = (i == r) ? (i - 1) : i;
                for (int j = 1; j <= l; j++) {
                    System.out.print(" " + cb);
                    bw.write(" " + cb);
                }
                System.out.println();
                bw.newLine();
            }
            for (int i = r - 1; i > 0; i--) {
                // Pattern 1
                for (int j = 1; j <= shH; j++) {
                    System.out.print(" ");
                    bw.write(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + cj);
                    bw.write(" " + cj);
                }
                for (int s = 1; s <= (2 * (r - i) - 1); s++) {
                    System.out.print(" " + " ");
                    bw.write(" " + " ");
                }
                int l = (i == r) ? (i - 1) : i;
                for (int j = 1; j <= l; j++) {
                    System.out.print(" " + cj);
                    bw.write(" " + cj);
                }
                // Pattern 2
                for (int s = 1; s < i; s++) {
                    System.out.print(" " + " ");
                    bw.write(" " + " ");
                }
                for (int j = 1; j <= (2 * (r - i) + 1); j++) {
                    System.out.print(" " + ca);
                    bw.write(" " + ca);
                }
                for (int s = 1; s < i; s++) {
                    System.out.print(" " + " ");
                    bw.write(" " + " ");
                }
                // Pattern 3
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + cb);
                    bw.write(" " + cb);
                }
                for (int s = 1; s <= (2 * (r - i) - 1); s++) {
                    System.out.print(" " + " ");
                    bw.write(" " + " ");
                }
                l = (i == r) ? (i - 1) : i;
                for (int j = 1; j <= l; j++) {
                    System.out.print(" " + cb);
                    bw.write(" " + cb);
                }
                System.out.println();
                bw.newLine();
            }
            bw.close();
            System.out.println();
        }
    }
}
