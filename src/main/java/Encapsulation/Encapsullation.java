package Encapsulation;

public class Encapsullation {
    public static void main(String[] args) {
        SetGet student = new SetGet();
        student.setName("Simon");
        student.setName("David");
        student.setAge(100);
        student.setAge(1002);
        student.setClassName("Geomentry");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAge());

    }
}
