import java.util.Arrays;

public class homework_6_3_heapsort {
    public static void main(String[] args) {
        int[] intArray = new int[]{1,11,111,22,2,222,3,33,333};
        System.out.println(Arrays.toString(intArray));
        heapSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
    public static void heapSort(int[] intArray){
        int sizeArray = intArray.length;
        
        for (int i = sizeArray / 2 - 1; i >= 0; i--){
            createTree(intArray, sizeArray, i);
        }
       
        for (int i=sizeArray-1; i>=0; i--)
        {       
            int temp = intArray[0];
            intArray[0] = intArray[i];
            intArray[i] = temp;
            createTree(intArray, i, 0);
        }
    }
    public static void createTree(int[] intArray, int sizeArray, int rootArray){
        
        int maxItemTree = rootArray; 
        int leftTree = 2*rootArray + 1; 
        int rightTree = 2*rootArray + 2; 

        if (leftTree < sizeArray && intArray[leftTree] > intArray[maxItemTree])
            maxItemTree = leftTree;

        if (rightTree < sizeArray && intArray[rightTree] > intArray[maxItemTree])
            maxItemTree = rightTree;

        if (maxItemTree != rootArray)
        {
            int temp = intArray[rootArray];
            intArray[rootArray] = intArray[maxItemTree];
            intArray[maxItemTree] = temp;

          createTree(intArray, sizeArray, maxItemTree);
        }
    }
    }

