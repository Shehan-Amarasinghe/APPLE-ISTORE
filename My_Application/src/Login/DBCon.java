import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class DBCon {
    String myFile = "C:\\Users\\Shehan Amarasinghe\\OneDrive\\Desktop\\Createacc\\";
    public void makeConnection(String Record, String file) throws IOException
    {
        try
        {
            myFile = myFile + file;
            FileWriter writer = new FileWriter(myFile,true);
            BufferedWriter buffer = new BufferedWriter(writer);
            
            buffer.write(Record);
            buffer.newLine();
            buffer.close();
            writer.close();
            
            JOptionPane.showMessageDialog(null, "Succesfully wrote to the file.");
             }
        
        catch (IOException e) 
        {
            System.out.println("An error occurred saving values" + e);
        }
            
}
}
