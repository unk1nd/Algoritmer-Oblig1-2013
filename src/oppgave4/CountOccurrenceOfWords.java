package oppgave4;

import java.util.*;

public class CountOccurrenceOfWords 
{
  public static void main(String[] args) 
  {
    
    String text = "Good morning. Have a good class. " +
      "Have a good visit. Have fun!";

    Map<String, Integer> map = new TreeMap<String, Integer>();

    String[] words = text.split("[ \n\t\r.,;:!?(){}]");
    for (int i = 0; i < words.length; i++) 
    {
      String key = words[i].toLowerCase();
      
      if (key.length() > 0) 
      {
        if (!map.containsKey(key)) 
        {
          map.put(key, 1);
        }
        else 
        {
          int value = map.get(key);
          value++;
          map.put(key, value);
        }
      }
    }

    
    //  Setter alle ordene inn i ett mapset og legger til hvor mange ganger ordene kommer opp i stringen
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

    // Her kjøres det en forloop som henter hver enkel sett i mapsettet og printer ut ordet og antall tellinger
    for (Map.Entry<String, Integer> entry: entrySet)
      System.out.println(entry.getKey() + "\t" + entry.getValue());
  }
}