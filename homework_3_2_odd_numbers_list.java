import java.util.ArrayList;
import java.util.Arrays;

//Пусть дан произвольный список целых чисел, удалить из него четные числа


public class homework_3_2_odd_numbers_list {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                list.remove(i);

            }
        }        
        System.out.println(list);
    }
}
