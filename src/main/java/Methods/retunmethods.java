package Methods;

public class retunmethods {
    static int car(int carsize, long vinNumber){
        if(carsize>30){
            System.out.println("carsize is selected " + carsize);
        }else{
            System.out.println("car size is should be bigger thatn 30 but its only " + carsize);
        }
        System.out.println("carsize " + carsize +
                           "vinNumber " + vinNumber);
     return carsize;
    }
    public static void main(String[] args) {
        int carDetails= car(24,234962346239l);
        System.out.println(carDetails);
    }
}
