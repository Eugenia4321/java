package exceptions;

import java.util.Scanner;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
(типа float), и возвращает введенное значение. Ввод текста вместо числа не должно 
приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных. */
public class homework_2_1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    float a = getFloatNumber();
    System.out.println(a);

    }
    //функция получения float числа из консоли
    public static float getFloatNumber(){
        float floatNumber = 0;
        boolean tryGetFloatNumber = false;
        
        while (!tryGetFloatNumber){
            System.out.print("Введите дробное число: ");
            if(scanner.hasNextLine()){
                String inputString = scanner.nextLine();

                //выход из цикла если пользователь передумал вводить число
                if(inputString.equals("exit") || inputString.equals("выход") || inputString.equals("stop")){
                    System.exit(0);
                }
                try{
                    floatNumber = Float.parseFloat(inputString);
                    tryGetFloatNumber = true;
                }
                catch(NullPointerException e){
                    System.out.println("Пустая строка");
                }
                catch(NumberFormatException e){
                    System.out.println("Неверный формат");
                }
                catch(Exception e){
                    System.out.println("Ошибка");

                }
            }
        }
        return floatNumber;
    }
}
