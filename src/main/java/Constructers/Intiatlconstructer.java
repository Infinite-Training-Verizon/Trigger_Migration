package Constructers;

public class Intiatlconstructer {
    String firstName;
    String lastName;
    public Intiatlconstructer(String last, String first){
        firstName = last;
        lastName = first;                 //Setting initial values of firstName in here construter rather than after class objet creation
    }
    public String getFirstName(String name){
        System.out.println("printing First Name");
        return name;
    }
    public static void main(String[] args) {
        Intiatlconstructer obj1 = new Intiatlconstructer("Sai" , " Bolli");
        String name= obj1.getFirstName("Vincent");
        System.out.println(name);
        String result = obj1.firstName + obj1.lastName;
        System.out.println(result);
    }
}
