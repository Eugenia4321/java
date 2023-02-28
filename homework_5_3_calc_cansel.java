import java.util.LinkedList;
import java.util.Scanner;

/*В калькулятор добавьте возможность отменить последнюю операцию. */
public class homework_5_3_calc_cansel {
    public static void main(String[] args) {
        LinkedList<String> calcList = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);

        while(true){
        String str = iScanner.nextLine();
        String repStr = str.replace("=", "");
        String repStr2 = repStr.replace(" ","");
        calcList.add(repStr2);

        if (repStr2.indexOf("+")!=-1){
            String[] nubm = repStr2.split("\\+");
            int result = Integer.parseUnsignedInt(nubm[0]) +Integer.parseUnsignedInt(nubm[1]);
            System.out.println(result);
        }
        if (repStr2.indexOf("-")!=-1){
            String[] nubm = repStr2.split("-");
            int result = Integer.parseUnsignedInt(nubm[0])-Integer.parseUnsignedInt(nubm[1]);
            System.out.println(result);
        }

        if (repStr2.indexOf("*")!=-1){
            String[] nubm = repStr2.split("\\*");
            int result = Integer.parseUnsignedInt(nubm[0]) *Integer.parseUnsignedInt(nubm[1]);
            System.out.println(result);
        }

        if (repStr2.indexOf("/")!=-1){
            String[] nubm = repStr2.split("/");
            Double result = Double.parseDouble(nubm[0]) /Double.parseDouble(nubm[1]);
            System.out.println(result);
        }
        if(repStr2.equals("cancel")||repStr2.equals("Cancel")){
            System.out.println("Введите новое число");
            String num =iScanner.nextLine();
            calcList.removeLast();
            repStr2 = calcList.getLast();
            if (repStr2.indexOf("+")!=-1){
                String[] nubm = repStr2.split("\\+");
                nubm[1]=num;
                int result = Integer.parseUnsignedInt(nubm[0]) +Integer.parseUnsignedInt(nubm[1]);
                System.out.println(result);
            }
            if (repStr2.indexOf("-")!=-1){
                String[] nubm = repStr2.split("-");
                nubm[1]=num;
                int result = Integer.parseUnsignedInt(nubm[0])-Integer.parseUnsignedInt(nubm[1]);
                System.out.println(result);
            }
    
            if (repStr2.indexOf("*")!=-1){
                String[] nubm = repStr2.split("\\*");
                nubm[1]=num;
                int result = Integer.parseUnsignedInt(nubm[0]) *Integer.parseUnsignedInt(nubm[1]);
                System.out.println(result);
            }
    
            if (repStr2.indexOf("/")!=-1){
                String[] nubm = repStr2.split("/");
                nubm[1]=num;
                Double result = Double.parseDouble(nubm[0]) /Double.parseDouble(nubm[1]);
                System.out.println(result);
            }
        }  
    }
   
}
}
