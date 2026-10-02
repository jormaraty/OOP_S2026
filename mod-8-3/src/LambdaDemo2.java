@FunctionalInterface  // optional, it allows the compiler to ensure that there is only one abstract function
interface Drawable {
    public void draw();
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        int width = 10;

        Drawable d = ()-> System.out.println("Drawing " + width);
        d.draw();
    }
}
