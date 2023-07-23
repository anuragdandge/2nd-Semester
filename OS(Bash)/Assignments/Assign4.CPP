// FIFO
// #include <bits/stdc++.h>
// using namespace std;

// int pageFaults(int pages[], int n, int capacity)
// {
//     unordered_set<int> s;
//     queue<int> indexes;
//     int page_faults = 0;
//     for (int i = 0; i < n; i++)
//     {
//         if (s.size() < capacity)
//         {
//             if (s.find(pages[i]) == s.end())
//             {
//                 s.insert(pages[i]);
//                 page_faults++;
//                 indexes.push(pages[i]);
//             }
//         }
//         else
//         {
//             if (s.find(pages[i]) == s.end())
//             {
//                 int val = indexes.front();
//                 indexes.pop();
//                 s.erase(val);
//                 s.insert(pages[i]);
//                 indexes.push(pages[i]);
//                 page_faults++;
//             }
//         }
//     }
//     return page_faults;
// }
// int main()
// {
//     int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};
//     int n = sizeof(pages) / sizeof(pages[0]);
//     int capacity = 4;
//     cout << pageFaults(pages, n, capacity);
//     return 0;
// }

// LRU

//C++ implementation of above algorithm
// #include<bits/stdc++.h>
// using namespace std;
// int pageFaults(int pages[], int n, int capacity)
// {
// 	unordered_set<int> s;

// 	unordered_map<int, int> indexes;

// 	int page_faults = 0;
// 	for (int i=0; i<n; i++)
// 	{
// 		if (s.size() < capacity)
// 		{
// 			if (s.find(pages[i])==s.end())
// 			{
// 				s.insert(pages[i]);

// 				page_faults++;
// 			}

		
// 			indexes[pages[i]] = i;
// 		}

// 		else
// 		{
			
// 			if (s.find(pages[i]) == s.end())
// 			{
// 				int lru = INT_MAX, val;
// 				for (auto it=s.begin(); it!=s.end(); it++)
// 				{
// 					if (indexes[*it] < lru)
// 					{
// 						lru = indexes[*it];
// 						val = *it;
// 					}
// 				}

			
// 				s.erase(val);

				
// 				s.insert(pages[i]);


// 				page_faults++;
// 			}

// 			indexes[pages[i]] = i;
// 		}
// 	}

// 	return page_faults;
// }


// int main()
// {
// 	int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};
// 	int n = sizeof(pages)/sizeof(pages[0]);
// 	int capacity = 4;
// 	cout << pageFaults(pages, n, capacity);
// 	return 0;
// }

// Optimal Page 

// #include <bits/stdc++.h>
// using namespace std;

// bool search(int key, vector<int>& fr)
// {
// 	for (int i = 0; i < fr.size(); i++)
// 		if (fr[i] == key)
// 			return true;
// 	return false;
// }
// int predict(int pg[], vector<int>& fr, int pn, int index)
// {
// 	int res = -1, farthest = index;
// 	for (int i = 0; i < fr.size(); i++) {
// 		int j;
// 		for (j = index; j < pn; j++) {
// 			if (fr[i] == pg[j]) {
// 				if (j > farthest) {
// 					farthest = j;
// 					res = i;
// 				}
// 				break;
// 			}
// 		}

// 		if (j == pn)
// 			return i;
// 	}

// 	return (res == -1) ? 0 : res;
// }

// void optimalPage(int pg[], int pn, int fn)
// {
// 	vector<int> fr;

// 	int hit = 0;
// 	for (int i = 0; i < pn; i++) {

// 		if (search(pg[i], fr)) {
// 			hit++;
// 			continue;
// 		}

// 		if (fr.size() < fn)
// 			fr.push_back(pg[i]);

// 		else {
// 			int j = predict(pg, fr, pn, i + 1);
// 			fr[j] = pg[i];
// 		}
// 	}
// 	cout << "No. of hits = " << hit << endl;
// 	cout << "No. of misses = " << pn - hit << endl;
// }


// int main()
// {
// 	int pg[] = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2 };
// 	int pn = sizeof(pg) / sizeof(pg[0]);
// 	int fn = 4;
// 	optimalPage(pg, pn, fn);
// 	return 0;
// }

// C implementation of First - Fit algorithm
// #include<stdio.h>

// // Function to allocate memory to
// // blocks as per First fit algorithm
// void firstFit(int blockSize[], int m, int processSize[], int n)
// {
// 	int i, j;
// 	// Stores block id of the
// 	// block allocated to a process
// 	int allocation[n];

// 	// Initially no block is assigned to any process
// 	for(i = 0; i < n; i++)
// 	{
// 		allocation[i] = -1;
// 	}

// 	// pick each process and find suitable blocks
// 	// according to its size ad assign to it
// 	for (i = 0; i < n; i++)	 //here, n -> number of processes
// 	{
// 		for (j = 0; j < m; j++)	 //here, m -> number of blocks
// 		{
// 			if (blockSize[j] >= processSize[i])
// 			{
// 				// allocating block j to the ith process
// 				allocation[i] = j;

