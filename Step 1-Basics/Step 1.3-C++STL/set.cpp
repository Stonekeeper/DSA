#include<bits/stdc++.h>
using namespace std;

//Set -> Sorted and Unique

main() {
        set<int> st;
        st.insert(2); // {2}
        st.insert(1); // {1,2}
        st.emplace(3); // {1,2,3}

        //Returns the iterator for element 2
        set<int>::iterator it = st.find(2);

        //If we try to find the element which does not exists
        //Then it'll return the end
        auto it = st.find(4);

        //Takes log time
        st.erase(2); // {1,3}

        // Returns 1 in element 1 exists or else 0
        int cnt = st.count(1);
}

