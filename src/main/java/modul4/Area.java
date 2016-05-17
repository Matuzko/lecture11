package modul4;

public class Area {

    public static int triangle (int sideA, int sideB){
        int area = (sideA * sideB) / 2;
        return area;
    }
    public static int rectangle (int sideA, int sideB){
        int area = sideA * sideB;
        return area;
    }
    public static double circle (int radius){
        double area = radius * radius * 3.14;
        return area;
    }
}
