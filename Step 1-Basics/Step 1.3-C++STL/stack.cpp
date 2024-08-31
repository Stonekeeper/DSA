#include<bits/stdc++.h>
using namespace std;

main(){
        stack<int> st;
        st.push(1); // 1
        st.push(2); // 2,1 
        st.push(3); // 3,2,1
        st.emplace(4); // 4,3,2,1

        cout << st.top(); // Prints 4

        st.pop(); // 3,2,1

        cout << st.top(); // Prints 3

        cout << st.size(); // 3

        cout << st.empty(); // Checks if stack is empty or not

        stack<int> st1,st2;

        st.swap(st2);

}
