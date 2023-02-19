import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class homework_2_1_bubble_sort_and_log {
    public static void main(String[] args) throws IOException {
       
        Logger logger = Logger.getLogger(testlog.class.getName());
        FileHandler fileHandler = new FileHandler("log.txt");
        logger.addHandler(fileHandler);
        SimpleFormatter sFormat = new SimpleFormatter();
        fileHandler.setFormatter(sFormat);
        fileHandler.setEncoding("UTF-8");
        int[] array = new int[] { 5, 2, 6, 3, 1 };
        BubbleSort(array, logger);
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);

    }

    public static void BubbleSort(int[] array, Logger logger) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    try {
                        doLog(array, logger);
                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                }
            }
        }
    }

    public static void doLog(int[] array, Logger logger)  {

        String arrayString = Arrays.toString(array);
        logger.info(arrayString);

    }
}
