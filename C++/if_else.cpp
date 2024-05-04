#include <bits/stdc++.h>
using namespace std;

int main (){
    int age;
    cout << "Enter you're age:" << "\n";
    cin >> age;
    if (age >= 18){
        cout << "You are an Adult." << "\n";
    } else {
        cout << "You are Minor";
    }

    // If marks are less than 25, it prints "Grade: F."
    // If marks are between 25 and 44 (inclusive), it prints "Grade: E."
    // If marks are between 45 and 49 (inclusive), it prints "Grade: D."
    // If marks are between 50 and 59 (inclusive), it prints "Grade: C."
    // If marks are between 60 and 69 (inclusive), it prints "Grade: B."
    // If marks are 70 or higher, it prints "Grade: A."
    // If marks are outside the valid range, it prints "Invalid marks entered."
    int marks;
    char grade;
    cout << "Enter the marks:" << endl ;
    cin >> marks;
    if (marks < 25){
        grade = 'F';
    } else if (marks < 45 ) {
        grade = 'E';
    } else if (marks < 50) {
        grade = 'D';
    } else if (marks < 60) {
        grade = 'C';
    } else if (marks < 70) {
        grade = 'B';
    } else if (marks >= 70) {
        grade = 'A';
    } else {
        cout << "Invalid marks entered..!";
    }

    cout << "Grade: " << grade ;
    return 0;
}


