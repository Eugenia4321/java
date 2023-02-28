import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() -
возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */
public class homework_5_2_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        System.out.println(inputList);
        enqueue(5,inputList);
        System.out.println(inputList);
        System.out.println(dequeue(inputList));
        System.out.println(inputList);
        System.out.println(first(inputList));
        System.out.println(inputList);
        
    }
    public static LinkedList enqueue(int item, LinkedList inputList){
        inputList.addLast(item);
        return inputList;
    }
    public static Integer dequeue(LinkedList<Integer> inputList){
        int item = inputList.getFirst();
       // System.out.println(item);
        inputList.removeFirst();
        return item;
    }
    public static Integer first(LinkedList<Integer> inputList){
        int item = inputList.getFirst();        
        return item;
    }
}
