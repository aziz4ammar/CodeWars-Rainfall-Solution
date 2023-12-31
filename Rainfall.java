import java.lang.*;
public class Rainfall {
    
    public static double mean(String town, String strng) {
        String[] list = strng.split("\n"); 
        String listTown = null; 
        String rainfall = null; 
        double sum = 0; 
        for(String s : list)
        { 
          String[] temp = s.split(":");
          if(town.equals(temp[0]))
          { 
            listTown = town; 
            rainfall = temp[1]; 
          }
        } 
        
        if(listTown == null)
          return -1; 
        String[] values = rainfall.split(","); 
        for(String s : values)
        {
          String[] temp2 = s.split(" ");
          sum += Double.parseDouble(temp2[1]);  
        }
        
        return sum / 12;

    }
    public static double variance(String town, String strng) {
        String[] list = strng.split("\n"); 
        String listTown = null; 
        String rainfall = null; 
        double sum = 0; 
        for(String s : list)
        { 
          String[] temp = s.split(":");
          if(town.equals(temp[0]))
          { 
            listTown = town; 
            rainfall = temp[1]; 
          }
        } 
        if(listTown == null)
          return -1; 
        
        double average = mean(town, strng);
        String[] values = rainfall.split(","); 
        for(String s : values)
        {
          String[] temp2 = s.split(" ");
          sum += Math.pow(Double.parseDouble(temp2[1]) - average, 2);  
        }
        
        return sum / 12;
    }
}