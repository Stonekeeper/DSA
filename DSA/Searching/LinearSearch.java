public class LinearSearch {
    

    static int searchLinear(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int result = searchLinear(new int[] {1,2,3,4,5,6,7,8,9,10},50);
        if(result != -1){
            System.out.println("The element is found in the index " + result);
        } else {
            System.out.println("The element not found");

        }

    }
}