// 				// Reduce available memory in this block.
// 				blockSize[j] -= processSize[i];

// 				break; //go to the next process in the queue
// 			}
// 		}
// 	}

// 	printf("\nProcess No.\tProcess Size\tBlock no.\n");
// 	for (int i = 0; i < n; i++)
// 	{
// 		printf(" %i\t\t\t", i+1);
// 		printf("%i\t\t\t\t", processSize[i]);
// 		if (allocation[i] != -1)
// 			printf("%i", allocation[i] + 1);
// 		else
// 			printf("Not Allocated");
// 		printf("\n");
// 	}
// }

// // Driver code
// int main()
// {
// 	int m; //number of blocks in the memory
// 	int n; //number of processes in the input queue
// 	int blockSize[] = {100, 500, 200, 300, 600};
// 	int processSize[] = {212, 417, 112, 426};
// 	m = sizeof(blockSize) / sizeof(blockSize[0]);
// 	n = sizeof(processSize) / sizeof(processSize[0]);

// 	firstFit(blockSize, m, processSize, n);

// 	return 0 ;
// }

// Best Fit :

// // C++ implementation of Best - Fit algorithm
// #include<iostream>
// using namespace std;

// // Method to allocate memory to blocks as per Best fit algorithm
// void bestFit(int blockSize[], int m, int processSize[], int n)
// {
// 	// Stores block id of the block allocated to a process
// 	int allocation[n];

// 	// Initially no block is assigned to any process
// 	for (int i = 0; i < n; i++)
// 		allocation[i] = -1;

// 	// pick each process and find suitable blocks
// 	// according to its size ad assign to it
// 	for (int i = 0; i < n; i++)
// 	{
// 		// Find the best fit block for current process
// 		int bestIdx = -1;
// 		for (int j = 0; j < m; j++)
// 		{
// 			if (blockSize[j] >= processSize[i])
// 			{
// 				if (bestIdx == -1)
// 					bestIdx = j;
// 				else if (blockSize[bestIdx] > blockSize[j])
// 					bestIdx = j;
// 			}
// 		}

// 		// If we could find a block for current process
// 		if (bestIdx != -1)
// 		{
// 			// allocate block j to p[i] process
// 			allocation[i] = bestIdx;

// 			// Reduce available memory in this block.
// 			blockSize[bestIdx] -= processSize[i];
// 		}
// 	}

// 	cout << "\nProcess No.\tProcess Size\tBlock no.\n";
// 	for (int i = 0; i < n; i++)
// 	{
// 		cout << " " << i+1 << "\t\t" << processSize[i] << "\t\t";
// 		if (allocation[i] != -1)
// 			cout << allocation[i] + 1;
// 		else
// 			cout << "Not Allocated";
// 		cout << endl;
// 	}
// }

// // Driver Method
// int main()
// {
// 	int blockSize[] = {100, 500, 200, 300, 600};
// 	int processSize[] = {212, 417, 112, 426};
// 	int m = sizeof(blockSize) / sizeof(blockSize[0]);
// 	int n = sizeof(processSize) / sizeof(processSize[0]);

// 	bestFit(blockSize, m, processSize, n);

// 	return 0 ;
// }


// Worst Fit :

// C++ implementation of worst - Fit algorithm
#include<bits/stdc++.h>
using namespace std;

// Function to allocate memory to blocks as per worst fit
// algorithm
void worstFit(int blockSize[], int m, int processSize[],
												int n)
{
	// Stores block id of the block allocated to a
	// process
	int allocation[n];

	// Initially no block is assigned to any process
	memset(allocation, -1, sizeof(allocation));

	// pick each process and find suitable blocks
	// according to its size ad assign to it
	for (int i=0; i<n; i++)
	{
		// Find the best fit block for current process
		int wstIdx = -1;
		for (int j=0; j<m; j++)
		{
			if (blockSize[j] >= processSize[i])
			{
				if (wstIdx == -1)
					wstIdx = j;
				else if (blockSize[wstIdx] < blockSize[j])
					wstIdx = j;
			}
		}

		// If we could find a block for current process
		if (wstIdx != -1)
		{
			// allocate block j to p[i] process
			allocation[i] = wstIdx;

			// Reduce available memory in this block.
			blockSize[wstIdx] -= processSize[i];
		}
	}

	cout << "\nProcess No.\tProcess Size\tBlock no.\n";
	for (int i = 0; i < n; i++)
	{
		cout << " " << i+1 << "\t\t" << processSize[i] << "\t\t";
		if (allocation[i] != -1)
			cout << allocation[i] + 1;
		else
			cout << "Not Allocated";
		cout << endl;
	}
}

// Driver code
int main()
{
	int blockSize[] = {100, 500, 200, 300, 600};
	int processSize[] = {212, 417, 112, 426};
	int m = sizeof(blockSize)/sizeof(blockSize[0]);
	int n = sizeof(processSize)/sizeof(processSize[0]);

	worstFit(blockSize, m, processSize, n);

	return 0 ;
}
