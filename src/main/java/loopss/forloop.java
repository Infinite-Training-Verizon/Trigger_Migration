package loopss;

public class forloop {
    public static void main(String[] args) {
//        for(int i=0;i<10;i++)
//        {
//            if(i==5 || i==6 || i==7){
//                System.out.println(i);
//            }else{
//                System.out.println(i);
//            }
//            System.out.println("print untill it reaches 10 " + i);
//        }
//    }
        for (int age = 25; age <= 30; age++) {
            if (age < 30) {
                System.out.println("You cannot enter " + age);
            } else {
                System.out.println("you can enter now " + age);
            }
        }
        for (int countDown = 5; countDown >= 0; countDown--) {
            System.out.println(countDown);
        }
        for (int time = 1; time <= 2; time++) {
            System.out.println("outline 1 " + time);

            for (int moment = 1; moment <= 5; moment++) {
                System.out.println("inner 1 " + moment);
            }
        }
    }
}
