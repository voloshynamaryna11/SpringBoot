package maryna.production.demo.service;

import java.util.List;

public interface FileReaderService {
    public static final String FILE_SEPARATOR = ",";

    List<List<String>> readFromFile(String filePath);
}
