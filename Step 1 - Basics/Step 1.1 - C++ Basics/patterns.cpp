#include <bits/stdc++.h>
using namespace std;

/*
*****
*****
*****
*****
*****
*/
void pattern1(int n){
    for (int i = 0; i < n; i++)
    {
        for(int j = 0 ; j < n ;j++){
            cout << "*";
        }
        cout << endl;
    }
    
}


/*
*
**
***
****
*****
*/
void pattern2(int n){
    for (int i = 1; i <= n; i++)
    {
        for(int j = 1 ; j <= i ;j++){
            cout << "*";
        }
        cout << endl;
    }
    
}

/*
1
12
123
1234
12345
*/
void pattern3(int n){
    for (int i = 1; i <= n; i++)
    {
        for(int j = 1 ; j <= i ;j++){
            cout << j;
        }
        cout << endl;
    }
    
}

/*
1
22
333
4444
55555
*/
void pattern4(int n){
    for (int i = 1; i <= n; i++)
    {
        for(int j = 1 ; j <= i ;j++){
            cout << i;
        }
        cout << endl;
    }
    
}

/*
*****
****
***
**
*
*/
void pattern5(int n){
    for (int i = 1; i <= n; i++)
    {
        for(int j =  n; j >=i ;j--){
            cout << "*";
        }
        cout << endl;
    }
    
}

/*
12345
1234
123
12
1
*/
void pattern6(int n){
    for (int i = 1; i <= n; i++)
    {
        for(int j =  1; j <= n-i+1 ;j++){
            cout << j;
        }
        cout << endl;
    }
    
}

/*
    *    
   ***   
  *****  
 ******* 
*********
*/
void pattern7(int n){
    for (int i = 1; i <= n; i++)
    {
        for(int j =  1; j <= n-i;j++){
            cout << " ";
        }
        for(int j =  1; j <= (2 * i) - 1 ;j++){
            cout << "*";
        }
        for(int j =  1; j <= n-i;j++){
            cout << " ";
        }
        cout << endl;
    }
    
}

/*
*********
 ******* 
  *****  
   ***   
    *    
*/
void pattern8(int n){
    for (int i = n; i >= 1; i--)
    {
        for(int j =  1; j <= n-i;j++){
            cout << " ";
        }
        for(int j =  1; j <= (2 * i) - 1 ;j++){
            cout << "*";
        }
        for(int j =  1; j <= n-i;j++){
            cout << " ";
        }
        cout << endl;
    }
    
}


/*
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *    
*/
void pattern9(int n){
    pattern7(n);
    pattern8(n);
}

/*
*
**
***
****
*****
****
***
**
*
*/
void pattern10(int n){
    for (int i = 1; i <= (2 * n) - 1; i++)
    {   
        int stars;
        if (i > 5) stars = (2*n) - i;
        else stars = i;
        for(int j = 1 ; j <= stars ;j++){
            cout << "*";
        }
        cout << endl;
    }
    
}

/*
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/
void pattern11(int n){
    for (int i = 1; i <= n; i++)
    {
        int flag;
        if (i % 2 == 0) flag = 0;
        else flag = 1;
    
        for(int j = 1 ; j <= i ;j++){
            cout << flag << " ";
            flag = 1 - flag;
        }
        cout << endl;
    }
    
}

/*
1        1
12      21
123    321
1234  4321
1234554321
*/
void pattern12(int n){
    for (int i = 1; i <= n; i++)
    {
        for(int j =  1; j <=i;j++){
            cout << j;
        }
        for(int j =  1; j <= (2 * n) - (2 * i) ;j++){
            cout << " ";
        }
        for(int j = i; j >= 1;j--){
            cout << j;
        }
        cout << endl;
    }
    
}


/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
void pattern13(int n){
    int counter = 1;
    for (int i = 1; i <= n; i++)
    {
        for(int j =  1; j <= i;j++){
            cout << counter << " ";
            counter++;
        }
        cout << endl;
    }
    
}

/*
A
AB
ABC
ABCD
ABCDE
*/
void pattern14(int n){
    for (int i = 1; i <= n; i++)
    {
        for(char j = 'A'; j <= 'A'+i-1;j++){
            cout << j ;
        }
        cout << endl;
    }
    
}

/*
ABCDE
ABCD
ABC
AB
A
*/
void pattern15(int n){
    for (int i = 1; i <= n; i++)
    {
        for(char j = 'A'; j <= 'A' + n - i;j++){
            cout << j ;
        }
        cout << endl;
    }
    
}


/*
A
BB
CCC
DDDD
EEEEE
*/
void pattern16(int n){
    for (int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= i ;j++){
            cout << (char)('A' + i - 1) ;
        }
        cout << endl;
    }
    
}

/*
    A    
   ABA   
  ABCBA  
 ABCDCBA 
ABCDEDCBA
*/
void pattern17(int n){
    for (int i = 0; i < n; i++)
    {
        int flag;
        for (int j = 0; j < n - i - 1 ; j++)
        {
            cout << " ";
        }
        for (int j = 0; j < 2 * i + 1  ; j++)
        {
            if (j > i) flag--;
            else flag = j;
            cout << (char)('A'+ flag) ;
        }
        for (int j = 0; j < n - i - 1 ; j++)
        {
            cout << " ";
        }
        cout << endl;
    }
    
}

/*
E
DE
CDE
BCDE
ABCDE
*/
void pattern18(int n){
    for (int i = 0; i < n; i++)
    {
        for (char j = 'A' + n - 1 - i ; j <= 'A' + n - 1; j++)
        {
            cout << j;
        }
        cout << endl;
        
    }
    
}

/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/
void pattern19(int n){
    for (int i = 0; i < n; i++)
    {
        int stars, spaces;
        stars = n - i; spaces = 2 * i;
        for(int j =  0; j < stars;j++){
            cout << "*";
        }
        for(int j =  0; j < spaces ;j++){
            cout << " ";
        }
        for(int j =  0; j < stars;j++){
            cout << "*";
        }
        cout << endl;
    }

    for (int i = 0; i < n; i++)
    {
        int stars, spaces;
        stars = i; spaces = (2 * n - 2 ) - (2 * i);
        for(int j =  0; j <= stars;j++){
            cout << "*";
        }
        for(int j =  0; j < spaces ;j++){
            cout << " ";
        }
        for(int j =  0; j <= stars;j++){
            cout << "*";
        }
        cout << endl;
    }
}

/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/
void pattern20(int n){
    for(int i = 1 ; i < 2 * n ; i++){
        int stars, spaces;
        if (i > n ){
            stars = (2 * n) - i;
            spaces += 2;
        } else {
            stars = i;
            spaces = (2 * n) - (2 * i);
        }
        for (int j = 1; j <= stars; j++)
        {
            cout << "*";
        }
        for (int j = 0; j < spaces; j++)
        {
            cout << " ";
        }
        for (int j = 1; j <= stars; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

/*
*****
*   *
*   *
*   *
*****
*/
void pattern21(int n){
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1){
                cout << "*";
            } else {
                cout << " ";
            }
        }
        cout << endl;
        
    }
    
}

/*
555555555
544444445
543333345
543222345
543212345
543222345
543333345
544444445
555555555
*/
void pattern22(int n){
    for (int i = 0; i < 2 * n - 1; i++)
    {
        for (int j = 0; j < 2 * n - 1; j++)
        {
            int top = i;
            int bottom = (2 * n - 2) - i ;
            int left = j ;
            int right = (2 * n - 2) - j;
            
            cout << (n - min(min(top,bottom), min(left,right)));

        }
        cout << endl;
        
    }
    
}
int main(){
    return 0;
}
