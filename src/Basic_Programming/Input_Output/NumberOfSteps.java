package Basic_Programming.Input_Output;

import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int min = 5001;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        int i = 0;
        while (i < a.length) {
            while (a[i] > min) {
                a[i] -= b[i];
                count++;
            }
            if (a[i] < min) {
                min = a[i];
                i = 0;
            } else if (a[i] < 0) {
                System.out.println(-1);
                return;
            } else {
                i = i + 1;
            }
        }
        System.out.println(count);
    }
}
