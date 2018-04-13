package fileReader;
import java.util.*;
import java.io.*;

public class ReadFile {

    private Scanner x;

    public void openFile(){
        try{
            x = new Scanner(new File("/Users/mahmudurrahman/IdeaProjects/NewProject/src/fileReader/chinese.txt"));
        } catch (Exception e) {
            System.out.println("could not find file!");
        }
    }

    public void readFile(){
        while (x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();

            System.out.printf("%s %s %s\n", a , b , c);
        }
    }

    public void closeFile(){
        x.close();
    }
}
