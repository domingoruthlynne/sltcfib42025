package chapter1;
public class WaterBottle {
    private String brand;
    private boolean empty;

    /* short numPets = 5;
    int numGrains = 5.6;
    String name = "Scruffy";
    numPets.length();
    numGrains.length();
    name.length(); **/

    

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.println("Empty = " + wb.empty);
        System.out.println(", Brand = " + wb.brand);
    }
}
