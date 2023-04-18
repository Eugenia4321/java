package exceptions;

import java.io.FileNotFoundException;

public class homework_2_3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } 
        //Обработаем исключения из метода printSum
        catch(FileNotFoundException e){
            System.out.println("Данные не могут быть null");
        }
        //Так как есть деление переменных - добавим исключение для деления на 0
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль не обрабатывается");
        }
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } 
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        //Общее исключение переместим на последнее место чтобы сначала сработали таргетные
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } 
     
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        //Проброс исключения есть, опишем его 
        if(a == null || b == null) throw new NullPointerException("Данные не могут быть null");
        System.out.println(a + b);
        }   
     
}
