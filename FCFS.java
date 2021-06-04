package FCFS_Scheduling;

import java.util.Scanner;

public class FCFS {

    public static void main(String[] args) {

        int numberOfProcesses;
        float average_wt, average_ta;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of Proccess: ");
            numberOfProcesses = sc.nextInt();
            //System.out.print("Enter the Staring Time: ");
            // int strating_time =sc.nextInt();
            int pid[] = new int[numberOfProcesses];//Proccess ID
            int ar[] = new int[numberOfProcesses];//Arrival Time
            int bt[] = new int[numberOfProcesses];//Burst/CPU Time
            int ct[] = new int[numberOfProcesses];//Completion Time// Strating + cpu time
            int ta[] = new int[numberOfProcesses];//Turnaround Time//Completion Time - Arrival Time
            int wt[] = new int[numberOfProcesses];//Waiting Time// Turnaround Time - CPU Time
            int temp;
            int[] stt = new int[10];
            //int stt[]=new int[strating_time];
            average_wt = 0;
            average_ta = 0;
            for (int i = 0; i < numberOfProcesses; i++) {
                
                System.out.print("\nProccess " + (i + 1) + " Arrival Time: ");
                ar[i] = sc.nextInt();
                System.out.print("Proccess " + (i + 1) + " Burst Time: ");
                bt[i] = sc.nextInt();
                pid[i] = i + 1;
            }   //Sorting According to Arrival Times
            for (int i = 0; i < numberOfProcesses; i++) {
                
                for (int j = 0; j < numberOfProcesses - (i + 1); j++) {
                    
                    if (ar[j] > ar[j + 1]) {
                        
                        temp = ar[j];//swap
                        ar[j] = ar[j + 1];//arrival time
                        ar[j + 1] = temp;
                        
                        temp = bt[j];
                        bt[j] = bt[j + 1];//cpu/burst time
                        bt[j + 1] = temp;
                        
                        temp = pid[j];
                        pid[j] = pid[j + 1];// proccess no
                        pid[j + 1] = temp;
                    }
                }
            }   //Finding Completion Times
            for (int i = 0; i < numberOfProcesses; i++) {
                if (i == 0) //condition
                {
                    ct[i] = ar[i] + bt[i];
                } else {
                    if (ar[i] > ct[i - 1]) {
                        ct[i] = ar[i] + bt[i];
                    } else {
                        ct[i] = ct[i - 1] + bt[i];
                    }
                }
                
                ta[i] = ct[i] - ar[i];//turnaround time = completion time - arrival time
                wt[i] = ta[i] - bt[i];// waiting time = turnaround time - burst/cpu time
                
                average_wt += wt[i];//total waiting time
                average_ta += ta[i];//total turnaround time
                
            }   //------------ Start ---------------------------
            if (ar[0] <= ct[0]) {
                
                stt[0] = ar[0];
                //---------- Index 1 --------------------------------
            } else if (ar[1] < ct[1]) {
                
                stt[1] = ct[1];
                
            } else if (ar[1] > ct[1]) {
                stt[1] = ar[1];
                
            }//---------- Index 2 ----------------------------
            else if (ar[2] > ct[2]) {
                
                stt[2] = ar[2];
                
            } else if (ar[2] < ct[2]) {
                
                stt[2] = ct[2];
                
            }//---------- Index 3 ---------------------------
            else if (ar[3] < ct[3]) {
                
                stt[3] = ct[3];
            } else if (ar[3] > ct[3]) {
                
                stt[3] = ar[3];
            }
            //------------- End -------------------------
            for (int i = 0; i < numberOfProcesses; i++) {
                
                stt[i] = stt[0] + stt[1] + stt[2] + stt[3];
            }   System.out.println("\n-------------------------------------------------------------------------------------------------------");
            System.out.println("\nProccess\tArrival\t\tStarting \tBrust\t\tCompletion\tTurnaround\tWaiting");
            System.out.println("\n-------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < numberOfProcesses; i++) {
                System.out.println("\n " + pid[i] + "\t\t" + ar[i] + "\t\t" + ar[i] + "\t\t" + bt[i] + "\t\t" + ct[i] + "\t\t" + ta[i] + "\t\t" + wt[i]);
                
            }   System.out.println("\n-------------------------------------------------------------------------------------------------------");
        }

        System.out.println("\n\nAverage Waiting Time: " + (average_wt / numberOfProcesses) + "ms");//print Average Waiting Time
        System.out.println("\nAverage Turnaround Time: " + (average_ta / numberOfProcesses + "ms\n"));//print Average Turnaround Time

    }
}
