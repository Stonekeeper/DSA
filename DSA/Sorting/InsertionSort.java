public class InsertionSort{

    public void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            //to store the first element in the unsorted array
            int temp = arr[i];
            //to acess the last index of sorted part of array
            int j = i - 1;

            //Checks wheather the elements in the sorted part is greater than temp
            while (j >= 0 && arr[j] > temp) {
                //if it is greater Shifts by one pos
                arr[j+1] = arr[j];
                //Decrement j to compare remaining sorted part of array with temp
                j--;
            }
            //once we find the element in j'th positon lesser than temp we store the temp in j+1 pos.  
            arr[j+1] = temp;
        }
    }

    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println("Before Sorting");
        is.printArray(arr);
        is.insertionSort(arr);
        System.out.println("After Sorting");
        is.printArray(arr);
    }
}