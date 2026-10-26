import javax.swing.*;

public class Strings {
    public static void main(String[] args) {
        String passwordLength= "Lincon$143";
        String capitalLetters="ailsdhfoiuasdhvkjasdhf";
        System.out.println("Password Length "+passwordLength.length());
        System.out.println(capitalLetters.toUpperCase());
        String findingIndezx= "I am the greatest ever";
        System.out.println(findingIndezx.indexOf("the greatest"));
        System.out.println(findingIndezx.charAt(10)==findingIndezx.charAt(10));
        System.out.println(capitalLetters.charAt(100));
    }
}
