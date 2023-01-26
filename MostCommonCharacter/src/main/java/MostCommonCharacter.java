import java.util.*;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char common = ' ';
        Map<Character,Integer> count = new HashMap<Character,Integer>();
        for (int i=0; i<str.length(); i++) { //add neccesary characters to map
            count.put(str.charAt(i), 0);
        }
        
        for (int i=0; i<str.length(); i++) { //tally up the number of occurences for each character
            count.put(str.charAt(i), count.get(str.charAt(i))+1);
        }

        int maxvalue = Collections.max(count.values());
        for (Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == maxvalue) {
                common = entry.getKey();
            }
        }
        return common;
    }
}
