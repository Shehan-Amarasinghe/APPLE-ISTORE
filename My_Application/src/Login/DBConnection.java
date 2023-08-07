
package Login;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class DBConnection {
   
   String myFile ="C:\\Users\\Shehan Amarasinghe\\OneDrive\\Desktop\\khvjkj\\" ;
   
    public void makeConnection(String Record, String file)
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
    
    public void findData (String value)
    {
        try
        {
            boolean found = true;
            String[] words = null;
            
            FileReader fileR = new FileReader(myFile);
            BufferedReader br = new BufferedReader (fileR);
            
            String findLine;
            String input = value;
            
            outerLoop:
            
            while ((findLine = br.readLine())!= null)
            {
                words = findLine.split(" ");
                
                for (String word: words)
                {
                    if (word.equals(input))
                    {
                        found = true;
                        System.out.println(findLine);
                        
                        break outerLoop;
                    }
                    else
                    {
                        found = false;
                    }
                }
            }
            
            if (found)
            {
                JOptionPane.showMessageDialog(null, "Value is in the List!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Value not in the List");
            }  
        }
        catch (Exception e)
        {
            System.out.println("An Error Occured While Searching" + e);
        }
    }
   
    
   }
