package exceptions;
import java.util.Arrays;
/*
 Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
 Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/
import java.util.Random;

public class homework_1 {
    static Random random = new Random();
    public static void main(String[] args) {
        
    for (int i = 0; i < 5; i++) {
        // В метод вычисления разности массивов передаем массив со случайной размерностью от 5 до 6 и массив с размерностью 5
        int[] res =differenceArray(generateArray(5+random.nextInt(2)),generateArray(5));
        System.out.println("Разность массивов");
        System.out.println(Arrays.toString(res));
    }
    
    }

//Метод принимает 2 целочисленных массива и возвращает массив разности элементов, если это возможно   
static int[] differenceArray(int[] arr1, int[] arr2){   
    //Случайно удалим массив для проверки исключения
    if (random.nextInt(2)==0){
        arr1 = null;
    }
    //Только для этой задачи выведем на экран массивы для нашего удобства, в реальности вывод в методе не используется 
    System.out.println("Первый массив");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Второй массив");
    System.out.println(Arrays.toString(arr2));
    
    if (arr1 == null || arr2 == null)
            throw new NullPointerException("Оба массива должны существовать.");
    if (arr1.length != arr2.length)
            throw new CustomArraySizeException("Кол-во элементов массива должно быть одинаковым.", arr1.length, arr2.length);
    
    //вычисляем новый массив
    int[] res = new int[arr1.length];
    for (int i = 0; i < res.length; i++) {
        res[i] = arr1[i] - arr2[i];
    }
    
    return res;
}

static int[] generateArray(int lengthArray){   // Функция создания массива размерности lengthArray заполненного числами от 0 до 9, возвращает массив
    int[] arr = new int[lengthArray];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = random.nextInt(10);        
    }
    return arr;
}
}
class CustomArraySizeException extends RuntimeException{    //так как у курса тестировщиков нет ООП , просто скопировано из семинара 

    private int length1;
    private int length2;

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    public CustomArraySizeException(String message, int length1, int length2) {
        super(message);
        this.length1 = length1;
        this.length2 = length2;
    }
}