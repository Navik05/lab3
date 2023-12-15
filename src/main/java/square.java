public class square extends figure{
    private double a;
    private double diagonal;
    public void setA(float a) {
        this.a = a;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public void workSquare(){
        diagonal=Math.sqrt(2)*a;
        area=Math.pow(a,2);
        perimeter = a * 4;
    }
}
