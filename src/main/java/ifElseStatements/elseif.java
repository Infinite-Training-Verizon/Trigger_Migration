package ifElseStatements;

public class elseif {
    public static void main(String[] args) {
        String employeeName = "John";
        int experience = 5;
        int salary = 60000;
        int bonus = 0;
        if (experience >= 5 && salary >= 60000) {
            bonus = 10000;
        } else {
            if (experience >= 3 && experience < 5) {
                bonus = 50000;
            } else {
                bonus = 0;
            }
        }
        int totalSalary = salary + bonus;
        System.out.println("The total salary is: " + totalSalary);
        System.out.println("The bonus salary is: " + bonus);
        System.out.println("salary " + salary);
    }
}


//Business requirements:
//        1. If experience is 5 years or more AND salary is $60,000 or more, the employee receives a $10,000 bonus.
//2. If experience is 3 years or more but less than 5, the employee receives a $5,000 bonus.
//3. Otherwise, the employee receives no bonus.