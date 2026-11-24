package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String ,Integer> hm = new HashMap<String ,Integer>();
            hm.put("FirstName", 24);
            hm.put("SecondName", 25);
            if(hm.containsKey("FirstName")) {
                for (String key : hm.keySet()) {
                    System.out.println(key);

                }
            }
        }
    }
