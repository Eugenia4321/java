package final_project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class homework_6_laptop {
public static void main(String[] args) {
    LaptopClass lp1 = new LaptopClass();
    LaptopClass lp2 = new LaptopClass();
    LaptopClass lp3 = new LaptopClass();
    LaptopClass lp4 = new LaptopClass();
    lp1.addLaptop(21212,"asus" ,"Irbis NB270","black", 
    2,"win7",10000);
    lp2.addLaptop(325123,"Lenovo" ,"DEXP Aquilon","black", 
    4,"win8",20000);
    lp3.addLaptop(15233,"Lenovo" ,"Digma EVE","Red", 
    8,"win10",30000);
    lp4.addLaptop(123512,"asus" ,"Laptop 15 D543MA-DM1368","black", 
    16,"win11",40000);

    var laptops = new HashSet<LaptopClass>(Arrays.asList(lp1,lp2,lp3,lp4));
    var laptopFilter = new HashSet<LaptopClass>();

    Scanner iScanner = new Scanner(System.in);
    while(true){
        System.out.println("1.Просмотр всех ноутбуков \n2.Фильтр по цене\n3.Фильтр по ОЗУ\n4.Фильр по производителю\n5.Фильтр по цене и производителю\n6.Выход");
        int key = Integer.parseInt(iScanner.nextLine());
        switch (key){
            case 1:
            System.out.println(laptops);
            break;
            case 2:
            System.out.println("Введите минимальную цену:");
            int minPrice=Integer.parseInt(iScanner.nextLine());
            System.out.println("Введите максимальную цену:");
            int maxPrice=Integer.parseInt(iScanner.nextLine());
            laptopFilter.clear();
            for (var item : laptops) {
                if( item.Filter(minPrice, maxPrice)!=null){
                    laptopFilter.add(item);
                }                
            }
            System.out.println(laptopFilter);
            System.out.println("Нажмите Enter для продолжения");
            String wait = iScanner.nextLine();
            break;
            case 3:
            System.out.println("Введите количество оперативной памяти в ГБ:");
            int ram=Integer.parseInt(iScanner.nextLine());
            laptopFilter.clear();
            for (var item : laptops) {
                if( item.Filter(ram)!=null){
                    laptopFilter.add(item);
                }                
            }
            System.out.println(laptopFilter);
            System.out.println("Нажмите Enter для продолжения");
            wait = iScanner.nextLine();
            break;
            case 4:
            System.out.println("Введите название производителя:");
            String manufacturer=iScanner.nextLine();
            laptopFilter.clear();
            for (var item : laptops) {
                if( item.Filter(manufacturer)!=null){
                    laptopFilter.add(item);
                }                
            }
            System.out.println(laptopFilter);
            System.out.println("Нажмите Enter для продолжения");
            wait = iScanner.nextLine();
            break;
            case 5:
            System.out.println("Введите название производителя:");
            manufacturer=iScanner.nextLine();
            System.out.println("Введите минимальную цену:");
            minPrice=Integer.parseInt(iScanner.nextLine());
            System.out.println("Введите максимальную цену:");
            maxPrice=Integer.parseInt(iScanner.nextLine());
            for (var item : laptops) {
                if( item.Filter(manufacturer,minPrice,maxPrice)!=null){
                    laptopFilter.add(item);
                }                
            }
            System.out.println(laptopFilter);
            System.out.println("Нажмите Enter для продолжения");
            wait = iScanner.nextLine();
            break;
            case 6:
            System.out.println("До свидания!");
            System.exit(0);
            break;
        
        }
    }
}

}

