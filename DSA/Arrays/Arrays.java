public class Arrays {

    //Print array elements 
    public void printArray(int[] arr){
        System.out.println("The Array contents are :");
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void newArray(){
        int[] array = new int[5];
        array[0] = 1 ;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        printArray(array);
        System.out.println("Lenght of array is "+ array.length);

        int[] arr = {1,2,3,4};
        printArray(arr);
        System.out.println("Lenght of array is "+ arr.length);

        printArray(new int[] {5,6,7,8,9});

    }

    //Remove even elemnts in the array
    public int[] removeEven(int[] arr){
        int length=0, j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0 ){
                length++;
            }
        }
        int[] oddArray = new int[length];
        for(int i=0;i<arr.length;i++){
            if( arr[i] % 2 != 0){
                oddArray[j] = arr[i];
                j++;
            }
        }
        return oddArray;
    }

    //Reverse Entire array
    public int[] reverseArray(int[] arr){
        int length = arr.length;
        int[] revArray = new int[length];

        for(int i = length-1,j=0;i>=0;i--,j++){
            revArray[j] = arr[i];
        }
        return revArray;
    }

    //Reverse the array in the given range
    public int[] reverseArray(int[] arr,int start,int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    //Find mininum element int the array
    public int min(int[] arr){
        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException(" Invalid argumrents");
        }
        int min = arr[0];
        for(int i =0 ;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    //Find the second max in array
    public int secMax(int[] arr){
        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException(" Invalid argumrents");
        }
        int max = arr[0], max2=0,temp;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            } else if( arr[i] > max2 && arr[i] != max ){
                max2 = arr[i];
            }
        }
        return max2;
    }

    //Move 0's to the end of the array
    public int[] moveZeros(int[] arr){
        int length = arr.length;
        int j=0,temp;
        for(int i = 0;i<length;i++){
            if(arr[i] != 0 && arr[j] == 0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        return arr;
    }

    //Resize the array
    public int[] resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    //Find the missing nummber from the array
    public int findMissing(int[] arr){
        int n = arr.length + 1;
        int sum = n*(n+1)/2;

        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Arrays a1 = new Arrays(); 
        // a1.newArray();
        // a1.removeEven(new int[] {1,2,3,4,5,6,7,8,9,10});

        // Get odd elements from array or remove even elements from array
        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // a1.printArray(arr);
        // int[] result = a1.removeEven(arr);
        // a1.printArray(result);

        // Reverse array
        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // a1.printArray(arr);
        // int[] result = a1.reverseArray(arr);
        // a1.printArray(result);

        // Reverse array in given range
        // int[] result1 = a1.reverseArray(arr,2,arr.length-2);
        // a1.printArray(result1);

        //Find minimun 
        // int min = a1.min(new int[] {1,2,3,4,5,6,7,8,9,10});
        // System.out.println("The minimum elemet is " +min);

        //find second max
        // int max = a1.secMax(new int[] {1,2,3,4,5,6,7,8,9,10});
        // System.out.println("The 2nd max elemet is " +max);

        //find second max
        // int[] zero = a1.moveZeros(new int[] {1,0,3,0,5,6,0,8,0,0});
        // a1.printArray(zero);

        //Resize the array for given capacity
        // int[] resizedArray = a1.resizeArray(new int[] {1,2,3,4,5},10);
        // a1.printArray(resizedArray);

        // int missingNum = a1.findMissing(new int[] {1,2,4,5});
        // System.out.println("The missing number is " + missingNum);



    }
}
