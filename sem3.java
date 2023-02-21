//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
/* */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class progr {
public static void main(String[] args) {

Random rand = new Random();
ArrayList<Integer> list = new ArrayList<>();



for (int i = 0; i < 10; i++) {
list.add(rand.nextInt(100));
}
System.out.print(list);
Collections.sort(list);
System.out.println();

System.out.print(list);
}


}
///////////////////////////////////
package Seminar3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class Task2 {
public static void main(String[] args) {
ArrayList<String> planet = new ArrayList<>();
planet.add("Меркурий");
planet.add("Венера");
planet.add("Земля");
planet.add("Юпитер");
planet.add("Сатурн");
planet.add("Марс");
planet.add("Уран");
planet.add("Нептун");
planet.add("Юпитер");
planet.add("Сатурн");
planet.add("Марс");
System.out.println(planet);

Set<String> uniqueSet = new HashSet<String>(planet);
for (String i : uniqueSet) {
System.out.println(i + ": " + Collections.frequency(planet, i));
}
}
}
/////////////////////////////////////////
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//Заполнить список названиями планет Солнечной системы в
//произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.

public class progr2 {
public static void main(String[] args) {
ArrayList<String> planet = new ArrayList<String>(Arrays.asList("Земля","Марс","Юпитер","Сатурн","Уран","Земля",
"Нептун","Меркурий","Уран","Земля","Нептун","Меркурий","Юпитер",
"Сатурн","Уран","Венера","Марс","Юпитер"));
ArrayList<String> result = new ArrayList<String>();
int count = 1;
System.out.print(planet);
System.out.println();
/*for (int i = 0; i < planet.size(); i++) {
for (int j = 1; j < planet.size(); j++) {
if (planet.get(i).equals(planet.get(j))){
count++;
planet.remove(j);
}

//////////////////////////////////////////////////////
import java.util.ArrayList;
import java.util.Arrays;

//Создать список типа ArrayList<String>. Поместить в него как строки,
//так и целые числа. Пройти по списку, найти и удалить целые числа.
public class progr4 {
public static void main(String[] args) {
ArrayList<String> planet = new ArrayList<String>(Arrays.asList(
"Земля","Марс","5","Сатурн","Уран","4",
"Нептун","7","Уран","9"));
System.out.print(planet);
System.out.println();
for (int i = 0; i < planet.size(); i++) {
try {
Integer.parseInt(planet.get(i));
planet.remove(i);

}catch (Exception e){

}
}
System.out.print(planet);
}
}