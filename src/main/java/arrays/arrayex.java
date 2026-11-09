package arrays;

import java.util.Arrays;

public class arrayex {
    public static void main(String[] args) {
        String[] arr = {"nissan", "santra", "Ford", "Toyota"};
        int[] ageOfTheCars = {10, 12, 5, 2};
        arr[2] = "Hyundai";
        System.out.println(arr.length + " " + ageOfTheCars.length);
        String[] names = {"Simon", "Samantha", "Sai", "Bolli"};
        for (int i = 0; i < names.length; i++) {
//            String name = names[i]+names[i];
            System.out.println(names[i]);
        }
        int[] numbers = {10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}



