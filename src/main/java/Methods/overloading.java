package Methods;

public class overloading {
    static int methodOverLoading(int a, int b, int c){
        return a+b+c;
}
    static double methodOverLoading(double a, double b, double c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        int printInt=methodOverLoading(2,4,7);
        Double printDouble=methodOverLoading(2.2,2.2,2.2);
        for(int i=0;i<printInt;i++){
            System.out.println(i);
        }
        System.out.println(printInt);
        System.out.println(printDouble);
    }
}
