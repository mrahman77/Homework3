package reader;
import java.util.*;
import java.io.*;

public class ReadTextFile {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader("/Users/mahmudurrahman/IdeaProjects/NewProject/src/fileReader/chinese.txt");
        } catch (Exception e) {

            System.out.println("Couldn't find the file.");
        }

        try {
            br = new BufferedReader(fr);
            String st = "";

            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
