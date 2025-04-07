#include<bits/stdc++.h>
using namespace std;

void print_vector(vector<int> arr);


void selection_sort(vector<int> arr){
    // Find Minimun and Swap
    for(int i = 0 ; i < arr.size() - 1 ; i++) {
        int min_value_index = i;
        int j;
        for(j = i + 1; j < arr.size() ; j++){
            if ( arr[min_value_index] > arr[j] ){
                min_value_index = j;

            }
        }
        int temp = arr[i];
        arr[i] = arr[min_value_index];
        arr[min_value_index] = temp;
    }
    //print_vector(arr);
}


void bubble_sort(vector<int> arr){

    for (int i = 0; i < arr.size() - 1; i++)
    {
        for (int j = 0; j < arr.size() - 1 - i; j++)
        {
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        
    }
    
    //print_vector(arr);
}


void insertion_sort(vector<int> arr){
    for (int i = 0; i < arr.size(); i++)
    {
        for (int j = i; j > 0; j--)
        {
            if(arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        
    }
    print_vector(arr);
}

void print_vector(vector<int> arr){
    for (auto it: arr)
    {
        cout << it << endl;
    }
}

int main()
{
    vector<int> arr = {5,4,3,2,1};
    insertion_sort(arr);
    return 0;
}
