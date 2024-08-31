#include<bits/stdc++.h>
using namespace std;

void print_dequeue(deque<int> ls){
        for (auto l : ls )
        {
                cout << l << " ";
        }
        cout << endl;
}

main() {
        deque<int> dq;

        dq.push_back(1); // {1}
        dq.emplace_back(2); // {1,2}

        print_dequeue(dq);

        dq.push_front(0); // {0,1,2}
        dq.emplace_front(0); // {0,0,1,2}

        print_dequeue(dq);

        dq.pop_front(); // {0,1,2}
        dq.pop_back(); // {0,1}

        print_dequeue(dq);

        cout << dq.back() << endl; // 1
        cout << dq.front() << endl; // 0

        //Rest are same as vector
        // begin, end, rbegin, rend, size, empty, swap, size



}
