#include<bits/stdc++.h>
using namespace std;

main(){
        queue<int> q;

        q.push(1); // 1 
        q.push(2); // 2
        q.emplace(3); // 1, 2 ,3

        q.back() += 4; // 1, 2, 7

        cout << q.front(); // 1
        cout << q.back(); // 7

        q.pop(); // 2, 7

        //Size, swap, empty same as stack
}
