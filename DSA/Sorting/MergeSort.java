public class MergeSort {
    
    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void sort(int[] arr,int[] temp, int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            sort(arr,temp,low,mid);
            sort(arr,temp,mid+1, high);
            merge(arr,temp,low,mid,high);
        }
    }

    public void merge(int[] arr,int[] temp, int low,int mid,int high){
        
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low, j = mid+1, k = low;

        while(i<=mid && j<=high){
            if(temp[i] <= temp[j]){
                arr[k] = temp[i];
                k++;
                i++;
            } else {
                arr[k] = temp[j];
                k++;
                j++;
            }
        }
        while(i<= mid){
            arr[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        MergeSort qs = new MergeSort();
        int[] arr = {6,5,4,3,2,1};
        System.out.println("Before Sorting");
        qs.printArray(arr);
        qs.sort(arr,new int[arr.length], 0, arr.length-1);
        System.out.println("After Sorting");
        qs.printArray(arr);

    }
}
