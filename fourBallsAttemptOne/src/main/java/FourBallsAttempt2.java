
import processing.core.PApplet;

public class FourBallsAttempt2 extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 25;

    private Circle circle1;
    private Circle circle2;
    private Circle circle3;
    private Circle circle4;

    public static void main(String[] args) {
        PApplet.main("FourBallsAttempt2", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        circle1 = new Circle(0, HEIGHT * 1 / 5, 1);
        circle2 = new Circle(0, HEIGHT * 2 / 5, 2);
        circle3 = new Circle(0, HEIGHT * 3 / 5, 3);
        circle4 = new Circle(0, HEIGHT * 4 / 5, 4);
    }

    @Override
    public void draw() {
        background(255);
        circle1.display();
        circle2.display();
        circle3.display();
        circle4.display();
    }

    public class Circle {
        private float x;
        private float y;
        private int speed;

        public Circle(float x, float y, int speed) {
            this.x = x;
            this.y = y;
            this.speed = speed;
        }

        public void display() {
            ellipse(x, y, DIAMETER, DIAMETER);
            x += speed;
        }
    }
}


