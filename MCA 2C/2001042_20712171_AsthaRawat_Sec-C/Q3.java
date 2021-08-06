import java.io.*; 
import java.io.*; 
import java.io.IOException;
import java.util.*;
public class Q3 {
  public static void main(String[] args) {
    try {
      File myObj = new File("astha rawat");
      if (myObj.createNewFile()) 
      {
        System.out.println("File created with the name " + myObj.getName());
        FileWriter myWriter = new FileWriter("astha rawat");
        System.out.println("Enter Content");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        myWriter.write(str);
        myWriter.close();
        System.out.println("Data inside the file");
        String line = null;
        FileReader fileReader = new FileReader("astha rawat");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }
        bufferedReader.close();    
      } 
      else {
        System.out.println("File already exists.");
      }
    }
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
