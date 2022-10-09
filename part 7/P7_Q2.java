import java.util.*;
 
public class P7_Q2{
    public static void main(String[] args){
        String s = "Alice is girl and Bob is boy";
 
        
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        String[] words = s.split(" ");
        for (String word : words) {
            
            if (hashMap.containsKey(word))
                hashMap.put(word, hashMap.get(word) + 1); 
            else
                hashMap.put(word, 1); 
        }
 
       
        TreeMap<String, Integer> tm = new  TreeMap<String, Integer> (hashMap);  
        Iterator itr=tm.keySet().iterator();  
        while(itr.hasNext()){    
            String key=(String)itr.next();  
            System.out.println(key + hashMap.get(key));  
        }  
       
       
    }
}
