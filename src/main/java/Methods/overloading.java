package Methods;

public class overloading {
    public int methodOverLoading(int a, int b, int c){
        return a+b+c;
}
    public double methodOverLoading(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        overloading obj = new overloading();
       int printing=  obj.methodOverLoading(1, 2, 3);
        overloading obj2 = new overloading();
       Double doubles=  obj.methodOverLoading(2.3,3.5,3.3);
        for(int i=0;i<printing;i++){
            System.out.println(i);
        }
        System.out.println(printing);
        System.out.println(doubles);
        }
}
