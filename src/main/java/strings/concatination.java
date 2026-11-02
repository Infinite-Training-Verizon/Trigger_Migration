package strings;

public class concatination {
    public static void main(String[] args) {
        String orderName="Amazon";
        String orderCatogeory="E-Commerce";
        String firstName="Simon ";
        String lastName="David";
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName + " " + lastName);
       String name=firstName.concat(lastName);
       var fullName=(String)name;
        System.out.println(name);
    }
}
