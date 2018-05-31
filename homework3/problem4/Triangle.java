public final class Triangle {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea() {
        return 0.5 * this.base * this.height;
    }

    public double getBase() {
        return this.base;
    }
    public double getHeight() {
        return this.height;
    }
}