public class BinarySearch {
    
    public int searchBinary(int[] arr,int key,int low,int high){
        
        while (low <= high) {
            int mid = (low+high)/2;

            if(key == arr[mid])
                return mid;
            
            if(key > mid){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int result = bs.searchBinary(arr, 5 ,0 ,arr.length-1);
        if(result != -1){
            System.out.println("The element is found in the index " + result);
        } else {
            System.out.println("The element not found");

        }    }
}
