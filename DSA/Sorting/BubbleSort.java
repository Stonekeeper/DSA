public class BubbleSort {
    
    public void bubbleSort(int[] arr) {
        boolean isSwapped;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
        }
        
    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        BubbleSort bs = new BubbleSort();
        System.out.println("Before Sorting");
        bs.printArray(arr);
        System.out.println("After Sorting");
        bs.bubbleSort(arr);
        bs.printArray(arr);

    }
}
