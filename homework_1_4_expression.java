

public class homework_1_4_expression {
    public static void main(String[] args) {
        String str = lib.inputString("Enter mathematical expression: ");
        String repStr = str.replace(" ", "");
        String[] nubm = repStr.split("\\+");
        String[] nubm2 = nubm[1].split("\\=");
        String[] q =nubm[0].split("");
        String[] w =nubm2[0].split("");
        String[] e =nubm2[1].split("");
        
        String[] x1 = new String[3];
        x1[0] = q[0];
        x1[1] = w[0];
        x1[2] = e[0];
        String[] x2 = new String[3];
        x2[0] = q[1];
        x2[1] = w[1];
        x2[2] = e[1];
        //System.out.println(Arrays.toString(x1));
        //System.out.println(Arrays.toString(x2));
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i<2;i++)
        {   
            if(x1[i].indexOf("?")==-1){
                sum = sum +Integer.parseUnsignedInt(x1[i]);
            }
            
        }
        if(x1[2].indexOf("?")==-1){
            sum = sum - Integer.parseUnsignedInt(x1[2]);
        }
        sum = sum*10;
        
        for (int i = 0; i<2;i++)
        {               
            if(x2[i].indexOf("?")==-1)
            {
                sum2 = sum2 +Integer.parseUnsignedInt(x2[i]);
            }
            
        }
        if(x2[2].indexOf("?")==-1)
        {
            sum2 = sum2 - Integer.parseUnsignedInt(x2[2]);
        }
        sum = sum + sum2;
        int flagFound = 0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if((sum+i*10+j)==0)
                {
                    System.out.println("Found! "+i+" "+j);
                    flagFound = 1;
                }
              
            }

        }
        if (flagFound==0){
            System.out.println("Not found");
        }

    }
}
