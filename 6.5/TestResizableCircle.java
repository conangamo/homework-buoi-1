// TestResizableCircle.java
public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(5.0);
        System.out.println("Original Radius: " + circle.radius);
        System.out.println("After resizing by 50%: " + circle.resize(50));
    }
}
