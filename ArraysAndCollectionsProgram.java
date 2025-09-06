import java.util.Arrays;

public class ArraysAndCollectionsProgram {
    public static void arrayAndCollectionsDefination(){
        // findSmallestAndSmalestElementFromArray();//1.Find the smallest and largest element in an array
        //findMissingNumberFromArray();//2.Find the missing number in an array
        //checkTwoArrayEqueal();//3.Check if two arrays are equal
        //reverseArrayWithoutUsingNewArray();//4.Reverse an array
        //reverseArrayWithUsingNewArray();//4.1.Reverse an array
        //findDuplicateElementsFromArray();//5.Find duplicate elements in an array
        //FindSecondLargestElementFromArray();//6.Find second largest number in an array
        //7.Sort an array using bubble sort, selection sort, and insertion sort
        //mergeTwoArrays();//8.Merge two arrays
        removeDuplicateElementFromArray();//9.Remove duplicates from array
        //10.Find common elements between two arrays
        //11.Move all zeros to end of array
        //12.Search an element in a rotated sorted array
        //13.Find subarray with maximum sum (Kadane’s algorithm)
        //14.Rotate an array by k steps
    }

    public static void printArray(int arr[]){
        System.out.println("***** START Prind Given Array ********");
        int size = arr.length;
        for(int i=0;i<size;i++){
            System.out.println("Array index of["+i+"]"+arr[i]);
        }
        System.out.println("***** END Prind Given Array ********");
    }
    public static void findSmallestAndSmalestElementFromArray(){
        int arr[] = {8,10,3,20,6,5,44,9,7,14};
        int size = arr.length;
        int smallestElement = -1;
        int largestElement = -1;

        System.out.println("Array's all Value's Lenth are :"+size);
        for(int i = 0;i<size;i++){
            System.out.println("Array index of["+i+"]"+arr[i]);
        }

        for(int i = 0 ;i<size;i++){
            if(i==0){
                smallestElement = arr[i];
            }
            if(smallestElement >arr[i]){
                smallestElement = arr[i];
            }
            if(largestElement < arr[i]){
                largestElement = arr[i];
            }
            
        }
        System.out.println("Smallest Elemen from this array : "+smallestElement);
        System.out.println("Largest  Elemen from this array : "+largestElement);
    }

    public static void sortGivenArray(int arr[]){
        int size = arr.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
       // printArray(arr);
    }
    public static void findMissingNumberFromArray(){
        int arr[] = {1,3,2,5,6,7,8,9};
        int size = arr.length;
        int startingFrom = 0;
        int missingNum = 0;
       // printArray(arr);
        sortGivenArray(arr);
       // printArray(arr);
        for(int i = 0 ;i<size;i++){
            if(i == 0){
                startingFrom = arr[i];
            }
            if(startingFrom != arr[i]){
                missingNum = startingFrom;
                startingFrom++;
            }
            startingFrom++;
        }
        System.out.println("Missing number is : "+missingNum);
    }

    public static void checkTwoArrayEqueal(){
        System.out.println("Two are are Equeal ? "+ comparingTwoArrayEqueal());
    }
    public static boolean comparingTwoArrayEqueal(){
        int arr1[] = {5,1,4,6,8,12,7,9};
        int arr2[] = {5,1,4,6,8,7,9,11};

        int size1 = arr1.length;
        int size2 = arr2.length;

        boolean isTwoArrayEqueal = false;
        if(size1 !=size2){
            return isTwoArrayEqueal;
        }
        sortGivenArray(arr1);
        sortGivenArray(arr2);

        for(int i=0;i<size1;i++){
            if(arr1[i] != arr2[i]){
                return isTwoArrayEqueal;
            }
        }
        return true;
    }

    public static void reverseArrayWithoutUsingNewArray(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int size = arr.length;
        int tail = size-1;

        printArray(arr);
         for(int i=0;i<size/2;i++){
            System.out.println(arr[i]);
            int temp = arr[i];
           arr[i] = arr[tail];
           arr[tail]=temp;
           tail--;
        }
        printArray(arr);
    }

    public static void reverseArrayWithUsingNewArray(){
         int arr[] = {1,2,3,4,5,6,7,8,9};
        int size = arr.length;
        int reversArr[] = new int[size];
        int top = 0;
        printArray(arr);
         for(int i=size-1;i>=0;i--){
           reversArr[top++] = arr[i];
        }
        printArray(reversArr);
        reverseUsingNewArray();
    }

    public static void reverseUsingNewArray() {
        int[] original = {1, 2, 3, 4, 5};
        int size = original.length;
        int[] reversed = new int[size];

        for (int i = 0; i < size; i++) {
            reversed[i] = original[size - 1 - i];
        }
        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Reversed array: " + Arrays.toString(reversed));
    }
    public static void findDuplicateElementsFromArray(){
        int arr[] = {8,1,1,1,1,3,2,4,3,5,5,3};
        int size = arr.length;
        int duplicateIndex = 0;
        int duplicateElements[] = new int[size/2];
        for(int i=0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i]==arr[j] && !isExistInArray(duplicateElements,arr[i])){
                    duplicateElements[duplicateIndex] = arr[i];
                    duplicateIndex++;
                }
            }
        }
        printArray(duplicateElements);
    }
    private static boolean isExistInArray(int[] duplicateElements,int element){
            int size = duplicateElements.length;
            for(int i=0;i<size;i++){
                if(duplicateElements[i]==element){
                    return true;
                }
            }
            return false;
    }
    public static void mergeTwoArrays(){
        int arr1[] = {2,4,5,6};
        int arr2[] = {7,8,9};
        int size1 = arr1.length;
        int size2 = arr2.length;

        int combineArr[] = new int[size1+size2];
        int index = 0;
        for(int element :arr1){
            combineArr[index] = element;
            index++;
        }
        for(int element :arr2){
            combineArr[index] = element;
            index++;
        }
        printArray(combineArr);
    }
    public static void FindSecondLargestElementFromArray(){
        int arr[] = {3,5,2,7,4,9};
        sortArray(arr);
        printArray(arr);
        System.out.println("Second Largest number is : "+arr[1]);
    }
    private static void sortArray(int arr[]){
        int size = arr.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
    }
    public static void removeDuplicateElementFromArray(){
        int arr[] = {1,3,1,2,3,1,3,4,5,5,5};
        int size = arr.length;
        int uniqArr[] = new int[size];
        int uniqArrSize = uniqArr.length;

        printArray(arr);
        int index = 0;
        
        for(int i=0;i<size;i++){
            boolean isDuplicate = false;
            for(int j=0;j<index;j++){
                if(arr[i]==uniqArr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqArr[index]  = arr[i];
                index++;
            }
        }
       printArray(uniqArr);
    }
}
