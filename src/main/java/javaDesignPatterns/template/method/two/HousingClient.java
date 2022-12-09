package javaDesignPatterns.template.method.two;

//Let´s test our template method pattern example a test program.
public class HousingClient {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("*******************");

        houseType = new GlassHouse();

        houseType.buildHouse();

    }

    //Notice that client is invoking the template method of base class and depending of implementation of
    // different steps, it’s using some of the methods from base class and some of them from subclass.

    //Building foundation with cement,iron rods and sand
    //Building Pillars with Wood coating
    //Building Wooden Walls
    //Building Glass Windows
    //House is built.
    //************
    //Building foundation with cement,iron rods and sand
    //Building Pillars with glass coating
    //Building Glass Walls
    //Building Glass Windows
    //House is built.


}
