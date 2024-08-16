#include<bits/stdc++.h>
using namespace std;

int main(){
    pair<int, int> p1 = {1 ,2};
    cout << "Pair 1: " <<  p1.first << " " << p1.second << endl;

    pair<int, pair<int,int> > p2= {1, {2,3} };
    cout << "Pair 2.1: " << p2.first << endl;
    cout << "Pair 2.2: " << p2.second.first << " " << p2.second.second << endl;

    pair<int, int> arr[] = {{1,2},{3,4},{5,6}};
    cout << "Pair 3 arr[1]: " <<  arr[1].first << " " << arr[1].second ;
    return 0;
}
