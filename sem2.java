import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Main {
public static void main(String[] args) {
Logger logger = Logger.getAnonymousLogger();
logger.info(String.valueOf(5));
try (FileWriter writer = new FileWriter("test.txt")) {
String info = "information\n";
for (int i = 0; i < 100; i++) {
writer.write(String.valueOf(info));
logger.info(info);
}
FileHandler fileHandler =new FileHandler();
fileHandler.
logger.se

writer.flush();

} catch (IOException e) {

}


}
}
///////////////////////
////Напишите метод, который принимает на вход строку (String)
//и определяет является ли строка палиндромом (возвращает boolean значение).

public class program23 {
    public static void main(String[] args) {
    
    System.out.println(poli("шаль"));
    
    }
    public static boolean poli(String string) {
    StringBuilder myString = new StringBuilder(string);
    
    return string.equals(myString.reverse().toString());
    
    }
    }
    ////////////////////////////////////
    //Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
public class program22 {
    public static void main(String[] args) {
    String str = "aaaabbbcdd ";
    String [] string = str.split("");
    int count = 1;
    StringBuilder itogo = new StringBuilder();
    for (int i = 0; i < string.length-1; i++) {
    
    if (string[i].equals(string[i+1])){
    count++;
    }else{
    if (count > 1) {
    itogo.append(String.valueOf(count));
    }
    itogo.append(string[i]);
    count = 1;
    }
    }
    System.out.println(itogo);
    }
    }
    ////////////////////////////////////////
    /*
Напишите метод, который составит строку, состоящую из 100 повторений
слова TEST и метод, который запишет эту строку в простой текстовый файл,
обработайте исключения.
*/
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Arrays;


public class program24 {
public static void main(String[] args) {

String info = "test\n";
try (FileWriter writer = new FileWriter("test.txt")) {
for (int i = 0; i < 100; i++) {
writer.write(String.valueOf(info));
}
writer.flush();
} catch (IOException e) {
e.printStackTrace();
}


}
}
///////////////////////////////////
Roman: http://www.dxgames.narod.ru/articles/java/logging.htm

