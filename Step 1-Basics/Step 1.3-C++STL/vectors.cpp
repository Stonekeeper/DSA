#include<bits/stdc++.h>
using namespace std;


void print_vector(vector<int> v){
        for(auto it : v){
                cout << it << " ";
        }
        cout << endl;
}

main(){
        // Declare and insert into vectors
        vector<int> v;

        //Inserting 2 ways
        v.push_back(1);
        v.emplace_back(2);

        //vector of type pair
        vector< pair<int, int >> vec;
        vec.push_back({1,2});
        vec.emplace_back(1,2);

        //vector with prefilled values
        //The below will create the a vector of size 5 with the value 100 in it
        vector<int> v1(5,100);

        //Create a vector with 0 in the values
        vector<int> v2(5);

        //make a copy of the vector
        vector<int> v3(v2);

        vector<int> ex = {1,2,3,4,5};

        //access vector elements
        cout << ex[0] << " or " << ex.at(3) << endl;

        //To point to starting address of the vector
        vector<int>::iterator it = ex.begin();

        //Use * to print the values in the address
        cout << *(it) << endl;

        //To print the next element 
        it++;
        cout << *(it) << endl;

        //To point to the last element
        cout << ex.back() << endl;


        //To point (last element position + 1)th address of the vector
        it = ex.end();
        it--;
        cout << *(it) << endl;

        // // To point to (first - 1)th address of the vector rend = Reverse End
        // cout << ex.rend();

        // //To point to the last address it ++ will move in reverse
        // it = ex.rbegin();

        //To print elements in the vector
        for(vector<int>::iterator it = ex.begin(); it != ex.end() ; it++){
                cout << *(it) << " ";
        }
        cout << endl;

        //Auto
        for(auto it = ex.begin(); it != ex.end() ; it++){
                cout << *(it) << " ";
        }
        cout << endl;

        //for each loop
        for(auto it : ex){
                cout << it << " ";
        }
        cout << endl;
        //Erase

        //To Remove the first element 1 2 3 4 5 Removes 1 from the vector
        ex.erase(ex.begin());
        //Prints 2 3 4 5
        print_vector(ex);

        //To remove sequenece of elements 2 3 4 5
        ex.erase(ex.begin() + 2, ex.end());
        //Prints 4 5
        print_vector(ex);


        //Insert
        ex.insert(ex.begin(), 1);

        //Insert multiple elements
        ex.insert(ex.end(),3,5);

        //Insert in certain pos
        ex.insert(ex.begin() + 3, 4);

        print_vector(ex);

        //Size of the vector
        cout << ex.size() << endl;

        //Delete first element
        ex.pop_back();

        print_vector(ex);

        //To swap 2 lists
        // v1.swap(v2);

        ex.clear();

        //To check if vector is empty or not if it  returns 1 the vector is empty else its not 
        cout << ex.empty();

}
