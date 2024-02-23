package assigment.question09;

public class HinhTron extends HinhHoc {
    private double radius;

    public HinhTron(double radius) throws HinhHocException{
        super();
        this.radius = radius;
    }

    @Override
    public double chuVi() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double dienTich() {
        return radius * radius * Math.PI;
    }
}
