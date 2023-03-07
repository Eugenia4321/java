package final_project;
/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/
public class LaptopClass {
    int idLaptop;
    String laptopManufacturer;
    String nameLaptop;
    String colorLaptop;
    int ramLaptop;
    String OSLaptop;
    int priceLaptop;
    String description;

    @Override
    public String toString(){
        return description;
    }
    public void addLaptop(int newIdLaptop,String newLaptopManufacturer,String newNameLaptop,String newColorLaptop,
    int newRamLaptop,String newOSLaptop, int newPriceLaptop){
        idLaptop = newIdLaptop;
        laptopManufacturer=newLaptopManufacturer ;
        nameLaptop=newNameLaptop;
        colorLaptop=newColorLaptop;
        ramLaptop=newRamLaptop;
        OSLaptop=newOSLaptop;
        priceLaptop =newPriceLaptop;
        description = idLaptop+ " " + laptopManufacturer+ " " + nameLaptop + " color:" + colorLaptop + " RAM:" + ramLaptop+ "GB OS:" + OSLaptop+" Price:"+priceLaptop;
    } 
    public String Filter(int minPrice, int maxPrice){
        if(priceLaptop>minPrice &&priceLaptop<maxPrice){
            return description;
        } else{
            return null;
        }
    }
    public String Filter(int ram){
        if(ramLaptop==ram){
            return description;
        } else{
            return null;
        }
    }

    public String Filter(String manufacturer){
        if(laptopManufacturer.equals(manufacturer)){
            return description;
        } else{
            return null;
        }
    }
    public String Filter(String manufacturer,int minPrice, int maxPrice){
        if(laptopManufacturer.equals(manufacturer)&& priceLaptop>minPrice && priceLaptop<maxPrice){
            return description;
        } else{
            return null;
        }
    }
}
