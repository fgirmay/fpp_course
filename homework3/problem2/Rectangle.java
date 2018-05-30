public final class Rectangle {

    private final double width;
    private final double length;

    public Rectangle(double width, double length) {

        this.width = width;
        this.length = length;
    }

    public double computeArea() {
        return this.length * this.width;
    }

    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
}