public class Main {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(6, 1);

        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println("Top-left corner: " + rectangle.getTopLeft());
        System.out.println("Bottom-right corner: " + rectangle.getBottomRight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle details: " + rectangle);
    }
}