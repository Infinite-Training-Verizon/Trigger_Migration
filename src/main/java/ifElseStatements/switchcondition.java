package ifElseStatements;

public class switchcondition {
    public static void main(String[] args) {
        int age = 4;
        switch (age) {
            case 1:
                if (age <= 5) {
                    System.out.println("You cant enter ");
                }
            case 2:
                if (age <= 5) {
                    age=4;
                    System.out.println("You cant enter ");
                }
            case 4:
                if (age == 4) {
                    age=5;
                    System.out.println("You can enter"+age);
                    break;
                }
            case 3:
                if (age <= 5) {
                    System.out.println("You  enter ");
                }
        }
    }
}
