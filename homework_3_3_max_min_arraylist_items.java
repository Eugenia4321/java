import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


public class homework_3_3_max_min_arraylist_items {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8,9,9,10));
        System.out.println(list);
        SortedSet<Integer> sortedSet = new TreeSet<Integer>(list);
        System.out.println(sortedSet);
        int max = sortedSet.last();
        int min = sortedSet.first();
        int size = sortedSet.size();
        if (size%2==0){
            Object[] middle = sortedSet.toArray();
            int middleItem =(Integer)middle[size/2];
            System.out.print("1st middle element = ");
            System.out.println(middleItem);
            middleItem =(Integer)middle[(size-2)/2];
            System.out.print("2nd middle element = ");
            System.out.println(middleItem);
        }else{
            Object[] middle = sortedSet.toArray();
            int middleItem =(Integer)middle[(size-1)/2];
            System.out.print("middle element = ");
            System.out.println(middleItem);
        }
        System.out.print("max element = ");
        System.out.println(max);
        System.out.print("min element = ");
        System.out.println(min);
    }
}
