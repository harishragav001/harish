import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;  


class main
{
 public static void main(String[] args)
 {

     try 
     {
         File Obj = new File("C:\\Users\\Haris\\Downloads\\harish.txt");
         if (Obj.createNewFile()) 
         {// CREATE
             System.out.println("File created: "+ Obj.getName());
         }
         else
         {
        Scanner Reader = new Scanner(Obj);   
             while (Reader.hasNextLine())
             {
                 String name = Reader.next();
                 String num= Reader.next();
                 if(Pattern.matches("[7-9][0-9]{9}",num))
                 { 
                	 File myObj = new File(name+".txt");
                 if (myObj.createNewFile())
                 {
                	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                	   LocalDateTime now = LocalDateTime.now();  
                	   System.out.println(dtf.format(now));  
                     System.out.println("File created: " + myObj.getName());
                 }
                 else
                 {
                     System.out.println("File already exists.");
                 }
                 }
                 System.out.println("lonhy");
             }
         FileWriter Writer = new FileWriter("myfile.txt");    
         Writer.write("We have successfully completed the course with confidence");
         }
     }
     catch (IOException e) 
     {
         e.printStackTrace();
     }
 }
}