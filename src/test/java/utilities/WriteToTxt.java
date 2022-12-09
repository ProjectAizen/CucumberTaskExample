package utilities;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class WriteToTxt {





    public static void writeDrictor(String Bilgiler){

        try{

            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("bilgiler"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(Bilgiler+"\n");
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }






}
