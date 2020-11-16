package maryna.production.demo.service.impl;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class FileReaderServiceImplTest {
    private static final String EMPTY_FILE_PATH = "src\\test\\resources\\empty";
    private static final String NOT_REAL_FILE_PATH = "src\\test\\resources\\some";
    private static final String FILE_PATH = "src\\test\\resources\\okfile";
    private FileReaderServiceImpl fileReaderService = new FileReaderServiceImpl();

    @Test(expected = RuntimeException.class)
    public void test_empty() {
        fileReaderService.readFromFile(EMPTY_FILE_PATH);
    }

    @Test(expected = RuntimeException.class)
    public void test_not_real() {
        fileReaderService.readFromFile(NOT_REAL_FILE_PATH);
    }

    @Test
    public void test_ok() {
        List<List<String>> expectedList = new ArrayList<>();
        List<String> row = new ArrayList<>();
        row.add("8");
        row.add("B006K2ZZ7K");
        row.add("A3JRGQVEQN31IQ");
        row.add("Pamela G. Williams");
        expectedList.add(row);
        Assert.assertEquals(expectedList, fileReaderService.readFromFile(FILE_PATH));
    }
}