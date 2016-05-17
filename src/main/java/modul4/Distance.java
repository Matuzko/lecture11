package modul4;

public class Distance {
    public static double distanc (int x1, int y1, int x2,int y2){
        double dist = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return dist;
    }
}
