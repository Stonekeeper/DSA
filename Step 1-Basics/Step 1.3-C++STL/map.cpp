#include<bits/stdc++.h>
using namespace std;

main(){

        //Examples
        // Key = Integer and Value = Integer
        map<int, int> mp;
        
        //Key = Integer and Value = Pair
        map<int, pair<int,int>> mp2;

        //Key = Pair and Value = integer
        map<pair<int,int>, int> mp3;
        
        //Inserting into map
        mp[1] = 1;
        mp.insert({2,2});
        mp.emplace(3,4);

        for(auto it: mp){
                cout << "Key: " << it.first << " Value: " << it.second ;
        }

        //Access values

        //Direct access using key
        cout << mp[2];

        //Access using iterator
        map<int,int>::iterator it2 = mp.find(2);
        cout << *(it2).second;


        //Multimap
        // Can have multiple keys with same values and it will be in sorted order

        //Unorderedmap
        //Will have unique keys but in unsorted order
        
}
