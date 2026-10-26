package Datatypes;

public class assignments {
    public static void main(String[] args) {
        int savingsAccount= 1;
        savingsAccount+= 54;
        savingsAccount-=1;
        savingsAccount++;
        System.out.println(savingsAccount);
        int johnScore= 54;
        int vincetScore=67;
        vincetScore++;
        boolean totalScore= johnScore<=vincetScore && johnScore>=savingsAccount;
        System.out.println("John Score is " + totalScore);
        float heightInInches= 6.3f;
        int length=23;
        int width=41;
        System.out.println(length!=width);
        System.out.println(length==width);
        System.out.println(length>=width);
        System.out.println(johnScore>=savingsAccount);
        System.out.println(length<=width);
        int age=25;
        System.out.println(age>25);
        System.out.println(age<25);//
        int password=45;
        System.out.println(password>=45);
        System.out.println(password<45);

    }
}
