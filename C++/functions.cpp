#include <bits/stdc++.h>
using namespace std;


void printName(string name){
    cout << "Hello " << name << endl; 
}

void add(int a, int b){
    cout << "Sum of " << a << " and " << b << " is " << a+b << endl;
}

int sum(int num1, int num2){
    return num1 + num2;
}

// Pass by value 
void incrementByFive(int num){
    num += 5;
    cout << "Inside the function after incrementing: " << num << endl;
}

// Pass by reference 
void incrementByTen(int &num){
    num += 10;
    cout << "Inside the function after incrementing: " << num << endl;
}

int main(){
    string name;
    cin >> name;
    printName(name);

    string name2;
    cin >> name2;
    printName(name2);

    int a , b;
    cin >> a >> b;
    add(a,b);

    int n1 , n2 ;
    cin >> n1 >> n2;
    int res = sum(n1,n2);
    cout << "Sum of " << n1 << " and " << n2 << " is " << res << endl;

    int num;
    cin >> num;
    incrementByFive(num);
    cout << "After function execution (incrementByFive) the num is: " << num << endl;

    cin >> num;
    incrementByTen(num);
    cout << "After function execution (incrementByTen) the num is: " << num << endl;
    return 0;
}
