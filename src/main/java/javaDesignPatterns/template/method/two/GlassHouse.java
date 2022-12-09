package javaDesignPatterns.template.method.two;

//We could have overriden other methods also, but for simplicity I am not doing that.
public class GlassHouse extends HouseTemplate{

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
