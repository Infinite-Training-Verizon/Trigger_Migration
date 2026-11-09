package oops;

public class Full {
        // Create a fullThrottle() method
        public String fullThrottle(String input) {
            System.out.println("The car is going as fast as it can!");
            int lenght=input.length();
            int breath=5;
            if(lenght>breath){
                System.out.println("tell me the lengtht " + lenght);
            }else{
                System.out.println("still tell me the lengbh " + lenght);
            }
            return input;
        }

        // Create a speed() method and add a parameter
        public int speed(int maxSpeed,int minSpeed ) {
            maxSpeed = 200;
            if (maxSpeed > minSpeed) {
                System.out.println("Gets Pulled  over " + maxSpeed);
            } else {
                System.out.println("You are driving under the speed limit " + maxSpeed);
            }
            return maxSpeed;
        }
        public int areaOfRectabgle(int length, int breath) {
            int  area = length * breath;
            return area;
        }
        public static void main(String[] args) {
            Full myCar = new Full();
            String throttle = myCar.fullThrottle("abc");
            int carSpeed = myCar.speed(200, 350);
            int findingAreaOfLenght= myCar.areaOfRectabgle(23,87);// Create a myCar object
            System.out.println(throttle);      // Call the fullThrottle() method
            System.out.println(carSpeed);
            System.out.println(findingAreaOfLenght);
        }
    }
