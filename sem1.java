import java.util.*;
/**
Дан массив двоичных чисел, например [1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.
*/
public class program {
public static void main(String[] args) {

int[] arr = new int[] {1,1,0,1,1,1};
int[] arr_count = new int[2];
int count = 0;
int j = 0;

for (int i = 0; i < arr.length; i++){
if (arr[i] == 1) {
count++;
arr_count[j] = count;
} else {
count=0;
j++;
}
}
Arrays.sort(arr_count);
int[] newarr = new int[arr_count[1]];
for (int i = 0; i < arr_count[1]; i++){
newarr[i] = 1;

System.out.println(arr_count[1]);
System.out.println(Arrays.toString(newarr));
}

}
}
////////////////////////////
/*Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному,
нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов
массива должны быть отличны от заданного, а остальные - равны ему.
*/
import java.util.*;
public class program2 {
public static void main(String[] args) {
int[] arr = new int[] {3,2,4,3,2,3,8,5};
int val = 3;
int temp;
for (int i = 0; i < arr.length-1; i++){
if (arr[i] == val) {
temp = arr[i];
arr[i] = arr[i+1];
arr[i+1] = arr[arr.length-1] ;
arr[arr.length-1] = temp;
}
}
System.out.println(Arrays.toString(arr));
}
}
///////////////////////////////////////
import java.util.*;
import java.io.*;

public class program3 {
public static void main(String[] args) {
String Str, pref;
String[] arr_str = new String[]{"страна","стройка","сорока","дерево"};

for (int i = 0; i < arr_str.length; i++){
Str = arr_str[i];
//char[] pref = str.toCharArray() ;
pref = Str.subString(i);

System.out.println(Str);
}
}


}
