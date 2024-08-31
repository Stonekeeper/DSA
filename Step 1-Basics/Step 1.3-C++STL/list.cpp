#include<bits/stdc++.h>
using namespace std;

void print_list(list<int> ls){
        for (auto l : ls )
        {
                cout << l << " ";
        }
        cout << endl;
}

main(){
        //Declare a List
        list<int> ls;

        ls.push_back(1);

        ls.emplace_back(2);

        ls.push_front(0);

        ls.emplace_front(0);

        print_list(ls);

        cout << "begin: " << *(ls.begin()) << endl;

        auto it = ls.end();
        it--;

        cout << "end: " << *(it) << endl;

        cout << "back: " << ls.back() << endl;

        list<int>::iterator lt = ls.begin();
        advance(lt,2);
        ls.insert(it, 1);

        print_list(ls);

        ls.clear();

        print_list(ls);

        cout << ls.size() << endl;

        
}
