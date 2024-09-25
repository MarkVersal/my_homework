package javaFirst;

public class Point {
    private double pointX;
    private double pointY;
    private final String pointName;


    public Point(double pointX, double pointY, String pointName) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointName = pointName;
    }

    public void printSelf(){
        System.out.println("pointX: " + pointX + " pointY: " + pointY);
    }

    public Point inverse(){
        return new Point(pointY, pointX, pointName);
    }

    public void setArg100(int arg) {
        arg = 100;
    }

    public void setCoordinates(Point arg) {
        arg.pointX = 0.0;
        arg.pointY = 0.0;
    }
}
