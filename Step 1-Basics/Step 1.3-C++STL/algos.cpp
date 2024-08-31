#include<bits/stdc++.h>
using namespace std;


void print_vector(vector<int> v){
        for(auto it: v){
                cout << it << " ";
        }
        cout << endl;
}

void print_vector_pair(vector<pair<int,int>> v){
        for(auto it: v){
                cout << it.first << " " << it.second ;
                cout << endl;
        }
        cout << endl;
}

bool comp(pair<int,int> p1, pair<int,int> p2){
        if(p1.second < p2.second)
                return true;
        if(p1.second > p2.second)
                return false;
        if(p1.first < p2.first)
                return false;
        else
                return true;
}

main(){
        // vector<int> v = {5,4,3,2,1};
        // sort(v.begin(), v.end());
        // print_vector(v);
        // cout << endl;
        // vector<int> v2 = {1,2,3,4,5};
        // sort(v2.begin(), v2.end(), greater<int>());
        // print_vector(v2);

        // vector<pair<int,int>> p = {{2,1},{4,1},{1,2}};

        // sort(p.begin(),p.end(),comp);

        // print_vector_pair(p);

        //This give the number of bits set
        //Ex: 7 Binary equivalent is 111
        // Here 3 bits are set so the oputput is 3
        //For 8 it would be 1, 8 binary eqivalent is 1000
        int cnt = __builtin_popcount(7);
        cout << cnt << endl;

        //To get the permutatuions 
        string s = "123";
        //We should make sure it's in the sorted order
        sort(s.begin(),s.end());
        do{
                cout << s << endl;
        } while(next_permutation(s.begin(),s.end()));


        //To find the max element
        vector<int> v3 = {3,4,2,7,0,1};
        cout << *max_element(v3.begin(),v3.end());
 
}


