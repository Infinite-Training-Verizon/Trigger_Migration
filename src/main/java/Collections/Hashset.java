package Collections;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("FirstName");
        hs.add("SecondName");
        hs.add("thirdName");
        hs.add("thirdName");
        System.out.println(hs);
    }
}
