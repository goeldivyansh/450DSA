import java.util.*;  
public class DuplicateWithCount {
    
    void printDup(String S) {
        
        // Store frequency of each character in map
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();  
       
        for(int i=0;i<S.length();i++)
        {
            if(map.containsKey(S.charAt(i)) == false)
            {
                map.put(S.charAt(i),1);
            }
            else
            {
                map.put(S.charAt(i), map.get(S.charAt(i)) + 1 );
            }
        }

        for (Map.Entry mapElement : map.entrySet()) 
        {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
 
            if (value > 1)
                System.out.println(key + ", count = " + value);
        }


    }
}