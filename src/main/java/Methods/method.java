package Methods;

public class method {
    static void firstMethod(String firstName, String lastName) {
        System.out.println("First Name : " + firstName+ " Last Name : " + lastName);
        }
   static void secondMethod(int id, String firstName, String lastName) {
        System.out.println("Second Name : " + firstName + " " + lastName + "ID : " + id);
    }
    static void thirdMethod(long ledgerNo,int branchId,String branchName,String countryName){
//        if(ledgerNo!=branchId) {
            System.out.println(ledgerNo + " " + branchId + " " + branchName + " " + countryName);
//        }
//        else{
//                System.out.println("Not reachable");
//            }
    }
    static void checkAge(int age){
        if(age<18) {
            System.out.println("Age is out of range, Hence access Denied");
        }else{
            System.out.println("Age is within the  range, Hence access Granted");
        }
    }
    public static void main(String[] args) {
        firstMethod("Sai", "Richard");
        secondMethod(234,"Richard","Brandson");
        method.secondMethod(345,"Dillon","Dannis");
        thirdMethod(123213,20,"Sainikpuri","usa");
        checkAge(23);
    }
}
