import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * LiteracyDataProcessor
 */
public class LiteracyDataProcessor {
    private List<LiteracyRecord> records;

    public LiteracyDataProcessor() {
        this.records = new ArrayList<>();
    }

    public void readData(String filePath){
        try  {
            Files.lines(Paths.get(filePath))
                .map(row -> row.split(","))
                .map(parts -> new LiteracyRecord(parts[0], parts[1], parts[2].split(" ")[1].trim(), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                .forEach(record -> records.add(record));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<LiteracyRecord> getSortedList(){
        //from the lowest to the highest ranked on the literacy rate
        Collections.sort(records, (r1, r2) -> Double.compare(r1.getLiteracyPercent(), r2.getLiteracyPercent()));
        return records;
    }
}
