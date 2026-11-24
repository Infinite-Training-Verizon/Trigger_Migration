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
    public Contrustermethods(String carName) {
        this(carName, 2340,1997);

    }
    public String carInfromation(){
        System.out.println("carInfromation" + carName + " " + carYear + " " + carPrice);
        return carName + " " + carYear + " " + carPrice;
    }
    public int getCarPrice(int carPrice){
        return carPrice;
    }
    public static void main(String[] args) {
        Contrustermethods obj1 = new Contrustermethods("Toyota" ,23333, 25000);
        Contrustermethods obj2 = new Contrustermethods(2055);
        Contrustermethods obj3 = new Contrustermethods("CX13", 2067);
        Contrustermethods obj4 = new Contrustermethods("Mazda");
        obj1.carInfromation();
        obj2.carInfromation();
        obj3.carInfromation();
        obj4.carInfromation();

        System.out.println(obj2.getCarPrice(23));
    }
}
