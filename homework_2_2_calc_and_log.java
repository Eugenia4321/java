import java.io.IOException;
import java.util.logging.*;

public class homework_2_2_calc_and_log {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(homework_2_2_calc_and_log.class.getName());
        FileHandler fileHandler = new FileHandler("log2.txt");
        logger.addHandler(fileHandler);
        SimpleFormatter sFormat = new SimpleFormatter();
        fileHandler.setFormatter(sFormat);
        fileHandler.setEncoding("UTF-8");
          
        String inputString = lib.inputString("Enter mathematical expression: ");
        String formattedString = inputString.replace("=", "");
        String mathExpressionString = formattedString.replace(" ","");


        if (mathExpressionString.indexOf("+")!=-1){
            String[] nubm = mathExpressionString.split("\\+");
            int result = Integer.parseUnsignedInt(nubm[0]) +Integer.parseUnsignedInt(nubm[1]);
            System.out.print(result);
            doIntLog(result,inputString,logger);
        }
        if (mathExpressionString.indexOf("-")!=-1){
            String[] nubm = mathExpressionString.split("-");
            int result = Integer.parseUnsignedInt(nubm[0])-Integer.parseUnsignedInt(nubm[1]);
            System.out.print(result);
            doIntLog(result,inputString,logger);
        }

        if (mathExpressionString.indexOf("*")!=-1){
            String[] nubm = mathExpressionString.split("\\*");
            int result = Integer.parseUnsignedInt(nubm[0]) *Integer.parseUnsignedInt(nubm[1]);
            System.out.print(result);
            doIntLog(result,inputString,logger);
        }

        if (mathExpressionString.indexOf("/")!=-1){
            String[] nubm = mathExpressionString.split("/");
            Double result = Double.parseDouble(nubm[0]) /Double.parseDouble(nubm[1]);
            System.out.print(result);
            doDoubleLog(result, inputString, logger);
        }
    }
    public static void doIntLog(int result, String inputString, Logger logger)  {

        String intString = Integer.toString(result);
        logger.info(inputString);
        logger.info(intString);
        

    }
    public static void doDoubleLog(Double result, String inputString, Logger logger)  {

        String intString = Double.toString(result);
        logger.info(inputString);
        logger.info(intString);

    }

}
