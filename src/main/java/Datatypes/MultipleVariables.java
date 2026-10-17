package Datatypes;

import java.sql.SQLOutput;

public class MultipleVariables {
    public static void main(String[] args) {
        String firstName= "Simon";
         int age= 25;
        age = 34;
        String lasName= "Simon Richard";
        System.out.println(age);
        System.out.println(firstName + " and his age " + age);
        System.out.println(age+ firstName);
        int x = 24,y= 34,xyz = 2342;
        System.out.println("Addition " + (x+y+xyz));
        System.out.println("Merging the variables " + x+y+xyz  + " " + (x+y+xyz));
        final int MINUTES_PER_HOUR= 60;
        final int SECONDS_PER_MINUTE = 60;
        int DAY_LIGHT_SAVING_DAYS = 7;
        String Raining = "Yes";
        final int BIRTH_YEAR=1997,BIRTH_MONTH=5,BIRTH_DAY=12;
        System.out.println("Simon Birth year " + BIRTH_YEAR + " and Birth Month " + BIRTH_MONTH + " and Birth Day " + BIRTH_DAY);
        System.out.println("Raining " + Raining + "So you get the savings of? " + DAY_LIGHT_SAVING_DAYS );


    }
}
