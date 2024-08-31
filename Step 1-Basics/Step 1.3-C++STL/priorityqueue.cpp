#include<bits/stdc++.h>
using namespace std;

main(){
        //Stores the Max element at the top
        // MAX heap or Priority Queue
        priority_queue<int> pq;

        pq.push(5); // 5
        pq.push(10); // 10, 5
        pq.emplace(20); // 20, 10, 5
        pq.emplace(100); // 100, 20, 10 ,5

        cout << pq.top(); // Prints 100

        pq.pop(); // 20, 10, 5

        //Min Heap 
        priority_queue<int, vector<int>, greater<int>> pq1;
        pq1.push(5); // 5
        pq1.push(10); // 5, 10
        pq1.emplace(20); // 5, 10, 20
        pq1.emplace(100); // 5, 10, 20, 100

        cout << pq.top(); // Prints 5

        pq1.pop(); // 10, 20, 100

}
