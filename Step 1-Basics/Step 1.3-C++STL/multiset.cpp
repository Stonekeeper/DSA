#include<bits/stdc++.h>
using namespace std;

void print_multiset(multiset<int> st){
        for(auto it = st.begin(); it != st.end() ; it++){
                cout << *(it) <<  " ";
        }
}

main() {
        //Mutliset stores multiple occrances of the same element in sorted order
        multiset<int> st;
        st.insert(1);
        st.insert(1);
        st.insert(1);
        st.insert(1);
        st.insert(2);
        st.insert(2);
        st.insert(3);

        //This will erase all the occurances of 2
        st.erase(2);

        
        //Earse just one element using the iteratior
        //This will erase the first occurance of the element 1 
        st.erase(st.find(1));

        //Other functions are same as vectors

}
