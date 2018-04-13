package reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class SecondTry {
    public static void main(String[] args) {
        FileReader fr= null;
        BufferedReader br= null;

        try{
            fr = new FileReader("/Users/mahmudurrahman/Documents/Hello.txt");
        } catch (Exception e){
            System.out.println("Couldn't load the File!");
        }

        try {
            br = new BufferedReader(fr);
            String st = "";
            st = br.readLine();
            System.out.println(st);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
