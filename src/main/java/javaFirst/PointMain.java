package javaFirst;

public class PointMain {

    public static void main (String[] args){
        Point moscow = new Point(45.344, 45.566, "Москва");
        Point london = new Point(55.34234, 423.566, "Лондон");
        moscow.inverse();
        moscow.printSelf();
        Point inverseMoscow = moscow.inverse();


        String s = new String("Roma");

        int initArg = 42;
        moscow.setArg100(42);
        System.out.println(initArg);

        moscow.setCoordinates(london);
        london.printSelf();
    }
}
