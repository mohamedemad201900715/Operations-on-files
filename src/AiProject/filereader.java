package AiProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class filereader {
    
public static HashMap<String, Integer> frequencyData = new HashMap<String,Integer>();
private static int getCount(String word)
    {
        if (frequencyData.containsKey(word))
        { 
            return frequencyData.get(word); 
        }
        else
        { 
            return 0;
        }
    }
    public static void readWordFile(String x)
    {
        Scanner wordFile;
        String word;
        Integer count;

        try
        {
            
            wordFile = new Scanner(new FileReader(x));
        }
        catch (FileNotFoundException e)
        {
            System.err.println(e);
            return ;
        }

        while (wordFile.hasNext())
        {
            word = wordFile.next();
            if("is".equals(word) || "am".equals(word) ||"are".equals(word)){
            count = getCount(word) + 1;
            frequencyData.put(word, count);
            }
            
        }

    }
    public static  String findLongestWords(String x) throws FileNotFoundException {
       
       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File( x ));
       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
             
           }}
            return longest_word;
    }
    public static  String findshortestWords(String x) throws FileNotFoundException {

       String shortest_word = "";
       String current;
       Scanner sc = new Scanner(new File( x ));
       Scanner sn = new Scanner(new File( x ));
       while(sn.hasNext()){
       if(!"is".equals(sn.next()) &&!"am".equals(sn.next()) && !"are".equals(sn.next())){
       shortest_word = sn.next();
       break;
       }
       
       }
       sc.reset();
       while (sc.hasNext()) {
          current = sc.next();
          if(!"is".equals(current) &&!"am".equals(current) && !"are".equals(current)){
           if (current.length() < shortest_word.length()) {
             shortest_word = current;
             
           }}}
         System.out.println("\n"+shortest_word+"\n");
            return shortest_word;
          }

}
