package sjf;

import java.util.Scanner;

public class SJF {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of process: ");
        int n = sc.nextInt();
        int pid[] = new int[n];
        int at[] = new int[n];
        int bt[] = new int[n];
        int ct[] = new int[n];
        int ta[] = new int[n];
        int wt[] = new int[n];
        int f[] = new int[n];

        int st = 0, tot = 0;
        float average_wt = 0, average_ta = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nProcess " + (i + 1) + " Arrival time: ");
            at[i] = sc.nextInt();
            System.out.print("Process " + (i + 1) + " CPU time: ");
            bt[i] = sc.nextInt();
            pid[i] = i + 1;
            f[i] = 0;
        }

        while (true) {
            int c = n, min = 999999;

            if (tot == n) {
                break;
            }

            for (int i = 0; i < n; i++) {

                if ((at[i] <= st) && (f[i] == 0) && (bt[i] < min)) {
                    min = bt[i];
                    c = i;
                }
            }
            if (c == n) {
                st++;
            } else {
                ct[c] = st + bt[c];
                st += bt[c];
                ta[c] = ct[c] - at[c];
                wt[c] = ta[c] - bt[c];
                f[c] = 1;
                pid[tot] = c + 1;
                tot++;
            }
        }
        System.out.println("\n-------------------------------------------------------------------------------------------");
        System.out.println("\nProccess\tArrival\t\tCPU\t\tComplete\tTurnaround\tWaiting");
        for (int i = 0; i < n; i++) {
            average_wt += wt[i];
            average_ta += ta[i];
            System.out.println("\n"+pid[i] + "\t\t" + at[i] + "\t\t" + bt[i] + "\t\t" + ct[i] + "\t\t" + ta[i] + "\t\t" + wt[i]);
        }
        System.out.println("\n-------------------------------------------------------------------------------------------");
        System.out.println("\nAverage Waiting Time is " + (float) (average_wt / n) + "ms");
        System.out.println("\nAverage Turnaround Time is " + (float) (average_ta / n) + "ms\n");
        
        sc.close();
        
   }
}
