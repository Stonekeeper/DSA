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

void merge_sort(vector<int> &arr,int low, int mid, int high){
    int left = low;
    int right = mid + 1;
    vector<int> temp;

    while (left <= mid && right <= high)
    {
        if(arr[left] <= arr[right]){
            temp.push_back(arr[left]);
            left++;
        } else {
            temp.push_back(arr[right]);
            right++;
        }
    }

    while( left <= mid){
        temp.push_back(arr[left]);
        left++;
    }

    while (right <= high)
    {
        temp.push_back(arr[right]);
        right++;
    }

    for(int i = low ; i <= high ; i++){
        arr[i] = temp[i-low];
    }
}

void merge_sort_divide(vector<int> &arr,int low, int high){
    if (low == high){
        return;
    }
    int mid = (low + high) / 2 ;
    merge_sort_divide(arr,low,mid);
    merge_sort_divide(arr,mid+1,high);
    merge_sort(arr,low,mid,high);
}




int quick_sort_partition(vector<int> &arr,int low, int high){
    int i = low;
    int j = high;
    int pivot = low;
    while(i < j){
        while(arr[i] <= arr[pivot] && i <= high - 1 ){
            i++;
        }
        cout << "i" << i;

        while (arr[j] >= arr[pivot] && j >= low + 1)
        {
            j--;
        }
        cout << "j" << j;

        if (i < j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

    }
    int temp = arr[pivot];
    arr[pivot] = arr[j];
    arr[j] = temp;

    return j;

}

void quick_sort(vector<int> &arr,int low,int high){
    if ( low < high){
        int partition_index = quick_sort_partition(arr, low, high);
        quick_sort(arr,low, partition_index - 1 );
        quick_sort(arr, partition_index + 1 , high);
    }

}


void recursive_bubble_sort(vector<int> &arr, int size){
    if(size == 1)
        return;
    
    for (int i = 0; i < size - 1 ; i++)
    {
        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    
    recursive_bubble_sort(arr, size - 1 );
}


// void recursive_insertion_sort(vector<int> &arr, int i){
//     if (i == arr.size() - 1 )
//         return;
    
//     for (int j = i - 1 ; j >= 0; j--)
//     {
//         if(arr[j] > arr[j+1]){
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//         }
//     }
    
//     recursive_insertion_sort(arr, i + 1);
    

// }

int main()
{
    vector<int> arr = {5,4,3,2,1};
    recursive_insertion_sort(arr, arr.size());
    print_vector(arr);
    return 0;
}
