package Datatypes;

public class logicalOperators {
    public static void main(String[] args) {
        int profit=10;
        int loss= 100;
        long passwordLength= 10;
        System.out.println(profit<=loss);
        System.out.println(profit>=10 && profit<10);
        System.out.println(profit==10 || profit>=10);
        System.out.println(profit>=15 && profit<15);
        System.out.println(profit==15 || profit>=15);
        System.out.println(profit>=15 || profit<15);
        System.out.println(15>=profit);
        System.out.println(passwordLength<10);
        System.out.println(passwordLength>=10 && passwordLength<10 );
        System.out.println(passwordLength>=10);
        System.out.println(passwordLength>=10);
        System.out.println(passwordLength<10);// returns ture if more than 10;
       boolean isLoggedIn=true;
       boolean isAdmin=false;
        System.out.println("Regular User "+ (isLoggedIn && !isAdmin));
        System.out.println("Admin User "+ (!isAdmin || !isLoggedIn));
        System.out.println("Not Loggedin yet " + !isLoggedIn);
    }
}
