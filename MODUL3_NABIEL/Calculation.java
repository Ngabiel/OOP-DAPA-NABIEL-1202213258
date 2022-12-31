import java.lang.Exception;

import java.lang.Thread;

public class Calculation implements Runnable {
    double radius, sides, area, phi;

    void setSquare(double sides, double exception) {
        if (sides <= 1) {

            throw new IllegalArgumentException("sides must be greater than or equal to 1");
        }

        area = sides * sides;
    }

    void setCircle(double radius, double exception) {
        if (radius <= 1) {

            throw new IllegalArgumentException("radius must be greater than or equal to 1");
        }
        phi = 3.14 * radius * radius;
        area = phi * radius * radius;
    }
    void setTrapezoid(double a, double b, double t, double exception) {
        if (a <= 1 || b <= 1 || t <= 1) {
            throw new IllegalArgumentException("a, b, t must be greater than or equal to 1");
        }
        area = (a + b + t) / 2;
    }
    public void run() {
        try {
            System.out.println("Program will start in " + Thread.currentThread() + ".");
            for (int i = 3; i > 0; i--) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Thread " + Thread.currentThread() + ": " + i + " "+ " " + area);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTrapezoid() {
        return null;
    }

    public String getCircle() {
        return null;
    }

    public String getSquare() {
        return null;
    }
}