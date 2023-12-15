public class circle extends figure{
    private double r;
    private double d;
    public void setR(double r) {
        this.r = r;
    }
    public double getD() {
        return d;
    }
    public void workCircle(){
        d = r * 2;
        area = 3.14 *Math.pow(r,2);
        perimeter = 3.14 * 2 * r;
    }
}
