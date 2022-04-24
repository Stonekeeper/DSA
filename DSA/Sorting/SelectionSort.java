public class SelectionSort{

    public void selectionSort(int[] arr){
        int n = arr.length, min;
        for (int i = 0; i < n-1; i++) {
            min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }    
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = {5,4,3,2,1};
        System.out.println("Before Sorting");
        ss.printArray(arr);
        ss.selectionSort(arr);
        System.out.println("After Sorting");
        ss.printArray(arr);
    }
}