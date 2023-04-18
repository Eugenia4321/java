package exceptions;

import java.util.Scanner;

public class homework_2_empty_string {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
        String f = checkEmptyString();
        System.out.printf("Введенная строка : %s",f);
        }
        // исключение на пустую строку
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        //общее исключение
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    //функция возвращает строку если она не пустая или исключение если она пустая
    public static String checkEmptyString() throws MyException{
        String inputString = null;
        System.out.println("Введите строку :");
        if(scanner.hasNextLine()){            
            inputString = scanner.nextLine();            
        }
        if (inputString.isEmpty()){           
            throw new MyException("Строка не может быть пустой");
        }
        return inputString;
    }
}
abstract class AbstractClassException extends Exception{    
  
    public AbstractClassException(String message) {
        super(message);              
    }
}
class MyException extends AbstractClassException{

    public MyException(String message){
        super(message);
    }

}