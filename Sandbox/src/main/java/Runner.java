import com.sun.org.apache.xpath.internal.SourceTree;

public class Runner {
    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        System.out.println("Расстояние между двумя точками:" + "(" + p1.x + "," + p1.y + ")" + " и " + "(" + p2.x + "," + p2.y + ")" + " = " + distance(p1, p2));

        System.out.println("Расстояние между двумя точками:" + "(" + p1.x + "," + p1.y + ")" + " и " + "(" + p2.x + "," + p2.y + ")" + " = " + p2.distance(p1));

    }

    public static double distance(Point p1, Point p2) {
        double x = p1.x - p2.x;
        double y = p1.y - p2.y;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}