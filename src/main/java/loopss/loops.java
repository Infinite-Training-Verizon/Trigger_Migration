package loopss;

import org.w3c.dom.ls.LSOutput;

public class loops {
    public static class whiledowhile {
        public static void main(String[] args) {
            int i = 20, b= 25;
            while (i <= b) {
                System.out.println("print when its reached the given limit");
                i++;
            }
            int countDown = 3;
            while (countDown > 0) {
                System.out.println("Countdown started" + countDown);
                countDown--;
            }
            int doWhile = 5;
            do {
                System.out.println("Do While started" + doWhile);
                doWhile++;
            }
            while (doWhile < 10);
            System.out.println("lOOPS OVER");
        }
    }
}
