public class triangle extends figure{
    private final double[] sides=new double[3];
    private int view;
    public void setSides(double[] sides) {
        System.arraycopy(sides, 0, this.sides, 0, 3);
    }
    public int getView() {
        return view;
    }
    public void workTriangle(){
        double p2;
        perimeter = sides[0] + sides[1] + sides[2];
        p2 = perimeter / 2;
        area =Math.sqrt(p2 * (p2 - sides[0]) * (p2 - sides[1]) * (p2 - sides[2]));
        if (sides[0] == sides[1] && sides[1] == sides[2])
            view = 1;
        else if (sides[0] == sides[1] || sides[1] == sides[2])
            view = 2;
        else view = 3;
    }
}
