// #include <stdio.h>

// struct process
// {
//     int AT, WT, TT, BT;
// };
// struct process a[10];
// int main(){
//     int n;
//     int burst = 0, cmpl_T;
//     float Avg_WT, Avg_TT, Total = 0;
//     printf("Enter number of process\n");
//     scanf("%d", &n);
//     printf("Enter Arrival time and Burst time of the process\n");
//     printf("At BT\n");
//     for (int i = 0; i < n; i++)
//     {
//         scanf("%d", &a[i].AT);
//         scanf("%d", &a[i].BT);
//     }
//     for (int i = 0; i < n; i++)
//     {
//         if (i == 0)
//             a[i].WT = a[i].AT;
//         else
//             a[i].WT = burst - a[i].AT;
//         burst += a[i].BT;
//         Total += a[i].WT;
//     }
//     Avg_WT = Total / n;
//     Total = 0;
//     for (int i = 0; i < n; i++)
//     {
//         cmpl_T += a[i].BT;
//         a[i].TT = cmpl_T - a[i].AT;
//         Total += a[i].TT;
//     }
//     Avg_TT = Total / n;
//     printf("Process , Waiting_time , TurnA_time\n");
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d\t\t%d\t\t%d\n", i + 1, a[i].WT, a[i].TT);
//     }
//     printf("Average waiting time is : %f\n", Avg_WT);
//     printf("Average turn around time is : %f\n", Avg_TT);
//     return 0;
// }
// SJF
// #include <stdio.h>
// struct process
// {
//     int WT, AT, BT, TAT;
// };
// struct process a[10];
// int main()
// {
//     int n, temp[10];
//     int count = 0, t = 0, short_P;
//     float total_WT = 0, total_TAT = 0, Avg_WT, Avg_TAT;
//     printf("Enter the number of the process\n");
//     scanf("%d", &n);

//     printf("Enter the arrival time and burst time of the process\n");
//     printf("AT WT\n");
//     for (int i = 0; i < n; i++)
//     {
//         scanf("%d%d", &a[i].AT, &a[i].BT);

//         // copying the burst time in a temp array for the further use
//         temp[i]=a[i].BT;
//     }
//     // initialize max burst time
//     a[9].BT = 10000;
//     for (t = 0; count != n; t++)
//     {
//         // for finding min burst
//         short_P = 9;
//         for (int i = 0; i < n; i++)
//         {
//             if (a[i].BT < a[short_P].BT && (a[i].AT <= t && a[i].BT > 0))
//             {
//                 short_P = i;
//             }
//         }
//         a[short_P].BT = a[short_P].BT - 1;
//         // any process is completed
//         if (a[short_P].BT == 0)
//         {
//             count++;
//             a[short_P].WT = t + 1 - a[short_P].AT - temp[short_P];
//             a[short_P].TAT = t + 1 - a[short_P].AT;

//             total_WT = total_WT + a[short_P].WT;
//             total_TAT = total_TAT + a[short_P].TAT;
//         }
//     }
//     Avg_WT = total_WT / n;
//     Avg_TAT = total_TAT / n;
//     printf("Id WT TAT\n");
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d\t%d\t%d\n", i + 1, a[i].WT, a[i].TAT);
//     }
//     printf("Avg waiting time of the process is %f\n", Avg_WT);
//     printf("Avg turn around time of the process %f\n", Avg_TAT);
// }
// Priority
// #include <stdio.h>
// struct process{
//     int WT, AT, BT, TAT, PT;
// };
// struct process a[10];
// int main()
// {
//     int n, temp[10], t, count = 0, short_p;
//     float total_WT = 0, total_TAT = 0, Avg_WT, Avg_TAT;
//     printf("Enter the number of the process\n");
//     scanf("%d", &n);
//     printf("Enter the arrival time , burst time and priority of the process\n");
//     printf("AT BT PT\n");
//     for (int i = 0; i < n; i++)
//     {
//         scanf("%d%d%d", &a[i].AT, &a[i].BT, &a[i].PT);
//         temp[i] = a[i].BT;
//     }
//     a[9].PT = 10000;
//     for (t = 0; count != n; t++)
//     {
//         short_p = 9;
//         for (int i = 0; i < n; i++)
//         {
//             if (a[short_p].PT > a[i].PT && a[i].AT <= t && a[i].BT > 0)
//             {
//                 short_p = i;
//             }
//         }
//         a[short_p].BT = a[short_p].BT - 1;
//         // any process completed
//         if(a[short_p].BT==0)
//         {
//             count++;
//             a[short_p].WT = t + 1 - a[short_p].AT - temp[short_p];
//             a[short_p].TAT = t + 1 - a[short_p].AT;
//             total_WT = total_WT + a[short_p].WT;
//             total_TAT = total_TAT + a[short_p].TAT;
//         }
//     }
//     Avg_WT = total_WT / n;
//     Avg_TAT = total_TAT / n;
//     // printing of the answer
//     printf("ID WT TAT\n");
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d %d\t%d\n", i + 1, a[i].WT, a[i].TAT);
//     }
//     printf("Avg waiting time of the process is %f\n", Avg_WT);
//     printf("Avg turn around time of the process is %f\n", Avg_TAT);
//     return 0;
// }

// Round Robin
//  P BT  AT
// p1 6   2
// p2 2   5
// p3 8   1
// p4 3   0
// p5 4   4
//    23
#include <iostream>
using namespace std;
int main()
{
    int no_of_process=0, quantum=0, total_time=0;
    cout << "\n Enter the Number Process : ";
    cin >> no_of_process;
    cout << "\n Enter Quantum : ";
    cin >> quantum;
    int burst_time[no_of_process], arrival_time[no_of_process];
    cout << "\n Enter Burst Time & Arrival Time for process ";
    for (int i = 0; i < no_of_process; i++)
    {
        cout << "\n  Burst Time of Process " << i + 1 << " : ";
        cin >> burst_time[i];
        cout << " Arrival Time " << i + 1 << " : ";
        cin >> arrival_time[i];
    }

    cout << " Process ID\t Burst Time\t Arrival Time ";
    for (int i = 0; i < no_of_process; i++)
    {
        cout << "\n\tP" << i << "\t\t" << burst_time[i] << "\t\t" << arrival_time[i];
        total_time += burst_time[i];
    }
    cout << "\n Gantt Chart : ";
    cout << "\n Total Time =  " << total_time << "\n";
    int count = 0;
    int queue[no_of_process];
    
    while (count < total_time)
    {
        if (count > total_time)
            break;

        count++;
    }
}