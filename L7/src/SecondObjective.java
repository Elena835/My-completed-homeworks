interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();
}

class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;

    public Rectangle(double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

public class SecondObjective {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Blue", "Black");
        Rectangle rectangle = new Rectangle(4, 6, "Red", "Green");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Fill Color: " + circle.getFillColor());
        System.out.println("Border Color: " + circle.getBorderColor());

        System.out.println("---------------");

        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Fill Color: " + rectangle.getFillColor());
        System.out.println("Border Color: " + rectangle.getBorderColor());

        System.out.println("---------------");

        System.out.println("Triangle:");
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Fill Color: " + triangle.getFillColor());
        System.out.println("Border Color: " + triangle.getBorderColor());
    }
}
