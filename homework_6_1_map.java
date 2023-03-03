import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
public class homework_6_1_map {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
        Map<String,String> phoneBook = new HashMap<>();
        phoneBook.put("89123456789", "Иванов иван");
        phoneBook.put("89123456788", "Иванов иван");
        phoneBook.put("89123456787", "Иванов иван");
        phoneBook.put("89123456786", "Петров петр");
        phoneBook.put("89123456785", "Сидоров сидр");

        for (var item : phoneBook.entrySet()){                                
               System.out.println(item.getKey() + " " + item.getValue());          
        }


        //Пусть дан список сотрудников:Написать программу, которая найдет и выведет 
        //повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
        Map<String,String> nameBook = new HashMap<>();
        Map<String,Integer> countNameBook = new HashMap<>();
        nameBook.put("Петрова", "Светлана");
        nameBook.put("Белова", "Кристина");
        nameBook.put("Мусина", "Анна");
        nameBook.put("Крутова", "Анна");
        nameBook.put("Юрин", "Иван");
        nameBook.put("Лыков", "Петр");
        nameBook.put("Чернов", "Павел");
        nameBook.put("Чернышов", "Петр");
        nameBook.put("Федорова", "Мария");
        nameBook.put("Светлова", "Марина");
        nameBook.put("Савина", "Мария");
        nameBook.put("Рыкова", "Мария");
        nameBook.put("Лугова", "Марина");
        nameBook.put("Владимирова", "Анна");
        nameBook.put("Мечников", "Иван");
        nameBook.put("Петин", "Петр");
        nameBook.put("Ежов", "Иван");

        System.out.println();        
        System.out.println("Список сотрудников"); 
        for (var item : nameBook.entrySet()){               
            System.out.println(item.getKey() + " " + item.getValue());   
        }    

        int tempInt = 0;

        for (var item : nameBook.entrySet()){           
            if(countNameBook.containsKey(item.getValue())){               
                tempInt = countNameBook.get(item.getValue());
                countNameBook.put(item.getValue(), tempInt+1);
            }else{
                countNameBook.put(item.getValue(), 1);
            }
         }

        SortedMap<Integer,String> sortedCountNameBook = new TreeMap(Collections.reverseOrder());
        String tempString = "";
        for (var item : countNameBook.entrySet()){    
            if(sortedCountNameBook.containsKey(item.getValue())){
                tempString = sortedCountNameBook.get(item.getValue());
                sortedCountNameBook.put(item.getValue(), tempString+" "+item.getKey());
            }  else{
                sortedCountNameBook.put(item.getValue(), item.getKey());
            }
            //System.out.println(item.getKey() + " " + item.getValue());   
         }    
        System.out.println("Частота поторения имен по убыванию");

         for (var item : sortedCountNameBook.entrySet()){      
             System.out.println(item.getKey() + " " + item.getValue());   
             }    

      
        }

            
        
        
    }

