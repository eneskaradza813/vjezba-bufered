package vjzeba1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {

    public static void main(String[] args) {

        String templine;
       try(BufferedWriter bw = new BufferedWriter(new FileWriter("treci.Fajl.txt"));){
        
        BufferedReader br = new BufferedReader(new FileReader("prviFajl.txt"));
        while((templine = br.readLine()) != null)
            bw.write(templine +"\n");
        br.close();
        bw.close();
        
       }catch(IOException exc){
           System.out.println(exc);
       }
    }
}
