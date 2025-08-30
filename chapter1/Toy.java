package chapter1;
public class Toy {
    String name;
    String brand;
    double price;
    int quantity;
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Rage pink";
        toy1.brand = "Lavuvu";
        toy1.price = 4500;
        toy1.quantity = 12;

        System.out.println(toy1.brand);
    }
}