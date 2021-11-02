package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake("chocolate");
        cake.setPrice(24.99);
        System.out.println("The flavor is this cake is " + cake.getFlavor());
        System.out.println("The price of this cake is " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(20.99);
        System.out.println("The birthday cake flavor is " + birthdayCake.getFlavor());
        System.out.println("The birthday cake price is " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("strawberry");
        System.out.println("The flavor of this wedding cake is " + weddingCake.getFlavor());
        System.out.println("The price of this wedding cake is " + weddingCake.getPrice());
    }
}
