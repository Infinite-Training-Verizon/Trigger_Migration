package Constructers;
import java.util.Arrays;

public class AnatherContructer {
      String firstName;
      String lastName;
      int age;
      float height;
      float weight;
      long socialSecurityNumber;

      public AnatherContructer(String first, String lastName, int age, float height, float weight, long socialSecurityNumber) {
          firstName = first;
          this.lastName = lastName;
          this.age = age;
          this.height = height;
          this.weight = weight;
          this.socialSecurityNumber = socialSecurityNumber;
      }
    public static void main(String[] args) {
          AnatherContructer result= new AnatherContructer("Simon", "richard", 25,6.2f, 192.5f,8979372897l);
        Object[] arr= {result.firstName, result.lastName,result.socialSecurityNumber,result.weight,result.height};
        System.out.println(Arrays.toString(arr));
//          String mainResult=  result.firstName,
//          result.lastName,
//          result.height,
//        result.weight,
//        result.age,
//        result.socialSecurityNumber;
//        System.out.println(mainResult);
//
    }
}
