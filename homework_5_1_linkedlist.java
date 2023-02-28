import java.util.LinkedList;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class homework_5_1_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);

        LinkedList <Integer> outputList = new LinkedList<>();
        for (Integer item : inputList) {
            outputList.addFirst(item);
            
        }
        System.out.println(inputList);
        System.out.println(outputList);
    }
}
