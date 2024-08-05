import java.util.*;
import java.lang.*;
import java.io.*;

public class Lab_4_9 {
    class Codechef {

        public static void main(String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            for (int t = 0; t < T; t++) {
                int N = sc.nextInt();
                int M = N;
                int a[] = new int[N];

                int i = 0;
                int k = 0;
                int temp;

                for (int j = 0; j < N; j++) {
                    a[j] = sc.nextInt();
                }

                int b[] = Arrays.copyOf(a, N);
                if (N > 1) {
                    while (N > i) {
                        if (i == N - 1) {
                            k = 0;
                            if (b[i] == b[k]) {
                                k++;
                            }
                            temp = b[i];
                            b[i] = b[k];
                            b[k] = temp;
                            break;
                        }
                        if (b[i] == b[i + 1]) {
                            k = N - 1;
                            if (b[i] == b[k] && i > 0) {
                                k = i - 1;
                            }
                            temp = b[i];
                            b[i] = b[k];
                            b[k] = temp;
                            i++;
                            N--;
                        } else {
                            temp = b[i];
                            b[i] = b[i + 1];
                            b[i + 1] = temp;
                            i += 2;
                        }
                    }
                }
                int hammingDistance = 0;
                for (int j = 0; j < M; j++) {
                    if (a[j] != b[j]) {
                        hammingDistance++;
                    }
                }
                System.out.println(hammingDistance);
                for (int j = 0; j < M; j++) {
                    System.out.print(b[j] + (j < M - 1 ? " " : "\n"));
                }
            }
        }

    }
}