package exceptions;

public class homework2_2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7};
        
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } 
         catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         // так как работаем с массивом - обработаем выход за пределы массива
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива: " + e);
         }
         // больше очевидных мест для ошибок нет - обрабатываем что-либо внезапное 
         catch(Exception e){
            System.out.println("Возникла ошибка: " + e);
         }
         



    }
}
