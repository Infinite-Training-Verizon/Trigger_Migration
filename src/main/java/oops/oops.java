package oops;

public class oops {
    int x = 23;
    int y = 34;
    int result = x + y;

    public static void main(String[] args) {
        oops obj = new oops();
        oops obj1 = new oops();
        oops results = new oops();
        System.out.println("printing x " + obj.x + " y " + obj1.y + " = " + results.result);
        if (results.result > obj1.y) {
            System.out.println("result is less than 50");
        } else if (results.result > 50) {
            System.out.println("result is greater than 50 good to go");
        }
    }
}
