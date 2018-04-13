package fileReader;

public class TestReadFile {
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();

        rf.openFile();
        rf.readFile();
        rf.closeFile();
    }
}
