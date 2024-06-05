
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        LiteracyDataProcessor dataProcessor = new LiteracyDataProcessor();
        dataProcessor.readData("literacy.csv");
        List<LiteracyRecord> sortedList = dataProcessor.getSortedList();
        for (LiteracyRecord literacyRecord : sortedList) {
            System.out.println(literacyRecord);

        }


    }
}
