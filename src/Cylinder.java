public class Cylinder {
    public static double getArea(int radius, int height){
        double baseArea = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI  * radius;
        double area = perimeter * height + 2 * baseArea;
        return area;
    }
}
