package loopss;

public class foreach {
    public static void main(String[] args) {
        String[] cars = {"Nissan", "Ford", "chevi"};
        for (String car : cars) {
            System.out.println(car);
        }
        int[] numbers = {1, -34, 988, -43};
        for (int number : numbers) {
            if (number < 0) {
                continue;
            }
            System.out.println(number);
        }
    }
}

