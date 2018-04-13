package reader;
import java.io.*;
public class TestRead {
    public static void main(String[] args) {

        FileReader fr =  null;
        BufferedReader br = null;

        try {
            fr = new FileReader("/Users/mahmudurrahman/Documents/Hello.txt");
        }catch (Exception e){
            System.out.println("Couldn't find the file.");
        }

        try{
            br = new BufferedReader(fr);
            String st = "";

            st = br.readLine();
            System.out.println(st);
        } catch(Exception e){
            e.printStackTrace();
            //System.out.println("no File found");
        } finally {
            if(fr != null){
                try {
                    fr.close();
                    fr = null;
                }catch(Exception e){

                }
            }
            if (br != null){
                try {
                    br.close();
                    br = null;
                }catch (Exception e){

                }
            }
        }

    }
}
