import java.util.ArrayList;
import java.util.Arrays;


//Реализовать алгоритм сортировки слиянием
public class homework_3_1_merge_sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,8,1,4,5,6,7,11,23,5));
        ArrayList<Integer> listSort = new ArrayList<>();
        System.out.println(list);
        listSort = mergeSortArrayList(list);
        System.out.println(listSort);
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> arrayListLeft,ArrayList<Integer> arrayListRight){
        ArrayList<Integer> arrayList =new ArrayList<>();
        int arrayListSize = arrayListLeft.size()+arrayListRight.size();
        for (int i = 0; i < arrayListSize; i++) {
            if (arrayListLeft.isEmpty() && arrayListRight.isEmpty()){
                return arrayList;
            }else{
                if(arrayListLeft.isEmpty()){
                    arrayList.add(arrayListRight.get(0));
                    arrayListRight.remove(0);            
                }else{
                if(arrayListRight.isEmpty()){
                    arrayList.add(arrayListLeft.get(0));
                    arrayListLeft.remove(0);
                }
            }
            }
            if (!arrayListLeft.isEmpty() && !arrayListRight.isEmpty()){
                if(arrayListLeft.get(0)<=arrayListRight.get(0)){
                    arrayList.add(arrayListLeft.get(0));
                    arrayListLeft.remove(0);
                }else{
                    arrayList.add(arrayListRight.get(0));
                    arrayListRight.remove(0); 
                }
            }
        }
        return arrayList;
    }
    public static ArrayList<Integer> mergeSortArrayList(ArrayList<Integer> arrayList){
        int sizeArrayList = arrayList.size();
        ArrayList<Integer> arrayListLeft =new ArrayList<>();
        ArrayList<Integer> arrayListRight =new ArrayList<>();
        if(arrayList.size()==1){
            return arrayList;
        }
        for (int i = 0; i < sizeArrayList/2; i++) {
            arrayListLeft.add(arrayList.get(i));
        }
        for (int i = sizeArrayList/2; i < sizeArrayList; i++) {
            arrayListRight.add(arrayList.get(i));
            
        }
        arrayListLeft = mergeSortArrayList(arrayListLeft);
        arrayListRight = mergeSortArrayList(arrayListRight);

        return merge(arrayListLeft, arrayListRight);
    }
}
