package LinkedInJaveEL;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class try_catch {
    public static void main(String[] args) {
        File file = new File ("hello.txt");
        System.out.println("File Exists " + file.exists());

        try ( FileReader reader = new FileReader(file);
              BufferedReader br = new BufferedReader(reader);) {

            String text = br.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
