import java.util.Scanner;

public class lib {
    public static void main(String[] args) {
        
    }
    public static String inputString(String helloWord){
        Scanner iScanner = new Scanner(System.in);
        System.out.println(helloWord);
        String data = iScanner.nextLine();
        iScanner.close();
        return data;
    }
    public static Integer inputInt(String helloWord){
        Scanner iScanner = new Scanner(System.in);
        System.out.println(helloWord);
        int data = iScanner.nextInt();
        iScanner.close();
        return data;
    }

}
