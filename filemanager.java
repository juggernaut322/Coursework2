import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public void importFile(String filePath) {
        // Implementation for importing files
    }

    public void exportFile(String filePath, SheetMusic sheetMusic) {
        try (FileWriter writer = new FileWriter(new File(filePath))) {
            writer.write(sheetMusic.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
