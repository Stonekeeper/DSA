public class QuickSort {
    
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int j = low;
        int i = low;

        while(i <= high){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
    }

    public void sort(int[] arr,int low, int high){
        if(low<high){
            int p = partition(arr,low,high);
            sort(arr, low,p-1);
            sort(arr, p+1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {6,5,4,3,2,1};
        System.out.println("Before Sorting");
        qs.printArray(arr);
        qs.sort(arr, 0, arr.length-1);
        System.out.println("After Sorting");
        qs.printArray(arr);
    }
}
