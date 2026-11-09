package arrays;

public class lowestage {
    public static void main(String[] args) {
        int[] ages = {20, 34, 19, 34, 45};
        int lowestAge = ages[0];
        for (int age : ages) {
            if (lowestAge < age) {
                lowestAge = age;
            }
        }
            System.out.println("Lowest age is " + lowestAge);
        }
    }