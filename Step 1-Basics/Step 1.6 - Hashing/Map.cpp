#include<bits/stdc++.h>
using namespace std;

int main(){

    // map stores all the values in sorted order
    map<int,int> mp;
    int input_size;
    cin >> input_size;

    for (int i = 0; i < input_size; i++){
        int input;
        cin >> input;
        mp[input] += 1;
    }

    int q;
    cin >> q;

    while(q--){
        int query_element;
        cin >> query_element;
        cout << "The frequency of " << query_element << " is " << mp[query_element] << endl;
    }

    return 0;
}