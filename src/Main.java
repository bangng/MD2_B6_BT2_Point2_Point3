import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.0f,2.0f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
        Point3D point3D = new Point3D();
        point3D.setXYZ(point2D.getX(),point2D.getY(),7.0f);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
