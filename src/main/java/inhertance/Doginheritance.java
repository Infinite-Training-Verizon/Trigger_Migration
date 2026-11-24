package inhertance;

public class Doginheritance {
    protected String bark = "barking";

    public void dogBarks() {
        int barks = bark.length();
        System.out.println("dogBarks " + barks);
    }
    public String dogSleeps() {
        return bark;
    }
}


    class Dog extends  Doginheritance {
        String calmedl = "calmnow";
        public static void main(String[] args) {
            Dog obj = new Dog();
            obj.dogBarks();
            System.out.println(obj.dogSleeps());
            System.out.println(obj.bark + " " + obj.calmedl);
        }
    }



