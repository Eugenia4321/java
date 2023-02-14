
public class homework_1_3_calc {
    public static void main(String[] args) {
        String str = lib.inputString("Enter mathematical expression: ");
        String repStr = str.replace("=", "");
        String repStr2 = repStr.replace(" ","");


        if (repStr2.indexOf("+")!=-1){
            String[] nubm = repStr2.split("\\+");
            int result = Integer.parseUnsignedInt(nubm[0]) +Integer.parseUnsignedInt(nubm[1]);
            System.out.print(result);
        }
        if (repStr2.indexOf("-")!=-1){
            String[] nubm = repStr2.split("-");
            int result = Integer.parseUnsignedInt(nubm[0])-Integer.parseUnsignedInt(nubm[1]);
            System.out.print(result);
        }

        if (repStr2.indexOf("*")!=-1){
            String[] nubm = repStr2.split("\\*");
            int result = Integer.parseUnsignedInt(nubm[0]) *Integer.parseUnsignedInt(nubm[1]);
            System.out.print(result);
        }

        if (repStr2.indexOf("/")!=-1){
            String[] nubm = repStr2.split("/");
            Double result = Double.parseDouble(nubm[0]) /Double.parseDouble(nubm[1]);
            System.out.print(result);
        }
    }
}
