package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class executer {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("calm");
        arr.add("dog");
        arr.add("tigher");
        arr.remove(2);
        System.out.println(arr.get(1));
        Collections.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(145);
        myNumbers.add(206);
        myNumbers.add(25);
        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}