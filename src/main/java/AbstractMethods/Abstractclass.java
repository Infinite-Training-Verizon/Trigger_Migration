package AbstractMethods;

import java.util.Arrays;

abstract class Abstractclass {
    String name= " Sai";
    String className= "Geomentry";
    int age= 23;
    public abstract void method1();
    public abstract void method2();
     public void method3() {
     }
}
 class abstractclass1 extends Abstractclass {
    public void method1(){
        System.out.println("Printing method1");
    }
     public void method2(){
         Object[] arr= {name, className, age, age};
         for(Object o: arr){
             System.out.println(o);
         }
         System.out.println(Arrays.toString(arr));
     }
 }
class Car extends abstractclass1 {
    public static void main(String[] args) {
        Car obj= new Car();
        obj.method1();
        obj.method2();
    }
}

