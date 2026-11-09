package Constructers;

public class Contrustermethods {
    String carName;
    int carYear;
    int carPrice;

    public Contrustermethods(String carName, int carPrice, int  carYear){
        this.carName=carName;
        this.carPrice=carPrice;
        this.carYear=carYear;
    }
    public Contrustermethods(int carYear) {
        this("Hyundai", 32000, carYear);
    }
    public Contrustermethods(String carName, int carPrice) {
        this(carName , carPrice, 2340);
    }
    public void carInfromation(){
        System.out.println("carInfromation" + carName + " " + carYear + " " + carPrice);
    }
    public int getCarPrice(int carPrice){
        return carPrice;
    }
    public static void main(String[] args) {
        Contrustermethods obj1 = new Contrustermethods("Toyota" ,23333, 25000);
        Contrustermethods obj2 = new Contrustermethods(2055);
        Contrustermethods obj3 = new Contrustermethods("CX13", 2067);
        obj2.carInfromation();
        obj1.carInfromation();
        obj3.carInfromation();
        System.out.println(obj1.getCarPrice(23));
    }
}
