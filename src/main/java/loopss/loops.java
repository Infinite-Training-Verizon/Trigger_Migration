package loopss;

public class loops {
    public static class whiledowhile {
        public static void main(String[] args) {
            int i = 20;
            while (i <= 50) {
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
             while(doWhile<10);
        }
    }
}
